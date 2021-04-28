package com.purplewisteria.RecipeApp.domain.featured;

import com.purplewisteria.RecipeApp.domain.Category;
import com.purplewisteria.RecipeApp.domain.Ingredient;
import com.purplewisteria.RecipeApp.domain.Notes;

public class Dessert extends Featured {
	
	private Ingredient ingredient; 
	private Notes notes;

	public Dessert (Long id, Category category, String menuName, String itemName, Ingredient ingredient, Notes notes) {
		
		super(id, category, menuName, itemName);
		
		this.ingredient = ingredient;
		this.notes = notes;
	}

	@Override
public String showIngredients() {
		
		return this.ingredient.getDescription();
	}
	
	@Override
	public String showNotes() {
		return this.notes.getRecipeNotes();
	}

}
