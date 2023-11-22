public class Caiet extends Rechizita{
    public Caiet(String eticheta){
        this.eticheta = eticheta;
    }
    protected String getNume() {
        return "Caiet "+this.eticheta;
    }
}