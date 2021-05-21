package es.bbva.model;

import java.util.ArrayList;

public class Client {

    private int id;
    private String name;
    private String surname;
    //En la agregación la relación entre clases no es obligatoria.
    //Las clases pueden existir la una sin la otra.
    //Un cliente puede tener tarjetas de crédito o no
    private ArrayList<CreditCard> creditCardList;

    public Client(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public ArrayList<CreditCard> getCreditCardList() {
        return creditCardList;
    }

    public void setCreditCardList(ArrayList<CreditCard> creditCardList) {
        this.creditCardList = creditCardList;
    }
}
