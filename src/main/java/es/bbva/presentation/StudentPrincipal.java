package es.bbva.presentation;

import es.bbva.model.Direction;
import es.bbva.model.Student;

public class StudentPrincipal {

    public static void main(String[] args) {
        Direction direction = new Direction();
        direction.setStreet("East Main Street");
        direction.setCity("Portage");
        direction.setState("Michigan");

        Student student = new Student(1, "Pepe", "Soto", direction);

        System.out.println(student.getName());
        System.out.println(student.getSurname());
        System.out.println(student.getDirection().getStreet());
        System.out.println(student.getDirection().getState());
    }
}
