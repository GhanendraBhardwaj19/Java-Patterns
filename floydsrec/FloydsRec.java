package com.example.floydsrec;

public class FloydsRec {
    public static void main(String[] args) {
        int n = 5;
        int count = 1;
        for(int i=1; i<=n; i++){
            int j = 1;
            while(j<=i){
                System.out.print(count + " ");
                count++;
                j++;
            }
            System.out.println();
        }
    }
}
