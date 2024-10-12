

// Adicione o código para calcular a média das notas e verificar se o aluno foi aprovado ou reprovado.

public class MediaNotas {
    public static void main(String[] args) throws Exception {
        
        double nota1 = 9;
        double nota2 = 10;
        double nota3 = 7;
        double nota4 = 8;
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println(media > 7 ? " Aprovado "+ media : " Reprovado " + media);

    

    }
}
