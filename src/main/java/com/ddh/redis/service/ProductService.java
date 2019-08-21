package com.ddh.redis.service;

import com.ddh.redis.entity.Product;


/**
 * <Description> <br>
 *
 * @author ddh<br>
 * @version 1.0<br>
 * @taskId: <br>
 * @createDate 2019/08/20 22:44 <br>
 * @see com.ddh.redis.service <br>
 */
public interface ProductService {

    /**
     * 根据id查询到一条数据
     *
     * @param id
     * @return
     */
    Product getOne( long id);

    /**
     * 更新数据
     *
     * @param product
     */
    void update(Product product);

    void add(Product product);
}
