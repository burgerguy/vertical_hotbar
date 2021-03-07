package dzwdz.vertical_hotbar.client.hudtweaks;

import com.github.burgerguy.hudtweaks.api.CustomHudElementEntry;
import com.github.burgerguy.hudtweaks.api.MatrixUpdater;
import com.github.burgerguy.hudtweaks.hud.HTIdentifier;
import com.github.burgerguy.hudtweaks.hud.element.DefaultHotbarEntry;

import net.minecraft.client.MinecraftClient;

public class VerticalHotbarEntry extends CustomHudElementEntry {
	public VerticalHotbarEntry(MatrixUpdater updater) {
		super(new HTIdentifier(DefaultHotbarEntry.IDENTIFIER.getElementType(), HudTweaksIntegration.MOD_NAMESPACE), updater, "onOffhandStatusChange", "onHotbarAttackIndicatorChange");
	}

	@Override
	protected double calculateWidth(MinecraftClient client) {
		return 10;
	}

	@Override
	protected double calculateHeight(MinecraftClient client) {
		return 10;
	}

	@Override
	protected double calculateDefaultX(MinecraftClient client) {
		return client.getWindow().getScaledWidth() - 10;
	}

	@Override
	protected double calculateDefaultY(MinecraftClient client) {
		return client.getWindow().getScaledHeight() - 10;
	}
	
}
