package PhantomStyle.banknotes;

public enum  Denomination {
    ONE(1), FIVE(5), TEN(10), FIFTY(50), ONE_HUNDRED(100), FIVE_HUNDRED(500), ONE_THOUSAND(1000), FIVE_THOUSAND(5000);

    private final int denomination;

    Denomination(int denomination) {
        this.denomination = denomination;
    }

    public int getNumDenomination() {
        return denomination;
    }
}
