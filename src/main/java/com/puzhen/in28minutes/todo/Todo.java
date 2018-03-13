package com.puzhen.in28minutes.todo;

import java.util.Date;

import javax.validation.constraints.Size;

public class Todo {

    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}

	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public boolean isComplete() {
		return complete;
	}
	public void setComplete(boolean complete) {
		this.complete = complete;
	}
	private int id;
    private String user;
    
    @Size(min = 6, message = "Enter at least 6 characters")
    private String desc;
    private Date date;
    @Override
	public String toString() {
		return "Todo [id=" + id + ", user=" + user + ", todo=" + desc + ", date=" + date + ", complete=" + complete
				+ "]";
	}
	private boolean complete;
    
	public Todo(int id, String user, String desc, Date date, boolean complete) {
		super();
		this.id = id;
		this.user = user;
		this.desc = desc;
		this.date = date;
		this.complete = complete;
	}
	
	public Todo() {}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Todo other = (Todo) obj;
		if (id != other.id)
			return false;
		return true;
	}

    
}
