package Hospital;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
        System.out.println(HOSPITALSSS.AVAEVCLINIC);
        System.out.println(HOSPITALSSS.CLINIC2);
        System.out.println(HOSPITALSSS.CLINIC1);
        System.out.println(HOSPITALSSS.WOMENCLINIC);


    }
    private static void menu(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите персональные данные: ");
        System.out.print("Полис ОМС: ");
        String polis=scanner.next();
        System.out.println();
        System.out.print("Дата рождения: ");
        String bornDate=scanner.next();
        System.out.println();
        System.out.print("Контактный телефон: ");
        String telephoneNumber=scanner.next();
        System.out.println();
    }
}
