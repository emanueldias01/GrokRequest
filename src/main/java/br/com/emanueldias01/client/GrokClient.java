package br.com.emanueldias01.client;

import br.com.emanueldias01.exception.GrokApiException;
import br.com.emanueldias01.model.GrokRequest;
import br.com.emanueldias01.model.GrokResponse;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class GrokClient {

    private static final String API_URL = "https://api.x.ai/v1/chat/completions";
    private final String apiKey;
    private final HttpClient httpClient;
    private final ObjectMapper objectMapper;

    public GrokClient(String apiKey) {
        this.apiKey = apiKey;
        this.httpClient = HttpClient.newHttpClient();
        this.objectMapper = new ObjectMapper();
    }

    public GrokResponse sendRequest(GrokRequest request) {
        try {
            String requestBody = objectMapper.writeValueAsString(request);

            HttpRequest httpRequest = HttpRequest.newBuilder()
                    .uri(URI.create(API_URL))
                    .header("Content-Type", "application/json")
                    .header("Authorization", "Bearer " + apiKey)
                    .timeout(java.time.Duration.ofSeconds(3600))
                    .POST(HttpRequest.BodyPublishers.ofString(requestBody))
                    .build();

            HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() >= 200 && response.statusCode() < 300) {
                return objectMapper.readValue(response.body(), GrokResponse.class);
            } else {
                throw new GrokApiException("Erro da API Grok: " + response.body());
            }
        } catch (Exception e) {
            throw new GrokApiException("Falha ao enviar requisição", e);
        }
    }
}
