package lab_07.lab_07_02;

import java.util.ArrayList;
import java.util.List;

public class ControllerAnimal {

    public String findAnimalWinner(List<Animal> animals) {

        List<Integer> animalsSpeed = new ArrayList<>();

        for (Animal animal : animals) {
            animalsSpeed.add(animal.getSpeed());
        }

        int maxSpeedIndex = 0;

        for (int i = 1; i < animalsSpeed.size(); i++) {
            if (animalsSpeed.get(i) > animalsSpeed.get(maxSpeedIndex)) {
                maxSpeedIndex = i;
            }
        }
        return "Winner is "
                +animals.get(maxSpeedIndex).getClass().getSimpleName()
                +", with speed: "
                + animalsSpeed.get(maxSpeedIndex).toString();
    }
}
