package com.bootstrap.springboot.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="products")
@NoArgsConstructor
public class Product implements Serializable {

	private static final long serialVersionUID = -5752805178427746354L;

	@Id
	@Column
	@NotNull
    private Long id;

	@Column
    private String name;
	
	@ManyToOne
	@JoinColumn(name="fk_categories_id")
	private Category category;
    
	@Column(name="created_at")
	private Timestamp createdAt;
	
	public Product(Long number, String string) {
		// TODO Auto-generated constructor stub
	}
	
}
