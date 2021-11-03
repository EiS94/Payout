package backend;

public class Transaction {

    private final Person payer, receiver;
    private double sum;

    public Transaction(Person payer, Person receiver, double sum) {
        this.payer = payer;
        this.receiver = receiver;
        this.sum = sum;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return payer.getName() + " zahlt " + Utils.roundDoubleToNDigits(sum, 2) + " € an " + receiver.getName();
    }
}
