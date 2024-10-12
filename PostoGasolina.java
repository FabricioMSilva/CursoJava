public class PostoGasolina {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        System.out.println("Informe o quantos Litros deseja:"); 
        int litros = new java.util.Scanner(System.in).nextInt();

        System.out.println("Valor a ser pago é: " + (litros * 5) + " Reais");

    }
}
