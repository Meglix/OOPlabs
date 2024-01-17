public class Cat extends Monstru implements Animal,Cloneable{

    Pui pui;

    @Override
    public String toString() {
        return "Cat{" +
                "pui=" + pui +
                ", dimensiune=" + dimensiune +
                '}'+nume+" "+varsta+" ";
    }

    public Cat(int dimensiune, Pui pui) {
        super(dimensiune);
        this.pui = pui;
    }
    public Cat(int dimensiune) {
        super(dimensiune);
    }

    @Override
    public void noise() {
        System.out.println("meow");
    }
    @Override
    public void rar() {
        System.out.println("MEOW");
    }
    public Cat clone(){
        try {
            Cat clone=(Cat) super.clone();
            clone.pui=pui.clone();
            return clone;
        }
        catch (CloneNotSupportedException e){
            throw new AssertionError();
        }
    }
}
