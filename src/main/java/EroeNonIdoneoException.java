public class EroeNonIdoneoException extends Exception {
    private String name;
    private int powerLevel;
    public EroeNonIdoneoException(String message) {
        super(message);
    }
    public EroeNonIdoneoException(String message,String name, int powerLevel) {
        this.name=name;
        this.powerLevel=powerLevel;
        super(message);
    }
    public String getName() {
        return name;
    }
    public int getPowerLevel() {
        return powerLevel;
    }
}
