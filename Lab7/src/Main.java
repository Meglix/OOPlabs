public class Main {
    public static void main(String[] args) {
//        Masina m=new Masina("Mercedes","Rosu");
//        Student s=new Student("Ion","Marius",m);
//        Student s2=s.clone();
//        s2.masina.culoare="alba";
//        System.out.println(s);
//        System.out.println(s2);
        //Cat c=new Cat(13);
        Pui p=new Pui("Ionel",123);
        Cat c=new Cat(12,p);
        Cat c1=c.clone();
        c1.dimensiune=321;
        c1.pui.marime=1;
        System.out.println(c);
        System.out.println(c1);
    }
}