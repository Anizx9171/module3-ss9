package th.Shapes;

import ra.modal.Animal;
import ra.modal.Bird;
import ra.modal.IUser;
import ra.modal.impl.Chiken;
import ra.modal.impl.Dog;
import ra.modal.impl.UserImpl;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeNoise();
        Animal dogy = new Dog();
        dog.makeNoise();

        Bird bird1 = new Chiken();
        bird1.fly();

        IUser user = new UserImpl();

        user.login("Anizx", "Anizx9171?!");
    }
}
