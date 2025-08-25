package br.com.emanueldias01.model;

import java.util.List;

public class GrokRequest {
    private List<GrokMessage> messages;
    private String model;
    private boolean stream;

    public GrokRequest(List<GrokMessage> messages, String model, boolean stream) {
        this.messages = messages;
        this.model = model;
        this.stream = stream;
    }

    public List<GrokMessage> getMessages() {
        return messages;
    }

    public String getModel() {
        return model;
    }

    public boolean isStream() {
        return stream;
    }
}
