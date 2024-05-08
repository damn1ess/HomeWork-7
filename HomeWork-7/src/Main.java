public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Задача 1");
        int i = 1;
        int savings = 0;
        int deposit = 15_000;
        while (savings < 2_459_000) {
            System.out.println("Месяц " + i + " сумма накоплений равна " + savings + " рублей.");
            i++;
            savings = savings + deposit;
        }

        //Task 2
        System.out.println("\nЗадача 2");
        int a = 1;
        while (a <= 10) {
            System.out.print(a + " ");
            a++;
        }
        System.out.println();
        for (int b = 10; b > 0; b--) {
            System.out.print(b + " ");
        }
        System.out.println();

        
        //Task 3
        System.out.println("\nЗадача 3");
        int population = 12_000_000;
        int year = 1;
        int birthRate = 17;
        int mortalityRate = 8;
        int populationGrowth = (birthRate - mortalityRate) * (population / 1000);
        while (year <= 10) {
            System.out.println("Год " + year + ", численность населения составляет " + population + " человек.");
            year++;
            population = population + populationGrowth;
        }

        //Task 4
        System.out.println("\nЗадача 4");
        double capital = 15_000;
        int month = 1;
        while (capital <= 12_000_000) {
            System.out.println("Месяц " + month + ", сумма накоплений - " + Math.round(capital) + " рублей.");
            capital = capital + capital * 0.07;
            month++;
        }


        //Task 5
        double capital1 = 15_000;
        int month1 = 1;
        System.out.println("\nЗадача 5");
        while (capital1 <= 12_000_000) {
            capital1 = capital1 + capital1 * 0.07;
            month1++;
            if (month1 % 6 == 0) {
                System.out.println("Месяц " + month1 + ", сумма накоплений - " + Math.round(capital1) + " рублей.");
            }
        }


        //Task 6
        System.out.println("\nЗадача 6");
        double capitalOfVasiliy = 15_000;
        for (int monthsOfYear = 1; monthsOfYear <= 108; monthsOfYear++) {
            capitalOfVasiliy = capitalOfVasiliy + capitalOfVasiliy * 0.07;
            if (monthsOfYear % 6 == 0) {
                System.out.println("Месяц " + monthsOfYear + ", сумма накоплений - " + Math.round(capitalOfVasiliy) + " рублей.");
        }
            }


        //Task 7
        System.out.println("\nЗадача 7");
        int friday;
        for (friday = 4; friday <= 31; friday = friday + 7) {
            System.out.println("Сегодня пятница - " + friday + "-е число. Необходимо составить отчёт");
        }


        //Task 8
        System.out.println("\nЗадача 8");
        int years;
        int twoHundredsYearsAgo = 1824;
        int oneHundredYearsLater = 2124;
        for (years = 0; years <= 2124; years = years + 79) {
            if (years >= twoHundredsYearsAgo && years <= oneHundredYearsLater) {
                System.out.println(years);
            }
        }
    }
}