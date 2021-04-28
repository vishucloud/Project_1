package com.purplewisteria.RecipeApp.domain.course;

import com.purplewisteria.RecipeApp.domain.Category;
import com.purplewisteria.RecipeApp.domain.Ingredient;
import com.purplewisteria.RecipeApp.domain.Notes;
import com.purplewisteria.RecipeApp.domain.Recipe;

public abstract class Course extends Recipe {
	
	private String menuName;
	private String itemName;
	
	private Ingredient ingredient; 
	private Notes notes;
	
	public Course(Long id, Category category, String menuName, String itemName, Ingredient ingredient, Notes notes ) {
		
		super (id, category);
		this.menuName = menuName;
		this.itemName = itemName;
		this.ingredient =ingredient;
		this.notes = notes;
	}
	
	public Ingredient getIngredient() {
		return ingredient;
	}

	public Notes getNotes() {
		return notes;
	}

	
	
	public String getMenuName() {
		return menuName;
	}
	public String getItemName() {
		return itemName;
	}
	


}