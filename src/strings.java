public class strings {
    public static void main(String[] args) {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("��� ���������� � " + fullName);
        String fullNameCaps = fullName.toUpperCase();
        System.out.println("������ ��� ���������� ��� ���������� ������ � " + fullNameCaps);
        String fullNameAdmin = fullName.replace(" ", "; ");
        System.out.println("������ ��� ���������� ��� ����������������� ������ � " + fullNameAdmin);
        String fullName2 = "������ ���� ��������";
        String fullName2Replace = fullName2.replace("�", "�");
        System.out.println("������ ��� ���������� � " + fullName2Replace);
    }
}
