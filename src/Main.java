//6510450585 Prakasit Jaiharn
import Models.GumballMachine;

public class Main {
    public static void main(String[] args) {
        int n = 10;
        GumballMachine gm = new GumballMachine(n);
        for(int i = 0; i < n+3; i++) {
            gm.insert();
            gm.turned();
        }
    }
}