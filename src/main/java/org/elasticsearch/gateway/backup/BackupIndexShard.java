package org.elasticsearch.gateway.backup;

import org.elasticsearch.common.inject.Inject;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.index.gateway.IndexGateway;
import org.elasticsearch.index.gateway.blobstore.BlobStoreIndexShardGateway;
import org.elasticsearch.index.shard.ShardId;
import org.elasticsearch.index.shard.service.IndexShard;
import org.elasticsearch.index.store.Store;
import org.elasticsearch.threadpool.ThreadPool;

public class BackupIndexShard extends BlobStoreIndexShardGateway {

	@Inject
	protected BackupIndexShard(final ShardId shardId, final Settings indexSettings, final ThreadPool threadPool,
			final IndexGateway indexGateway, final IndexShard indexShard, final Store store) {
		super(shardId, indexSettings, threadPool, indexGateway, indexShard, store);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String type() {
		// TODO Auto-generated method stub
		return null;
	}

}
