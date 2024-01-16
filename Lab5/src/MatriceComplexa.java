public class MatriceComplexa {
    NumarComplex[][] a;
    private final int n;
    private final int m;

    public MatriceComplexa(int[][] img, int[][] re, int m, int n) {
        a = new NumarComplex[n][m];
        this.n = n;
        this.m = m;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                a[i][j] = new NumarComplex(img[i][j], re[i][j]);
    }

    public MatriceComplexa(int n, int m) {
        this.n = n;
        this.m = m;
        a = new NumarComplex[n][m];
        for (int i = 0; i < n; i++) for (int j = 0; j < m; j++) this.a[i][j] = new NumarComplex(0,0);
    }

    public MatriceComplexa(NumarComplex[][] a, int n, int m) {
        this.a = a;
        this.n = n;
        this.m = m;
    }

    public MatriceComplexa adunare(MatriceComplexa matrice) {
        MatriceComplexa ans = new MatriceComplexa(this.a, this.n, this.m);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                ans.a[i][j] = ans.a[i][j].adunare(matrice.a[i][j]);
        }
        return ans;
    }

    public MatriceComplexa scadere(MatriceComplexa matrice) {
        MatriceComplexa ans = new MatriceComplexa(this.a, this.n, this.m);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                ans.a[i][j] = ans.a[i][j].scadere(matrice.a[i][j]);
        }
        return ans;
    }

    public MatriceComplexa inmultireScalar(int x) {
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                this.a[i][j] = this.a[i][j].inmultireScalar(x);
        return new MatriceComplexa(this.a, n, m);
    }

    public MatriceComplexa inmultire(MatriceComplexa matrice) {
        MatriceComplexa ans = new MatriceComplexa(this.n, this.m);
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                for (int k = 0; k < m; k++) {
                    NumarComplex c = this.a[i][k];
                    ans.a[i][j] = ans.a[i][j].adunare(c.inmultire(matrice.a[k][j]));
                }
        return ans;
    }

    public void afiseaza() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                System.out.print(this.a[i][j].toString() + " ");
            System.out.println();
        }
    }
}