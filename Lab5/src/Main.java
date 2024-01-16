public class Main {
    public static void main(String[] args) {
        /*int []a=new int[10];
        for(int i=a.length-1;i>=0;i--){
            a[i]=i;
        }
        for (int i:a){
            System.out.println(i);
        }
        String[] sir={"Luni","Marti","Miercuri"};
        for(int i=sir.length-1;i>=0;i--){
            System.out.println(sir[i]);
        }
        String[]sir2;
        sir2=sir;
        sir2[0]="Duminica";
        System.out.println(sir[0]);
         */
        int [][]a = new int[][]{{1,2},{3,4}};
        int [][]b = new int[][]{{2,3},{5,6}};

        MatriceComplexa m = new MatriceComplexa(a,b,2,2);
//        System.out.println();
        MatriceComplexa n = new MatriceComplexa(b,a,2,2);
//        n.afiseaza();
//        System.out.println();
//        m = m.scadere(n);
//        m.afiseaza();
        m=m.inmultire(n);
        m.afiseaza();
    }
}