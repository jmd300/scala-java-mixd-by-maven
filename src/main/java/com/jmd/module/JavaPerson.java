//package com.jmd.module;
//
//import com.jmd.module.ScalaPerson;
//
//public class JavaPerson {
//    String name;
//    Integer age;
//
//    public String getName() {
//        return name;
//    }
//
//    public Integer getAge() {
//        return age;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setAge(Integer age) {
//        this.age = age;
//    }
//
//    @Override
//    public String toString() {
//        return "jmd.JavaEntity{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
//
//    public static void main(String[] args) {
//        var entity = new JavaPerson();
//        entity.setAge(20);
//        entity.setName("ha");
//        System.out.println(entity.getAge());
//        System.out.println(entity);
//
//        var scalaPerson = new ScalaPerson("java", 20);
//        System.out.println("scalaPerson is: " + scalaPerson);
//    }
//}
