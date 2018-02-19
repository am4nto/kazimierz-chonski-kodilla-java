package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify (String poem, PoemDecorator decorator){
        System.out.println(decorator.decorate(poem));
    }
}
