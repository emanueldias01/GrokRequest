package br.com.emanueldias01.model;

public class GrokMessage {
    private String role;
    private String content;

    public GrokMessage(String role, String content) {
        this.role = role;
        this.content = content;
    }

    public String getRole() {
        return role;
    }

    public String getContent() {
        return content;
    }
}

