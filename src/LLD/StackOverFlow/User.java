package StackOverFlow;

import java.util.HashMap;
import java.util.Map;

public class User {

    int userId;
    String userName;
    Map<Integer, Question> questionMap;
    Map<Integer, Answer> answerMap;
    int interactionCount;

    public User(int userId, String userName) {
        this.userId = userId;
        this.userName = userName;
        this.answerMap = new HashMap<>();
        this.questionMap = new HashMap<>();
        this.interactionCount = 0;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Map<Integer, Question> getQuestionMap() {
        return questionMap;
    }

    public void setQuestionMap(Map<Integer, Question> questionMap) {
        this.questionMap = questionMap;
    }

    public Map<Integer, Answer> getAnswerMap() {
        return answerMap;
    }

    public void setAnswerMap(Map<Integer, Answer> answerMap) {
        this.answerMap = answerMap;
    }

    public void incrementInteractionCount() {
        this.interactionCount++;
    }

    public void addQuestion(Question question) {
        this.questionMap.put(question.questionId, question);
    }

    public void addAnswer(Answer answer, int questionId) {
        this.answerMap.put(questionId, answer);
    }
}
