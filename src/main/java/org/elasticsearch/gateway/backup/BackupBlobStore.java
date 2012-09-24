package org.elasticsearch.gateway.backup;

import org.elasticsearch.common.blobstore.BlobPath;
import org.elasticsearch.common.blobstore.BlobStore;
import org.elasticsearch.common.blobstore.ImmutableBlobContainer;
import org.elasticsearch.common.logging.ESLogger;
import org.elasticsearch.common.logging.Loggers;
import org.elasticsearch.common.settings.Settings;

public class BackupBlobStore implements BlobStore {
	final ESLogger	logger	= Loggers.getLogger(BackupBlobStore.class.getName());

	public BackupBlobStore(final Settings settings) {
		this.logger.info("Initializing Backup Blob Store");
	}

	@Override
	public ImmutableBlobContainer immutableBlobContainer(final BlobPath path) {
		this.logger.info("Getting BlobContainer for path {}", path);
		return null;
	}

	@Override
	public void delete(final BlobPath path) {
		this.logger.info("Deleting BlobContainer at path {}", path);

	}

	@Override
	public void close() {
		this.logger.info("Closing Backup Blob Store");
	}
}