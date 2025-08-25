package br.com.emanueldias01.service;

import br.com.emanueldias01.client.GrokClient;
import br.com.emanueldias01.model.GrokMessage;
import br.com.emanueldias01.model.GrokRequest;
import br.com.emanueldias01.model.GrokResponse;

import java.util.List;

public class GrokService {

    private final GrokClient grokClient;

    public GrokService(String apiKey) {
        this.grokClient = new GrokClient(apiKey);
    }

    public String ask(String systemPrompt, String userPrompt) {
        GrokRequest request = new GrokRequest(
                List.of(
                        new GrokMessage("system", systemPrompt),
                        new GrokMessage("user", userPrompt)
                ),
                "grok-4",
                false
        );

        GrokResponse response = grokClient.sendRequest(request);
        return response.getContent();
    }
}