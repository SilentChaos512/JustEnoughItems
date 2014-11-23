package mezz.jei.recipes.crafting;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.ShapedRecipes;

import javax.annotation.Nonnull;

public class ShapedRecipesGui extends CraftingRecipeGui {

	@Override
	public void setItemsFromRecipe(@Nonnull Object recipe, ItemStack focusStack) {
		ShapedRecipes shapedRecipe = (ShapedRecipes)recipe;

		setInput(shapedRecipe.recipeItems, focusStack, shapedRecipe.recipeWidth, shapedRecipe.recipeHeight);
		setOutput(shapedRecipe.getRecipeOutput());
	}
}