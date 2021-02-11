package org.recap.model;

import org.junit.Test;
import org.recap.BaseTestCaseUT;
import org.recap.ils.model.RecordTypeType;
import org.recap.model.jpa.*;

import static org.junit.Assert.assertNotNull;

/**
 * Created by hemalathas on 20/3/17.
 */
public class SearchItemResultRowUT extends BaseTestCaseUT {

    @Test
    public void testSearchItemResultRow(){

        SearchItemResultRow searchItemResultRow = new SearchItemResultRow();
        searchItemResultRow.setCallNumber("X");
        searchItemResultRow.setChronologyAndEnum("test");
        searchItemResultRow.setCustomerCode("PB");
        searchItemResultRow.setBarcode("3216598422355545");
        searchItemResultRow.setUseRestriction("Others");
        searchItemResultRow.setCollectionGroupDesignation("Open");
        searchItemResultRow.setAvailability("Available");
        searchItemResultRow.setSelectedItem(false);
        searchItemResultRow.setItemId(1);
        searchItemResultRow.hashCode();
        new SearchItemResultRow().hashCode();
        searchItemResultRow.compareTo(searchItemResultRow);
        searchItemResultRow.compareTo(new SearchItemResultRow());
        searchItemResultRow.equals(new SearchItemResultRow());
        searchItemResultRow.equals(searchItemResultRow);
        searchItemResultRow.equals(SearchItemResultRow.class);
        searchItemResultRow.equals(null);
        assertNotNull(searchItemResultRow.getCallNumber());
        assertNotNull(searchItemResultRow.getChronologyAndEnum());
        assertNotNull(searchItemResultRow.getCustomerCode());
        assertNotNull(searchItemResultRow.getBarcode());
        assertNotNull(searchItemResultRow.getUseRestriction());
        assertNotNull(searchItemResultRow.getCollectionGroupDesignation());
        assertNotNull(searchItemResultRow.getAvailability());
        assertNotNull(searchItemResultRow.isSelectedItem());
        assertNotNull(searchItemResultRow.getItemId());

    }

    @Test
    public void testResponseClass(){
        ItemRefileResponse itemRefileResponse=new ItemRefileResponse();
        assertNotNull(itemRefileResponse);
        BulkRequestResponse bulkRequestResponse=new BulkRequestResponse();
        assertNotNull(bulkRequestResponse);
        BulkRequestItemEntity bulkRequestItemEntity=new BulkRequestItemEntity();
        assertNotNull(bulkRequestItemEntity);
        BulkRequestItem bulkRequestItem=new BulkRequestItem();
        assertNotNull(bulkRequestItem);
        ReplaceRequest replaceRequest=new ReplaceRequest();
        assertNotNull(replaceRequest);
        PendingRequestEntity pendingRequestEntity=new PendingRequestEntity();
        assertNotNull(pendingRequestEntity);
    }


}