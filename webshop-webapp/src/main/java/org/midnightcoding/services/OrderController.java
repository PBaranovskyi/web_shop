package org.midnightcoding.services;

import org.midnightcoding.entities.Order;
import org.midnightcoding.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by red3 on 9/7/2016.
 */
@Controller
public class OrderController {
    @Autowired
    private OrderRepository repo;

    @RequestMapping("/viewAll")
    public String viewAllOrders(Model model){
        List<Order> orders = repo.findAll();
        model.asMap().put("orders", orders);
        return "orderView";
    }
}
