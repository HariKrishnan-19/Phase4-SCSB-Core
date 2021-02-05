package org.recap.controller;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.RouteController;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.recap.BaseTestCaseUT;
import org.recap.RecapCommonConstants;
import org.recap.repository.jpa.ImsLocationDetailsRepository;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by hemalathas on 13/7/17.
 */
public class DailyReconcilationJobControllerUT extends BaseTestCaseUT {

    @InjectMocks
    DailyReconciliationJobController dailyReconcilationJobController;

    @Mock
    ImsLocationDetailsRepository imsLocationDetailsRepository;

    @Mock
    CamelContext camelContext;

    @Mock
    RouteController routeController;

    @Test
    public void testDailyReconcilationJobController() throws Exception {
        List<String> allImsLocationCodeExceptUN=new ArrayList<>();
        allImsLocationCodeExceptUN.add("RECAP");
        allImsLocationCodeExceptUN.add("HD");
        Mockito.when(imsLocationDetailsRepository.findAllImsLocationCodeExceptUN()).thenReturn(allImsLocationCodeExceptUN);
        Mockito.when(camelContext.getRouteController()).thenReturn(routeController);
        String response = dailyReconcilationJobController.statCamel();
        assertNotNull(response);
        assertEquals(RecapCommonConstants.SUCCESS, response);
    }

}
