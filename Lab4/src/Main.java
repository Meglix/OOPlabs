public class Main {
    public static void main(String[] args) {
        Rezervor rezervor=new Rezervor(100,50);
        Sofer sofer=new Sofer("Dan","Ion",30,123,rezervor);
        Autovehicul autovehicul=new Autovehicul("Mercedes","Rosie",120,240,300,6,sofer);
        System.out.println(autovehicul);
        //autovehicul.oprire();
        System.out.println(autovehicul);
    }
}