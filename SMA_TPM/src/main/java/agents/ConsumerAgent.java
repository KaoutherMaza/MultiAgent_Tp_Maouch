package agents;
import jade.core.Agent;

public class ConsumerAgent extends Agent{
	
	@Override
	protected void setup() {
		// TODO Auto-generated method stub
		//super.setup();
		System.out.println("Initialisation de l'agent" +this.getAID().getName());
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
