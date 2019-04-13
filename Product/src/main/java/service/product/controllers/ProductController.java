package service.product.controllers;


import service.product.service.ProductService;
import service.orgnization.sw.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;
    @RequestMapping(value = "/api/getProduct",method = RequestMethod.GET)
    public Product getCustomer(@RequestParam(value="id", defaultValue="1") int id){
       return productService.getProduct(id);
    }
}
