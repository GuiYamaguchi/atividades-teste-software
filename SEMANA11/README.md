# Exercícios — Testes de integração com Spring Boot e JUnit 5

Projeto baseado no material fornecido pelo professor.

## Testes implementados

### Exercício 1 — Service, Repository e H2

- **CT01 — Cadastro válido:** cadastra `Teclado` por `150.0`, verifica se o ID foi gerado e consulta o produto pelo `ProdutoRepository`, conferindo nome e preço.
- **CT02 — Nome inválido:** tenta cadastrar um nome em branco, verifica `IllegalArgumentException` e confirma que a quantidade de registros não aumentou.
- **CT03 — Atualização (desafio):** cadastra `Mouse` por `80.0`, atualiza para `95.0` e consulta novamente pelo repositório para conferir o preço.

### Exercício 2 — Integração HTTP com MockMvc

- **CT04 — Cadastro via API:** envia `POST /produtos` com nome e preço e verifica HTTP 200, ID numérico, nome e preço no JSON.
- **CT05 — Consulta via API:** cadastra o produto via POST, extrai o ID da resposta e realiza `GET /produtos/{id}`, conferindo os dados retornados.

Os testes utilizam o contexto Spring, `ProdutoService`, `ProdutoRepository`, banco H2 e `MockMvc` reais, sem mocks para substituir o serviço ou o repositório.

## Como executar

Requisitos: JDK 17 ou superior e Maven.

Na pasta deste projeto, execute:

```bash
mvn test
```

Os testes estão implementados, mas **não foi possível executá-los no ambiente de preparação**, pois o comando Maven não está instalado. Portanto, execute `mvn test` localmente antes de enviar e confira se todos os testes passaram.

## Isolamento

As classes de teste usam `@Transactional`. No fluxo de testes com `@SpringBootTest` e `MockMvc` sem servidor HTTP real, as operações participam da transação do teste e normalmente são revertidas ao final de cada método. Isso ajuda a manter os testes independentes.
