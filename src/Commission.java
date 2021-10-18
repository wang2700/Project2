public class Commission extends Hourly {
    private double totalSale;
    private double commissionRate;

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionRate = commissionRate;
        this.totalSale = 0;
    }

    public void addSales (double totalSales) {
        this.totalSale += totalSales;
    }

    @Override
    public double pay() {
        double hourPay = super.pay();
        return hourPay + commissionRate * totalSale / 100.0;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\nTotal Sale: $ %.2f", totalSale);
    }
}
