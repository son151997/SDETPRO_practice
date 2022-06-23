import java.security.SecureRandom;

public class Animals {
    public int speed;

    public Animals() {
    }

    public Animals(int speed, String name) {

        this.speed = speed;
    }
    public int getSpeed() {

        return speed;
    }

    public void setSpeed(int speed) {

        this.speed = speed;
    }

    public int speed() {

        int randomSpeed =  new SecureRandom().nextInt(100);
        return randomSpeed;
    }
}


