package controller;

import java.time.LocalDate;
import java.time.Period;

public class Employee implements Comparable<Employee>{

    protected String name;
    protected String midName;
    protected String surName;
    protected String position;
    protected String phone;
    protected double salary;
    protected LocalDate birthDay;
    protected LocalDate currentDate = LocalDate.now();
    protected int age = getAge(birthDay, currentDate);



    public Employee(String name, String midName, String surName, String position, String phone, double salary, LocalDate birthDay){
        this.name = name;
        this.midName = midName;
        this.surName = surName;
        this.position= position;
        this.phone = phone;
        this.salary = salary;
        this.birthDay = birthDay;
        this.age = getAge(birthDay, currentDate);

    }

    public Employee() {

    }

    private int getAge(LocalDate birthDay, LocalDate currentDate){
            if ((birthDay != null) && (currentDate != null)) {
                return Period.between(birthDay, currentDate).getYears();
            } else {
                return 0;
            }
    }

    public String getName(){
        return name;
    }

    public String getMidName(){
        return midName;
    }

    public String getSurName(){
        return surName;
    }

    public String getPosition(){
        return position;
    }

    public String getPhone(){
        return phone;
    }

    public double getSalary(){
        return salary;
    }

    public LocalDate getBirthDay(){
        return birthDay;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setMidName(String midName){
        this.midName = midName;
    }

    public void setSurName(String surName){
        this.surName = surName;
    }

    public void setPosition(String position){
        this.position = position;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public void setBirthDay(LocalDate birthDay){
        this.birthDay = birthDay;
    }

    public void setAge(int age){
        this.age = age;

    }

    public int compareTo(Employee args){
        return (this.getAge() - args.getAge()) * -1;
    }

//    public String toString(){
//        return String.format("midName: %s, name: %s, surName: %s, position: %s, phone: %s, solary: %d, age: %d",midName, name, surName, position, phone, salary, getAge(birthDay, currentDate));
//    }

    public String toString(){
        return "Employee{" +
                "midName='" + midName + '\'' +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", position='" + position + '\'' +
                ", phone='" + phone + '\'' +
                ", salary='" + salary + '\'' +
                ", age='" + getAge(birthDay, currentDate) + '\'' +
                '}';
    }
}
