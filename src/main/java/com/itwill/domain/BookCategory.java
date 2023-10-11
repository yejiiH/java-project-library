package com.itwill.domain;

public class BookCategory {
	private int category_no;
	private String category_name;
	
	public BookCategory() {
		// TODO Auto-generated constructor stub
	}
	public BookCategory(int category_no, String category_name) {
		super();
		this.category_no = category_no;
		this.category_name = category_name;
	}
	public int getCategory_no() {
		return category_no;
	}
	public void setCategory_no(int category_no) {
		this.category_no = category_no;
	}
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	@Override
	public String toString() {
		return "BookCategory [category_no=" + category_no + ", category_name=" + category_name + "]";
	}
	
	
	
}
