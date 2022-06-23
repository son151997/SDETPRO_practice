import java.security.SecureRandom;

public class Horse extends Animals {
    public Horse() {
        this.speed = this.speed();
    }

    @Override
    public int speed() {

        return (new SecureRandom().nextInt(75));
    }
}
