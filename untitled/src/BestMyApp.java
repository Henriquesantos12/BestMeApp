import java.util.Scanner;

public class BestMyApp {

            public static void main(String[] args) {
                System.out.println("Bem-vindo ao BestMyApp!");

                perguntas();
            }
            //Perguntas com interatividade com o usuário:
            public static void perguntas() {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Seu nome é?");
                String nome = scanner.nextLine();
                System.out.println("O que você aprendeu na Linguagem Java?");
                String aprendizado = scanner.nextLine();
                System.out.println("Teve algum impedimento?");
                String impedimento = scanner.nextLine();
                System.out.println("O que você mais gostou?");
                String gostou = scanner.nextLine();

                scanner.close(); // Fechando o Scanner após a leitura

                // Realize as operações desejadas com as respostas capturadas
                System.out.println("Respostas capturadas:");
                System.out.println("Nome: " + nome);
                System.out.println("Aprendizado em Java: " + aprendizado);
                System.out.println("Impedimento: " + impedimento);
                System.out.println("Gostou de: " + gostou);
            }
        }


