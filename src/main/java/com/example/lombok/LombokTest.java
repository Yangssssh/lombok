package com.example.lombok;

import com.example.lombok.entity.People;

/**
 * @author Y.sh
 * @date 2019/10/22 17:49
 * @Description
 */
public class LombokTest {
    public static void main(String arg[]){
        People people=new People();
        people.setName("Y.sh");
        people.setAddress("China");
        people.setNumber("123321");
        System.out.println(people.getName()+people.getAddress()+people.getNumber());
        System.out.println(people.toString());
    }
}
