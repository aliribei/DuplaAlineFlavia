import java.util.Scanner;

public class Main {

    private static Scanner sc;

    public static void main(String[] args) {
        int num1, num2, resposta;

        cabecalho();
        num1 = ler_numero("Digite o primeiro número: ");
        num2 = ler_numero("Digite o segundo número: ");
        
        resposta = somar(num1, num2);
        
        System.out.printf("Resultado soma: %d ", resposta);

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


}

