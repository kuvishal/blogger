package com.cisco.blogger.model;

import java.sql.Date;

public class Blog {
	
	private String title;
	
	private String[] tags;
	
	private String content;
	
	private Date timeOfCreation;
	
	private String author;
	
	public Blog(){
		
	}

	public Blog(String title, String content) {
		super();
		this.title = title;
		this.content = content;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Blog [title=" + title + ", content=" + content + "]";
	}

}
