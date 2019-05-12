package Controller.ZeneState;
import Controller.ColorGeneration.ColorGenerator;
import Controller.Logger.ProgramLogger;
import Controller.ViewManager;

public class Zene0 extends ZeneAllapot {

    ColorGenerator cg = new ColorGenerator();
    ProgramLogger logger = new ProgramLogger();

    /**
     * Sets the Music state into the next state
     *
     * @param vm ViewManager sets the state inside this class
     */
    @Override
    public void GombLenyomas(ViewManager vm) {
        vm.setAllapot(new Zene1());
    }

    public Zene0(){
        logger.LogInfo("Nem játszik zenét.");
    }

}
