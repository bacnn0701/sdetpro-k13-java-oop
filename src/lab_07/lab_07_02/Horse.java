package lab_07.lab_07_02;

import java.security.SecureRandom;

public class Horse extends Animal{

    @Override
    public int getSpeed() {

        return new SecureRandom().nextInt(75);
    }
}
