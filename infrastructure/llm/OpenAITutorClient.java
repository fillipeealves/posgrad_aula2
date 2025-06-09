package infrastructure.llm;

public class OpenAITutorClient implements TutorClient {
    @Override
    public String ask(String question) {
        return "Resposta da OpenAI para: " + question;
    }
}