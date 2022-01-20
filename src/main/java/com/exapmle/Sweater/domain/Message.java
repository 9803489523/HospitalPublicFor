package com.exapmle.Sweater.domain;

import javax.persistence.*;

@Entity //этой аннотацией помечаются классы-сущности, которые мы хотим сохранять в базе данных
public class Message {

    @Id //указывает что это поле идентификатор
    @GeneratedValue(strategy= GenerationType.AUTO) //нужен для автогенерации идентификаторов
    private Integer id;

    private String text;
    private String tag;


    public Integer getId() {
        return id;
    }

    public Message() {
    }

    public Message(String text, String tag) {
        this.text = text;
        this.tag = tag;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
