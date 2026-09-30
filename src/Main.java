//TODO: musimy dodać brakujące klasy


//Ok, dodam 'Adder', ktoś inny doda 'Substractor'

public class Main {
    static void main() {
        Adder adder = new Adder();
        System.out.println(adder.add(1,2));

        Substractor substractor = new Substractor();
        System.out.println(substractor.substract(6,3));

    }
}
