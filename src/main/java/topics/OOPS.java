package topics;

import java.util.function.BinaryOperator;

interface MyMath {

    int add(int a, int b);

    int multiply(int a, int b);

}

class Human {

    int age;

    String name;

    String gender;


    Human() {
    }

    Human(int age, String name, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public void walk() {
        System.out.println("Walking...");
    }

    @Override
    public String toString() {
        return ("Name: " + this.name + " | Age: " + this.age + " | Gender: " + this.gender);
    }

}

class Male extends Human {

    Male() {
    }

    Male(int age, String name) {
        super(age, name, "M");
    }

}

class ImplMyMath implements MyMath {

    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

}

class MMAth<Pawan> {
    Pawan a;
    Pawan b;

    BinaryOperator<Pawan> adder;
    BinaryOperator<Pawan> multiplier;

    MMAth(Pawan a, Pawan b, BinaryOperator<Pawan> adder, BinaryOperator<Pawan> multiplier) {
        this.a = a;
        this.b = b;
        this.adder = adder;
        this.multiplier = multiplier;
    }

    Pawan add() {
        return adder.apply(this.a, this.b);
    }

    Pawan multiply() {
        return multiplier.apply(this.a, this.b);
    }
}

public class OOPS {

    static void main() {

        MMAth<Integer> mmAth = new MMAth<>(1, 232, (a, b) -> a + b, (a, b) -> a * b);

        System.out.println(mmAth.add());
        System.out.println(mmAth.multiply());

    }

}
