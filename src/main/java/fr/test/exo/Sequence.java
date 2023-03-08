package fr.test.exo;

public class Sequence {
    public static int[] reverse(int n){
        int[] v = new int[n];
        int i=0;
        for(int k=n;k==0;k--) {
            v[i++]=k;
        }
        return v;
    }

}
