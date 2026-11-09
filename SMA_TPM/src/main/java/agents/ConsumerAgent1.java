package agents;
import jade.core.Agent;
import jade.wrapper.ControllerException;

public class ConsumerAgent1 extends Agent{
	
	@Override
	protected void setup() {
		// TODO Auto-generated method stub
		//super.setup();
		String bookName = null ;
		if(this.getArguments().length==1) {
			bookName = (String) this.getArguments()[0];
		}
		
		System.out.println("Initialisation de l'agent" +this.getAID().getName());
		System.out.println("Je vourais acheter le livre" +bookName);
	}
	
	@Override
	protected void beforeMove() {
		// TODO Auto-generated method stub
		//super.beforeMove();
		try {
			System.out.println("Avant de migrer de" +this.getContainerController().getContainerName());
		} catch (ControllerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Executer les taches ...I'm leaving");
	}
	
	@Override
	protected void afterMove() {
		// TODO Auto-generated method stub
		//super.afterMove();
		try {
			System.out.println("Apres de migrer de " +this.getContainerController().getContainerName());
		} catch (ControllerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
