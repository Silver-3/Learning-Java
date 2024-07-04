public class Friend {
    String name;
    static int friendCount;

    Friend(String name) {
        this.name = name;
        friendCount++;
    }

    static void displayFriends() {
        System.out.println("You have " + friendCount + " friends");
    }
}
