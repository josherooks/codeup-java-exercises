package OOP;

public class DogRunner {

    public static void main(String[] args) {
        Dog.bark();
        Dog zoey = new Dog("Zoey", "blond");
        System.out.println(zoey.getName());
        System.out.println(zoey.getFurr());
        System.out.println(zoey.getLegs());
        zoey.setName("clark");
        System.out.println(zoey.getName());
    }
}