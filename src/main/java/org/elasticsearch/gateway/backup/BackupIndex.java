package org.elasticsearch.gateway.backup;

import org.elasticsearch.common.inject.Inject;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.gateway.Gateway;
import org.elasticsearch.index.Index;
import org.elasticsearch.index.gateway.IndexShardGateway;
import org.elasticsearch.index.gateway.blobstore.BlobStoreIndexGateway;
import org.elasticsearch.index.settings.IndexSettings;

public class BackupIndex extends BlobStoreIndexGateway {

	@Inject
	public BackupIndex(final Index index, @IndexSettings final Settings indexSettings, final Gateway gateway) {
		super(index, indexSettings, gateway);
	}

	@Override
	public String type() {
		return "backup";
	}

	@Override
	public Class<? extends IndexShardGateway> shardGatewayClass() {
		return BackupIndexShard.class;
	}

}
