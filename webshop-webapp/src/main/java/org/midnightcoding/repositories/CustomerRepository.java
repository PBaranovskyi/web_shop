package org.midnightcoding.repositories;

import main.java.org.midnightcoding.vo.CustomerVO;
import org.midnightcoding.entities.Customer;
import org.midnightcoding.entities.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by red3 on 9/7/2016.
 */
@Repository
public interface CustomerRepository extends Repository {
    List<CustomerVO> findAll();
}
