package study;

import java.util.List;
import java.util.ArrayList;

public class GenericsStudy {

    public static void main(String[] args) {

        List<? super Animal> animals = new ArrayList<>();

        // Animal cat = new Cat();
        animals.add(new Cat());
        animals.add(new Dog());

        List<? extends Animal> animals1 = new ArrayList<>();
        Animal animal = animals1.get(0);

//        non-generics
//        animals1.add(new Cat());
    }

    private interface Animal {

    }

    private static class Cat implements Animal {

    }

    private static class Dog implements Animal {

    }
}
