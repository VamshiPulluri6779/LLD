package Splitwise;

import java.util.HashMap;
import java.util.Map;

public class GroupController {

    Map<Integer, Group> groupMap;

    GroupController(){
        this.groupMap = new HashMap<>();
    }

    public Group createGroup(int id, String title){
        Group group = new Group(id, title);
        this.groupMap.put(group.id, group);
        System.out.println("Group created "+title);
        return group;
    }

    public void addUserToGroup(Group group, User user){
        System.out.println("User "+user.name+" has been added to "+group.title);
        group.groupMembers.put(user.id, user);
    }

    public void removeUserFromGroup(Group group, User user){
        group.groupMembers.remove(user.id);
    }
}
