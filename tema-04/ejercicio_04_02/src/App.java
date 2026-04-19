public class App {
    public static void main(String[] args) throws Exception {
        int hora = Integer.parseInt(System.console().readLine("Introduce la hora del día (0-23): "));

        if ((hora >= 6) && (hora <=12)) {
            System.out.println("Buenos días");
        } else if ((hora >= 13) && (hora <=20)) {
            System.out.println("Buenos días");
        } else if (((hora >= 21) && (hora <24)) || ((hora <=5) && (hora >=0))) {
            System.out.println("Buenas noches");
        } else {
            System.out.println("La hora introducida no es correcta");
        }
        
                
    }
}
