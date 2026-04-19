public class App {
    // Códigos ANSI para colores de texto
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
        System.out.println(AZUL+"████████████████████████████████████████████████████████████████████████████████████████████████████"+ BLANCO);
        System.out.println();
        System.out.println();
        System.out.println("Rojo Polo Paella Inc.");
        System.out.println("Carretera Muelle 38");
        System.out.println("37531 Ávila, Ávila");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.printf("%-30s%-30s%-30s%11s","FACTURAR A","ENVIAR A","FACTURA Nº","ES-001\n");
        System.out.printf("%-30s%-30s%-30s%1s","Leda Villareal","Leda Villareal","FECHA","29.01.2019\n");
        System.out.printf("%-30s%-30s%-30s%11s","Virgen Blanca 63","Cercas Bajas 68","Nº DE PEDIDO","1730/2019\n");
        System.out.printf("%-30s%-30s%-30s%8s","08759 Burgos, Burgos","47300 Cádiz, Cádiz","FECHA","29.01.2019\n");
        System.out.printf("%-30s%-30s%-30s%1s","","","FECHA VCN.","\n");
        System.out.println();
        System.out.println("─────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println();
        System.out.printf("%-90s%12s", "Total Factura", "199,65EUR\n");
        System.out.println();  
        System.out.println("─────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println();
        System.out.printf("%-8s%-34s%30s%30s", "CANT.","DESCRIPCIÓN","PRECIO","IMPORTE\n");
        System.out.printf("%-8s%-34s%30s%30s", "","","UNITARIO","\n");
        System.out.printf("%-8s%-34s%28s%30s", "1","Talla pequeña traje de luces en rojo","100,00","100,00\n");
        System.out.printf("%-8s%-34s%30s%30s", "2","Camisa talla grande","25,00","50,00\n");
        System.out.printf("%-8s%-34s%30s%30s", "3","Equipaje de Fútbol","5,00","15,00\n");
        System.out.println();
        System.out.printf("%-8s%-34s%30s%30s", "","","Subtotal","165,00\n");
        System.out.printf("%-8s%-34s%30s%30s", "","","IVA 21,0%","34,65\n");
    }
}
