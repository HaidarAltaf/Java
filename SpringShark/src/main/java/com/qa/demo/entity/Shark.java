package com.qa.demo.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
public class Shark {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column
	private String sharkType;
	
	@Column
	@Min(20)
	@Max(800)
	private int length;
	
	@Column
	private String name;

	@Column
	private boolean isVtuber;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSharkType() {
		return sharkType;
	}

	public void setSharkType(String sharkType) {
		this.sharkType = sharkType;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isVtuber() {
		return isVtuber;
	}

	public void setVtuber(boolean isVtuber) {
		this.isVtuber = isVtuber;
	}

	public Shark(long id, String sharkType, @Min(20) @Max(800) int length, String name, boolean isVtuber) {
		super();
		this.id = id;
		this.sharkType = sharkType;
		this.length = length;
		this.name = name;
		this.isVtuber = isVtuber;
	}

	public Shark(String sharkType, @Min(20) @Max(800) int length, String name, boolean isVtuber) {
		super();
		this.sharkType = sharkType;
		this.length = length;
		this.name = name;
		this.isVtuber = isVtuber;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, isVtuber, length, name, sharkType);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Shark other = (Shark) obj;
		return id == other.id && isVtuber == other.isVtuber && length == other.length
				&& Objects.equals(name, other.name) && Objects.equals(sharkType, other.sharkType);
	}
	
}
