package com.sap.odata.handler;

import com.sap.cloud.server.odata.*;

public class MaterialPositionHandler extends com.sap.cloud.server.odata.DefaultEntityHandler {
    private com.sap.odata.MainServlet servlet;
    private com.sap.odata.proxy.OdataService service;

    public MaterialPositionHandler(com.sap.odata.MainServlet servlet, com.sap.odata.proxy.OdataService service) {
        super(servlet, service);
        this.servlet = servlet;
        this.service = service;
    }

    @Override public DataValue executeQuery(DataQuery query) {
        return service.executeQuery(query).getResult();
    }

    @Override public void createEntity(EntityValue entityValue) {
        com.sap.odata.proxy.MaterialPosition entity = (com.sap.odata.proxy.MaterialPosition)entityValue;
        service.createEntity(entity);
    }

    @Override public void updateEntity(EntityValue entityValue) {
        com.sap.odata.proxy.MaterialPosition entity = (com.sap.odata.proxy.MaterialPosition)entityValue;
        service.updateEntity(entity);
    }

    @Override public void deleteEntity(EntityValue entityValue) {
        com.sap.odata.proxy.MaterialPosition entity = (com.sap.odata.proxy.MaterialPosition)entityValue;
        service.deleteEntity(entity);
    }
}
