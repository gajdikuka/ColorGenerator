package Controller.ZeneState;
import Controller.ColorGeneration.ColorGenerator;

public class Zene0 extends ZeneAllapot {

    ColorGenerator cg = new ColorGenerator();

    @Override
    public void GombLenyomas(ViewManager vm) {
        vm.setAllapot(new Zene1());
    }

    public Zene0()
    {
    }

}
