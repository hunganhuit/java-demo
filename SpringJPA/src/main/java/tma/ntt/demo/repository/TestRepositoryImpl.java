package tma.ntt.demo.repository;

import java.util.Properties;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Repository;

@Repository
public class TestRepositoryImpl implements TestRepository {
    private EntityManagerFactory factory;
    @Autowired
    Environment environment;

    @Override
    public void Test1() {
        Properties jpaProperties = new Properties();
        jpaProperties.put("hibernate.dialect", environment.getRequiredProperty("hibernate.dialect"));
        jpaProperties.put("hibernate.hbm2ddl.auto", environment.getRequiredProperty("hibernate.hbm2ddl.auto"));
        jpaProperties.put("hibernate.show_sql", environment.getRequiredProperty("hibernate.show_sql"));
        jpaProperties.put("hibernate.format_sql", environment.getRequiredProperty("hibernate.format_sql"));
        factory = Persistence.createEntityManagerFactory("PU", jpaProperties);
        EntityManager em = factory.createEntityManager();


    }
}
