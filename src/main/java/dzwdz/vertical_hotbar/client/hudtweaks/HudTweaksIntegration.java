package dzwdz.vertical_hotbar.client.hudtweaks;

import java.util.Arrays;
import java.util.Collection;

import com.github.burgerguy.hudtweaks.api.CustomHudElementEntry;
import com.github.burgerguy.hudtweaks.api.HudTweaksApi;
import com.github.burgerguy.hudtweaks.hud.HTIdentifier;

import dzwdz.vertical_hotbar.client.EntryPoint;

public class HudTweaksIntegration implements HudTweaksApi {
	public static final HTIdentifier.Namespace MOD_NAMESPACE = new HTIdentifier.Namespace("vertical_hotbar", "text.autoconfig.vertical_hotbar.title");

	@Override
	public Collection<CustomHudElementEntry> getCustomElementEntries() {
		return Arrays.asList(new VerticalHotbarEntry(EntryPoint.HOTBAR_UPDATER));
	}
	
}
