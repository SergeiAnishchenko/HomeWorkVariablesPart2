public class Main {
    public static void main(String[] args) {

        task1();
        System.out.println(" ");
        task2();
        System.out.println(" ");
        task3();
        System.out.println(" ");
        task4();
        System.out.println(" ");
        task5();
        System.out.println(" ");
        task6();
        System.out.println(" ");
        task7();
        System.out.println(" ");
        task8();

    }

    private static void task1() {
        System.out.println("Задача 1");

        byte b = 1;
        short sh = 128;
        int i = 33000;
        long l = 3000000000L;
        float fl = 1.5F;
        double d = 1.5555555555;

        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной sh с типом short равно " + sh);
        System.out.println("Значение переменной i с типом int равно " + i);
        System.out.println("Значение переменной l с типом long равно " + l);
        System.out.println("Значение переменной fl с типом float равно " + fl);
        System.out.println("Значение переменной d с типом double равно " + d);

    }

    private static void task2() {
        System.out.println("Задача 2");

        float fl = 27.12F;
        long l = 987678965549L;
        double d = 2.786;
        short sh = 569;
        short sh2 = -159;
        short sh3 = 27897;
        byte b = 67;

        System.out.println("Переменные успешно инициализированы:\n" + "float fl = " + fl + "\n" + "long l = " + l +
                "\n" + "double d = " + d + "\n" + "short sh = " + sh + "\n" + "short sh2 = " + sh2 + "\n" +
                "short sh3 = " + sh3 + "\n" + "byte b = " + b);

    }

    private static void task3() {
        System.out.println("Задача 3");

        // int studentsNumber1 - это количество учеников в классе Людмилы Павловны
        int studentsNumber1 = 23;

        // int studentsNumber2 - это количество учеников в классе Анны Сергеевны
        int studentsNumber2 = 27;

        // int studentsNumber3 - это количество учеников в классе Екатерины Андреевны
        int studentsNumber3 = 30;

        int allStudentsNumber = studentsNumber1 + studentsNumber2 + studentsNumber3;
        int sheetsNumber = 480;
        int sheetsNumberForOneStudent = sheetsNumber / allStudentsNumber;
        System.out.println("На каждого ученика рассчитано " + sheetsNumberForOneStudent + " листов бумаги.");

    }

    private static void task4() {
        System.out.println("Задача 4");

        // int mashineProductivity - это производительность машины по производству бутылок за 2 минуты
        int mashineProductivity = 16;

        int bottlesNumber20Minutes = (mashineProductivity / 2) * 20;
        int bottlesNumberOneDay = (mashineProductivity / 2) * 60 * 24;
        int bottlesNumberThreeDays = (mashineProductivity / 2) * 60 * 24 * 3;
        int bottlesNumberOneMonth = (mashineProductivity / 2) * 60 * 24 * 30;
        System.out.println("За 20 минут машина произвела " + bottlesNumber20Minutes + " штук бутылок.");
        System.out.println("За один день машина произвела " + bottlesNumberOneDay + " штук бутылок.");
        System.out.println("За три дня машина произвела " + bottlesNumberThreeDays + " штук бутылок.");
        System.out.println("За месяц машина произвела " + bottlesNumberOneMonth + " штук бутылок.");
    }

    private static void task5() {
        System.out.println("Задача 5");

        // cansNumber - это общее количество банок краски двух цветов
        int cansNumber = 120;

        // cansOneClassroom - это расход краски двух цветов на один класс (2 банки белой и 4 банки коричневой)
        int cansOneClassroom = 6;

        // classroomsNumber - это количество классов в школе
        int classroomsNumber = cansNumber / cansOneClassroom;

        // cansWhitePaint - это количество банок белой краски
        int cansWhitePaint = classroomsNumber * 2;

        // cansBrownPaint - это количество банок коричневой краски
        int cansBrownPaint = classroomsNumber * 4;

        System.out.println("В школе, где " + classroomsNumber + " классов, нужно " + cansWhitePaint
                + " банок белой краски и " + cansBrownPaint + " банок коричневой краски.");
    }

    private static void task6() {
        System.out.println("Задача 6");

        int bananasNumber = 5;
        int oneBananaWeight = 80;
        int bananasWeight = bananasNumber * oneBananaWeight;

        int milkAmount = 200;
        int milkOnePortionAmount = 100;
        int milkPortionsNumber = milkAmount / milkOnePortionAmount;
        int milkOnePortionWeigt = 105;
        int milkWeight = milkPortionsNumber * milkOnePortionWeigt;

        int iceCreamPortionsWeight = 100;
        int iceCreamPortionsNumber = 2;
        int iceCreamWeight = iceCreamPortionsWeight * iceCreamPortionsNumber;

        int oneEggWeight = 70;
        int eggsNumber = 4;
        int eggsWeight = oneEggWeight * eggsNumber;

        int breakfastWeightGram = bananasWeight + milkWeight + iceCreamWeight + eggsWeight;
        double breakfastWeightKilogram = (double) breakfastWeightGram / 1000;

        System.out.println("Вес завтрака в граммах составляет " + breakfastWeightGram + " грамм.");
        System.out.println("Вес завтрака в килограммах составляет " + breakfastWeightKilogram + " килограмм.");

    }

    private static void task7() {
        System.out.println("Задача 7");

        int excessWeightKilogram = 7;
        int excessWeightGram = excessWeightKilogram *1000;
        int weightLossOneDay250 = 250;
        int weightLossOneDay500 = 500;
        int daysNumber250 = excessWeightGram / weightLossOneDay250;
        int daysNumber500 = excessWeightGram / weightLossOneDay500;
        int averageDaysNumber = (daysNumber250 + daysNumber500) / 2;

        System.out.println("Для похудения потребуется " + daysNumber250 + " дней, если худеть на 250 грамм в день");
        System.out.println("Для похудения потребуется " + daysNumber500 + " дней, если худеть на 500 грамм в день");
        System.out.println("Для похудения потребуется " + averageDaysNumber + " дней в среднем");

    }

    private static void task8() {
        System.out.println("Задача 8");

        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        double salaryIncreaseCoefficient = 1.1;
        int newMashaSalary = (int) (mashaSalary * salaryIncreaseCoefficient);
        int newDenisSalary = (int) (denisSalary * salaryIncreaseCoefficient);
        int newKristinaSalary = (int) (kristinaSalary * salaryIncreaseCoefficient);
        int mashaIncomeIncrease = newMashaSalary - mashaSalary;
        int denisIncomeIncrease = newDenisSalary - denisSalary;
        int kristinaIncomeIncrease = newKristinaSalary - kristinaSalary;

        System.out.println("Маша теперь получает " + newMashaSalary + " рублей."
                + " Годовой доход вырос на " + mashaIncomeIncrease + " рублей.");
        System.out.println("Денис теперь получает " + newDenisSalary + " рублей."
                + " Годовой доход вырос на " + denisIncomeIncrease + " рублей.");
        System.out.println("Кристина теперь получает " + newKristinaSalary + " рублей."
                + " Годовой доход вырос на " + kristinaIncomeIncrease + " рублей.");
    }
}