import net.datafaker.Faker;

public class Reclutatore {
    private Faker f=new Faker();
    private String name;
    private int powerLevel;
    public Reclutatore(int difficulty) throws EroeNonIdoneoException {
        name = f.name().toString();
        powerLevel = (int)(Math.random()*100+1);
        if(powerLevel<difficulty){
            throw new EroeNonIdoneoException("Eroe non idoneo!",name,powerLevel);
        }
    }
    public String getName() {
        return name;
    }
    public int getPowerLevel() {
        return powerLevel;
    }
}
