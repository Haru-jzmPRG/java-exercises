public class App {
    public static void main(String[] args) throws Exception {
        int[] numeros = new int[100];

        for (int i = 0; i < 100; i++) {
            numeros[i] = (int) (Math.random() * 100);
            System.out.print(numeros[i] + " ");
        }

        int nMostrado = Integer.parseInt(System.console().readLine("\nIntroduszca un número de los que se han mostrado: "));
        int nSustituto = Integer.parseInt(System.console().readLine("Introduzca el valor por el que quiere sustituirlo: "));

        for (int i = 0; i < 100; i++) {
            if (numeros[i] == nMostrado) {
                numeros[i] = nSustituto;
            }

            if (numeros[i] == nSustituto) {
                System.out.print("'"+nSustituto+"'"+" ");
            }else{
                System.out.print(numeros[i]+" ");
            }
        }


    }
}
