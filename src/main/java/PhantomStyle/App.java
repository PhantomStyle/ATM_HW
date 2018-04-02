package PhantomStyle;

import PhantomStyle.atm.ATM;

public class App {
    public static void main(String[] args) {
        ATM atm = new ATM();
        ATM.AtmBuilder atmBuilder = atm.new AtmBuilder();
        ATM testATM = atmBuilder
                .setFifties(500)
                .setFives(10)
                .build();

        System.out.println("Before\n");
        testATM.getRestOfMoney();
        //testATM.withdrawMoney(16461);
        testATM.setOneHundreds(444);
        System.out.println("Added\n");
        testATM.getRestOfMoney();
//        System.out.println("After init state\n");
//        testATM.setInitialState();
//        testATM.getRestOfMoney();

    }
}
