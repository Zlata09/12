package org.example;

public class Tester {
    private String name;
    private String surname;
    private int experienceInYears;
    private String englishLevel;
    private double salary;

    // Конструктор без параметров
    public Tester() {
        this("Ztghy", "xdcfvbnj", 0, "tdgtgugg", 454.454);
    }

    // Конструктор с двумя параметрами
    public Tester(String name, String surname) {
        this(name, surname, 0, "Unknown", 0.0);
    }

    // Конструктор с пятью параметрами
    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    // Перегруженные методы
    public void printInfo() {
        System.out.println("Name: " + name + ", Surname: " + surname);
    }

    public void printInfo(boolean showExperience) {
        System.out.println("Name: " + name + ", Surname: " + surname +
                (showExperience ? ", Experience: " + experienceInYears + " years" : ""));
    }

    public void printInfo(boolean showExperience, boolean showSalary) {
        System.out.println("Name: " + name + ", Surname: " + surname +
                (showExperience ? ", Experience: " + experienceInYears + " years" : "") +
                (showSalary ? ", Salary: $" + salary : ""));
    }

    // Статический метод
    public static void printStaticMessage() {
        System.out.println("This is a static method in Tester class.");
    }
}
