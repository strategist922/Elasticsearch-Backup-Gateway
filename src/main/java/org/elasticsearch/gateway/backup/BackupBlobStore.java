package org.elasticsearch.gateway.backup;

import org.elasticsearch.common.blobstore.BlobPath;
import org.elasticsearch.common.blobstore.BlobStore;
import org.elasticsearch.common.blobstore.ImmutableBlobContainer;
import org.elasticsearch.common.settings.Settings;

public class BackupBlobStore implements BlobStore {

	public BackupBlobStore(final Settings settings) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public ImmutableBlobContainer immutableBlobContainer(final BlobPath path) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(final BlobPath path) {
		// TODO Auto-generated method stub

	}

	@Override
	public void close() {
		// TODO Auto-generated method stub

	}

}
