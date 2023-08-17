package ru.geekbrains.lesson7.observer;

public class Program {

    /**
     * TODO: Доработать приложение, которое разрабатывалось на семинаре, поработать с шаблоном проектирования Observer,
     *  добавить новый тип соискателя.
     *  Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  Только после этого вы можете усложнить ваше приложение (при желании), например, добавить тип вакансии (enum), учитывать тип вакансии при отправке предложения соискателю.
     * @param args
     */
    public static void main(String[] args) {
        Publisher jobAgency = new JobAgency();
        Company googleDev = new Company(jobAgency, "programmer", "Google", 120000);
        Company googleAnalytics = new Company(jobAgency, "analyst", "Google", 150000);
        Company yandexTest = new Company(jobAgency, "tester", "Yandex", 95000);
        Company geekBrainsDev = new Company(jobAgency, "programmer", "GeekBrains", 90000);

        Student pertov = new Student("Petrov", "programmer");
        Master master = new Master("Ivanov", "analyst");
        Master sidorov = new Master("Sidorov", "tester");
        Middle ivanov = new Middle("Ivanov", "programmer");
        Middle pupkin = new Middle("Pupkin", "analyst");

        jobAgency.registerObserver(pertov);
        jobAgency.registerObserver(master);
        jobAgency.registerObserver(sidorov);
        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(pupkin);

        for (int i = 0; i < 2; i++){
            googleDev.needEmployee();
            googleAnalytics.needEmployee();
            yandexTest.needEmployee();
            geekBrainsDev.needEmployee();
        }


    }

}
