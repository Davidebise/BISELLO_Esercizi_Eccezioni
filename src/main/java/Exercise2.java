import net.datafaker.Faker;

import static java.lang.IO.println;

void main() {
    Faker f=new Faker();
    Reclutatore r;
    for(int i=0;i<5;i++){

        try{
            r=new Reclutatore(75);
            println("Eroe reclutato con successo"+"\nEroe:"+r.getName()+"\nLivello:"+r.getPowerLevel()+"\n");
        }catch(EroeNonIdoneoException e){
            println("Errore:"+e.getMessage()+"\nEroe:"+e.getName()+"\nLivello:"+e.getPowerLevel());
        }
    }
}