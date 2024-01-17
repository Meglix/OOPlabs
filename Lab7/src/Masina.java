public class Masina implements Cloneable{
    String marca;
    String culoare;

    public Masina(String marca, String culoare) {
        this.marca = marca;
        this.culoare = culoare;
    }

    @Override
    public String toString() {
        return "Masina{" +
                "marca='" + marca + '\'' +
                ", culoare='" + culoare + '\'' +
                '}';
    }
    public Masina clone(){
        try {
            Masina clone=(Masina) super.clone();
            return clone;
        }
        catch (CloneNotSupportedException e){
            throw new AssertionError();
        }
    }
}
