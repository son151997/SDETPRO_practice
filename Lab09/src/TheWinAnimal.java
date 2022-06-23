import java.util.ArrayList;
import java.util.List;

public class TheWinAnimal {

    public static void main(String[] args) {
        AnimalWithBuilder.Builder builder = new AnimalWithBuilder.Builder();

        AnimalWithBuilder Ant = builder.setName("Ant").setFlyable(false).build();
        System.out.println(Ant);

        AnimalWithBuilder Snake = builder.setName("Snake").setFlyable(false).build();
        System.out.println(Snake);

        AnimalWithBuilder Rabbit = builder.setName("Rabbit").setFlyable(false).build();
        System.out.println(Rabbit);

        AnimalWithBuilder Falcon = builder.setName("Falcon").setFlyable(true).build();
        System.out.println(Falcon);

        ArrayList<AnimalWithBuilder> animalList = new ArrayList<AnimalWithBuilder>();
        animalList.add(Ant);
        animalList.add(Snake);
        animalList.add(Rabbit);
        animalList.add(Falcon);

        int Speed = 0;
        String fastestAnimal = "";
        for (AnimalWithBuilder animal : animalList) {
            if (animal.isFlyable() == true) {
                String arraylist = String.valueOf(animalList.remove(false));
            }
            {
                if (animal.getSpeed() > Speed) {
                    Speed = animal.getSpeed();
                    fastestAnimal = animal.getName();
                }
            }

        }
        System.out.println("The faster animal = " + fastestAnimal + " With the speed = " + Speed);
    }
}