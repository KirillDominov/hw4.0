public class Main {
    public static void main(String[] args) {
        System.out.println("Задача № 1");
        for (int i = 0; i < 10; i = i + 1) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Задача № 2");
        for (int i = 10; i > 0; i = i - 1) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Задача № 3");
        for (int i = 0; i < 18; i = i + 2) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Задача № 4");
        for (int i = 10; i > -11; i = i - 1) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Задача № 5");
        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.println(i + " год является високосным.");
        }
        System.out.println();
        System.out.println("Задача № 6");
        for (int i = 7; i < 99; i = i + 7) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Задача № 7");
        for (int i = 1; i < 513; i = i * 2) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Задача № 8");
        int accumulation = 29000;
        int deposit = 0;
        for (int i = 1; i < 13; i++) {
            deposit = deposit + accumulation;
            System.out.println("Месяц " + i + " сумма накоплений равна " + deposit + " рублей");
        }
        System.out.println();
        System.out.println("Задача № 9");
        int salary = 29000;
        int total = 0;
        for (int i = 0; i < 13; i++) {
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
        System.out.println();
        System.out.println("Задача № 10");
        int number = 2;
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(number + "*" + i + "=" + number * i);
        }
    }
}