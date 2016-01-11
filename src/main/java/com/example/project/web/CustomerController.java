package com.example.project.web;

import com.example.project.domain.customer.Customer;
import com.example.project.service.customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by Administrator on 2015/12/23 0023.
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @RequestMapping("/create")
    public Customer create() {
        customerService.create();
        Customer customer = new Customer("HUANGBIN",new Date());
        return customer;
    }
}
