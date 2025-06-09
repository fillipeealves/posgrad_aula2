package application.usecase;

import domain.model.Answer;
import domain.model.Question;
import domain.service.TutorService;

public class AskTutorUseCase {
    private final TutorService tutorService;

    public AskTutorUseCase(TutorService tutorService) {
        this.tutorService = tutorService;
    }

    public Answer execute(String content) {
        return tutorService.askQuestion(new Question(content));
    }
}