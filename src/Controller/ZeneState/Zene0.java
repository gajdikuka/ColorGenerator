package Controller.ZeneState;
import Controller.ColorGeneration.ColorGenerator;
import Controller.Logger.ProgramLogger;

public class Zene0 extends ZeneAllapot {

    ColorGenerator cg = new ColorGenerator();
    ProgramLogger logger = new ProgramLogger();
    @Override
    public void GombLenyomas(ViewManager vm) {
        vm.setAllapot(new Zene1());
    }

    public Zene0(){
        logger.LogInfo("Nem játszik zenét.");
    }

}
