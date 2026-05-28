package j2j;

abstract class Machine {
    abstract void start();
}

class Computer extends Machine {

    @Override
    void start() {
        System.out.println("시작");
    }

}

public class Main2 {
    public static void main(String[] args) {

        Computer com = new Computer();
        com.start();

    }

}