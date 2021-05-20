package com.capgemini.lms.entities;

import java.util.Date;
import java.util.List;

public class BooksReturned {
	private int id;
	private Users users;
	private List<Books> books;
	private Date returnedDate;
	private int delayed_Days;
	private double penalty;
	private String penalty_Status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public Date getReturnedDate() {
		return returnedDate;
	}
	public void setReturnedDate(Date returnedDate) {
		this.returnedDate = returnedDate;
	}
	public int getDelayed_Days() {
		return delayed_Days;
	}
	public void setDelayed_Days(int delayed_Days) {
		this.delayed_Days = delayed_Days;
	}
	public double getPenalty() {
		return penalty;
	}
	public void setPenalty(double penalty) {
		this.penalty = penalty;
	}
	public String getPenalty_Status() {
		return penalty_Status;
	}
	public void setPenalty_Status(String penalty_Status) {
		this.penalty_Status = penalty_Status;
	}
	
	
	
}
