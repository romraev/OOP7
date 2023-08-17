package ru.geekbrains.lesson7.observer;

public class Student implements Observer {

    private String name;
    private Vacancy vacancy;
    int salary = 2000;

    public Student(String name, String vacancyName) {
        this.vacancy = Vacancy.valueOf(vacancyName.toUpperCase());
        this.name = name;
    }

    @Override
    public void receiveOffer(String nameCompany, Vacancy vacancy, int salary) {
        if (this.salary <= salary && this.vacancy.equals(vacancy)){
            System.out.printf("Student %s: Мне нужна эта работа! (company: %s; vacancy: %s, salary: %d)\n", name,
                    nameCompany, vacancy, salary);
            this.salary = salary;
            this.vacancy = vacancy;
        }
        else {
            System.out.printf("Student %s: Я найду работу получше! (company: %s; salary: %d)\n", name,
                    nameCompany, salary);
        }
    }
}
