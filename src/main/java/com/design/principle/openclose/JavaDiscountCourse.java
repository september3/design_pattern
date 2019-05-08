package com.design.principle.openclose;

/**
 * @author sunlele
 * @className JavaDiscountCourse
 * @date 2019/5/8 15:36
 **/
public class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public JavaDiscountCourse() {
    }

    public Double getDiscountPrice() {
        return super.getPrice() * 0.8;
    }
}
