public class Main {
    public static void main(String[] args){
        task1();
        task2();
        task3();


    }
    public static void task1(){
        System.out.println("Задание 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        System.out.println("ФИО сотрудника - " + lastName + " " + firstName + " " + middleName);
    }
    public static void task2(){
        System.out.println("Задание 2");
        String fullName = "Ivanov Ivan Ivanovich";
        String s1 = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + s1);
    }
    public static void task3(){
        System.out.println("Задание 3");
        String fullName = "Иванов Семён Семёнович";
        String s1 = fullName.replace('ё','е');

        System.out.println("Данные ФИО сотрудника — " + s1);

    }
}

