package com.company.RandomQuotes;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PositiveOrZero;

public class MagicEight extends Words {
    @PositiveOrZero
    @NotBlank
    private String answer;


    public MagicEight() {

    }

    public MagicEight(String answer) {
        this.answer = answer;
    }


    public String getAnswer() {
        return answer;
    }

    public void setQuestion(String answer) {
        this.answer = answer;


    }
}

