import java.util.ArrayList;
import java.util.List;

public class DetectTheWinner {
    public static void main(String[] args) {

        int maxSpeed;
        String nameAnimal;
        Animals Dog = new Dog();
        Animals Horse = new Horse();
        Animals Tiger = new Tiger();
        List<Animals> animalList = new ArrayList<>();
        Animals theWinner = new Animals();
        animalList.add(Dog);
        animalList.add(Horse);
        animalList.add(Tiger);

        theWinner = new DetectTheWinner().DetectTheWinner(animalList);
        for (Animals animals : animalList) {

            System.out.printf("%s speed: %d\n", animals.getClass().getSimpleName(), animals.getSpeed());

        }

        System.out.printf("Winner is %s, with speed: %d Km/h", theWinner.getClass().getSimpleName(), theWinner.getSpeed());
    }

    private Animals DetectTheWinner(List<Animals> animalList) {
        Animals theWinner = animalList.get(0);
        for (Animals animals : animalList) {

            if (theWinner.getSpeed() < animals.getSpeed()) theWinner = animals;
        }
        return theWinner;

    }

}

