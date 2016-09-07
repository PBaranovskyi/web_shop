package org.midnightcoding.services;

import org.midnightcoding.entities.Customer;
import org.midnightcoding.entities.Order;
import org.midnightcoding.entities.Product;
import org.midnightcoding.repositories.CustomerRepository;
import org.midnightcoding.repositories.OrderRepository;
import org.midnightcoding.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by red3 on 9/7/2016.
 */
@Controller
public class MainController {
    @Autowired
    private CustomerRepository custRepo;

    @Autowired
    private OrderRepository orderRepo;

    @Autowired
    private ProductRepository productRepo;

    @RequestMapping("/getView")
    public String getAll(Model model){
        List<Order> orders = orderRepo.findAll();
        model.asMap().put("orders", orders);

        List<Customer> customers = custRepo.findAll();
        model.asMap().put("customers", orders);

        List<Product> products = productRepo.findAll();
        model.asMap().put("products", orders);

        return "mainView";
    }
}
