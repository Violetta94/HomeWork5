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
        if (year%4==0 && year%100!=0 || year%400==0) {
            System.out.println(year + " год является високосным ");
        } else System.out.println(year + " год не является високосным");

 // Задание 4
        int deliveryDistance = 95;//  содержит дистанцию до клиента
        int deliveryDay = 1;
        if (deliveryDistance<20) {
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (deliveryDistance>=20 && deliveryDistance <60) {
            deliveryDay = deliveryDay + 1;
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (deliveryDistance>=60 && deliveryDistance <100) {
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
    }
}