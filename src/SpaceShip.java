public class SpaceShip {
    private String type;
    private String destiantion;
    private String pilot;

    public SpaceShip(String type, String destiantion, String pilot) {
        this.type = type;
        this.destiantion = destiantion;
        this.pilot = pilot;
    }

    @Override
    public String toString() {
        return  "type = " + type +
                ", destiantion = " + destiantion +
                ", pilot = " + pilot;
    }
}
