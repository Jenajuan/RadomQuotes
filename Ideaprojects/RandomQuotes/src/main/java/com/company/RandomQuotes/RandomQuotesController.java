package com.company.RandomQuotes;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class RandomQuotesController {
    private ArrayList<RandomQuotes>
            qList = new ArrayList<>();
    private ArrayList<Words>
            wList = new ArrayList<>();
    private ArrayList<MagicEight>
            aList = new ArrayList<>();

     Random rand = new Random();


        public RandomQuotesController() {

        this.qList.add(new RandomQuotes("The greatest glory in living lies not in never falling, but in rising every time we fall ", "Nelson Mandela"));
        this.qList.add(new RandomQuotes("Life is what happens when you're making other plans", "John Lennon"));
        this.qList.add(new RandomQuotes("Spread love everywhere you go. Let no one ever come to you without leaving happier", "Mother Teresa"));
        this.qList.add(new RandomQuotes(" Always remember that you are absolutely unique. Just like everyone else. ", "Margaret Mead"));
        this.qList.add(new RandomQuotes("If you don't like something then change it and if you can't change it change your attitude", "Maya Angelou"));
        this.qList.add(new RandomQuotes("You don't have to be somebody different to be important. You're important in your own right.", "Michelle Obama"));
        this.qList.add(new RandomQuotes("We need to do a better job of putting ourselves higher on out own 'to do' list", "Michelle Obama"));
        this.qList.add(new RandomQuotes("Nobody can give you freedom. Nobody can give you equality or justice or anything. If you're a man, you take it.", "Malcolm X"));
        this.qList.add(new RandomQuotes("You can't separate peace from freedom because no one can be at peace unless he has his freedom.", "Malcolm X"));
        this.qList.add(new RandomQuotes("I think beautiful is like looking like you take care of yourself.", "Cardi B"));


        this.wList.add(new Words("Apology", "an explanation that frees one from fault or blame"));
        this.wList.add(new Words("Poppycock", "empty talk or writing : NONSENSE"));
        this.wList.add(new Words(" Trilogy ", " a series of three novels, movies, etc., that are closely related and involve the same characters or themes"));
        this.wList.add(new Words(" Unique ", " being the only one  "));
        this.wList.add(new Words("Catalyst", " an agent that provokes or speeds significant change or action "));
        this.wList.add(new Words("diameter", " the length of a straight line through the center of an object or space"));
        this.wList.add(new Words("cogent ", " appealing forcibly to the mind or reason "));
        this.wList.add(new Words("jamboree ", " a large festive gathering"));
        this.wList.add(new Words("felicitous.", " very well suited or expressed : APT"));
        this.wList.add(new Words("balderdash", " NONSENSE"));

        this.aList.add(new MagicEight("It is certain."));
        this.aList.add(new MagicEight("It is decidedly so."));
        this.aList.add(new MagicEight("Reply hazy, try again."));
        this.aList.add(new MagicEight("Ask again later."));
        this.aList.add(new MagicEight("Better not tell you now."));
        this.aList.add(new MagicEight("Cannot predict now."));
        this.aList.add(new MagicEight("Concentrate and ask again"));
        this.aList.add(new MagicEight("Don't count on it."));
        this.aList.add(new MagicEight("My reply is no."));
        this.aList.add(new MagicEight("Outlook not so good."));
        this.aList.add(new MagicEight("My sources say no."));



        List<String[]> arrayList = new ArrayList<>();
        arrayList.add(new String[9]);
    }

    @RequestMapping(value = "/quote", method = RequestMethod.GET)
    public RandomQuotes getQuotes() {
            return qList.get(rand.nextInt(qList.size()));
    }

    @RequestMapping(value = "/word", method = RequestMethod.GET)
    public Words getWords() {
        return wList.get(rand.nextInt(wList.size()));
    }
    @RequestMapping(value = "/answer", method = RequestMethod.POST)
    public MagicEight getAnswers() {
        return aList.get(rand.nextInt(aList.size()));
}}




