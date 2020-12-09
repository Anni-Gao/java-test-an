package com.homework07;
import java.util.*;

public class SetTest {
    public static void main(String[] args) {
        Set<User> users = new HashSet<>();
        User user1 = new User(01,"Bob","London");
        User user2 = new User(02,"Jack","London");
        User user3 = new User(03,"Tom","Sheffield");
        User user4 = new User(04,"John","Sheffield");
        User user5 = new User(05,"Tony","Manchester");
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);

        toMap(users);
        SetToList(users);
        Remove(users,02);
    }
    private static List SetToList(Set<User> users) {
        List<User> userList = new ArrayList<User>(users);
        return userList;
    }

    private static void Remove(Set<User> users, int id) {
        Iterator <User> iUsers = users.iterator();
        while(iUsers.hasNext()) {
            User u = iUsers.next();
            if(u.getId() == id) {
                iUsers.remove();
            }
        }
    }
    private static void toMap(Set<User> users) {
        Map<String, Set<User>> map = new HashMap<>();
        for (User u : users) {
            Set<User> set = map.get(u.getCity());
            if (set == null) {
                set = new HashSet<>();
                map.put(u.getCity(), set);
            }
            set.add(u);
        }
    }
}
