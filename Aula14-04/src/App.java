import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        int opcao;

        System.out.println("Atividades da aula 14-04");
        System.out.println();
        System.out.println("Menu das questões");
        System.out.println("1- Questão 1");
        System.out.println("2- Questão 2");
        System.out.println("3- Questão 3");
        System.out.println("4- Questão 4");
        System.out.println("5- Questão 5");
        System.out.println("6- Questão 6");
        System.out.println("7- Questão 7");
        
        System.out.println();
        System.out.print("Digite a opção desejada: ");
        opcao = input.nextInt();
        System.out.println();

        
          

        if (opcao == 1){
        // QUESTÃO 1
        
        int numero;
        int antecessor;
        int sucessor;

        System.out.println("------Questão 1------");
        System.out.println();
        System.out.print("Digite um número: ");
        numero = input.nextInt();
        antecessor = numero - 1;
        sucessor = numero + 1;
        System.out.println();
        System.out.println("O sucessor do número digitado é: " + sucessor);
        System.out.println("O antecessor do número digitado é: " + antecessor);
        System.out.println();}

        if (opcao == 2){
        // QUESTÃO 2

        int numero1, numero2;
        int soma;

        System.out.println("-------Questão 2-------");
        System.out.println();
        System.out.println("Soma de dois números");
        System.out.println();
        System.out.print("Digite o primeiro número: ");
        numero1 = input.nextInt();
        System.out.print("Digite o segundo número: ");
        numero2 = input.nextInt();
        soma = numero1 + numero2;
        System.out.println();
        System.out.println("A soma dos números é: " + soma);
        System.out.println();}


        if (opcao == 3){

        // QUESTÃO 3

        int numero1, numero2, produto;

        System.out.println("------Questão 3-------");
        System.out.println();
        System.out.println("Produto de dois números");
        System.out.println();
        System.out.print("Digite o primeiro número: ");
        numero1 = input.nextInt();
        System.out.print("Digite o segundo número: ");
        numero2 = input.nextInt();
        produto = numero1 * numero2;
        System.out.println();
        System.out.println("O produto dos dois números é: " + produto);
        System.out.println();}


        if (opcao == 4){

        // Questão 4
        
        int numero;
        String binario;

        System.out.println("------Questão 4------");
        System.out.println();
        System.out.println("Converter numero decimal para binario");
        System.out.println();
        System.out.print("Digite um número: ");
        numero = input.nextInt();
        binario = Integer.toBinaryString(numero);
        System.out.println(binario);
        System.out.println();}

        if (opcao == 5){

        // questao 5
        int numero;
        double raiz;
        System.out.println("-----Questão 5------");
        System.out.println();
        System.out.println("Raiz quadrada de um número");
        System.out.println();
        System.out.print("Digite um numero: ");
        numero = input.nextInt();
        raiz = Math.sqrt(numero);
        System.out.println("A raiz do número é: " + raiz);}

        if (opcao == 6){

        // Questao 6

        int numero1, numero2, numero3, numero4;
        double media;
        System.out.println("-----Questão 6------");
        System.out.println();
        System.out.println("Média ponderada de 4 números");
        System.out.println();
        System.out.print("Digite o primeiro número: ");
        numero1 = input.nextInt();
        System.out.print("Digite o segundo número: ");
        numero2 = input.nextInt();
        System.out.print("Digite o terceiro número: ");
        numero3 = input.nextInt();
        System.out.print("Digite o quarto número: ");
        numero4 = input.nextInt();
        media = (numero1 * 1 + numero2 * 2 + numero3 * 3 + numero4 * 4) / 10;
        System.out.println();
        System.out.println("A media ponderada é: " + media);
        }

        if (opcao == 7){

        // questao 7
        int angulo;
        double seno, cosseno, tangente, secante, cossecante, cotangente;

        System.out.println("-----Questão 7------");
        System.out.println();
        System.out.println("Valores de um angulo");
        System.out.println();
        System.out.print("Digite o valor do angulo: ");
        angulo = input.nextInt();
        seno = Math.sin(angulo);
        cosseno = Math.cos(angulo);
        tangente = Math.tan(angulo);
        secante = 1 / cosseno;
        cossecante = 1 / seno;
        cotangente = 1 / tangente;
        System.out.println();
        System.out.println("Os valores são: ");
        System.out.println("Seno: " + seno);
        System.out.println("Cosseno: " + cosseno);
        System.out.println("Tangente: " + tangente);
        System.out.println("Secante: " + secante);
        System.out.println("Cossecante: " + cossecante);
        System.out.println("Cotangente: " + cotangente);}
        
        else {
        System.out.println("Opção invalida");
        }
        input.close();
    }
}
