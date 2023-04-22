package lab_08;

import java.util.ArrayList;
import java.util.List;

public class ControllerAnimal {

    public String findWinnerAnimal(List<Animal> animals) {

        List<Animal> listAnimalCompetition = new ArrayList<>();

        if (!animals.isEmpty()) {
            for (Animal animal : animals) {
                if (!animal.isFlyable()) {
                    listAnimalCompetition.add(animal);
                }
            }
        } else {
            return "No have any animals to compete";
        }

        int largestSpeedIndex = 0;
        if (!listAnimalCompetition.isEmpty()) {
            for (int i = 1; i < listAnimalCompetition.size(); i++) {

                if (listAnimalCompetition.get(i).getSpeed() > listAnimalCompetition.get(largestSpeedIndex).getSpeed()) {
                    largestSpeedIndex = i;
                }
            }
        } else {
            return "No have any animals enough the conditions to compete";
        }

        return "Winner Animal is "
                + listAnimalCompetition.get(largestSpeedIndex).getName()
                + ",with speed: "
                + listAnimalCompetition.get(largestSpeedIndex).getSpeed();

    }
}
