public class Autovehicul  {
    private String marca;
    private String culoare;
    private Sofer sofer;
    private int vitezaCurenta;
    private int treaptaVitezaCurenta;
    private int vitezaMaxima;
    private int nrTrepteDisponibile;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public int getVitezaCurenta() {
        return vitezaCurenta;
    }

    public void setVitezaCurenta(int vitezaCurenta) {
        this.vitezaCurenta = vitezaCurenta;
    }

    public int getTreaptaVitezaCurenta() {
        return treaptaVitezaCurenta;
    }

    public void setTreaptaVitezaCurenta(int treaptaVitezaCurenta) {
        this.treaptaVitezaCurenta = treaptaVitezaCurenta;
    }

    public int getVitezaMaxima() {
        return vitezaMaxima;
    }

    public void setVitezaMaxima(int vitezaMaxima) {
        this.vitezaMaxima = vitezaMaxima;
    }

    public int getNrTrepteDisponibile() {
        return nrTrepteDisponibile;
    }

    public void setNrTrepteDisponibile(int nrTrepteDisponibile) {
        this.nrTrepteDisponibile = nrTrepteDisponibile;
    }

    public Autovehicul(String marca, String culoare, int vitezaCurenta, int treaptaVitezaCurenta, int vitezaMaxima, int nrTrepteDisponibile,Sofer sofer){
        this.marca=marca;
        this.culoare=culoare;
        this.vitezaCurenta=vitezaCurenta;
        this.treaptaVitezaCurenta=treaptaVitezaCurenta;
        this.vitezaMaxima=vitezaMaxima;
        this.nrTrepteDisponibile=nrTrepteDisponibile;
        this.sofer=sofer;
    }
    public void accelerare(int delta){
        this.vitezaCurenta+=delta;
    }
    public void decelerare(){
        this.vitezaCurenta-=10;
    }
    public void schimbaTreapta(int treaptaDorita){
        this.treaptaVitezaCurenta=treaptaDorita;
    }
    public void oprire(){
        while(vitezaCurenta>0){
            System.out.println(vitezaCurenta);
            decelerare();
        }
    }
    public Autovehicul(){}

    @Override
    public String toString() {
        return "Autovehicul{" +
                "marca='" + marca + '\'' +
                ", culoare='" + culoare + '\'' +
                ", sofer=" + sofer +
                ", vitezaCurenta=" + vitezaCurenta +
                ", treaptaVitezaCurenta=" + treaptaVitezaCurenta +
                ", vitezaMaxima=" + vitezaMaxima +
                ", nrTrepteDisponibile=" + nrTrepteDisponibile +
                '}';
    }
}
