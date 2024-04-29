public class Arreglos {
    public static void main(String[] args) {
        /*Arreglos: estructuiras de datos que tienen valores del mismo tipo bajo un mismo nombre, estos valores
         * se distribuyen secuencialmente en la memoria y se puede acceder a ellos mediante un indice.
         * Los arreglos son tambien llamados vectores o matrices 
         */
        // el indice se comienza a contar en 0

        /*
         * int[] numeros = new int[5];
         numeros[0] = 10;
         numeros[1] = 20;
         numeros[2] = 30;
         numeros[3] = 40;
         numeros[4] = 50;
         */
         

         /*
          *System.out.println(numeros[0]);
         System.out.println(numeros[1]);
         System.out.println(numeros[2]);
         System.out.println(numeros[3]);
         System.out.println(numeros[4]); 

            *System.out.println(numeros.length); 
    
        
         * for(int index =0; index < numeros.length; index++){
            System.out.println(numeros[index]);
            }  
         */

         //otra manera de hacerlo 
         int[] numeros = {10, 20, 30, 40, 50};

         numeros[2] = 70;
        /*
         *for(int index =0; index < numeros.length; index++){
            System.out.println(numeros[index]);
            } 
         */

        for (int numero : numeros) {
            System.out.println(numeros[numero]);
        }
           
         
    }
}
