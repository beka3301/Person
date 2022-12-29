public class Main {
    public static void main(String[] args) {
        Footballmen footballmen=new Footballmen(154,"ronaldo","cristiano",41,"77",1.85);
        footballmen.City();
        footballmen.Parents();
        Footballmen footballmen1=new Footballmen(113,"bektur","han",24,"77",1.65);
        Footballmen footballmen2=new Footballmen(111,"elmir","leo",18,"123",1.60);
        Footballmen footballmen3=new Footballmen(111,"elmir","lao",18,"123",1.60);
        Footballmen footballmen4=new Footballmen(111,"elmir","oil",18,"123",1.60);
        System.out.println();
        Student student=new Student(5,"beknur","narmanov",22,"223",1.68);
        Student student1=new Student(5,"beknur","narmanov",22,"223",1.68);
        Student student2=new Student(5,"beknur","narmanov",22,"223",1.68);
        Student student3=new Student(5,"beknur","narmanov",22,"223",1.68);
        Student student4=new Student(5,"beknur","narmanov",22,"223",1.68);

        Person[] people = {footballmen2,student1,footballmen1,student2,footballmen3,student3,footballmen4,student4};
        for (Person a:people) {
            System.out.println(a);

        }
    }

}