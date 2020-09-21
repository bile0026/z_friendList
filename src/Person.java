
public class Person {
    public String Name;
    public String getFriendNames;
    public int getNumberOfFriends;
    public String Person;
    public int friendCount;
    public String friendList;

    public Person(final String newName) {
        Name = newName;
        friendCount = 0;
        friendList = "";
    }

    public String getName(final String Name) {
        return Name;

    }

    public String befriend(final Person p) {
        friendCount = friendCount + 1;
        // friendList.add(p.getName(Person));
        this.friendList += (p.Name + " ");
        return friendList;
    }

    public String unfriend(final Person p) {
        friendCount = friendCount - 1;
        friendList.replace(friendList, "");
        return friendList;
    }

    // private String replace(final String person2, final String string) {
    //     return null;
    // }

    public String getFriendNames() {
        return friendList;
    }

    public int getNumberOfFriends() {
        return friendCount;
    }
}