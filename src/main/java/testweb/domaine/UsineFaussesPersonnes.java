package testweb.domaine;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class UsineFaussesPersonnes {

	public List<Personne> genereFaussesPersonnes(Integer nombre){
		List<Personne> resultat = new ArrayList<>();
		for (int i = 0; i < nombre; i++) {
			resultat.add(genereFaussePersonne());
		}
		return resultat;
	}

	private Personne genereFaussePersonne() {
		int randomNum = ThreadLocalRandom.current().nextInt(0, 500);
		return new Personne("Nom-" + randomNum, "Prenom-" + randomNum);
	}
}
