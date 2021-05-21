package es.bbva.model;

public interface Printable {

    public default void on() {
        format("encendiendo el dispositivo");
    }

    public default void off() {
        format("apagando el dispositivo");
    }

    public void print();

    private static void format( String message) {
        System.out.println("**********");
        System.out.println(message);
        System.out.println("**********");
    }
}
