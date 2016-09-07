package org.midnightcoding.repositories;

import org.midnightcoding.entities.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by red3 on 9/7/2016.
 */
@Repository
public interface OrderRepository extends Repository {
    List<Order> findAll();
}
