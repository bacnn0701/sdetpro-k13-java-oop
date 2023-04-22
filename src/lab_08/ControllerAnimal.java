package lab_08;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class ControllerAnimal {

    public String findWinnerAnimal(List<Animal> animals) {

        // Find animals enough conditions to race

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

        // Find max speed

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

        //Find list animal have the same max speed

        final int maxSpeedWinner = listAnimalCompetition.get(largestSpeedIndex).getSpeed();
        List<Animal> animalWinner = listAnimalCompetition.stream()
                                    .filter(s -> s.getSpeed() == maxSpeedWinner)
                                    .toList();

        // Find return animals winner with the max speed

        return String.format("Winner Animal is %s with speed: %d",
                animalWinner.stream().map(Animal::getName).collect(Collectors.joining(", ")),
                maxSpeedWinner);

    }
}
