package ru.geekbrains.lesson7.observer;

import java.util.Random;

public class Company {

    private Random random = new Random();

    Publisher jobAgency;

    private String name;

    private int maxSalary;
    private Vacancy vacancy;

    public Company(Publisher jobAgency, String vacancyName, String name, int maxSalary) {
        this.jobAgency = jobAgency;
        this.name = name;
        this.maxSalary = maxSalary;
        this.vacancy = Vacancy.valueOf(vacancyName.toUpperCase());
    }

    public void needEmployee(){
        int salary = random.nextInt(maxSalary);
        jobAgency.sendOffer(name, vacancy, salary);
    }

}
