package com.rakuten.myhospital.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BED")
public class Bed {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@Column(name = "BED_NUM")
	private int bedNum;

	@Column(name = "STATUS")
	private boolean status;

	public Bed() {
		super();
	}

	public Bed(int id, int bedNum, boolean status) {
		super();
		this.id = id;
		this.bedNum = bedNum;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBedNum() {
		return bedNum;
	}

	public void setBedNum(int bedNum) {
		this.bedNum = bedNum;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Bed [id=" + id + ", bedNum=" + bedNum + ", status=" + status + "]";
	}
}
