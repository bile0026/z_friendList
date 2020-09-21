import java.util.ArrayList;

public class Person {
    public String Name;
    public String getFriendNames;
    public int getNumberOfFriends;
    public String Person;
    public int friendCount;
    ArrayList<String> friendList;

    public Person(final String newName) {
        Name = newName;
        friendCount = 0;
        // friendList = "";
        ArrayList<String> friendList = new ArrayList<String>();
    }

    public String getName(final String Name) {
        return Name;

    }

    public String befriend(final Person p) {
        friendCount = friendCount + 1;
        // friendList.add(p.getName(Person));
        friendList.add(p.Name);
        return Person;

    }

    public String unfriend(final Person p) {
        friendCount = friendCount - 1;
        for (Person person : friendList) {
            if (person == p) {
                friendList.remove(p);
            }
        }
        friendList.remove(p);
    }

    private String replace(final String person2, final String string) {
        return null;
    }

    public String getFriendNames() {
        return friendList;

    }

    public int getNumberOfFriends() {
        return friendCount;
    }
}