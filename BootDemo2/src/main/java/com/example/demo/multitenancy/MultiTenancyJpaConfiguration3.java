///**
// * Copyright 2018 onwards - Sunit Katkar (sunitkatkar@gmail.com)
// *
// * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
// * in compliance with the License. You may obtain a copy of the License at
// *
// * http://www.apache.org/licenses/LICENSE-2.0
// *
// * Unless required by applicable law or agreed to in writing, software distributed under the License
// * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
// * or implied. See the License for the specific language governing permissions and limitations under
// * the License.
// */
//
//package com.example.demo.multitenancy;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import javax.persistence.EntityManagerFactory;
//import javax.sql.DataSource;
//
//import org.hibernate.MultiTenancyStrategy;
//import org.hibernate.cfg.Environment;
//import org.hibernate.context.spi.CurrentTenantIdentifierResolver;
//import org.hibernate.engine.jdbc.connections.spi.MultiTenantConnectionProvider;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import com.example.demo.common.DemoUtil;
//import com.fasterxml.jackson.core.type.TypeReference;
//
//
//
//@Configuration
//@EnableTransactionManagement
//public class MultiTenancyJpaConfiguration3 {
//
//    @Autowired
//    private JpaProperties jpaProperties;
//
//
//    /**
//     * Builds a map of all data sources defined in the application.yml file
//     * 
//     * @return
//     */
//    @SuppressWarnings("unchecked")
//    @Primary
//    @Bean(name = "dataSourcesMtApp")
//    public Map<String, DataSource> dataSourcesMtApp() {
//
//        List<DataSourceProperties> DataSourceList =
//                (List<DataSourceProperties>) DemoUtil.readJsonFile("D:\\datasource.json", new TypeReference<List<DataSourceProperties>>() {});
//        System.out.println(DataSourceList.toString());
//
//        Map<String, DataSource> result = new HashMap<>();
//        for (DataSourceProperties dsProperties : DataSourceList) {
//
//            DataSourceBuilder<?> factory = DataSourceBuilder.create().url(dsProperties.getUrl()).username(dsProperties.getUsername())
//                    .password(dsProperties.getPassword()).driverClassName(dsProperties.getDriverClassName());
//
//            result.put(dsProperties.getTenantId(), factory.build());
//        }
//        return result;
//    }
//
//    /**
//     * Autowires the data sources so that they can be used by the Spring JPA to access the database
//     * 
//     * @return
//     */
//    @Bean
//    public MultiTenantConnectionProvider multiTenantConnectionProvider() {
//        System.out.println("multiTenantConnectionProvider");
//        // Autowires dataSourcesMtApp
//        return new DataSourceBasedMultiTenantConnectionProviderImpl();
//    }
//
//    /**
//     * Since this is a multi-tenant application, Hibernate requires that the current tenant
//     * identifier is resolved for use with {@link org.hibernate.context.spi.CurrentSessionContext}
//     * and {@link org.hibernate.SessionFactory#getCurrentSession()}
//     * 
//     * @return
//     */
//    @Bean
//    public CurrentTenantIdentifierResolver currentTenantIdentifierResolver() {
//        System.out.println("currentTenantIdentifierResolver");
//        return new CurrentTenantIdentifierResolverImpl();
//    }
//
//    /**
//     * org.springframework.beans.factory.FactoryBean that creates a JPA
//     * {@link javax.persistence.EntityManagerFactory} according to JPA's standard container
//     * bootstrap contract. This is the most powerful way to set up a shared JPA EntityManagerFactory
//     * in a Spring application context; the EntityManagerFactory can then be passed to JPA-based
//     * DAOs via dependency injection. Note that switching to a JNDI lookup or to a
//     * {@link org.springframework.orm.jpa.LocalEntityManagerFactoryBean} definition is just a matter
//     * of configuration!
//     * 
//     * @param multiTenantConnectionProvider
//     * @param currentTenantIdentifierResolver
//     * @return
//     */
//    @Bean
//    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean(MultiTenantConnectionProvider multiTenantConnectionProvider,
//            CurrentTenantIdentifierResolver currentTenantIdentifierResolver) {
//        System.out.println("entityManagerFactoryBean");
//        Map<String, Object> hibernateProps = new HashMap<>();
//        hibernateProps.putAll(this.jpaProperties.getProperties());
//        hibernateProps.put(Environment.MULTI_TENANT, MultiTenancyStrategy.DATABASE);
//        hibernateProps.put(Environment.MULTI_TENANT_CONNECTION_PROVIDER, multiTenantConnectionProvider);
//        hibernateProps.put(Environment.MULTI_TENANT_IDENTIFIER_RESOLVER, currentTenantIdentifierResolver);
//
//        // No dataSource is set to resulting entityManagerFactoryBean
//        LocalContainerEntityManagerFactoryBean result = new LocalContainerEntityManagerFactoryBean();
//        result.setPackagesToScan("com.example.demo");
//        result.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
//        result.setJpaPropertyMap(hibernateProps);
//
//        return result;
//    }
//
//    /**
//     * Interface used to interact with the entity manager factory for the persistence unit.
//     * 
//     * @param entityManagerFactoryBean
//     * @return
//     */
//    @Bean
//    public EntityManagerFactory entityManagerFactory(LocalContainerEntityManagerFactoryBean entityManagerFactoryBean) {
//        System.out.println("entityManagerFactory");
//        return entityManagerFactoryBean.getObject();
//    }
//
//    @Bean
//    public PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
//        System.out.println("transactionManager");
//        return new JpaTransactionManager(entityManagerFactory);
//    }
//}
