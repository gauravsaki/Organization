package service.customer.service.impl;
import service.customer.service.CustomerService;
import service.orgnization.sw.pojo.Customer;


public class CustomerServiceImp implements CustomerService {
    @Override
    public Customer getCustomer(int custId) {
        Customer customer = new Customer();
        customer.setCustId(custId);
        customer.setName("More");
        customer.setPinCode("452001");
        return customer;
    }
}
