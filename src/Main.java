public class Main {
    public static void main(String[] args) {
        //task 1
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("Ф.И.О. сотрудника - " + fullName);

        //task 2
        String fullName2 = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName2);

        //task 3
        String fullName3 = "Иванов Семён Семёнович";
        System.out.println("Данные Ф. И. О. сотрудника — " + fullName3.replace("ё", "е"));
    }
}