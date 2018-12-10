package tma.ntt.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import tma.ntt.demo.entity.Product;

@Repository
@Transactional
public interface ProductRepository extends JpaRepository<Product, Integer> {

    // Query creation from method names
    public List<Product> findByPrice(int price);

    public List<Product> findByPriceOrderByNameDesc(int price);

    // Query using NamedQuery
    public Product findbyNamedQuery(String NamedQuery1);

    // @Query With JPQL
    @Query(value = "select p from Product p")
    public List<Product> listAll();

    // @Query With native SQL
    @Query(value = "select * from product p where p.price between :price1 and :price2 ", nativeQuery = true)
    public List<Product> findByPrice(@Param("price1") int price1, @Param("price2") int price2);
    
    @Transactional
    @Modifying
    @Query("update Product p set p.price = ?2 where p.name = ?1")
    public void updatePrice(String name, int price);
    
    @Transactional
    @Modifying
    @Query("update Product p set p.price = ?2 where p.name = ?1")
    public void updatePrice(String name, String price);

}
