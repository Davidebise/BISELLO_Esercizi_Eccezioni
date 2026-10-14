import static java.lang.IO.println;

void main(){
    ContoBancario conto = new ContoBancario(100);
    try{
        conto.preleva(101);
    }catch(SaldoInsufficienteException e){
        println(e.getMessage()+"\nSaldo:"+e.getSaldo()+"\nImporto:"+e.getImporto());
    }

    try{
        conto.preleva(-1);
    }catch(ImportoNonValidoException e){
        println(e.getMessage());
    }catch(SaldoInsufficienteException e){
        println(e.getMessage());
    }

    try{
        conto.preleva(10);
        println("Importo effettuato con successo!");
    }catch(ImportoNonValidoException e){
        println(e.getMessage());
    }catch(SaldoInsufficienteException e){
        println(e.getMessage());
    }
}
