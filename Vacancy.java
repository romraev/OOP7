package ru.geekbrains.lesson7.observer;

public enum Vacancy {
    PROGRAMMER("Программист"),
    ANALYST("Аналитик"),
    TESTER("Тестировщик");
    

    private String vacancyName;

    Vacancy(String vacancyName) {
        this.vacancyName = vacancyName;
    }

    @Override
    public String toString() {
        return vacancyName;
    }
}
