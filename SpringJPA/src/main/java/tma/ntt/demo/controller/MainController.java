package tma.ntt.demo.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tma.ntt.demo.entity.Product;
import tma.ntt.demo.repository.ProductRepository;

@RestController
public class MainController {


    private static final Logger logger = LoggerFactory.getLogger(MainController.class);

    @Autowired
    TestService testService;

    @Autowired
    ProductRepository productRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String test() {

        return "Hello";

    }

    @RequestMapping(value = "/save", method = RequestMethod.GET)
    public String test2() {
        Product product = new Product();
        product.setName("name11");
        product.setPrice(150);
        productRepository.save(product);
        return "saved";

    }

    @RequestMapping(value = "/findbyprice", method = RequestMethod.GET)
    public String test3() {
        logger.debug("----------Find by price-------------");
        List<Product> products = productRepository.findByPrice(200);
        for (Product product : products) {
            System.out.println(product.getName() + "-------------" + product.getPrice());
        }
        return "findbyprice";
    }

    @RequestMapping(value = "/findbyprice2", method = RequestMethod.GET)
    public String test31() {
        logger.debug("----------------findbyprice");
        List<Product> products = productRepository.findByPriceOrderByNameDesc(200);
        for (Product product : products) {
            System.out.println(product.getName() + "-------------" + product.getPrice());
        }
        return "OK";
    }

    @RequestMapping(value = "/findall", method = RequestMethod.GET)
    public List<Product> test4() {
        System.out.println("Find all and Sort");
        List<Product> products = productRepository.findAll(new Sort(Direction.ASC, "price"));
        for (Product product : products) {
            System.out.println(product.getName() + "-------------" + product.getPrice());
        }
        System.out.println("FIND AND PAGING");
        Page<Product> products1 = productRepository.findAll(new PageRequest(1, 2));
        for (Product product : products1) {
            System.out.println(product.getName() + "-------------" + product.getPrice());
        }
        System.out.println();
        return products;
    }

    @RequestMapping(value = "/namedquery", method = RequestMethod.GET)
    public String test5() {
        System.out.println("Find by name using NamedQuery");
        Product product = productRepository.findbyNamedQuery("name2");
        System.out.println(product.getName() + "-------------" + product.getPrice());
        return "NamedQuery";

    }


    @RequestMapping(value = "/queryJPQL", method = RequestMethod.GET)
    public String test6() {
        System.out.println("Query all");
        List<Product> products = productRepository.listAll();
        for (Product product : products) {
            System.out.println(product.getName() + "-------------" + product.getPrice());
        }
        return "OK";

    }

    @RequestMapping(value = "/nativeSQL", method = RequestMethod.GET)
    public String test7() {
        System.out.println("Query with native SQL and @param");
        List<Product> products = productRepository.findByPrice(150, 200);
        for (Product product : products) {
            System.out.println(product.getName() + "-------------" + product.getPrice());
        }
        return "OK";

    }

    @RequestMapping(value = "/updatePrice", method = RequestMethod.GET)
    public String test8() {
        System.out.println("Update @Modifying");
        productRepository.updatePrice("name8", 2001);;
        Product product = productRepository.findbyNamedQuery("name8");
        System.out.println(product.getName() + "-------------" + product.getPrice());
        return "OK";

    }

    @RequestMapping(value = "/test123", method = RequestMethod.GET)
    public void test123() {
        testService.test();
    }
    
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }
}
