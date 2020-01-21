package com.hjh.lession03;

import com.hjh.lession03.com.hjh.lession03.bean.Person;
import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

public class TestFastJSON {

    //将类的对象转成json对象
    public void test1(){

        Person p1 = new Person();
        p1.setId(1);
        p1.setAge(20);
        p1.setName("hjh");
        p1.setSex("male");

        Person p2 = new Person(2,"LJC",21,"male");

        List<Person> list = new ArrayList<Person>();
        list.add(p1);
        list.add(p2);

        String jString = JSON.toJSONString(p1);
    }

}
