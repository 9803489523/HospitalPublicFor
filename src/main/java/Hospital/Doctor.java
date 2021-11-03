package Hospital;

import java.util.Scanner;

public class Doctor {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    private String name;
    private String surname;
    private String[][] timetable={
            {"       пн       \t","       вт       \t","       ср       \t","       чт       \t","       пт       \t"},
            {"'1'-8:00-8:30   \t","'9'-8:00-8:30   \t","'17'-8:00-8:30  \t","'25'-8:00-8:30  \t","'33'-8:00-8:30  \t"},
            {"'2'-10:00-10:30 \t","'10'-10:00-10:30\t","'18'-10:00-10:30\t","'26'-10:00-10:30\t","'34'-10:00-10:30\t"},
            {"'3'-11:00-11:30 \t","'11'-11:00-11:30\t","'19'-11:00-11:30\t","'27'-11:00-11:30\t","'35'-11:00-11:30\t"},
            {"'4'-12:00-12:30 \t","'12'-12:00-12:30\t","'20'-12:00-11:30\t","'28'-12:00-12:30\t","'36'-12:00-12:30\t"},
            {"'5'-13:00-13:30 \t","'13'-13:00-13:30\t","'21'-13:00-13:30\t","'29'-13:00-13:30\t","'37'-13:00-13:30\t"},
            {"'6'-14:00-14:30 \t","'14'-14:00-14:30\t","'22'-14:00-14:30\t","'30'-14:00-14:30\t","'38'-14:00-14:30\t"},
            {"'7'-15:00-15:30 \t","'15'-15:00-15:30\t","'23'-15:00-15:30\t","'31'-15:00-15:30\t","'39'-15:00-15:30\t"},
            {"'8'-16:00-16:30 \t","'16'-16:00-16:30\t","'24'-16:00-16:30\t","'32'-16:00-16:30\t","'40'-16:00-16:30\t"},
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String[][] getTimetable() {
        return timetable;
    }

    public void setTimetable(String[][] timetable) {
        this.timetable = timetable;
    }

    public Doctor(String name, String surname) {
        this.name = ANSI_YELLOW+name+ANSI_RESET;
        this.surname = ANSI_YELLOW+surname+ANSI_RESET;
        for(int i=0;i<25;i++){
            goToReception((int)(Math.random()*41));
        }
    }

    @Override
    public String toString() {
        StringBuilder str= new StringBuilder();
        for (String[] strings : timetable) {
            str.append("\n");
            for (String string : strings) {
                str.append(ANSI_GREEN).append(string).append(ANSI_RESET);
            }
            str.append(ANSI_RESET);

        }
        return String.format("%s %s\n                                          Расписание:%s",name,surname,str);
    }

    public void goToReception(int choose){
        switch (choose) {
            case 1 -> timetable[1][0] = ANSI_RED+"     занято     \t"+ANSI_RESET;
            case 2 -> timetable[2][0] = ANSI_RED+"     занято     \t"+ANSI_RESET;
            case 3 -> timetable[3][0] = ANSI_RED+"     занято     \t"+ANSI_RESET;
            case 4 -> timetable[4][0] = ANSI_RED+"     занято     \t"+ANSI_RESET;
            case 5 -> timetable[5][0] = ANSI_RED+"     занято     \t"+ANSI_RESET;
            case 6 -> timetable[6][0] = ANSI_RED+"     занято     \t"+ANSI_RESET;
            case 7 -> timetable[7][0] = ANSI_RED+"     занято     \t"+ANSI_RESET;
            case 8 -> timetable[8][0] = ANSI_RED+"     занято     \t"+ANSI_RESET;
            case 9 -> timetable[1][1] = ANSI_RED+"     занято     \t"+ANSI_RESET;
            case 10 -> timetable[2][1] = ANSI_RED+"     занято     \t"+ANSI_RESET;
            case 11 -> timetable[3][1] = ANSI_RED+"     занято     \t"+ANSI_RESET;
            case 12 -> timetable[4][1] = ANSI_RED+"     занято     \t"+ANSI_RESET;
            case 13 -> timetable[5][1] = ANSI_RED+"     занято     \t"+ANSI_RESET;
            case 14 -> timetable[6][1] = ANSI_RED+"     занято     \t"+ANSI_RESET;
            case 15 -> timetable[7][1] = ANSI_RED+"     занято     \t"+ANSI_RESET;
            case 16 -> timetable[8][1] = ANSI_RED+"     занято     \t"+ANSI_RESET;
            case 17 -> timetable[1][2] = ANSI_RED+"     занято     \t"+ANSI_RESET;
            case 18 -> timetable[2][2] = ANSI_RED+"     занято     \t"+ANSI_RESET;
            case 19 -> timetable[3][2] = ANSI_RED+"     занято     \t"+ANSI_RESET;
            case 20 -> timetable[4][2] = ANSI_RED+"     занято     \t"+ANSI_RESET;
            case 21 -> timetable[5][2] = ANSI_RED+"     занято     \t"+ANSI_RESET;
            case 22 -> timetable[6][2] = ANSI_RED+"     занято     \t"+ANSI_RESET;
            case 23 -> timetable[7][2] = ANSI_RED+"     занято     \t"+ANSI_RESET;
            case 24 -> timetable[8][2] = ANSI_RED+"     занято     \t"+ANSI_RESET;
            case 25 -> timetable[1][3] = ANSI_RED+"     занято     \t"+ANSI_RESET;
            case 26 -> timetable[2][3] = ANSI_RED+"     занято     \t"+ANSI_RESET;
            case 27 -> timetable[3][3] = ANSI_RED+"     занято     \t"+ANSI_RESET;
            case 28 -> timetable[4][3] = ANSI_RED+"     занято     \t"+ANSI_RESET;
            case 29 -> timetable[5][3] = ANSI_RED+"     занято     \t"+ANSI_RESET;
            case 30 -> timetable[6][3] = ANSI_RED+"     занято     \t"+ANSI_RESET;
            case 31 -> timetable[7][3] = ANSI_RED+"     занято     \t"+ANSI_RESET;
            case 32 -> timetable[8][3] = ANSI_RED+"     занято     \t"+ANSI_RESET;
            case 33 -> timetable[1][4] = ANSI_RED+"     занято     \t"+ANSI_RESET;
            case 34 -> timetable[2][4] = ANSI_RED+"     занято     \t"+ANSI_RESET;
            case 35 -> timetable[3][4] = ANSI_RED+"     занято     \t"+ANSI_RESET;
            case 36 -> timetable[4][4] = ANSI_RED+"     занято     \t"+ANSI_RESET;
            case 37 -> timetable[5][4] = ANSI_RED+"     занято     \t"+ANSI_RESET;
            case 38 -> timetable[6][4] = ANSI_RED+"     занято     \t"+ANSI_RESET;
            case 39 -> timetable[7][4] = ANSI_RED+"     занято     \t"+ANSI_RESET;
            case 40 -> timetable[8][4] = ANSI_RED+"     занято     \t"+ANSI_RESET;
        }

    }
}
