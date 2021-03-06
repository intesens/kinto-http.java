package com.intesens.kinto_http;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by amalle on 16/09/16.
 */
public class ENDPOINTSTest {

    @Test
    public void testRoot() {
        String endpoint = ENDPOINTS.ROOT.getPath();
        assertEquals("", endpoint);
    }

    @Test
    public void testBatch() {
        String endpoint = ENDPOINTS.BATCH.getPath();
        assertEquals("/batch", endpoint);
    }

    @Test
    public void testPermissions() {
        String endpoint = ENDPOINTS.PERMISSIONS.getPath();
        assertEquals("/permissions", endpoint);
    }

    @Test
    public void testBuckets() {
        String endpoint = ENDPOINTS.BUCKETS.getPath();
        assertEquals("/buckets", endpoint);
    }

    @Test
    public void testBucket() {
        String endpoint = ENDPOINTS.BUCKET.getPath();
        assertEquals("/buckets/{bucket}", endpoint);
    }

    @Test
    public void testHistory() {
        String endpoint = ENDPOINTS.HISTORY.getPath();
        assertEquals("/buckets/{bucket}/history", endpoint);
    }

    @Test
    public void testCollections() {
        String endpoint = ENDPOINTS.COLLECTIONS.getPath();
        assertEquals("/buckets/{bucket}/collections", endpoint);
    }

    @Test
    public void testCollection() {
        String endpoint = ENDPOINTS.COLLECTION.getPath();
        assertEquals("/buckets/{bucket}/collections/{collection}", endpoint);
    }

    @Test
    public void testGroups() {
        String endpoint = ENDPOINTS.GROUPS.getPath();
        assertEquals("/buckets/{bucket}/groups", endpoint);
    }

    @Test
    public void testGroup() {
        String endpoint = ENDPOINTS.GROUP.getPath();
        assertEquals("/buckets/{bucket}/groups/{group}", endpoint);
    }

    @Test
    public void testRecords() {
        String endpoint = ENDPOINTS.RECORDS.getPath();
        assertEquals("/buckets/{bucket}/collections/{collection}/records", endpoint);
    }

    @Test
    public void testRecord() {
        String endpoint = ENDPOINTS.RECORD.getPath();
        assertEquals("/buckets/{bucket}/collections/{collection}/records/{record}", endpoint);
    }

    @Test
    public void testAttachment() {
        String endpoint = ENDPOINTS.ATTACHMENT.getPath();
        assertEquals("/buckets/{bucket}/collections/{collection}/records/{record}/attachment", endpoint);
    }
}
