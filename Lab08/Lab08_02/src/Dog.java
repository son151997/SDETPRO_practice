import java.security.SecureRandom;

public class Dog extends Animals {
    public Dog() {
        this.speed = this.speed();
    }

    @Override
    public int speed() {
        return (new SecureRandom().nextInt(60));
    }
}
