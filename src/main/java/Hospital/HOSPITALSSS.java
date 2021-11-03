package Hospital;

import javax.print.Doc;

public enum HOSPITALSSS {

    /**
     * AVAEVCLINIC
     */
    AVAEVCLINIC("Клиника Аваева",
            "170006, Тверская обл. г.Тверь, ул. С. Перовской, д. 54",
            "+7(4822)633-123",
            new Reception(
                    new Department(
                            "Флеболог\n\tКабинет 18\n\tСтоимость услуги: 500 руб.",
                            new Doctor("Сергей","Петров")
                    ),
                    new Department(
                            "Уролог\n\tКабинет 4\n\tСтоимость услуги: 700 руб.",
                            new Doctor("Иван","Барков")
                    ),
                    new Department(
                            "УЗИ\n\tКабинет 1\n\tСтоимость услуги: 850 руб.",
                            new Doctor("Алексей","Гринев"),
                            new Doctor("Борис","Кротов")
                    ),

                    new Department(
                            "COVID-отделение\n\tКабинет 10\n\tСтоимость услуги: 1200 руб.",
                            new Doctor("Олег","Попов")
                    )
            ),
            new Reception(
                    new Department(
                    "Хирург\n\tКабинет 8",
                    new Doctor("Григорий","Чистяков")
            ),
                    new Department(
                            "Психолог\n\tКабинет 13",
                            new Doctor("Дмитрий","Червячный")
                    ),
                    new Department(
                            "Ухо-горло-нос\n\tКабинет 7",
                            new Doctor("Дмитрий","Прядкин")
                    )

                    )),

    /**
     *WOMENCLINIC
     */
    WOMENCLINIC("Клиника Женского здоровья",
                        "1705687, Воронежская обл. г.Воронеж, ул. Торпедо, д. 37",
                        "+7(5978)621-475",
                        new Reception(
                        new Department(
                        "Гинеколог\n\tКабинет 2\n\tСтоимость услуги: 700 руб.",
                            new Doctor("Сергей","Сергеев")
                    ),

                            new Department(
                            "УЗИ\n\tКабинет 5\n\tСтоимость услуги: 900 руб.",
                                    new Doctor("Денис","Пономарев"),
                                    new Doctor("Алексей","Букатов")
                    ),

                            new Department(
                            "Мазок на COVID-19\n\tКабинет 4\n\tСтоимость услуги: 1700 руб.",
                                    new Doctor("Валентин","Фермеров")
                    )
                            ),
                            new Reception(
                    new Department(
            "Психиатр\n\tКабинет 3",
                    new Doctor("Григорий","Поплавский")
            ),
                    new Department(
                            "Оккулист\n\tКабинет 1",
                                    new Doctor("Игорь","Клинских")
                    )

                            )),
    /**
     * CLINIC2
     */
    CLINIC2("Поликлиника №2",
                        "179247, Московская обл. г.Химки, ул. Саврасова, д. 40",
                        "+7(0214)775-125",
                        new Reception(
                            new Department(
                            "ПЦР-тест\n\tКабинет 4\n\tСтоимость услуги: 2700 руб.",
                                    new Doctor("Егор","Куликов"),
                                    new Doctor("Сергей","Претков")
                    )
                            ),
                            new Reception(
                    new Department(
            "Психиатр\n\tКабинет 3",
                    new Doctor("Алексей","Баранов")
            ),
                    new Department(
                            "Оккулист\n\tКабинет 1",
                                    new Doctor("Игорь","Боровиков")
                    ),
                                    new Department(
                                            "Терапевт\n\tКабинет 2",
                                            new Doctor("Иван","Змеев")
                                    )


                            )),
    /**
     * CLINIC1
     */
    CLINIC1("Поликлиника №1",
            "179247, Московская обл. г.Балашиха, ул. Ленина, д. 12",
            "+7(0214)775-125",
            new Reception(
                    new Department(
                            "Проверка крови на антетела к COVID-19\n\tКабинет 1\n\tСтоимость услуги: 2500 руб.",
                            new Doctor("Егор","Свинов"),
                            new Doctor("Василий","Чернов")
                    ),
                    new Department(
                            "Общий анализ крови\n\tКабинет 5\n\tСтоимость услуги: 500 руб.",
                            new Doctor("Олег","Глебов")
                    )
            ),
            new Reception(
                    new Department(
                            "Педиатр\n\tКабинет 2",
                            new Doctor("Алексей","Куваев")
                    ),
                    new Department(
                            "Офтальмолог\n\tКабинет 3",
                            new Doctor("Денис","Кошкин")
                    ),
                    new Department(
                            "Терапевт\n\tКабинет 4",
                            new Doctor("Сергей","Крупов"),
                            new Doctor("Сергей","Смакин")
                    )


            ));
    private String nameOfHospital;
    private String address;
    private String telephoneNumber;
    private Reception paidReception;
    private Reception reception;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public void setPaidReception(Reception paidReception) {
        this.paidReception = paidReception;
    }

    public void setReception(Reception reception) {
        this.reception = reception;
    }

    public String getNameOfHospital() {
        return nameOfHospital;
    }

    public void setNameOfHospital(String nameOfHospital) {
        this.nameOfHospital = nameOfHospital;
    }

    public Reception getPaidReception() {
        return paidReception;
    }



    public Reception getReception() {
        return reception;
    }



    HOSPITALSSS(String nameOfHospital, String address, String telephoneNumber,Reception paidReception, Reception reception) {
        this.nameOfHospital = Doctor.ANSI_BLACK+Doctor.ANSI_YELLOW_BACKGROUND+nameOfHospital+Doctor.ANSI_RESET;
        this.address = Doctor.ANSI_BLACK+Doctor.ANSI_YELLOW_BACKGROUND+address+Doctor.ANSI_RESET;
        this.telephoneNumber = Doctor.ANSI_BLACK+Doctor.ANSI_YELLOW_BACKGROUND+telephoneNumber+Doctor.ANSI_RESET;
        this.paidReception = paidReception;
        this.reception = reception;
    }

    @Override
    public String toString() {
        String pReception=Doctor.ANSI_BLUE+"Платный прием"+Doctor.ANSI_RESET;
        String fReception=Doctor.ANSI_PURPLE+"Бесплатный прием"+Doctor.ANSI_RESET;
        return String.format("%s\n%s\n%s\n%s\n%s\n%s\n%s",nameOfHospital,address,telephoneNumber,pReception,paidReception,fReception,reception);
    }
}
