package com.capgemini.lms.entities;

import java.util.Date;
import java.util.List;

public class BooksIssued {
	private int issueId;
	private Users users;
	private List<Books> books;
	private Date issueDate;
	private int quantity;
	private Date dueDate;
	public int getIssueId() {
		return issueId;
	}
	public void setIssueId(int issueId) {
		this.issueId = issueId;
	}
	public Users getUsers() {
		return users;
	}
	public void setUsers(Users users) {
		this.users = users;
	}
	public List<Books> getBooks() {
		return books;
	}
	public void setBooks(List<Books> books) {
		this.books = books;
	}
	public Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	
	
}
