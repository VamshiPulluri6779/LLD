package StackOverFlow;

import java.util.List;

public class Demo {
    public static void main(String[] args) {

        StackOverFlow stackOverFlow = new StackOverFlow();

        stackOverFlow.createUser(1, "demoUser");
        stackOverFlow.createUser(2, "demoUser2");
        int questionId = stackOverFlow.postQuestion(1, "How to create a variable in java", List.of("java"));
        int answerId = stackOverFlow.postAnswer(2, questionId, "Ask AI");

        stackOverFlow.commentOnAnswer(1, questionId, answerId, "Maku telida ra errihook");

        for(String question : stackOverFlow.searchQuestionsByTag("java")){
            System.out.println(question);
        }
    }
}
