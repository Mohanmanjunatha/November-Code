
//creatting a Barista,Cashier,Manager
public class CofeeShop {

    interface Employee
    {
        void serveCustomer();
        void restockInventory();
    }


    static class Barista implements Employee{

        public void serveCustomer(){
            System.out.print("preparing and serving cofee");
        }
        public void restockInventory(){
            System.out.print("Stocking items");
        }


    }

    static class Cashier implements Employee{

        public void serveCustomer(){
            System.out.print("TAKING orders ");
        }
        public void restockInventory(){
            System.out.print("stocking cash in the counter");
        }
    }

    static class Manager implements Employee{

        public void serveCustomer(){
            System.out.print("taking feedback");
        }
        public void restockInventory(){
            System.out.print("stocking all the items needed for the month");
        }

    }

    public static void main(String[] args){
        Employee barista=new Barista();
        Employee cashier=new Cashier();
        Employee manager=new Manager();
        System.out.println("Barista:");
        barista.serveCustomer();
        barista.restockInventory();

        System.out.println("\nCashier:");
        cashier.serveCustomer();
        cashier.restockInventory();

        System.out.println("\nManager:");
        manager.serveCustomer();
        manager.restockInventory();


    }

}
