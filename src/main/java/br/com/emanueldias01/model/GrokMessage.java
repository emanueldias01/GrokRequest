package br.com.emanueldias01.model;

public class GrokMessage {
    private String role;
    private String content;

    public GrokMessage(){

    }

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

    public void setContent(String content) {
        this.content = content;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

