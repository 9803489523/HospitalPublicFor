package Hospital;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }
    private static void menu(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите персональные данные: ");
        System.out.print(Doctor.ANSI_BLUE+"Имя: "+Doctor.ANSI_RESET);
        String name=scanner.next();
        System.out.println();
        System.out.print(Doctor.ANSI_BLUE+"Фамилия: "+Doctor.ANSI_RESET);
        String surname=scanner.next();
        System.out.println();
        System.out.print(Doctor.ANSI_BLUE+"Полис ОМС: "+Doctor.ANSI_RESET);
        String polis=scanner.next();
        System.out.println();
        System.out.print(Doctor.ANSI_BLUE+"Дата рождения: "+Doctor.ANSI_RESET);
        String bornDate=scanner.next();
        System.out.println();
        System.out.print(Doctor.ANSI_BLUE+"Контактный телефон: "+Doctor.ANSI_RESET);
        String telephoneNumber=scanner.next();
        System.out.println();
        System.out.println(Doctor.ANSI_YELLOW+"Выберете медицинское учреждение для записи к врачу"+Doctor.ANSI_RESET);
        System.out.println("1"+HOSPITALSSS.CLINIC1.getNameOfHospital()+"\n"+HOSPITALSSS.CLINIC1.getAddress());
        System.out.println("2"+HOSPITALSSS.CLINIC2.getNameOfHospital()+"\n"+HOSPITALSSS.CLINIC2.getAddress());
        System.out.println("3"+HOSPITALSSS.AVAEVCLINIC.getNameOfHospital()+"\n"+HOSPITALSSS.AVAEVCLINIC.getAddress());
        System.out.println("4"+HOSPITALSSS.WOMENCLINIC.getNameOfHospital()+"\n"+HOSPITALSSS.WOMENCLINIC.getAddress());
        int choose=scanner.nextInt();
        String priem="";
        int usl=0;
        int doc=0;
        int time=0;
        switch (choose) {
            case 1 -> {
                System.out.println(HOSPITALSSS.CLINIC1);
                System.out.println(Doctor.ANSI_BLUE + "Выберете услугу, врача и время записи на прием в формате: " + Doctor.ANSI_RESET
                        + Doctor.ANSI_RED + "\n{платный/бесплатный прием} {индекс услуги} {индекс врача} {индекс времени}");
                priem = scanner.next();
                usl = scanner.nextInt();
                doc = scanner.nextInt();
                time = scanner.nextInt();
                switch (priem) {
                    case "бесплатный" -> {
                        System.out.printf(Doctor.ANSI_CYAN + "%s, вы записались на бесплатный прием\n" + Doctor.ANSI_RESET, name);
                        HOSPITALSSS.CLINIC1.getPaidReception().getUslDocTime(usl, doc, time);
                        System.out.println(Doctor.ANSI_CYAN + "Данные клиента: " + Doctor.ANSI_RESET);
                        System.out.printf(Doctor.ANSI_YELLOW + "%s%s %s%s, дата рождения: %s%s\nПолис ОМС: %s%s\nКонтактный телефон: %s%s" + Doctor.ANSI_RESET, Doctor.ANSI_GREEN + name, Doctor.ANSI_YELLOW, Doctor.ANSI_GREEN + surname, Doctor.ANSI_YELLOW, Doctor.ANSI_GREEN + bornDate, Doctor.ANSI_YELLOW, Doctor.ANSI_GREEN + polis, Doctor.ANSI_YELLOW, Doctor.ANSI_GREEN + telephoneNumber, Doctor.ANSI_RESET);
                    }
                    case "платный" -> {
                        System.out.printf(Doctor.ANSI_CYAN + "%s, вы записались на платный прием\n" + Doctor.ANSI_RESET, name);
                        HOSPITALSSS.CLINIC1.getPaidReception().getUslDocTime(usl, doc, time);
                        System.out.println(Doctor.ANSI_CYAN + "Данные клиента: " + Doctor.ANSI_RESET);
                        System.out.printf(Doctor.ANSI_YELLOW + "%s%s %s%s, дата рождения: %s%s\nПолис ОМС: %s%s\nКонтактный телефон: %s%s" + Doctor.ANSI_RESET, Doctor.ANSI_GREEN + name, Doctor.ANSI_YELLOW, Doctor.ANSI_GREEN + surname, Doctor.ANSI_YELLOW, Doctor.ANSI_GREEN + bornDate, Doctor.ANSI_YELLOW, Doctor.ANSI_GREEN + polis, Doctor.ANSI_YELLOW, Doctor.ANSI_GREEN + telephoneNumber, Doctor.ANSI_RESET);
                    }
                }
            }
            case 2 -> {
                System.out.println(HOSPITALSSS.CLINIC2);
                System.out.println(HOSPITALSSS.CLINIC1);
                System.out.println(Doctor.ANSI_BLUE + "Выберете услугу, врача и время записи на прием в формате: " + Doctor.ANSI_RESET
                        + Doctor.ANSI_RED + "\n{платный/бесплатный прием} {индекс услуги} {индекс врача} {индекс времени}");
                priem = scanner.next();
                usl = scanner.nextInt();
                doc = scanner.nextInt();
                time = scanner.nextInt();
                switch (priem) {
                    case "бесплатный" -> {
                        System.out.printf(Doctor.ANSI_CYAN + "%s, вы записались на бесплатный прием\n" + Doctor.ANSI_RESET, name);
                        HOSPITALSSS.CLINIC1.getPaidReception().getUslDocTime(usl, doc, time);
                        System.out.println(Doctor.ANSI_CYAN + "Данные клиента: " + Doctor.ANSI_RESET);
                        System.out.printf(Doctor.ANSI_YELLOW + "%s%s %s%s, дата рождения: %s%s\nПолис ОМС: %s%s\nКонтактный телефон: %s%s" + Doctor.ANSI_RESET, Doctor.ANSI_GREEN + name, Doctor.ANSI_YELLOW, Doctor.ANSI_GREEN + surname, Doctor.ANSI_YELLOW, Doctor.ANSI_GREEN + bornDate, Doctor.ANSI_YELLOW, Doctor.ANSI_GREEN + polis, Doctor.ANSI_YELLOW, Doctor.ANSI_GREEN + telephoneNumber, Doctor.ANSI_RESET);
                    }
                    case "платный" -> {
                        System.out.printf(Doctor.ANSI_CYAN + "%s, вы записались на платный прием\n" + Doctor.ANSI_RESET, name);
                        HOSPITALSSS.CLINIC1.getPaidReception().getUslDocTime(usl, doc, time);
                        System.out.println(Doctor.ANSI_CYAN + "Данные клиента: " + Doctor.ANSI_RESET);
                        System.out.printf(Doctor.ANSI_YELLOW + "%s%s %s%s, дата рождения: %s%s\nПолис ОМС: %s%s\nКонтактный телефон: %s%s" + Doctor.ANSI_RESET, Doctor.ANSI_GREEN + name, Doctor.ANSI_YELLOW, Doctor.ANSI_GREEN + surname, Doctor.ANSI_YELLOW, Doctor.ANSI_GREEN + bornDate, Doctor.ANSI_YELLOW, Doctor.ANSI_GREEN + polis, Doctor.ANSI_YELLOW, Doctor.ANSI_GREEN + telephoneNumber, Doctor.ANSI_RESET);
                    }
                }
            }
            case 3 -> {
                System.out.println(HOSPITALSSS.AVAEVCLINIC);
                System.out.println(HOSPITALSSS.CLINIC1);
                System.out.println(Doctor.ANSI_BLUE + "Выберете услугу, врача и время записи на прием в формате: " + Doctor.ANSI_RESET
                        + Doctor.ANSI_RED + "\n{платный/бесплатный прием} {индекс услуги} {индекс врача} {индекс времени}");
                priem = scanner.next();
                usl = scanner.nextInt();
                doc = scanner.nextInt();
                time = scanner.nextInt();
                switch (priem) {
                    case "бесплатный" -> {
                        System.out.printf(Doctor.ANSI_CYAN + "%s, вы записались на бесплатный прием\n" + Doctor.ANSI_RESET, name);
                        HOSPITALSSS.CLINIC1.getPaidReception().getUslDocTime(usl, doc, time);
                        System.out.println(Doctor.ANSI_CYAN + "Данные клиента: " + Doctor.ANSI_RESET);
                        System.out.printf(Doctor.ANSI_YELLOW + "%s%s %s%s, дата рождения: %s%s\nПолис ОМС: %s%s\nКонтактный телефон: %s%s" + Doctor.ANSI_RESET, Doctor.ANSI_GREEN + name, Doctor.ANSI_YELLOW, Doctor.ANSI_GREEN + surname, Doctor.ANSI_YELLOW, Doctor.ANSI_GREEN + bornDate, Doctor.ANSI_YELLOW, Doctor.ANSI_GREEN + polis, Doctor.ANSI_YELLOW, Doctor.ANSI_GREEN + telephoneNumber, Doctor.ANSI_RESET);
                    }
                    case "платный" -> {
                        System.out.printf(Doctor.ANSI_CYAN + "%s, вы записались на платный прием\n" + Doctor.ANSI_RESET, name);
                        HOSPITALSSS.CLINIC1.getPaidReception().getUslDocTime(usl, doc, time);
                        System.out.println(Doctor.ANSI_CYAN + "Данные клиента: " + Doctor.ANSI_RESET);
                        System.out.printf(Doctor.ANSI_YELLOW + "%s%s %s%s, дата рождения: %s%s\nПолис ОМС: %s%s\nКонтактный телефон: %s%s" + Doctor.ANSI_RESET, Doctor.ANSI_GREEN + name, Doctor.ANSI_YELLOW, Doctor.ANSI_GREEN + surname, Doctor.ANSI_YELLOW, Doctor.ANSI_GREEN + bornDate, Doctor.ANSI_YELLOW, Doctor.ANSI_GREEN + polis, Doctor.ANSI_YELLOW, Doctor.ANSI_GREEN + telephoneNumber, Doctor.ANSI_RESET);
                    }
                }
            }
            case 4 -> {
                System.out.println(HOSPITALSSS.WOMENCLINIC);
                System.out.println(HOSPITALSSS.CLINIC1);
                System.out.println(Doctor.ANSI_BLUE + "Выберете услугу, врача и время записи на прием в формате: " + Doctor.ANSI_RESET
                        + Doctor.ANSI_RED + "\n{платный/бесплатный прием} {индекс услуги} {индекс врача} {индекс времени}");
                priem = scanner.next();
                usl = scanner.nextInt();
                doc = scanner.nextInt();
                time = scanner.nextInt();
                switch (priem) {
                    case "бесплатный" -> {
                        System.out.printf(Doctor.ANSI_CYAN + "%s, вы записались на бесплатный прием\n" + Doctor.ANSI_RESET, name);
                        HOSPITALSSS.CLINIC1.getPaidReception().getUslDocTime(usl, doc, time);
                        System.out.println(Doctor.ANSI_CYAN + "Данные клиента: " + Doctor.ANSI_RESET);
                        System.out.printf(Doctor.ANSI_YELLOW + "%s%s %s%s, дата рождения: %s%s\nПолис ОМС: %s%s\nКонтактный телефон: %s%s" + Doctor.ANSI_RESET, Doctor.ANSI_GREEN + name, Doctor.ANSI_YELLOW, Doctor.ANSI_GREEN + surname, Doctor.ANSI_YELLOW, Doctor.ANSI_GREEN + bornDate, Doctor.ANSI_YELLOW, Doctor.ANSI_GREEN + polis, Doctor.ANSI_YELLOW, Doctor.ANSI_GREEN + telephoneNumber, Doctor.ANSI_RESET);
                    }
                    case "платный" -> {
                        System.out.printf(Doctor.ANSI_CYAN + "%s, вы записались на платный прием\n" + Doctor.ANSI_RESET, name);
                        HOSPITALSSS.CLINIC1.getPaidReception().getUslDocTime(usl, doc, time);
                        System.out.println(Doctor.ANSI_CYAN + "Данные клиента: " + Doctor.ANSI_RESET);
                        System.out.printf(Doctor.ANSI_YELLOW + "%s%s %s%s, дата рождения: %s%s\nПолис ОМС: %s%s\nКонтактный телефон: %s%s" + Doctor.ANSI_RESET, Doctor.ANSI_GREEN + name, Doctor.ANSI_YELLOW, Doctor.ANSI_GREEN + surname, Doctor.ANSI_YELLOW, Doctor.ANSI_GREEN + bornDate, Doctor.ANSI_YELLOW, Doctor.ANSI_GREEN + polis, Doctor.ANSI_YELLOW, Doctor.ANSI_GREEN + telephoneNumber, Doctor.ANSI_RESET);
                    }
                }
            }
        }
        System.out.println("\nЧтобы продолжить, нажмите '1' \nЧтобы завершить нажмите любую клавишу");
        choose=scanner.nextInt();
        if(choose==1)
            menu();

    }
}
