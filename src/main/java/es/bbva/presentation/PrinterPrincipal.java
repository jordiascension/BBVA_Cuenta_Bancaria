package es.bbva.presentation;

import es.bbva.model.Printable;
import es.bbva.model.Printer;

import java.util.ArrayList;
import java.util.List;

public class PrinterPrincipal {

    public static void main(String[] args) {
        Printable printable = new Printer();
        printable.on();
        printable.print();
        printable.off();

        //Polimorfismo de interfaces
        List lista = new ArrayList();
    }
}
