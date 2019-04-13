package service.product.controllers;


import service.orgnization.sw.pojo.Order;
import service.product.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;
    @RequestMapping(value = "/api/getOrder",method = RequestMethod.GET)
    public Order getCustomer(@RequestParam(value="id", defaultValue="1") int id){
       return orderService.getOrder(id);
    }
}
