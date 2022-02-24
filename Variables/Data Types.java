class Main {
     public static void main(String[] args) {

        int  x = 15;
        int y = 30;
        int sum = x+y;

     System.out.println(" sum of "+x+ " and " +y+ " = " + sum);

     
     int product = x*y;
     System.out.println(" product of " +x+ " and " +y+ " = " + product);

     int v1 = x/y;
     int v2 = x%y;
     int v3 = x^y;
     int v4 = x&y;
     int v5 = x-y;
     int v6 = y-x;
     System.out.println(v1);
     System.out.println(v2);
     System.out.println(v3);
     System.out.println(v4);
     System.out.println(v5);
     System.out.println(v6);

     int expression = (x*y) / (x+y);
     System.out.println(expression);

    }
}