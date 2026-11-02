package containers;

import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.AgentContainer;

public class SimpleContainer {

    public static void main(String[] args) throws Exception {

        Runtime runtime = Runtime.instance();
        ProfileImpl profile = new ProfileImpl();

     
        profile.setParameter(Profile.MAIN_HOST, "localhost");

        //profile.setParameter(Profile.MAIN_HOST, "10.235.79.93"
        
        profile.setParameter(Profile.MAIN_PORT, "1099");

  
        // profile.setParameter(
        //    Profile.PLATFORM_ID, "10.235.79.93:1099/JADE" );

        AgentContainer container = runtime.createAgentContainer(profile);

       
        if (container == null) {
            throw new Exception("Impossible de rejoindre le Main-Container : "
                    + "vérifie qu'il est lancé et que MAIN_HOST est correct.");
        }

        container.start();
    }
}