package PhantomStyle.atm;


import PhantomStyle.banknotes.Banknote;
import PhantomStyle.banknotes.BanknoteCell;
import PhantomStyle.banknotes.Denomination;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ATM {

    private Withdraw withdraw;
    private final Map<Denomination, BanknoteCell> cellMap = new HashMap<>();
    private State state = new State();

    public ATM(Withdraw withdraw) {
        this.withdraw = withdraw;
        cellMap.put(Denomination.ONE, new BanknoteCell(new Banknote(Denomination.ONE)));
        cellMap.put(Denomination.FIVE, new BanknoteCell(new Banknote(Denomination.FIVE)));
        cellMap.put(Denomination.TEN, new BanknoteCell(new Banknote(Denomination.TEN)));
        cellMap.put(Denomination.FIFTY, new BanknoteCell(new Banknote(Denomination.FIFTY)));
        cellMap.put(Denomination.ONE_HUNDRED, new BanknoteCell(new Banknote(Denomination.ONE_HUNDRED)));
        cellMap.put(Denomination.FIVE_HUNDRED, new BanknoteCell(new Banknote(Denomination.FIVE_HUNDRED)));
        cellMap.put(Denomination.ONE_THOUSAND, new BanknoteCell(new Banknote(Denomination.ONE_THOUSAND)));
        cellMap.put(Denomination.FIVE_THOUSAND, new BanknoteCell(new Banknote(Denomination.FIVE_THOUSAND)));
    }

    public ATM() {
        withdraw = new LargeNoteWithdraw();
        cellMap.put(Denomination.ONE, new BanknoteCell(new Banknote(Denomination.ONE)));
        cellMap.put(Denomination.FIVE, new BanknoteCell(new Banknote(Denomination.FIVE)));
        cellMap.put(Denomination.TEN, new BanknoteCell(new Banknote(Denomination.TEN)));
        cellMap.put(Denomination.FIFTY, new BanknoteCell(new Banknote(Denomination.FIFTY)));
        cellMap.put(Denomination.ONE_HUNDRED, new BanknoteCell(new Banknote(Denomination.ONE_HUNDRED)));
        cellMap.put(Denomination.FIVE_HUNDRED, new BanknoteCell(new Banknote(Denomination.FIVE_HUNDRED)));
        cellMap.put(Denomination.ONE_THOUSAND, new BanknoteCell(new Banknote(Denomination.ONE_THOUSAND)));
        cellMap.put(Denomination.FIVE_THOUSAND, new BanknoteCell(new Banknote(Denomination.FIVE_THOUSAND)));
    }

    public void setWithdraw(Withdraw withdraw) {
        this.withdraw = withdraw;
    }

    public boolean withdrawMoney(int summ){
        withdraw.withdrawMoney(summ, cellMap);
        return false;
    }



    public void addOnes(int amount) {
        for (int i = 0; i < amount; i++) {
            cellMap.get(Denomination.ONE).add(new Banknote(Denomination.ONE));
        }
    }

    public void addFives(int amount) {
        for (int i = 0; i < amount; i++) {
            cellMap.get(Denomination.FIVE).add(new Banknote(Denomination.FIVE));
        }
    }

    public void addTens(int amount) {
        for (int i = 0; i < amount; i++) {
            cellMap.get(Denomination.TEN).add(new Banknote(Denomination.TEN));
        }
    }

    public void addFifties(int amount) {
        for (int i = 0; i < amount; i++) {
            cellMap.get(Denomination.FIFTY).add(new Banknote(Denomination.FIFTY));
        }
    }

    public void addOneHundreds(int amount) {
        for (int i = 0; i < amount; i++) {
            cellMap.get(Denomination.ONE_HUNDRED).add(new Banknote(Denomination.ONE_HUNDRED));
        }
    }

    public void addFiveHundreds(int amount) {
        for (int i = 0; i < amount; i++) {
            cellMap.get(Denomination.FIVE_HUNDRED).add(new Banknote(Denomination.FIVE_HUNDRED));
        }
    }

    public void addOneThousand(int amount) {
        for (int i = 0; i < amount; i++) {
            cellMap.get(Denomination.ONE_THOUSAND).add(new Banknote(Denomination.ONE_THOUSAND));
        }
    }

    public void addFiveThousand(int amount) {
        for (int i = 0; i < amount; i++) {
            cellMap.get(Denomination.FIVE_THOUSAND).add(new Banknote(Denomination.FIVE_THOUSAND));
        }
    }

    public void setOnes(int amount) {
        cellMap.put(Denomination.ONE, new BanknoteCell(new Banknote(Denomination.ONE)));
        for (int i = 0; i < amount; i++) {
            cellMap.get(Denomination.ONE).add(new Banknote(Denomination.ONE));
        }
    }

    public void setFives(int amount) {
        cellMap.put(Denomination.FIVE, new BanknoteCell(new Banknote(Denomination.FIVE)));
        for (int i = 0; i < amount; i++) {
            cellMap.get(Denomination.FIVE).add(new Banknote(Denomination.FIVE));
        }
    }

    public void setTens(int amount) {
        cellMap.put(Denomination.TEN, new BanknoteCell(new Banknote(Denomination.TEN)));
        for (int i = 0; i < amount; i++) {
            cellMap.get(Denomination.TEN).add(new Banknote(Denomination.TEN));
        }
    }

    public void setFifties(int amount) {
        cellMap.put(Denomination.FIFTY, new BanknoteCell(new Banknote(Denomination.FIFTY)));
        for (int i = 0; i < amount; i++) {
            cellMap.get(Denomination.FIFTY).add(new Banknote(Denomination.FIFTY));
        }
    }

    public void setOneHundreds(int amount) {
        cellMap.put(Denomination.ONE_HUNDRED, new BanknoteCell(new Banknote(Denomination.ONE_HUNDRED)));
        for (int i = 0; i < amount; i++) {
            cellMap.get(Denomination.ONE_HUNDRED).add(new Banknote(Denomination.ONE_HUNDRED));
        }
    }

    public void setFiveHundreds(int amount) {
        cellMap.put(Denomination.FIVE_HUNDRED, new BanknoteCell(new Banknote(Denomination.FIVE_HUNDRED)));
        for (int i = 0; i < amount; i++) {
            cellMap.get(Denomination.FIVE_HUNDRED).add(new Banknote(Denomination.FIVE_HUNDRED));
        }
    }

    public void setOneThousand(int amount) {
        cellMap.put(Denomination.ONE_THOUSAND, new BanknoteCell(new Banknote(Denomination.ONE_THOUSAND)));
        for (int i = 0; i < amount; i++) {
            cellMap.get(Denomination.ONE_THOUSAND).add(new Banknote(Denomination.ONE_THOUSAND));
        }
    }

    public void setFiveThousand(int amount) {
        cellMap.put(Denomination.FIVE_THOUSAND, new BanknoteCell(new Banknote(Denomination.FIVE_THOUSAND)));
        for (int i = 0; i < amount; i++) {
            cellMap.get(Denomination.FIVE_THOUSAND).add(new Banknote(Denomination.FIVE_THOUSAND));
        }
    }

    public int getRestOfMoney() {

        int rest = 0;
        for (Map.Entry<Denomination, BanknoteCell> entry : cellMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue().getBanknotes().size());
            for (Banknote b : entry.getValue().getBanknotes()) {
                rest += b.getDenomination().getNumDenomination();
            }
        }
        System.out.println("Rest " + rest);
        return rest;
    }

    public void setInitialState() {
        AtmBuilder temp = new AtmBuilder().setInitialState();
        setOnes(temp.ones);
        setFives(temp.fives);
        setTens(temp.tens);
        setFifties(temp.fifties);
        setOneHundreds(temp.oneHundreds);
        setFiveHundreds(temp.fiveHundreds);
        setOneThousand(temp.oneThousand);
        setFiveThousand(temp.fiveThousand);
    }

    public class AtmBuilder {
        Random r = new Random();

        private int ones = r.nextInt(100) + 1;
        private int fives = r.nextInt(100) + 1;
        private int tens = r.nextInt(100) + 1;
        private int fifties = r.nextInt(100) + 1;
        private int oneHundreds = r.nextInt(100) + 1;
        private int fiveHundreds = r.nextInt(100) + 1;
        private int oneThousand = r.nextInt(100) + 1;
        private int fiveThousand = r.nextInt(100) + 1;

        public AtmBuilder setInitialState() {
            setOnes(state.ones);
            setFives(state.fives);
            setTens(state.tens);
            setFifties(state.fifties);
            setOneHundreds(state.oneHundreds);
            setFiveHundreds(state.fiveHundreds);
            setOneThousand(state.oneThousand);
            setFiveThousand(state.fiveThousand);
            return this;
        }

        public AtmBuilder setOnes(int ones) {
            this.ones = ones;
            state.ones = ones;
            return this;
        }

        public AtmBuilder setFives(int fives) {
            this.fives = fives;
            state.fives = fives;
            return this;
        }

        public AtmBuilder setTens(int tens) {
            this.tens = tens;
            state.tens = tens;
            return this;
        }

        public AtmBuilder setFifties(int fifties) {
            this.fifties = fifties;
            state.fifties = fifties;
            return this;
        }

        public AtmBuilder setOneHundreds(int oneHundreds) {
            this.oneHundreds = oneHundreds;
            state.oneHundreds = oneHundreds;
            return this;
        }

        public AtmBuilder setFiveHundreds(int fiveHundreds) {
            this.fiveHundreds = fiveHundreds;
            state.fiveHundreds = fiveHundreds;
            return this;
        }

        public AtmBuilder setOneThousand(int oneThousand) {
            this.oneThousand = oneThousand;
            state.oneThousand = oneThousand;
            return this;
        }

        public AtmBuilder setFiveThousand(int fiveThousand) {
            this.fiveThousand = fiveThousand;
            state.fiveThousand = fiveThousand;
            return this;
        }

        public ATM build() {
            ATM atm = new ATM();
            atm.addOnes(ones);
            atm.addFives(fives);
            atm.addTens(tens);
            atm.addFifties(fifties);
            atm.addOneHundreds(oneHundreds);
            atm.addFiveHundreds(fiveHundreds);
            atm.addOneThousand(oneThousand);
            atm.addFiveThousand(fiveThousand);
            //state = new State(ones, fives, tens, fifties, oneHundreds, fiveHundreds, oneThousand, fiveThousand);
            return atm;
        }
    }
}
