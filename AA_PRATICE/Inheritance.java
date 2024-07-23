package AA_PRATICE;

class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("The cat meows.");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Animal dog ;
        dog= new Dog();
        
        Cat cat = new Cat();

        System.out.println("Dog:");
        dog.eat();
        dog.eat();

        System.out.println("\nCat:");
        cat.eat();
        cat.meow();
    }
}
