package lab_08;

import java.security.SecureRandom;

public class Animal {

    private String name;
    private int speed;
    private boolean flyable;

    public Animal() {
    }

    public Animal(Builder builder) {

        this.name = builder.name;
        this.speed = builder.speed;
        this.flyable = builder.flyable;
    }

    // READ-ONLY
    public String getName() {
        return name;
    }
    public int getSpeed() {
        return speed;
    }
    public boolean isFlyable() {
        return flyable;
    }
    public static class Builder {

        private String name;
        private int speed;
        private boolean flyable;
        public Builder setName(String name) {
            this.name = name;
            return this;
        }
        public Builder setSpeed(int maxSpeed) {
            this.speed = new SecureRandom().nextInt(maxSpeed);
            return this;
        }
        public Builder setFlyable(boolean flyable) {
            this.flyable = flyable;
            return this;
        }
        public Animal build() {
            return new Animal(this);
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", flyable=" + flyable +
                '}';
    }
}
