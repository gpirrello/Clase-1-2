public class Main {
    public static void main(String[] args) {
                //int numeroinicio = 5;
                //int numerofin = 14;

                //while (numeroinicio <= numerofin) {
                //  System.out.println(numeroinicio);
                //numeroinicio++;
                //}
                //}
                // int numeroinicio = 5;
                //int numerofin = 14;
                //while (numeroinicio <= numerofin) {
                //  if (numeroinicio % 2 == 0) {
                //    System.out.println(numeroinicio);
                //      }
                //numeroinicio++;
                //    }
                //  }
                int numeroinicio = 5;
                int numerofin = 14;
                boolean pares = true;


                while(numeroinicio <= numerofin){
                    if (numeroinicio % 2 == 0 && pares) {
                        System.out.println(numeroinicio);
                    }
                    else if (numeroinicio % 2 == 1 && !pares){
                        System.out.println(numeroinicio);
                    }

                    numeroinicio++;
                }
            }
        }

