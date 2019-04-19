package com.billal.jokes.services;

/*
 * Created by Billal Taha
 * User: BILLALT
 * Date: 4/15/2019
 * Time: 3:22 PM
 */


import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeSrvice {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl(){
        chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
