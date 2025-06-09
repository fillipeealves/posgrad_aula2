package adapter.controller;

import application.usecase.AskTutorUseCase;
import domain.model.Answer;
import infrastructure.llm.TutorClient;
import infrastructure.llm.TutorClientStrategy;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/tutor")
public class TutorController {
    private final TutorClientStrategy strategy;

    public TutorController() {
        this.strategy = new TutorClientStrategy();
    }

    @PostMapping("/ask")
    public Map<String, String> ask(@RequestBody Map<String, String> body) {
        String question = body.get("question");
        String model = body.getOrDefault("model", "openai");

        TutorClient client = strategy.resolve(model);
        AskTutorUseCase useCase = new AskTutorUseCase(new domain.service.TutorService(client));
        Answer answer = useCase.execute(question);

        return Map.of(
            "answer", answer.getContent(),
            "modelUsed", model
        );
    }
}