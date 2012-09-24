package org.elasticsearch.gateway.backup;

import org.elasticsearch.gateway.Gateway;
import org.elasticsearch.gateway.blobstore.BlobStoreGatewayModule;

public class BackupGatewayModule extends BlobStoreGatewayModule {

	@Override
	protected void configure() {
		bind(Gateway.class).to(BackupGateway.class).asEagerSingleton();
	}
}
