package org.elasticsearch.gateway.backup;

import org.elasticsearch.common.inject.Inject;
import org.elasticsearch.common.logging.ESLogger;
import org.elasticsearch.common.logging.Loggers;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.index.gateway.IndexGateway;
import org.elasticsearch.index.gateway.blobstore.BlobStoreIndexShardGateway;
import org.elasticsearch.index.shard.ShardId;
import org.elasticsearch.index.shard.service.IndexShard;
import org.elasticsearch.index.store.Store;
import org.elasticsearch.threadpool.ThreadPool;

public class BackupIndexShard extends BlobStoreIndexShardGateway {
	final ESLogger	logger	= Loggers.getLogger(BackupIndexShard.class.getName());

	@Inject
	protected BackupIndexShard(final ShardId shardId, final Settings indexSettings, final ThreadPool threadPool,
			final IndexGateway indexGateway, final IndexShard indexShard, final Store store) {
		super(shardId, indexSettings, threadPool, indexGateway, indexShard, store);
		this.logger.info("Initiliazed Backup Index Shard");
	}

	@Override
	public String type() {
		this.logger.info("Returned Backup Index Shard Type: backup");
		return "backup";
	}

}
