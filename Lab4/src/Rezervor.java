public class Rezervor {
    private int capacitateMaximă;
    private int nivelCurentDeUmplere;

    public Rezervor(int capacitateMaximă, int nivelCurentDeUmplere) {
        this.capacitateMaximă = capacitateMaximă;
        this.nivelCurentDeUmplere = nivelCurentDeUmplere;
    }
    public Rezervor(){}
    public int getCapacitateMaximă() {
        return capacitateMaximă;
    }
    public void umplere(int delta){
        if (nivelCurentDeUmplere+delta<capacitateMaximă){
            nivelCurentDeUmplere+=delta;
        }
    }
    public void setCapacitateMaximă(int capacitateMaximă) {
        this.capacitateMaximă = capacitateMaximă;
    }

    public int getNivelCurentDeUmplere() {
        return nivelCurentDeUmplere;
    }

    public void setNivelCurentDeUmplere(int nivelCurentDeUmplere) {
        this.nivelCurentDeUmplere = nivelCurentDeUmplere;
    }

    public String toString() {
        return "Rezervor{" +
                "capacitateMaximă=" + capacitateMaximă +
                ", nivelCurentDeUmplere=" + nivelCurentDeUmplere +
                '}';
    }
}
