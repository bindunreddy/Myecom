package com.niit.bnr.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Category")
public class Category {
	
	@NotNull
	@Column
	@Id
	private String id;
	private String category_name;
	/**
	 * @return the cid
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param cid the cid to set
	 */
	public void setId(String cid) {
		this.id = cid;
	}
	/**
	 * @return the category_name
	 */
	public String getCategory_name() {
		return category_name;
	}
	/**
	 * @param category_name the category_name to set
	 */
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	

}
