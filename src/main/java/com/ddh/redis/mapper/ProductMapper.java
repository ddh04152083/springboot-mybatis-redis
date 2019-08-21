package com.ddh.redis.mapper;

import com.ddh.redis.entity.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * <Description> <br>
 *
 * @author ddh<br>
 * @version 1.0<br>
 * @taskId: <br>
 * @createDate 2019/08/20 22:41 <br>
 * @see com.ddh.redis.mapper <br>
 */
@Repository
public interface ProductMapper {
    /**
     * 根据id查询到一条数据
     *
     * @param id
     * @return
     */
    Product getOne(@Param("id") long id);

    /**
     * 更新数据
     *
     * @param product
     */
    void update(Product product);

    void add(Product product);
}
