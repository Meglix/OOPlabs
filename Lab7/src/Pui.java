public class Pui implements Cloneable{
    String nume;
    int marime;

    public Pui(String nume, int marime) {
        this.nume = nume;
        this.marime = marime;
    }

    @Override
    public String toString() {
        return "Pui{" +
                "nume='" + nume + '\'' +
                ", marime=" + marime +
                '}';
    }
    public Pui clone(){
        try {
            Pui clone=(Pui) super.clone();
            return clone;
        }
        catch (CloneNotSupportedException e){
            throw  new AssertionError();
        }
    }
}
