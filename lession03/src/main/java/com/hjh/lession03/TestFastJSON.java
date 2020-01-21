package com.hjh.lession03;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.hjh.lession03.com.hjh.lession03.bean.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestFastJSON {

    //将类的对象转成json对象
    @Test
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

        String jString = JSONObject.toJSONString(p1);
        System.out.println(jString);
    }

    //将json字符串转成对象
    @Test
    public void test2(){
        String jString = "{\"age\":25,\"id\":3,\"name\":\"XJP\",\"sex\":\"male\"}";
        Person p3 = JSON.parseObject(jString,Person.class);
        System.out.println(p3.getName());
    }
}
