package StackOverFlow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question {

    int questionId;
    String content;
    List<String> tags;
    int userId;
    Map<Integer,Answer> userIdVsAnswers;
    Map<Integer,Answer> answersList;
    int votes;
    Map<Integer, String> userIdVsComments;

    public Question(int questionId, String content, int userId) {
        this.questionId = questionId;
        this.content = content;
        this.tags = new ArrayList<>();
        this.userId = userId;
        this.userIdVsAnswers = new HashMap<>();
        this.answersList = new HashMap<>();
        this.votes = 0;
        this.userIdVsComments = new HashMap<>();
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void addAnswer(int userId, Answer answer){
        this.userIdVsAnswers.put(userId, answer);
        this.answersList.put(answer.answerId, answer);
    }

    public void downVote(){
        this.votes--;
    }

    public void upVote(){
        this.votes++;
    }
}
