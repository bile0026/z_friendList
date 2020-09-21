
public class PersonTester {

    /**
     * The main method executes the unit tester.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // let's conjure up some people
        Person alice = new Person("Alice");
        Person bob = new Person("Bob");
        Person charlie = new Person("Charlie");
        Person doug = new Person("Doug");
        Person eve = new Person("Eve");
        Person francine = new Person("Francine");

        // friendships are made
        alice.befriend(eve);
        eve.befriend(alice);
        alice.befriend(charlie);
        charlie.befriend(alice);
        alice.befriend(doug);
        doug.befriend(alice);

        bob.befriend(doug);
        doug.befriend(bob);

        charlie.befriend(francine);
        francine.befriend(charlie);

        // check to see whether things are working as expected
        System.out.println("Alice has " + alice.getNumberOfFriends() + " friends: " + alice.getFriendNames());
        System.out.println("Alice SHOULD have 3 friends:  Eve Charlie Doug ");
        System.out.println("Bob has " + bob.getNumberOfFriends() + " friends: " + bob.getFriendNames());
        System.out.println("Bob SHOULD have 1 friends:  Doug ");
        System.out.println("Charlie has " + charlie.getNumberOfFriends() + " friends: " + charlie.getFriendNames());
        System.out.println("Charlie SHOULD have 2 friends:  Alice Francine ");
        System.out.println("Doug has " + doug.getNumberOfFriends() + " friends: " + doug.getFriendNames());
        System.out.println("Doug SHOULD have 2 friends:  Alice Bob ");
        System.out.println("Eve has " + eve.getNumberOfFriends() + " friends: " + eve.getFriendNames());
        System.out.println("Eve SHOULD have 1 friends:  Alice ");
        System.out.println("Francine has " + francine.getNumberOfFriends() + " friends: " + francine.getFriendNames());
        System.out.println("Francine SHOULD have 1 friends:  Charlie ");

        System.out.println("------------------------");
        System.out.println("Now some drama ensues...");
        System.out.println("------------------------");

        // drame ensues, destroying friendships and forging new alliances...
        alice.unfriend(charlie);
        charlie.unfriend(alice);

        francine.unfriend(charlie);
        charlie.unfriend(francine);

        francine.befriend(doug);
        doug.befriend(francine);

        // check again to make sure things are working as expected
        System.out.println("Alice has " + alice.getNumberOfFriends() + " friends: " + alice.getFriendNames());
        System.out.println("Alice SHOULD have 2 friends:  Eve Doug ");
        System.out.println("Bob has " + bob.getNumberOfFriends() + " friends: " + bob.getFriendNames());
        System.out.println("Bob SHOULD have 1 friends:  Doug ");
        System.out.println("Charlie has " + charlie.getNumberOfFriends() + " friends: " + charlie.getFriendNames());
        System.out.println("Charlie SHOULD have 0 friends:  ");
        System.out.println("Doug has " + doug.getNumberOfFriends() + " friends: " + doug.getFriendNames());
        System.out.println("Doug SHOULD have 3 friends:  Alice Francine Bob ");
        System.out.println("Eve has " + eve.getNumberOfFriends() + " friends: " + eve.getFriendNames());
        System.out.println("Eve SHOULD have 1 friends:  Alice ");
        System.out.println("Francine has " + francine.getNumberOfFriends() + " friends: " + francine.getFriendNames());
        System.out.println("Francine SHOULD have 1 friends:  Doug ");

    }

}