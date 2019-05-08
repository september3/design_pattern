package com.design.principle.openclose;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 *  -@AllArgsConstructor 全参构造器注解
 * @author sunlele
 * @className JavaCourse
 * @date 2019/5/8 15:25
 **/
@AllArgsConstructor
@NoArgsConstructor
public class JavaCourse implements ICourse {

    private Integer id;
    private String name;
    private Double price;

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Double getPrice() {
        return this.price;
    }
}
