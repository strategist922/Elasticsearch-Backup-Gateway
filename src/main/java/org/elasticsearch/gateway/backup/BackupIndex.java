package org.elasticsearch.gateway.backup;

import org.elasticsearch.common.inject.Inject;
import org.elasticsearch.common.logging.ESLogger;
import org.elasticsearch.common.logging.Loggers;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.gateway.Gateway;
import org.elasticsearch.index.Index;
import org.elasticsearch.index.gateway.IndexShardGateway;
import org.elasticsearch.index.gateway.blobstore.BlobStoreIndexGateway;
import org.elasticsearch.index.settings.IndexSettings;

public class BackupIndex extends BlobStoreIndexGateway {
	final ESLogger	logger	= Loggers.getLogger(BackupIndex.class.getName());

	@Inject
	public BackupIndex(final Index index, @IndexSettings final Settings indexSettings, final Gateway gateway) {
		super(index, indexSettings, gateway);
		this.logger.info("Initlized Backup Index");
	}

	@Override
	public String type() {
		this.logger.info("Returned Backup Index Type: backup");
		return "backup";
	}

	@Override
	public Class<? extends IndexShardGateway> shardGatewayClass() {
		this.logger.info("Returned Backup Index Shard Class");
		return BackupIndexShard.class;
	}

}
