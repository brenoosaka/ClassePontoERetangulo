import java.util.Scanner;

public class App {
    // Teste
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite as coordenadas do vértice inferior esquerdo do retângulo:");
        System.out.print("Coordenada x: ");
        int x = scanner.nextInt();
        System.out.print("Coordenada y: ");
        int y = scanner.nextInt();
        Ponto vertice = new Ponto(x, y);

        System.out.print("Digite a largura do retângulo: ");
        int largura = scanner.nextInt();
        System.out.print("Digite a altura do retângulo: ");
        int altura = scanner.nextInt();

        Retangulo retangulo = new Retangulo(vertice, largura, altura);

        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Alterar os valores do retângulo");
            System.out.println("2. Imprimir o centro do retângulo");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite as coordenadas do vértice inferior esquerdo do retângulo:");
                    System.out.print("Coordenada x: ");
                    x = scanner.nextInt();
                    System.out.print("Coordenada y: ");
                    y = scanner.nextInt();
                    vertice = new Ponto(x, y);

                    System.out.print("Digite a largura do retângulo: ");
                    largura = scanner.nextInt();
                    System.out.print("Digite a altura do retângulo: ");
                    altura = scanner.nextInt();

                    retangulo.setVertice(vertice);
                    retangulo.setLargura(largura);
                    retangulo.setAltura(altura);
                    break;
                case 2:
                    Ponto centro = retangulo.encontrarCentro();
                    System.out.print("O centro do retângulo está localizado em ");
                    centro.imprimir();
                    break;
                case 3:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 3);

        scanner.close();
    }
}