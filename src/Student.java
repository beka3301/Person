public class Student extends Person {
private int course;

    public Student(int course,String name, String surname, int age, String weight, double height, String national, String country) {
        super(name, surname, age, weight, height, national, country);
        this.course=course;
    }

    public Student(int course, String beknur, String narmanov, int age, String weight, double height) {
    }

    @Override
    public void City() {

    }

    @Override
    public void Parents() {

    }

    @Override
    public String toString() {
        return "Student{" +
                "course=" + course +
                super.toString()+
                '}';
    }
}
