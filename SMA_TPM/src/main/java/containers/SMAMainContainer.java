package containers;

import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.AgentContainer;

public class SMAMainContainer {
    public static void main(String[] args) {
        try {
            Runtime runtime = Runtime.instance();
            ProfileImpl profile = new ProfileImpl();
            profile.setParameter(Profile.GUI, "true");

            
            String port = profile.getParameter(Profile.MAIN_PORT, "1099");

            AgentContainer mainContainer = runtime.createMainContainer(profile);

            if (mainContainer == null) {
                throw new Exception("Un main-container est deja en cours d'execution : "
                        + "le port " + port + " est deja utilise.");
            }

            mainContainer.start();
        } catch (Exception e) {
            System.out.println("Une erreur est survenue");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}