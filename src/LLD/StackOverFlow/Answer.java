package StackOverFlow;

import java.util.HashMap;
import java.util.Map;

public class Answer {

    int answerId;
    String content;
    int userId;
    int votes;
    Map<Integer, String> userIdVsComments;

    public Answer(int answerId, String content, int userId) {
        this.answerId = answerId;
        this.content = content;
        this.userId = userId;
        this.votes = 0;
        this.userIdVsComments = new HashMap<>();
    }

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void downVote(){
        this.votes--;
    }

    public void upVote(){
        this.votes++;
    }

    public Map<Integer, String> getUserIdVsComments() {
        return userIdVsComments;
    }

    public void setUserIdVsComments(Map<Integer, String> userIdVsComments) {
        this.userIdVsComments = userIdVsComments;
    }
}
