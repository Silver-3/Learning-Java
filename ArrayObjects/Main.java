public class Main {
    public static void main(String[] args) {

        // Food[] food = new Food[3];

        Food food1 = new Food("pizza");
        Food food2 = new Food("hamburger");
        Food food3 = new Food("hotdog");

        Food[] food = {food1, food2, food3};

        // food[0] = food1;
        // food[1] = food2;
        // food[2] = food3;

        System.out.println(food[0].name);
    }
}