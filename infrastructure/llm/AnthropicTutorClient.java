package infrastructure.llm;

public class AnthropicTutorClient implements TutorClient {
    @Override
    public String ask(String question) {
        return "Resposta da Anthropic para: " + question;
    }
}