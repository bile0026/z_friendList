import java.util.ArrayList;

public class Person {
    public String Name;
    public String getFriendNames;
    public int getNumberOfFriends;
    public String Person;
    public int friendCount;
    ArrayList<Person> friendList;

    public Person(final String newName) {
        Name = newName;
        friendCount = 0;
        // friendList = "";
    }

    public String getName(final String Name) {
        return Name;

    }

    public String befriend(final Person p) {
        friendCount = friendCount + 1;
        // friendList.add(p.getName(Person));
        friendList.add(p);
        return Person;

    }

    public Person unfriend(final Person p) {
        friendCount = friendCount - 1;
        for (Person person : friendList) {
            if (person == p) {
                friendList.remove(p);
            }
        }
        return Person p;
    }

    private String replace(final String person2, final String string) {
        return null;
    }

    public String getFriendNames() {
        String friendNameList[];

        for (Person friend : friendList) {
            int i = 0;
            friendNameList[i] = friend.Name;
            i++;
        }
        return friendNameList.toString();

    }

    public int getNumberOfFriends() {
        return friendCount;
    }
}