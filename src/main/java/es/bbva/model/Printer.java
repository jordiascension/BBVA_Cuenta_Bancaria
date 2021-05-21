package es.bbva.model;

public class Printer implements Printable{

    @Override
    public void print() {

        System.out.println("imprimiendo con la impresora");
    }
}
