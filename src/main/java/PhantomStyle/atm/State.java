package PhantomStyle.atm;

public class State {
    protected int ones;
    protected int fives;
    protected int tens;
    protected int fifties;
    protected int oneHundreds;
    protected int fiveHundreds;
    protected int oneThousand;
    protected int fiveThousand;

    public State(int ones, int fives, int tens, int fifties, int oneHundreds, int fiveHundreds, int oneThousand, int fiveThousand) {
        this.ones = ones;
        this.fives = fives;
        this.tens = tens;
        this.fifties = fifties;
        this.oneHundreds = oneHundreds;
        this.fiveHundreds = fiveHundreds;
        this.oneThousand = oneThousand;
        this.fiveThousand = fiveThousand;
    }

    public State() {
    }
}
