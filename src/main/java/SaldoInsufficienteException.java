public class SaldoInsufficienteException extends Exception {
    private double saldo;
    private double importo;
    public SaldoInsufficienteException(String message) {

        super(message);
    }

    public SaldoInsufficienteException(String message,double saldo,double importo) {
        this.saldo=saldo;
        this.importo=importo;
        super(message);
    }

    public double getImporto() {
        return importo;
    }

    public double getSaldo() {
        return saldo;
    }
}
