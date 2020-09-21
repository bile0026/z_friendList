
public class Person {
    public String Name;
    public String Person;
    public int friendCount;
    public String friendList;

    public Person(final String newName) {
        Name = newName;
        friendCount = 0;
        friendList = "";
    }

    public String getName() {
        return Name;

    }

    public String befriend(final Person p) {
        // friendCount = friendCount + 1;
        friendCount++;
        // friendList += (p.Name + " ");
        friendList += (p.getName() + " ");
        return friendList;
    }

    public String unfriend(final Person p) {
        // friendCount = friendCount - 1;
        friendCount--;
        // friendList = friendList.replace(p.Name, "");
        friendList = friendList.replace(p.getName(), "");
        return friendList;
    }

    public String getFriendNames() {
        return friendList;
    }

    public int getNumberOfFriends() {
        return friendCount;
    }
}