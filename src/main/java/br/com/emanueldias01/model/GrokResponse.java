package br.com.emanueldias01.model;

public class GrokResponse {
    private String id;
    private String object;
    private long created;
    private String model;
    private String content;

    public GrokResponse(String id, String object, long created, String model, String content) {
        this.id = id;
        this.object = object;
        this.created = created;
        this.model = model;
        this.content = content;
    }

    public String getContent() {
        return content;
    }

}
