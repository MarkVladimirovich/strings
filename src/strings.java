public class strings {
    public static void main(String[] args) {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
        String fullNameCaps = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameCaps);
        String fullNameAdmin = fullName.replace(" ", "; ");
        System.out.println("Данные ФИО сотрудника для административного отдела — " + fullNameAdmin);
        String fullName2 = "Иванов Семён Семёнович";
        String fullName2Replace = fullName2.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName2Replace);
    }
}
