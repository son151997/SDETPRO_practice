import java.security.SecureRandom;

public class Tiger extends Animals {
    public Tiger() {
        this.speed = this.speed();
    }

    @Override
    public int speed() {
        return new SecureRandom().nextInt(100);
    }
}
