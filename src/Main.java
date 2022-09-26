public class Main {
    public static void main(String[] args) {

        // Задача 6
        System.out.println("Задача 6");
        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        System.out.println("Общий вес двух бойцов: " + (boxer1Weight + boxer2Weight));
        System.out.println("Разница весов двух бойцов: " +(boxer2Weight - boxer1Weight));

        // Задача 7
        System.out.println("Задача 7");
        System.out.println("Разница весов двух бойцов: " + (boxer2Weight - boxer1Weight));
        System.out.println("Разница весов двух бойцов:(2 способ) " + (boxer2Weight % boxer1Weight));

        // Задача 8
        System.out.println("Задача 8");
        var totalWorkingHours = 640;
        var hoursPerDay = 8;
        var totalEmployees = totalWorkingHours / hoursPerDay;
        System.out.println("Всего работников в компании – " + totalEmployees + " человек ");

        totalEmployees = totalEmployees + 94;
        totalWorkingHours = totalEmployees * hoursPerDay;

        System.out.println("“Если в компании работает " + totalEmployees + " человек, то всего "+ totalWorkingHours + "часов работы может быть поделено между сотрудниками”");
        // ДЗ завершено















    }

}