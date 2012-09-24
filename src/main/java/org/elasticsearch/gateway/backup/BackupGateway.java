package org.elasticsearch.gateway.backup;

import java.io.IOException;

import org.elasticsearch.cluster.ClusterName;
import org.elasticsearch.cluster.ClusterService;
import org.elasticsearch.common.inject.Inject;
import org.elasticsearch.common.inject.Module;
import org.elasticsearch.common.logging.ESLogger;
import org.elasticsearch.common.logging.Loggers;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.gateway.blobstore.BlobStoreGateway;
import org.elasticsearch.threadpool.ThreadPool;

public class BackupGateway extends BlobStoreGateway {
	final ESLogger	logger	= Loggers.getLogger(BackupGateway.class.getName());

	@Inject
	protected BackupGateway(final Settings settings, final ThreadPool threadPool, final ClusterService clusterService,
			final ClusterName clusterName) throws IOException {
		super(settings, threadPool, clusterService);
		this.logger.info("Initializing Backup Gateway for cluster {}", clusterName);
		initialize(new BackupBlobStore(settings), clusterName, null);
	}

	@Override
	public String type() {
		this.logger.info("Returning Gateway type");
		return null;
	}

	@Override
	public Class<? extends Module> suggestIndexGateway() {
		this.logger.info("Returning suggested Index Gateway");
		return null;
	}
}