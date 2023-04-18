package lab_07.lab_07_02;

import java.util.Arrays;
import java.util.List;

public class WinnerAnimal {

    public static void main(String[] args) {

        Animal dog = new Dog();
        Animal horse = new Horse();
        Animal tiger = new Tiger();

        List<Animal> animals = Arrays.asList(dog,horse,tiger);

        ControllerAnimal controllerAnimal = new ControllerAnimal();

        System.out.println(controllerAnimal.findAnimalWinner(animals));
    }
}
