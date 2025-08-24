package StackOverFlow;

import java.util.HashMap;
import java.util.Map;

public class UserManagement {

    Map<Integer, User> userMap;

    UserManagement(){
        this.userMap = new HashMap<>();
    }

    public void addUser(int id, String name){
        User user = new User(id, name);
        this.userMap.put(id, user);
    }

    public void deleteUser(int id){
        this.userMap.remove(id);
    }

    public void addQuestionToUser(int userId, Question question) {
        User user = this.userMap.get(userId);
        user.addQuestion(question);
        incrementInteractionCount(userId);
    }

    public void addAnswerToUser(int userId, int questionId, Answer answer) {
        User user = this.userMap.get(userId);
        user.addAnswer(answer, questionId);
        incrementInteractionCount(userId);
    }

    public void incrementInteractionCount(int userId){
        this.userMap.get(userId).incrementInteractionCount();
    }
}
