public class Main {
    public static void main(String[] args) {
// Задание 1
        int clientOS = 1; // (0 — iOS, 1 — Android)
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
// Задание 2
        int clientOS1 = 0; // (0 — iOS, 1 — Android)
        int clientDeviceYear = 2015; // год производства телефона
        if (clientOS1 == 1) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else if (clientOS1 == 0) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }
/* Задание 3
Небольшая справка: високосным является каждый четвертый год, но не является каждый сотый.
Также високосным является каждый четырехсотый год.
 */
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным ");
        } else System.out.println(year + " год не является високосным");

        // Задание 4
        int deliveryDistance = 95;//  содержит дистанцию до клиента
        int deliveryDay = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryDay = deliveryDay + 1;
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            deliveryDay = deliveryDay + 2;
            System.out.println("Потребуется дней: " + deliveryDay);
        }
// Задание 5

        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Сезон: зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сезон: весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сезон: лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сезон: осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }

        // Задача 6

        int age2 = 29;
        int salary = 80000;
        double limit;
        if (age2 >= 23) {
            if (salary >= 80000) {
                limit = salary * 3 * 1.5;
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей");
            } else if (salary >= 50000) {
                limit = salary * 3 * 1.2;
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей");
            } else {
                limit = salary * 3;
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей");
            }
        } else if (age2 < 23 && age2 >= 16) {
            if (salary >= 80000) {
                limit = salary * 2 * 1.5;
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей");
            } else if (salary >= 50000) {
                limit = salary * 2 * 1.2;
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей");
            } else {
                limit = salary * 2;
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей");
            }
        }
// Задача 7
        int age3 = 25;
        int salary2 = 60000;
        int wantedSum = 330000;
        double percent = 10;
        int mountCredit = 12;
        double monthlyPayment;
        double maxPayment = (int)salary2 * 0.5; // Максимальный ежемесячный платеж (50% от зп)

        if (age3 >= 30) {
            if (salary2 >= 80000) {
                monthlyPayment = (float)(wantedSum * (1 + (percent - 0.7) / 100)) / mountCredit;
            } else monthlyPayment =(float)(wantedSum * (1 + (percent / 100))) / mountCredit;
        } else if (age3 < 30 && age3 >= 23) {
            if (salary2 >= 80000) {
                monthlyPayment = (float)(wantedSum * (1 + (percent + 0.5 - 0.7) / 100)) / mountCredit;
            } else monthlyPayment = (float)(wantedSum * (1 + (percent + 0.5) / 100)) / mountCredit;
        } else {
            if (salary2 >= 80000) {
                monthlyPayment = (float)(wantedSum * (1 + (percent + 1 - 0.7) / 100)) / mountCredit;
            } else monthlyPayment = (float)(wantedSum * (1 + (percent + 1) / 100)) / mountCredit;
        }

        if (maxPayment < monthlyPayment) {
            System.out.println("Максимальный платеж при ЗП " + salary2 + " равен " + maxPayment + " рублей. Платеж по кредиту " + monthlyPayment + " рублей. Отказано" );
        } else System.out.println("Максимальный платеж при ЗП " + salary2 + " равен " + maxPayment + " рублей. Платеж по кредиту " + monthlyPayment + " рублей. Одобрено" );
    }
}