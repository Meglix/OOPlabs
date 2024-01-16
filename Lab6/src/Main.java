public class Main {
    public static void main(String[] args) {
        Ghiozdan g=new Ghiozdan();
        g.add(new Manual("Matematica"));
        g.add(new Manual("Romana"));
        g.add(new Caiet("Caiet Mate"));
        g.add(new Caiet("Caiet Romana"));
        g.listItems();
        Caiet c= new Caiet("Romanae");
        g.add(c);
        g.listItems();
    }
}