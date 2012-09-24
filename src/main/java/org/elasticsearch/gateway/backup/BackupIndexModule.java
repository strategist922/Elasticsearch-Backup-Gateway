package org.elasticsearch.gateway.backup;

import org.elasticsearch.common.inject.AbstractModule;
import org.elasticsearch.index.gateway.IndexGateway;

public class BackupIndexModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(IndexGateway.class).to(BackupIndex.class).asEagerSingleton();
	}
}