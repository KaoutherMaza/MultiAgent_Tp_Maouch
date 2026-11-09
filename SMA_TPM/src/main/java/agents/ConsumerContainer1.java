package agents;
import jade.core.AID;
import jade.core.Runtime;
import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;

public class ConsumerContainer1 {

  public static void main(String[] args) throws Exception {
    Runtime runtime = Runtime.instance();
    ProfileImpl profile = new ProfileImpl();
    
    profile.setParameter(Profile.MAIN_HOST, "localhost");
    profile.setParameter(profile.MAIN_HOST,"192.168.100.73");
    
    AgentContainer container = runtime.createAgentContainer(profile);
    
    AgentController consumerAgent = container.createNewAgent("consumer", "agents.ConsumerAgent", new Object[] {"JAVA pour les nuls"});
    consumerAgent.start();
    

  }
}