package com.ChattyProject;

public class SimpleBot {
    String botName;
    int birthYear;

    SimpleBot(){

    }

    SimpleBot(String botName, int birthYear){
        this.botName = botName;
        this.birthYear = birthYear;
    }

    public void announce(){
        System.out.println("Hello! My name is " + botName + ".");
        System.out.println("I was created in " + birthYear + ".");
    }

    public static void main(String[] args){



    }
}
