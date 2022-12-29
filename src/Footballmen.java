public class Footballmen extends Person{
private int speed;

    public Footballmen(int speed,String name, String surname, int age, String weight, double height, String national, String country) {
        super(name, surname, age, weight, height, national, country);
        this.speed=speed;
    }

    public Footballmen(int speed, String ronaldo, String cristiano, int age, String weight, double height) {
    }


    @Override
    public void City() {
        System.out.println("Argentina");

    }

    @Override
    public void Parents() {
        System.out.println("Education");

    }

    @Override
    public String toString() {
        return "Footballmen{" +
                "speed=" + speed +
                super.toString()+
                '}';
    }
}
