public class ContoBancario {
    private double saldo;

    public ContoBancario(double saldo){
        this.saldo=saldo;
    }
    public void preleva(double importo) throws SaldoInsufficienteException {
        if(saldo-importo < 0){
            throw new SaldoInsufficienteException("saldo non sufficiente!",saldo,importo);
        }
        if(importo <= 0){
            throw new ImportoNonValidoException("Importo non valido");
        }else{
            saldo-=importo;
        }
    }

    public double getSaldo(){
        return saldo;
    }
}
