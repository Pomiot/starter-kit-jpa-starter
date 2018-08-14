package com.capgemini.domain;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "CAR_TYPE", indexes = { @Index(name = "name_UNIQUE", columnList = "name") })
public class CarTypeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	

	@Column(nullable = false,unique = true, length = 30)
	private String name;

	// for hibernate
	public CarTypeEntity() {
	}

	public CarTypeEntity(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
