public class Main {
    public static void main(String[] args) {

        Autor autor1=new Autor();
        Carte carte=new Carte("Minunea",autor1,1,4);
        Autor autor2=new Autor("Andrei","Minune",30);
        Carte carte1=new Carte("Minunea1",autor2,2,1);
        Autor autor3=new Autor();
        Carte carte2=new Carte("Minunea2",autor3,2,4);
        //System.out.println(carte);
        Biblioteca biblioteca=new Biblioteca();
        biblioteca.adaugaCarte(carte);
        biblioteca.adaugaCarte(carte1);
        biblioteca.adaugaCarte(carte2);
        //biblioteca.afiseaza();
        biblioteca.gaseste("Minunea");

    }
}