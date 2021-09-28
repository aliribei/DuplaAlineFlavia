import java.util.Scanner;

public class Main {

    private static Scanner sc;


    public static void main(String[] args) {

        int num1, num2, num3, num4, resposta;
        double respostaMedia;

        cabecalho();
        num1 = ler_numero("Digite o primeiro número: ");
        num2 = ler_numero("Digite o segundo número: ");
        num3 = ler_numero("Digite o primeiro número: ");
        num4 = ler_numero("Digite o segundo número: ");
        
        resposta = somar(num1, num2);
        respostaMedia = media(num1, num2, num3, num4);
        
        System.out.printf("Resultado soma: %d ", resposta);
        System.out.printf("Resultado média: %.2f ", respostaMedia);

    }

    static int ler_numero(String mensagem){
        sc = new Scanner (System.in);
        System.out.println(mensagem);
        int numero = Integer.parseInt(sc.nextLine());
        return numero;
    }
    
    static void cabecalho(){
        System.out.println("\n================== CÁLCULO DE MÉDIA ================== ");
    }

    static int somar( int numero1, int numero2){
        int resultado = numero1 + numero2;
        return resultado;
    }

    static double media ( int numero1, int numero2, int numero3, int numero4) {
        double soma =  numero1 + numero2 + numero3 + numero4;
        double resultado =  soma / 4;
        return resultado;
    }




}

