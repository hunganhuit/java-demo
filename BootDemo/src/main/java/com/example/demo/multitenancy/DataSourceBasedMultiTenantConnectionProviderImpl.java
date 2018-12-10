package com.example.demo.multitenancy;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Map;

import javax.sql.DataSource;

import org.hibernate.engine.jdbc.connections.spi.AbstractDataSourceBasedMultiTenantConnectionProviderImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javassist.NotFoundException;


@Component
public class DataSourceBasedMultiTenantConnectionProviderImpl extends AbstractDataSourceBasedMultiTenantConnectionProviderImpl {

    private static final long serialVersionUID = 1L;

    @Autowired
    private Map<String, DataSource> dataSourcesMtApp;

    /*
     * (non-Javadoc)
     * 
     * @see org.hibernate.engine.jdbc.connections.spi.
     * AbstractDataSourceBasedMultiTenantConnectionProviderImpl#selectAnyDataSource( )
     */
    @Override
    protected DataSource selectAnyDataSource() {
        System.out.println("selectAnyDataSource1");
        return this.dataSourcesMtApp.values().iterator().next();
    }

    @Override
    public Connection getConnection(String tenantIdentifier) throws SQLException{
        // TODO Auto-generated method stub
        return super.getConnection(tenantIdentifier);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.hibernate.engine.jdbc.connections.spi.
     * AbstractDataSourceBasedMultiTenantConnectionProviderImpl#selectDataSource( java.lang.String)
     */
    @Override
    protected DataSource selectDataSource(String tenantIdentifier) {
//        if(!this.dataSourcesMtApp.containsKey(tenantIdentifier)){
//                throw new NotFoundException("TenantId : " + tenantIdentifier + " is not found!!");
//        
//        };
        return this.dataSourcesMtApp.get(tenantIdentifier);
    }

}
