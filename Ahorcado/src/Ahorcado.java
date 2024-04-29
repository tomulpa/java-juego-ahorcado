import java.util.*;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        
        //clase escaner 
        Scanner scanner = new Scanner(System.in);
        
        //declaraciones y asignaciones
        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        //arreglos
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        //estructura de control iterativa: bucle
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }

        //estructura de control iterativa: bucle
        while (!palabraAdivinada && intentos < intentosMaximos) {
            System.out.println("Palabra a adivinar" + String.valueOf(letrasAdivinadas));
            System.out.println("introduce una letra por favor");
            
            // usamos la clase escanner para pedir una letra
            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;
            for (int i = 0; i < palabraSecreta.length(); i++) {
                //estructura de control condicional
                if(palabraSecreta.charAt(i) == letra){
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }

            if(!letraCorrecta){
                intentos++;
                System.out.println("Letra incorrecta te quedan " + (intentosMaximos - intentos) + " intentos.");
            }

            if(String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
                palabraAdivinada = true;
                System.out.println("felicidades has adivinado la palabra secreta");
            }
        }

        if(!palabraAdivinada){
            System.out.println("que pena te has quedado sin intentos");
        }
        scanner.close();
    }
}
