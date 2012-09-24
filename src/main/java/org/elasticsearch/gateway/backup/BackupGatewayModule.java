package org.elasticsearch.gateway.backup;

import org.elasticsearch.common.logging.ESLogger;
import org.elasticsearch.common.logging.Loggers;
import org.elasticsearch.gateway.Gateway;
import org.elasticsearch.gateway.blobstore.BlobStoreGatewayModule;

public class BackupGatewayModule extends BlobStoreGatewayModule {
	final ESLogger	logger	= Loggers.getLogger(BackupGatewayModule.class.getName());

	@Override
	protected void configure() {
		this.logger.info("Configuring Backup Gateway Module");
		bind(Gateway.class).to(BackupGateway.class).asEagerSingleton();
	}
}
