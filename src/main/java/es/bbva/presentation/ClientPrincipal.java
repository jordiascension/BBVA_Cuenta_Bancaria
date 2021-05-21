package es.bbva.presentation;


import es.bbva.model.Client;
import es.bbva.model.CreditCard;

import java.util.ArrayList;

public class ClientPrincipal {

    public static void main(String[] args) {
        ArrayList<CreditCard> creditCardList = new ArrayList<CreditCard>();
        CreditCard creditCard1 = new CreditCard("Pepe",34343434,
                3000.00);
        CreditCard creditCard2 = new CreditCard("Pepe",2122355,
                2000.00);

        creditCardList.add(creditCard1);
        creditCardList.add(creditCard2);

        Client client = new Client(1,"Pepe","Soto");
        client.setCreditCardList(creditCardList);

        System.out.println("Client name:" + client.getName());
        System.out.println("Client surname:" + client.getSurname());

        for (CreditCard creditCard: client.getCreditCardList()) {
            System.out.println("Card Number: " + creditCard.getCardNumber());
        }
    }
}
