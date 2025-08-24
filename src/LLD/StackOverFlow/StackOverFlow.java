package StackOverFlow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StackOverFlow {

    Map<String, List<Question>> tagsVsQuestions;
    Map<Integer, Question> questionList;
    UserManagement userManagement;

    StackOverFlow(){
        this.tagsVsQuestions = new HashMap<>();
        this.questionList = new HashMap<>();
        userManagement = new UserManagement();
    }

    public void createUser(int userId, String userName){
        this.userManagement.addUser(userId, userName);

        System.out.println("Created user with id"+userId);
    }

    public int postQuestion(int userId, String content, List<String> tags){

        int id = questionList.size()+1;
        Question question = new Question(id, content, userId);

        this.questionList.put(id, question);
        for(String item : tags){
            this.tagsVsQuestions.computeIfAbsent(item, key -> new ArrayList<>());
            this.tagsVsQuestions.get(item).add(question);
        }

        this.userManagement.addQuestionToUser(userId, question);

        System.out.println("User with id "+userId + " has posted a question :: "+content);

        return id;
    }

    public int postAnswer(int userId, int questionId, String content){

        Answer answer = new Answer(userId + questionId, content, userId);

        Question question = this.questionList.get(questionId);
        question.addAnswer(userId, answer);
        this.userManagement.addAnswerToUser(userId, questionId, answer);

        System.out.println("User with id "+userId + " has posted answer :: "+ content + " for question "+questionId);

        return userId+questionId;
    }

    public void upvoteQuestion(int userId, int questionId){
        this.userManagement.incrementInteractionCount(userId);

        Question question = this.questionList.get(questionId);
        question.upVote();

        System.out.println("User with id "+userId + " has up voted question "+questionId);
    }

    public void upVoteAnswer(int userId, int questionId, int answerId){
        this.userManagement.incrementInteractionCount(userId);

        Question question = this.questionList.get(questionId);
        question.answersList.get(answerId).upVote();

        System.out.println("User with id "+userId + " has up voted answer "+answerId);
    }

    public void commentOnQuestion(int userId, int questionId, String content){
        this.userManagement.incrementInteractionCount(userId);

        Question question = this.questionList.get(questionId);
        question.userIdVsComments.put(userId, content);

        System.out.println("User with id "+userId + " has commented :: "+content+" on question "+questionId);
    }

    public void commentOnAnswer(int userId, int questionId, int answerId, String content){
        this.userManagement.incrementInteractionCount(userId);

        Question question = this.questionList.get(questionId);
        Answer answer = question.answersList.get(answerId);
        answer.userIdVsComments.put(userId, content);

        System.out.println("User with id "+userId + " has commented :: "+content+" on answer "+answerId);
    }

    public List<String> searchQuestionsByTag(String tag){
        return this.tagsVsQuestions.get(tag).stream().map(e -> e.content).toList();
    }
}
