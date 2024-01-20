public class Function {
    public static void main(String[] args) {
        
        // GreetUser();
        // PrintPattern();
        // PrintPatternfirst();
        // PrintPatternSecond();
        PrintPatternThird();
    }

    public static void GreetUser(){
     System.out.println("Good Morning");
    }

    public static void PrintPattern(){
         System.out.println(" *\n * *\n * * *\n * * * *\n * * * * *");
        System.out.println("\n\n * * * * *\n * * * *\n * * *\n * *\n *");
        System.out.println("\n\n         *\n       * *\n     * * *\n   * * * *\n * * * * *");
        
    }

    public static void PrintPatternfirst(){
        int Rows=0;
        while (Rows<5) {
            System.out.print("*");
             int i=0;
            while (i<Rows) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            Rows++;
        }


    }
    public static void PrintPatternSecond(){
         int Rows=5;
        while (Rows>0) {
            System.out.print("*");
             int i=1;
            while (i<Rows) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            Rows--;
        }
    }
    public static void PrintPatternThird(){
         int Rows=0;
        while (Rows<5) {
            int j;
            j=2*(5-Rows);
            while( j>=0)
            {
                // printing spaces
                System.out.print(" ");
                j--;
            }
             int i=0;
            while (i<=Rows) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            Rows++;
        }
    }

    
    }
