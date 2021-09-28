public class Main {
    public static void main(String[] args) {
        cabecalho();

        int resposta = somar(2, 2);
        System.out.printf("Resultado soma: %d ", resposta);

    }
    
    static void cabecalho(){
        System.out.println("\n================== CÁLCULO DE MÉDIA ================== ");
    }

    static int somar( int numero1, int numero2){
        int resultado = numero1 + numero2;
        return resultado;
    }


}

