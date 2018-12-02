public class Main {

    public static void main(String[] args) {

    Cat cat = new Cat();
    cat.setCatSpeed(23.0d);
    Dog dog = new Dog();
    dog.setDogSpeed(28.0d);

        System.out.println("WhoIsFaster ? " + checkWhoIsFaster.checkSpeed(cat,dog));

    }

}
