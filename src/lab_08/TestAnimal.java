package lab_08;

import java.util.Arrays;
import java.util.List;

import static lab_08.Animal.*;

public class TestAnimal {

    public static void main(String[] args) {

        Animal cat = new Builder().setName("Cat")
                .setSpeed(50)
                .setFlyable(false).build();

        Animal falcon = new Builder().setName("Falcon")
                .setSpeed(60)
                .setFlyable(true).build();

        Animal dog = new Builder().setName("Dog")
                .setSpeed(70)
                .setFlyable(false).build();

        Animal eagle = new Builder().setName("Eagle")
                .setSpeed(80)
                .setFlyable(true).build();

        Animal snake = new Builder().setName("Snake")
                .setSpeed(90)
                .setFlyable(false).build();

        Animal horse = new Builder().setName("Horse")
                .setSpeed(100)
                .setFlyable(false).build();

        ControllerAnimal controllerAnimal = new ControllerAnimal();

        System.out.println(controllerAnimal.findWinnerAnimal(Arrays.asList(horse,eagle,falcon,snake,cat,dog)));

//        System.out.println(controllerAnimal.findWinnerAnimal(List.of()));
//
//        System.out.println(controllerAnimal.findWinnerAnimal(List.of(eagle)));
    }
}
