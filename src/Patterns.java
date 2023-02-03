public class Patterns {
    public static void main(String[] args) {
        int n =9;
        //rows = 5;
        //column =5;
        for ( int r =1;r<=5;r++){
            for (int c=1;c<=r;c++){
                System.out.print("*" +" ");
            }
            System.out.println();
        }
        for ( int r =6;r<=n;r++){
            for (int c=n;c>=r;c--){
                System.out.print("* "+ "");
            }
            System.out.println();
        }
    }
}
//r =0, c=0
//*
//r=1 c =0
//r=1 c =1
//r=1 c =2

//*Identify the number of rows
//Identify the number of column;
//what are we trying to print ?;

