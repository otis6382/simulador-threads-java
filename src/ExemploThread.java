public class ExemploThread extends Thread {

    private String nome;
    private int tempo;

    public ExemploThread(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
    }
    
    @Override 
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(nome +  " rodando - " + (i + 1));

            try {
                Thread.sleep(tempo);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}
