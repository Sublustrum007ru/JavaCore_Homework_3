package controller.impl;

import controller.Employee;

import java.time.LocalDate;

public class Junior extends Employee {
    public Junior(String name, String midName, String surName, String position, String phone, int salary, LocalDate birthDay) {
        super(name, midName, surName, position, phone, salary, birthDay);
    }
}
