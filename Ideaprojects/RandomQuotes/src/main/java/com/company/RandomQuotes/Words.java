package com.company.RandomQuotes;//import javax.validation.constraints.NotBlank;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PositiveOrZero;


public class Words {
    private String word;
    private String definition;

    public Words() {

    }

    public Words(String word, String definition) {
        this.word = word;
        this.definition = definition;
    }

    public String getWord() {
        return this.word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getDefinition() {
        return this.definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

}