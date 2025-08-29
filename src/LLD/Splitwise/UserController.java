package Splitwise;

import java.util.HashMap;
import java.util.Map;

public class UserController {

    Map<Integer, User> userMap;

    UserController(){
        this.userMap = new HashMap<>();
    }

    public User createUser(int id, String name){
        User user = new User(id, name);
        this.userMap.put(user.id, user);
        return user;
    }
}
