package view;

import controller.Animal;
import controller.Employee;
import controller.impl.Cat;
import controller.impl.Junior;
import controller.impl.TeamLeader;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Application {

    private static final TeamLeader tl = new TeamLeader();
    private static ArrayList<Employee> employList = new ArrayList<Employee>();

    public static void run(){
        System.out.println("Hello world!!!\n");

        Animal cat_1 = new Cat("Cat", "Pushok", 2, 6, 3);
        System.out.println(cat_1);
        Junior jun1 = new Junior("Anton","Gusev","Sergeevich","Junior","+7(906)0884050",50000, LocalDate.of(1986, 03,31));
        TeamLeader teamLed1 = new TeamLeader("Nataliya", "Guseva", "Alexandrovna", "TeamLeader", "+7(926)1856243", 100000, LocalDate.of(1975, 10, 16));
        Junior jun2 = new Junior("Sergey", "Gusev", "Valentinovich", "Junior", "89032949516", 67500, LocalDate.of(1958,01,23));
        addEmploy(jun1);
        addEmploy(teamLed1);
        addEmploy(jun2);
        System.out.println("\nTastk1\n");
        System.out.println("Список сотрудников до сортировки по возрасту (от старшего до младшго):");
        System.out.println(employList);
        Collections.reverse(employList);
        System.out.println("Список сотрудников после сортировки:");
        System.out.println(employList);
        System.out.println("\nTask2\n");
        System.out.println("Список сотрудников до изменения зарплаты");
        System.out.println(employList);
        int percent = 6; // Процент выраженный в числовом виде, на сколько поднять зарплату сотрудникам
        tl.updateSalary(employList, percent);
        System.out.println("Список сотрудников после изменения зарплаты");
        System.out.println(employList);
        System.out.println("********************");
        if(jun1.getAge() > teamLed1.getAge()){
            System.out.println(jun1.getName() + " стареше " + teamLed1.getName());
        }else if (jun1.getAge() < teamLed1.getAge()){
            System.out.println(jun1.getName() + " младше " + teamLed1.getName());
        }else{
            System.out.println(jun1.getName() + " и " + teamLed1.getName() + " родились в один день ))");
        }

    }

    public static void addEmploy(Employee employ){
        employList.add(employ);
    }


}
