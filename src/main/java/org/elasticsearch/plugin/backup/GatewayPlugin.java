package org.elasticsearch.plugin.backup;

import java.util.Collection;

import org.elasticsearch.common.collect.Lists;
import org.elasticsearch.common.inject.Module;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.gateway.backup.BackupGatewayModule;
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

	/**
	 * Not sure if this is needed.
	 */
	@Override
	public Collection<Class<? extends Module>> modules() {
		Collection<Class<? extends Module>> modules = Lists.newArrayList();
		if (this.settings.getAsBoolean("backup.enabled", true)) {
			modules.add(BackupGatewayModule.class);
		}
		return modules;
	}
}
