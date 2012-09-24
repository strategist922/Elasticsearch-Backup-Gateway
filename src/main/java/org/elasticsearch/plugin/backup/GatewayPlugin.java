package org.elasticsearch.plugin.backup;

import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.plugins.AbstractPlugin;

public class GatewayPlugin extends AbstractPlugin {
	private final Settings	settings;

	public GatewayPlugin(final Settings settings) {
		this.settings = settings;
	}

	@Override
	public String name() {
		return "backup-gateway";
	}

	@Override
	public String description() {
		return "Backup Enabled Gateway";
	}
}
