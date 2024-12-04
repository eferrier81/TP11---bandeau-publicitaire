package effets;

import bandeau.Bandeau;

public class EffetMiroir extends Effet {
    @Override
    public void executer(Bandeau bandeau) {
        System.out.println("Effet : Miroir");
        String message = bandeau.getMessage();

        // Inverser le message
        StringBuilder messageInversé = new StringBuilder(message);
        bandeau.setMessage(messageInversé.reverse().toString());
        bandeau.sleep(1000);
        bandeau.setMessage(message);  // Réinitialiser le message
    }
}
