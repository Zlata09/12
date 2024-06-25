package org.example;

public class Main {
    public static void main(String[] args) {
        // Пример вызова статического метода
        Tester.printStaticMessage();

        // Примеры использования перегруженных конструкторов и методов
        Tester tester1 = new Tester();
        Tester tester2 = new Tester("John", "Doe");
        Tester tester3 = new Tester("Jane", "Doe", 5, "Advanced", 75000.0);

        tester1.printInfo();
        tester2.printInfo(true);
        tester3.printInfo(true, true);
    }
}
