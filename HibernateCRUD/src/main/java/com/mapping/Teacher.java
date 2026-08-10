package com.mapping;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Teacher {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Tid;
	private String Tname;
	@OneToMany(mappedBy = "teacher")
//	@JoinColumn(name = "Student_id")
	private List<Students> list = new ArrayList<Students>();
	
	public int getTid() {
		return Tid;
	}
	public void setTid(int tid) {
		Tid = tid;
	}
	public String getTname() {
		return Tname;
	}
	public void setTname(String tname) {
		Tname = tname;
	}
	public List<Students> getList() {
		return list;
	}
	public void setList(List<Students> list) {
		this.list = list;
	}
	
}
