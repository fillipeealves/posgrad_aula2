# Tutor IA - Clean Architecture com Spring Boot

Este projeto demonstra o uso de Clean Architecture, integração com LLMs (OpenAI e Anthropic), e boas práticas de desenvolvimento com Java e Spring Boot.

## Como usar

### Enviar uma pergunta:

```bash
curl -X POST http://localhost:8080/api/tutor/ask \
     -H "Content-Type: application/json" \
     -d '{ "question": "O que é o padrão Strategy?", "model": "openai" }'
```

### Estrutura
- **domain**: Regras de negócio
- **application**: Casos de uso
- **infrastructure**: Integrações externas
- **adapter**: Controller REST
- **config**: Configurações do app