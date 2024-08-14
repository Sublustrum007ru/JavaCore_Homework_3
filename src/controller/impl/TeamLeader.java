package controller.impl;

import controller.Employee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TeamLeader extends Employee {

    public TeamLeader(String name, String midName, String surName, String position, String phone, double salary, LocalDate birthDay) {
        super(name, midName, surName, position, phone, salary, birthDay);
    }

    public TeamLeader() {
        super();
    }

    public static List<Employee> updateSalary(ArrayList<Employee> employList, double percent){
        for(Employee o : employList){
            if(!o.getPosition().equals("TeamLeader")){
                o.setSalary(o.getSalary() + (o.getSalary() * (percent / 100)) );
            }
        }
        return employList;
    }
}
