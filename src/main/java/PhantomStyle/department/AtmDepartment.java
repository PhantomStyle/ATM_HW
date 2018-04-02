package PhantomStyle.department;



import PhantomStyle.atm.ATM;

import java.util.ArrayList;
import java.util.List;

public class AtmDepartment {

    private final List<ATM> atms;

    public AtmDepartment() {
        atms = new ArrayList<>();
    }

    public int getState(int i) {
        return atms.get(i).getRestOfMoney();
    }

    public void returnToInitialState(int i) {
        atms.get(i).setInitialState();
    }
}
