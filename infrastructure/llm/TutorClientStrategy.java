package infrastructure.llm;

public class TutorClientStrategy {
    public TutorClient resolve(String modelName) {
        return switch (modelName.toLowerCase()) {
            case "openai" -> new OpenAITutorClient();
            case "anthropic" -> new AnthropicTutorClient();
            default -> throw new IllegalArgumentException("Modelo não suportado: " + modelName);
        };
    }
}