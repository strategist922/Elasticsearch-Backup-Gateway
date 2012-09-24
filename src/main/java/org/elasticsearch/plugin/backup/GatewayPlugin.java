package org.elasticsearch.plugin.backup;

import java.util.Collection;

import org.elasticsearch.common.collect.Lists;
import org.elasticsearch.common.inject.Module;
import org.elasticsearch.common.logging.ESLogger;
import org.elasticsearch.common.logging.Loggers;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.gateway.backup.BackupGatewayModule;
import org.elasticsearch.gateway.backup.BackupIndexModule;
import org.elasticsearch.plugins.AbstractPlugin;

public class GatewayPlugin extends AbstractPlugin {
	final ESLogger			logger	= Loggers.getLogger(GatewayPlugin.class.getName());
	private final Settings	settings;

	public GatewayPlugin(final Settings settings) {
		this.logger.info("Initilizing Backup Gateway Plugin");
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
			this.logger.info("Adding Backup Modules to plugin modules list");
			modules.add(BackupGatewayModule.class);
			modules.add(BackupIndexModule.class);
		}
		return modules;
	}
}
