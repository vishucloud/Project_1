package com.purplewisteria.RecipeApp.domain.course;

import com.purplewisteria.RecipeApp.domain.Category;
import com.purplewisteria.RecipeApp.domain.Ingredient;
import com.purplewisteria.RecipeApp.domain.Notes;

public class Appetizer extends Course {
	

	public Appetizer(Long id, Category category, String menuName, String itemName, Ingredient ingredient, Notes notes) {
		
		super(id, category, menuName, itemName, ingredient, notes);
	
		
	}
	
	@Override
public String showIngredients() {
		
		return this.getIngredient().getDescription();
	}
	
	@Override
	public String showNotes() {
		
		return this.getNotes().getRecipeNotes();
	}
	

}
