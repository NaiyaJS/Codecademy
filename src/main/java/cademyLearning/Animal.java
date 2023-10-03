package cademyLearning;

public class Animal {
    //super() in Java
    String sound;

    Animal(String snd) {
        this.sound = snd;
    }
}
    //Child class
    class Dog extends Animal{
    //super method can act like the parent constructor inside the childClass constructor
        Dog(){
            super("woof");
    }
    //we can override the constructor completely by defining a new constructor
        Dog(){
            this.sound = "woof";
    }
}
