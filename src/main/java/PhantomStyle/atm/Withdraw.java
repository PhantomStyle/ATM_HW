package PhantomStyle.atm;



import PhantomStyle.banknotes.BanknoteCell;
import PhantomStyle.banknotes.Denomination;

import java.util.HashMap;
import java.util.Map;

public interface Withdraw {
    Map<Denomination, Integer> counter = new HashMap<>();

    void counterToString();

    boolean withdrawMoney(int summ, Map<Denomination, BanknoteCell> map);
}
