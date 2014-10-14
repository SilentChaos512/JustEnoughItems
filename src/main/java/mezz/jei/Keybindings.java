package mezz.jei;

import cpw.mods.fml.client.registry.ClientRegistry;
import mezz.jei.config.Defaults;
import net.minecraft.client.settings.KeyBinding;
import org.lwjgl.input.Keyboard;

public class KeyBindings {

	public static KeyBinding toggleOverlay;
	public static KeyBinding showRecipe;
	public static KeyBinding showUses;

	public static void init() {
		String categoryName = Defaults.MODID + " (" + Defaults.NAME + ")";

		toggleOverlay = new KeyBinding("key.jei.toggleOverlay", Keyboard.KEY_O, categoryName);
		showRecipe = new KeyBinding("key.jei.showRecipe", Keyboard.KEY_R, categoryName);
		showUses = new KeyBinding("key.jei.showUses", Keyboard.KEY_U, categoryName);

		ClientRegistry.registerKeyBinding(toggleOverlay);
		ClientRegistry.registerKeyBinding(showRecipe);
		ClientRegistry.registerKeyBinding(showUses);
	}
}