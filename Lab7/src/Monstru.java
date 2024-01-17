public abstract class Monstru {
    int dimensiune;
    public Monstru(int dimensiune){
        this.dimensiune=dimensiune;
    }
    public abstract void rar();

    @Override
    public String toString() {
        return "Monstru{" +
                "dimensiune=" + dimensiune +
                '}';
    }
}
