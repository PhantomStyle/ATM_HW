package PhantomStyle.atm;


import PhantomStyle.banknotes.BanknoteCell;
import PhantomStyle.banknotes.Denomination;

import java.util.Map;

public class LargeNoteWithdraw implements Withdraw {


    @Override
    public void counterToString() {
        System.out.println("Was used");
        for(Map.Entry<Denomination, Integer> entry : counter.entrySet()){
            System.out.println(entry.getKey() + " x " + entry.getValue());
        }
    }

    @Override
    public boolean withdrawMoney(int summ, Map<Denomination, BanknoteCell> map) {
        try {
            if (summ % 1000 != 0) {
                int i = 0;
                while (summ / 1000 >= 5) {
                    summ -= 5000;
                    map.get(Denomination.FIVE_THOUSAND).getBanknotes().remove(0);
                    counter.put(Denomination.FIVE_THOUSAND, ++i);
                }
                i = 0;
                while (summ / 1000 > 0) {
                    summ -= 1000;
                    map.get(Denomination.ONE_THOUSAND).getBanknotes().remove(0);
                    counter.put(Denomination.ONE_THOUSAND, ++i);
                }
                summ %= 1000;
            }
            if (summ % 100 != 0) {
                int i = 0;
                while (summ / 100 >= 5) {
                    summ -= 500;
                    map.get(Denomination.FIVE_HUNDRED).getBanknotes().remove(0);
                    counter.put(Denomination.FIVE_HUNDRED, ++i);
                }
                i = 0;
                while (summ / 100 > 0) {
                    summ -= 100;
                    map.get(Denomination.ONE_HUNDRED).getBanknotes().remove(0);
                    counter.put(Denomination.ONE_HUNDRED, ++i);
                }
                summ %= 100;
            }
            if (summ % 10 != 0) {
                int i = 0;
                while (summ / 10 >= 5) {
                    summ -= 50;
                    map.get(Denomination.FIFTY).getBanknotes().remove(0);
                    counter.put(Denomination.FIFTY, ++i);
                }
                i = 0;
                while (summ / 10 > 0) {
                    summ -= 10;
                    map.get(Denomination.TEN).getBanknotes().remove(0);
                    counter.put(Denomination.TEN, ++i);
                }
                summ %= 10;
            }
            if (summ != 0) {
                int i = 0;
                while (summ >= 5) {
                    summ -= 5;
                    map.get(Denomination.FIVE).getBanknotes().remove(0);
                    counter.put(Denomination.FIVE, ++i);
                }
                i = 0;
                while (summ > 0) {
                    summ -= 1;
                    map.get(Denomination.ONE).getBanknotes().remove(0);
                    counter.put(Denomination.ONE, ++i);
                }
            }
            counterToString();
            return true;
        }
        catch (Exception e){
            System.out.println("Can't withdraw your summ with large notes");
            e.printStackTrace();
        }
        return false;
    }
}
