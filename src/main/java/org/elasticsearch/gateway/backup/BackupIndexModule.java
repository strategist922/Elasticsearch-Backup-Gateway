package org.elasticsearch.gateway.backup;

import org.elasticsearch.common.inject.AbstractModule;
import org.elasticsearch.common.logging.ESLogger;
import org.elasticsearch.common.logging.Loggers;
import org.elasticsearch.index.gateway.IndexGateway;

public class BackupIndexModule extends AbstractModule {
	final ESLogger	logger	= Loggers.getLogger(BackupIndexModule.class.getName());

	@Override
	protected void configure() {
		this.logger.info("Configuring Backup Index Module");
		bind(IndexGateway.class).to(BackupIndex.class).asEagerSingleton();
	}
}