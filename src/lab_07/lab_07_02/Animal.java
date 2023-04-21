package lab_07.lab_07_02;

import java.security.SecureRandom;

public class Animal {

    private int speed;

    public Animal(int maxSpeed) {

        this.speed = new SecureRandom().nextInt(maxSpeed);
    }

    public int getSpeed() {
        return speed;
    }
}
