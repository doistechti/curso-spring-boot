package br.com.doistech.curso_spring_boot.model;

public class Greeting {

    private final long id;
    private final String content;

    public Greeting(Long id, String content){
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
