import java.util.Scanner;

public class Main {

    public static int lerTempo(Scanner entrada, String nome) {
        int tempo;

        do {
            System.out.print("Digite o tempo da " + nome + " (ms): ");
            tempo = entrada.nextInt();

            if (tempo <= 0) {
                System.out.println("Tempo invalido! Tente novamente.");
            }

        } while (tempo <= 0);

        return tempo;
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int tempo1 = lerTempo(entrada, "Thread 1");
        int tempo2 = lerTempo(entrada, "Thread 2");
        int tempo3 = lerTempo(entrada, "Thread 3");

        ExemploThread thread1 = new ExemploThread("Thread 1", tempo1);
        ExemploThread thread2 = new ExemploThread("Thread 2", tempo2);
        ExemploThread thread3 = new ExemploThread("Thread 3", tempo3);

        thread1.start();
        thread2.start();
        thread3.start();

        entrada.close();
    }
}
