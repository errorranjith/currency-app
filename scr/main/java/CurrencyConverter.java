public class CurrencyConverter {

    double rupeeToDollar = 0.012;
    double rupeeToEuro = 0.011;

    public double rupeeToDollar(double rupee) {
        return rupee * rupeeToDollar;
    }

    public double rupeeToEuro(double rupee) {
        return rupee * rupeeToEuro;
    }

    public double dollarToRupee(double dollar) {
        return dollar / rupeeToDollar;
    }

    public double euroToRupee(double euro) {
        return euro / rupeeToEuro;
    }

    public static void main(String[] args) {
        CurrencyConverter c = new CurrencyConverter();

        System.out.println("1000 INR = " + c.rupeeToDollar(1000) + " USD");
        System.out.println("1000 INR = " + c.rupeeToEuro(1000) + " EUR");
    }
}
