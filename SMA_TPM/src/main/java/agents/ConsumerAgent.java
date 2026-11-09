package agents;
import jade.core.AID;
import jade.core.Agent;

public class ConsumerAgent extends Agent{
	
	@Override
	protected void setup() {
		// TODO Auto-generated method stub
		//super.setup();
		System.out.println("Initialisation de l'agent" +this.getAID().getName());

		// TEST 3 : construire l'objet AID (Client) a partir du nom local "consumer"
		String nomLocal = "consumer";

		// Le nom complet (GUID) = nomLocal@plateforme. On recupere la partie
		// plateforme (ip:port/JADE) depuis l'AID de cet agent.
		String nomCompletAgent = this.getAID().getName();
		String plateforme = nomCompletAgent.substring(nomCompletAgent.indexOf('@') + 1);

		AID Client = new AID(nomLocal + "@" + plateforme, AID.ISGUID);

		// Affichage du nom local et du nom global (complet) contenus dans l'objet Client
		System.out.println("Nom local  : " + Client.getLocalName());
		System.out.println("Nom global : " + Client.getName());
	}
	
	@Override
	protected void beforeMove() {
		// TODO Auto-generated method stub
		//super.beforeMove();
		System.out.println("Avant de migrer,");
		System.out.println("Executer les taches ...I'm leaving");
	}
	
	@Override
	protected void afterMove() {
		// TODO Auto-generated method stub
		//super.afterMove();
		System.out.println("Apres de migrer,");
		System.out.println("Executer les taches ...BYE");
	}
	
	@Override
	protected void takeDown() {
		// TODO Auto-generated method stub
		//super.takeDown();
		System.out.println("Avant de mettre fin a mon cycle de vie :(");
		System.out.println("Executer les taches ...Meow");
	}
	

}
