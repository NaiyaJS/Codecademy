package cademyLearning;

public class Dog {
    String breed;
    boolean hasOwner;
    int age;

    public Dog(String dogBreed, boolean dogOwned, int dogYears){
        breed = dogBreed;
        hasOwner = dogOwned;
        age = dogYears;
    }

    public static void main(String[] args) {
        Dog fido = new Dog("poodle", false,4);
        Dog nunzo = new Dog("shiba inu", true,  12);

        boolean isFidoOlder = fido.age > nunzo.age;
        int totalDogYears = nunzo.age + fido.age;

        System.out.println("Two dogs created: a " + fido.breed + " and a " + nunzo.breed);
        System.out.println("The Statement that fido is an older dog is: " + isFidoOlder);
        System.out.println("The total age of the dogs is: " + totalDogYears);

    }
}
