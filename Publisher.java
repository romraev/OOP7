package ru.geekbrains.lesson7.observer;


/**
 * Интерфейс рассылки вакансий.
 *
 */
public interface Publisher {

    void sendOffer(String companyName, Vacancy vacancy, int salary);

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);


}
