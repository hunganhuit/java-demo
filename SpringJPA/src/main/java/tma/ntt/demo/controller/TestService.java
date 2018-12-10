package tma.ntt.demo.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tma.ntt.demo.entity.Product;
import tma.ntt.demo.repository.ProductRepository;


public class TestService {
    @Autowired
    ProductRepository productRepository;
    
    @PersistenceContext
    private EntityManager manager;
    
    public void test() {
        productRepository.updatePrice("name8", 2005);
        productRepository.updatePrice("name99", "abc");
        List<Product> products = productRepository.listAll();
        for (Product product : products) {
            System.out.println(product.getName() + "-------------" + product.getPrice());
        }
    }
    
    
    
    public void getAllEmployees()
    {
        manager.getTransaction().begin();
        try {
            //do something
            
            manager.getTransaction().commit();
        } catch (Exception e) {
            manager.getTransaction().rollback();
        }
        

    }
}
