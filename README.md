# Primeiro Projeto Spring Boot - Educacional

Este é um projeto introdutório desenvolvido para aprendizado dos conceitos fundamentais do Spring Boot. O objetivo principal é explorar as principais funcionalidades do framework através de exemplos práticos e simples.

## Sobre o Projeto

**Caráter Educacional**: Este projeto foi criado exclusivamente para fins de aprendizado, demonstrando os conceitos básicos do Spring Boot de forma didática e progressiva.

## Tecnologias Utilizadas

- Java 17+
- Spring Boot 3.x
- Spring Web

## Estrutura do Projeto

```
src/main/java/com/jotace/
├── controller/
│   └── Controller.java                    # Controller principal com múltiplos endpoints
├── first_project_spring_boot/
│   └── FirstProjectSpringBootApplication.java # Classe principal da aplicação
└── ioc_di/
    ├── MyComponentController.java         # Controller com injeção de dependência
    └── MyComponent.java                   # Componente para demonstração de IoC/DI
```

## Conceitos Demonstrados

### 1. **Controller Básico e Mapeamento de Rotas**
- Uso de `@RestController` e `@RequestMapping`
- Mapeamento de endpoints HTTP

### 2. **Parâmetros de Requisição**
- **Path Variable**: `@PathVariable`
- **Query Params**: `@RequestParam`
- **Body**: `@RequestBody`
- **Headers**: `@RequestHeader`

### 3. **Injeção de Dependência (IoC/DI)**
- Uso de `@Service` e `@Autowired`
- Configuração com `@ComponentScan`

### 4. **Manipulação de Respostas HTTP**
- Uso de `ResponseEntity`
- Controle de status codes

## Endpoints Implementados

### Controller Principal (`/firstController`)

| Método | Endpoint | Descrição | Parâmetros |
|--------|----------|-----------|------------|
| `GET` | `/firstEndpoint/{id}` | Retorna o parâmetro do path | `id` (Path Variable) |
| `GET` | `/endpointWithQueryParams` | Retorna query param específico | `id` (Query Param) |
| `GET` | `/endpointWithQueryParamsTwo` | Retorna todos os query params | Múltiplos Query Params |
| `POST` | `/postEndpoint` | Recebe dados no body | JSON no body |
| `POST` | `/postEndpointWithHeader` | Lê header específico | Header `name` |
| `POST` | `/postEndpointWithHeaders` | Lê todos os headers | Todos os headers |
| `GET` | `/responseEntity/{id}` | Demonstra uso do ResponseEntity | `id` (Path Variable) |

### Controller de Componente (`/component`)

| Método | Endpoint | Descrição |
|--------|----------|-----------|
| `GET` | `/` | Chama método do componente injetado |

## Exemplos de Uso

### Testando os Endpoints

1. **Path Variable:**
```bash
curl http://localhost:8080/firstController/firstEndpoint/123
```
**Resposta:** `"O parâmetro é: 123"`

2. **Query Parameters:**
```bash
curl "http://localhost:8080/firstController/endpointWithQueryParams?id=456"
```
**Resposta:** `"O parâmetro via Query Params é 456"`

3. **Múltiplos Query Parameters:**
```bash
curl "http://localhost:8080/firstController/endpointWithQueryParamsTwo?id=456&name=João"
```

4. **POST com Body:**
```bash
curl -X POST http://localhost:8080/firstController/postEndpoint \
  -H "Content-Type: application/json" \
  -d '{"username":"jotace"}'
```

5. **POST com Header:**
```bash
curl -X POST http://localhost:8080/firstController/postEndpointWithHeader \
  -H "name: MeuHeader"
```

6. **ResponseEntity com Validação:**
```bash
# Retorna sucesso (id > 5)
curl http://localhost:8080/firstController/responseEntity/10

# Retorna erro (id <= 5)
curl http://localhost:8080/firstController/responseEntity/3
```

7. **Injeção de Dependência:**
```bash
curl http://localhost:8080/component/
```
**Resposta:** `"Retornando do meu componente"`

## Configuração e Execução

### Pré-requisitos
- Java 17 ou superior
- Maven
- IDE de sua preferência (IntelliJ, Eclipse, VS Code)

### Executando o Projeto

1. **Clone o repositório:**
```bash
git clone [url-do-repositorio]
```

2. **Execute a aplicação:**
```bash
./mvnw spring-boot:run
```

3. **Acesse a aplicação:**
```
http://localhost:8080
```

### Configuração do ComponentScan

O projeto demonstra duas formas de configurar o `@ComponentScan`:

```java
// Escaneia pacotes específicos
@ComponentScan(basePackages = "com.jotace")

// Escaneia classes específicas
@ComponentScan(basePackageClasses = {Controller.class, MyComponent.class})
```

## Objetivos de Aprendizado

- ✅ Compreender a estrutura básica de um projeto Spring Boot
- ✅ Aprender a criar controllers e mapear endpoints
- ✅ Entender os diferentes tipos de parâmetros em requisições HTTP
- ✅ Compreender o conceito de Injeção de Dependência
- ✅ Aprender a usar ResponseEntity para respostas HTTP customizadas
- ✅ Configurar e usar ComponentScan

## Próximos Passos Sugeridos

Para continuar o aprendizado, recomenda-se explorar:

- Spring Data JPA para persistência de dados
- Validação de dados com Bean Validation
- Tratamento de exceções com `@ControllerAdvice`
- Spring Security para autenticação e autorização
- Testes unitários e de integração

**Nota**: Este projeto foi desenvolvido para fins educacionais como parte do processo de aprendizado do Spring Boot. O código demonstra conceitos básicos e introdutórios do framework.
