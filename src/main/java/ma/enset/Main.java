package ma.enset;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            // Étape 4 : Créer une instance de Thread avec un Talkative ayant un entier unique
            Thread thread = new Thread(new Talkative(i));

            // Étape 5 : Démarrer le thread
            thread.start();
        }
    }
}
