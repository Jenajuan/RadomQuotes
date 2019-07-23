package com.company.RandomQuotes;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PositiveOrZero;
import java.util.Random;


//Quote class

public class RandomQuotes extends Words {

    private String quote;
    private String author;
    private int rand;
    public RandomQuotes() {


    }


    public RandomQuotes(String quote, String author) {
        this.quote = quote;
        this.author = author;



    }

    public String getQuote() {
        return this.quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getRand() {return this.rand;}
    public void setRand(int rand){ this.rand = rand;}
}