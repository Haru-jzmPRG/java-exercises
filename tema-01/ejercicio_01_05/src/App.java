public class App {
    // Códigos ANSI para colores de texto
    public static final String RESET = "\u001B[0m";
    public static final String NEGRO = "\u001B[30m";
    public static final String ROJO = "\u001B[31m";
    public static final String VERDE = "\u001B[32m";
    public static final String AMARILLO = "\u001B[33m";
    public static final String AZUL = "\u001B[34m";
    public static final String PURPURA = "\u001B[35m";
    public static final String BLANCO = "\u001B[37m";
    
    // Códigos ANSI para colores de fondo
    public static final String FONDO_NEGRO = "\u001B[40m";
    public static final String FONDO_ROJO = "\u001B[41m";
    public static final String FONDO_VERDE = "\u001B[42m";
    public static final String FONDO_AMARILLO = "\u001B[43m";
    public static final String FONDO_AZUL = "\u001B[44m";
    public static final String FONDO_PURPURA = "\u001B[45m";
    public static final String FONDO_CYAN = "\u001B[46m";
    public static final String FONDO_BLANCO = "\u001B[47m";

    public static void main(String[] args) throws Exception {
        System.out.print(RESET);
        System.out.printf("%-11s%-12s%-15s%-12s%-12s%n","   Lunes   ","    Martes  ","   Miércoles   ","   Jueves   ","  Viernes ");
        System.out.printf("%-11s%-12s%-15s%-12s%-12s%n","═══════════","════════════","═══════════════","════════════","══════════");
        System.out.printf("%-11s%-12s%-15s%-12s%-12s%n",FONDO_AZUL+"    SI     "+RESET, FONDO_CYAN+"    PROG    "+RESET, FONDO_AZUL+"      SI       "+RESET,FONDO_ROJO+"    IPE     "+RESET, FONDO_AMARILLO+"    BD    "+RESET);
        System.out.printf("%-11s%-12s%-15s%-12s%-12s%n",FONDO_AZUL+"    SI     "+RESET, FONDO_CYAN+"    PROG    "+RESET, FONDO_AZUL+"      SI       "+RESET,FONDO_ROJO+"    IPE     "+RESET, FONDO_AMARILLO+"    BD    "+RESET);
        System.out.printf("%-11s%-12s%-15s%-12s%-12s%n",FONDO_PURPURA+"    LM     "+RESET, FONDO_CYAN+"    PROG    "+RESET, FONDO_ROJO+"      IPE      "+RESET,FONDO_CYAN+"    PROG    "+RESET, FONDO_AZUL+"    SI    "+RESET);
        System.out.printf("%-11s%-12s%-15s%-12s%-12s%n",FONDO_PURPURA+"    LM     "+RESET, FONDO_AMARILLO+"     BD     "+RESET, FONDO_BLANCO+"      DIG      "+RESET,FONDO_CYAN+"    PROG    "+RESET, FONDO_NEGRO+"    ED    "+RESET);
        System.out.printf("%-11s%-12s%-15s%-12s%-12s%n",FONDO_AMARILLO+"    BD     "+RESET, FONDO_AMARILLO+"     BD     "+RESET, FONDO_CYAN+"      PROG     "+RESET,FONDO_CYAN+"    PROG    "+RESET, FONDO_NEGRO+"    ED    "+RESET);
        System.out.printf("%-11s%-12s%-15s%-12s%-12s%n",FONDO_AMARILLO+"    BD     "+RESET, FONDO_VERDE+"     SOS    "+RESET, FONDO_CYAN+"      PROG     "+RESET,FONDO_PURPURA+"     LM     "+RESET, FONDO_NEGRO+"    ED    "+RESET);
    }
}
