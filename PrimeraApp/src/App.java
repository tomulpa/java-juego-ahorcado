

public class App {
    public static void main(String[] args) throws Exception {
        int  i;

        for(i = 1; i<= 10; i++){
            System.out.println(i);
            if(i == 5){
                continue; // a diferencia del break, saltea la linea y continua con lo siguiente
            }
            System.out.println(i);
        }

    }
}
