package PhantomStyle.banknotes;

import java.util.ArrayList;
import java.util.List;

public class BanknoteCell {

    private final Banknote banknote;
    private final List<Banknote> banknotes;

    public void add(Banknote banknote){
        banknotes.add(banknote);
    }

    public BanknoteCell(Banknote banknote) {
        this.banknote = banknote;
        banknotes = new ArrayList<>();
    }


    public void get(int i){
        banknotes.get(i);
    }

    public List<Banknote> getBanknotes(){
        return banknotes;
    }


}
