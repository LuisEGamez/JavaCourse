package n3Excercise1;

public class Alumno {

    private String name;
    private int age;
    private String curs;
    private double note;

    public Alumno(String name, int age, String curs, double note) {
        this.name = name;
        this.age = age;
        this.curs = curs;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCurs() {
        return curs;
    }

    public void setCurs(String curs) {
        this.curs = curs;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", curs='" + curs + '\'' +
                ", note=" + note +
                '}';
    }
}
