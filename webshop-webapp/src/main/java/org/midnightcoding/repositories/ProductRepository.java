package org.midnightcoding.repositories;

import main.java.org.midnightcoding.vo.ProductVO;
import org.midnightcoding.entities.Order;
import org.midnightcoding.entities.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by red3 on 9/7/2016.
 */
@Repository
public interface ProductRepository extends Repository {
    List<ProductVO> findAll();
}