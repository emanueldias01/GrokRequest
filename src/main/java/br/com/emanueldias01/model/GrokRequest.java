package br.com.emanueldias01.model;

import java.util.List;

public class GrokRequest {
    private List<GrokMessage> messages;
    private String model;
    private boolean stream;

    public GrokRequest(){

    }

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

    public void setMessages(List<GrokMessage> messages) {
        this.messages = messages;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setStream(boolean stream) {
        this.stream = stream;
    }
}
