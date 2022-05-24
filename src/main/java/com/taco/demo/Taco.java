package com.taco.demo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
public class Taco {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	public Taco(String name, List<String> ingredients) {
		super();
		this.name = name;
		this.ingredients = ingredients;
	}
	
	@NotNull
	@Size(min=5, message="Name must be at least 5 characters long")
	private String name;
	
	private Date createdAt;
	
	@ManyToMany(targetEntity=Ingredient.class)
	@Size(min=1, message="You must choose at least 1 ingredient")
	private List<String> ingredients;
	
	void createdAt() {
		this.createdAt = new Date();
	}
}

