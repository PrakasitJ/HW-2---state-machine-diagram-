//6510450585 Prakasit Jaiharn
package Models;

public class GumballMachine {
    private int gumballs;
    private Boolean quarter; // false = No Quarter, true = Has Quarter, null Out of Gumball

    public GumballMachine(int n) {
        this.gumballs = n;
        this.quarter = false;
        System.out.println("Inventory : " + this.gumballs + " gumballs.");
        System.out.println("Machine is waiting for quarter.");
    }

    public void eject() {
        if(quarter != null && quarter) { // Has Quarter
            this.quarter = false; // Set to No Quarter
        }
    }

    public void insert() {
        if(quarter == null) { // Out of Gumball
            System.out.println("You can't insert a quarter, the machine is sold out");
        } else if (quarter) { // Has Quarter
            System.out.println("You can't insert another quarter");
        } else if(!quarter) { // No Quarter
            System.out.println("You inserted a quarter");
            this.quarter = true; // Set to Has Quarter
        }
    }

    public void turned() {
        if(quarter == null) { // Out of Gumball
            System.out.println("You turned, but there is no gumballs");
            return;
        }

        if(quarter) { // Has Gumball
            System.out.println("You turned...");
            System.out.println("The gumball comes rolling out the slot");
            this.quarter = false; // Set to No Gumball
            if(this.gumballs > 0) {
                gumballSold();
            } else {
                this.quarter = null; // Set to Out of Gumball
                System.out.println("You turned, but there is no gumballs");
                eject();
            }
        }
    }

    private void gumballSold() {
        this.gumballs--;
        System.out.println("\nInventory : " + this.gumballs + " gumballs.");
    }
}
