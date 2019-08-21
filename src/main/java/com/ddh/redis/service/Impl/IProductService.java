package com.ddh.redis.service.Impl;

import com.ddh.redis.entity.Product;
import com.ddh.redis.mapper.ProductMapper;
import com.ddh.redis.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <Description> <br>
 *
 * @author Sunny<br>
 * @version 1.0<br>
 * @taskId: <br>
 * @createDate 2019/08/20 22:45 <br>
 * @see com.ddh.redis.service.Impl <br>
 */
@Service
public class IProductService implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    /**
     * @param id
     * @return
     */
    @Override
    public Product getOne(long id) {
        return productMapper.getOne(id);
    }

    @Override
    public void update(Product product) {
        productMapper.update(product);
    }

    @Override
    public void add(Product product) {
        productMapper.add(product);
    }
}
