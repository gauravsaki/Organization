package service.product.service.impl;


import service.product.service.ProductService;
import service.orgnization.sw.pojo.Product;

public class ProductServiceImp implements ProductService {

    @Override
    public Product getProduct(int prodId) {
        Product product = new Product();
        product.setName("Tv");
        product.setPrice(4556.8f);
        return product;
    }
}
