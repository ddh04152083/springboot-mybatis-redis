package com.ddh.redis.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * <Description> <br>
 *
 * @author ddh<br>
 * @version 1.0<br>
 * @taskId: <br>
 * @createDate 2019/08/20 22:32 <br>
 * @see com.ddh.redis <br>
 */
@Setter
@Getter
@ToString
public class Product implements Serializable {
    private static final long serialVersionUID = 1435515995276255188L;
    private long id;
    private String name;
    private double price;
}
