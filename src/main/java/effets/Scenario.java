package effets;

import bandeau.Bandeau;
import java.util.ArrayList;
import java.util.List;

public class Scenario {
    private final List<EffetRepetition> effets = new ArrayList<>();

    // Méthode pour ajouter un effet avec le nombre de répétitions
    public void ajouterEffet(Effet effet, int repetitions) {
        effets.add(new EffetRepetition(effet, repetitions));
    }

    // Méthode pour exécuter tous les effets dans le scénario
    public void executer(Bandeau bandeau) {
        for (EffetRepetition effetRepetition : effets) {
            // Afficher le nom de l'effet avant son exécution
            System.out.println("Effet : " + effetRepetition.effet.getClass().getSimpleName());

            // Exécuter l'effet pour le nombre de répétitions spécifié
            String message = bandeau.getMessage();  // Récupérer le message
            bandeau.setMessage(message);  // Assurer que le message reste constant

            for (int i = 0; i < effetRepetition.repetitions; i++) {
                effetRepetition.effet.executer(bandeau);  // Exécuter l'effet
            }
        }
    }

    // Classe interne pour associer un effet à son nombre de répétitions
        private record EffetRepetition(Effet effet, int repetitions) {
    }
}
