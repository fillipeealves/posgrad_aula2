package domain.service;

import domain.model.Answer;
import domain.model.Question;
import infrastructure.llm.TutorClient;

public class TutorService {
    private final TutorClient tutorClient;

    public TutorService(TutorClient tutorClient) {
        this.tutorClient = tutorClient;
    }

    public Answer askQuestion(Question question) {
        String response = tutorClient.ask(question.getContent());
        return new Answer(response);
    }
}