package com.simplilearn.ecomorg.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.simplilearn.ecomorg.model.Product;

public class ProductDao {

	JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	// List All products
	public List<Product> getAllProducts() {
		String sql = "SELECT * FROM PRODUCTS";
		List<Product> productList = template.query(sql, new RowMapper<Product>() {

			public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
				Product product = new Product();
				product.setProductId(rs.getInt("productId"));
				product.setProductTitle(rs.getString("productTitle"));
				product.setProductDescription(rs.getString("productDescription"));
				product.setProductCode(rs.getString("productCode"));
				product.setPrice(rs.getInt("price"));
				product.setAddedOn(new Date());
				product.setRating(rs.getInt("rating"));
				return product;
			}
		});
		return productList;
	}
	
	// Add products
	public int addProduct(Product product) {
		String sql = "INSERT INTO PRODUCTS(productTitle,productCode,productDescription,price,rating) values(?,?,?,?,?)";
		return template.update(sql,product.getProductTitle(), product.getProductCode(), product.getProductDescription(), product.getPrice(),product.getRating());
	}
}
