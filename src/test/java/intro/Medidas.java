// 1 - Pacote
package intro;
// 2 - Referências as bibliotecas


import java.util.Scanner;

// 3 - Classe
public class Medidas {
    // 3.1 - Atributos - Caracterísicas

    // 3.2 - Métodos e Funções
    public static void main(String[] args) {

        // Condicional = verificar uma condição
        // Utilizar a classe Sacnner do Java para ler a escolha do usuário no console
        Scanner scanner = new Scanner(System.in);
        System.out.println("M E N U  D E  O P Ç Õ E S");
        System.out.println("c - Calcular Area Modo Compacto");
        System.out.println("d - Contagem até 10");
        System.out.println("e - Calcular Area Modo Exenso");
        System.out.println("i - IFSimples");
        System.out.println("r - Contagem regressiva");
        System.out.println("Digite a opção desejada: ");
        String opcao = scanner.next();

        // Switch = selecionar o comportamento do programa conforme a escolha da pessoa ou do sofware

        switch (opcao) {
            case "c":
            case "C":
                System.out.println("Você escolheu o método calcularAreaModoCompacto");
                calcularAreaModoCompacto();
                break;
            case "d":
            case "D":
                System.out.println("Você escolheu o método contarAte10");
                contarAte10();
                break;
            case "e":
            case "E":
                System.out.println("Você escolheu o método calcularAreaModoExtenso");
                calcularAreaModoExtenso();
                break;
            case "i":
            case "I":
                System.out.println("Você escolheu o método ifSimples");
                ifSimples();
                break;
            case "r":
            case "R":
                System.out.println("Você escolheu o método contagemRegressiva");
                contagemRegressiva();
                break;
            default:
                System.out.println("Você escolheu outro valor que não tem valor associaddo");
                calcularAreaModoExtenso();
                break;
        }

    }

    public static void ifSimples() {
        // Condicional = verificar uma condição
        String modo = "compacto";

        if (modo == "compacto") {
            calcularAreaModoCompacto();
        } else {
            calcularAreaModoExtenso();
        }

    }

    public static void calcularAreaModoExtenso() {
        System.out.println("Cálculo de Áreas Extenso");
        // Cálculo de área - Exemplo: o tamanho do tapete ou do piso
        int largura;
        int comprimento;
        int resultado;
        largura = 5; //largura recebe 4
        comprimento = 6;
        resultado = largura * comprimento;
        System.out.println("Para a largura de " + largura + "m" + " e o comprimento de " + comprimento + "m" + " a área é de " + resultado + "m²");

    }

    public static void calcularAreaModoCompacto() {
        System.out.println("Cáclulo de Áreas de Modo Compacto");
        int largura = 4;
        int comprimento = 3;
        System.out.println("Para a largura de " + largura + "m" + " e o comprimento de " + comprimento + "m" + " a área é de " + largura * comprimento + "m²");
    }

    public static void contarAte10() {
        // Loops ou Repetições
        // for = repetição incondicional
        System.out.println("Contagem Crescente");
        for (int numero = 1; numero <= 10; numero++) {
            System.out.println(numero);
        }
    }
    public static void contagemRegressiva(){
        System.out.println("Contagem Regressiva");
        for(int numero= 10; numero >=0; numero--){
            System.out.println(numero);
        }
    }

}
