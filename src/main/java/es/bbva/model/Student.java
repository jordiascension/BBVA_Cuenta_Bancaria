package es.bbva.model;

public class Student {

    private int id;
    private String name;
    private String surname;
    private Direction direction;

    //en la Composición la clase Student no puede existir sin la clase Direction
    //La relación 1 a 1 es obligatoria
    public Student(int id, String name, String surname, Direction direction){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.direction = direction;
    }

    public Student(int id, String name, Direction direction){
        this.id = id;
        this.name = name;
        this.direction = direction;
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

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}
