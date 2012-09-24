package org.elasticsearch.gateway.backup;

import java.io.IOException;

import org.elasticsearch.cluster.ClusterName;
import org.elasticsearch.cluster.ClusterService;
import org.elasticsearch.common.inject.Inject;
import org.elasticsearch.common.inject.Module;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.gateway.blobstore.BlobStoreGateway;
import org.elasticsearch.threadpool.ThreadPool;

public class BackupGateway extends BlobStoreGateway {

	@Inject
	protected BackupGateway(final Settings settings, final ThreadPool threadPool, final ClusterService clusterService,
			final ClusterName clusterName) throws IOException {
		super(settings, threadPool, clusterService);
		// TODO Auto-generated constructor stub
		initialize(new BackupBlobStore(settings), clusterName, null);
	}

	@Override
	public String type() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class<? extends Module> suggestIndexGateway() {
		// TODO Auto-generated method stub
		return null;
	}

}
