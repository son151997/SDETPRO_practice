import java.security.SecureRandom;

public class AnimalWithBuilder {

    private String name = "";
    private int speed = 0;
    private boolean flyable = true;

    protected AnimalWithBuilder(Builder builder) {
        this.name = builder.name;
        this.speed = builder.speed;
        this.flyable = builder.flyable;
    }

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
            if (name.equals("Ant")) {
                this.speed = new SecureRandom().nextInt(100);
            } else if (name.equals("Snake")) {
                this.speed = new SecureRandom().nextInt(100);
            } else if (name.equals("Rabbit")) {
                this.speed = new SecureRandom().nextInt(100);
            } else if (name.equals("Falcon")) {
                this.speed = new SecureRandom().nextInt(100);
            }
            return this;
        }

        public Builder setFlyable(boolean flyable) {
            this.flyable = flyable;
            return this;
        }

        public AnimalWithBuilder build() {
            return new AnimalWithBuilder(this);
        }

    }

    @Override
    public String toString() {
        return "AnimalWithBuilder{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", flyable=" + flyable +
                '}';
    }
}