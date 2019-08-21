package com.ddh.redis.controller;

import com.ddh.redis.entity.Product;
import com.ddh.redis.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * <Description> <br>
 *
 * @author ddh<br>
 * @version 1.0<br>
 * @taskId: <br>
 * @createDate 2019/08/20 22:34 <br>
 * @see com.ddh.redis.controller <br>
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/get/{id}")
    public Product getProductInfo(@PathVariable("id") Long id) {
        return productService.getOne(id);
    }

    @PostMapping("/update")
    public String updateProductInfo(@RequestBody Product product) {
        if (product != null) {
            productService.update(product);
            return "更新成功";
        }else {
            return "更新失败";
        }

    }

    @PostMapping("/add")
    public String addProductInfo(@RequestBody Product product) {
        if (product != null) {
            productService.add(product);
            return "添加成功";
        }else {
            return "添加失败";
        }

    }
}
