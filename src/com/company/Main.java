package com.company;

public class Main {

    public static void main(String[] args) {
        Boy obj = new Boy();
        obj.eat();
    }
}


class Human{
    public void eat()
    {
        System.out.println("Human is eating");
    }
}
class Boy extends Human{
    public void eat(){
        System.out.println("Boy is eating");
    }
}