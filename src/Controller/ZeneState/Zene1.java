package Controller.ZeneState;
import Controller.ColorGeneration.ColorGenerator;
import Controller.Logger.ProgramLogger;
import Controller.ViewManager;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.nio.file.Paths;

public class Zene1 extends ZeneAllapot {

    ColorGenerator cg = new ColorGenerator();
    ProgramLogger logger = new ProgramLogger();
    private static MediaPlayer mediaPlayer;

    @Override
    public void GombLenyomas(ViewManager vm) {
        mediaPlayer.stop();
        vm.setAllapot(new Zene2());
    }

    public Zene1() {
        new javafx.embed.swing.JFXPanel();
        Media zene = new Media(Paths.get("1.mp3").toUri().toString());
        mediaPlayer = new MediaPlayer(zene);
        mediaPlayer.play();
        logger.LogInfo("Első zenét játsza.");
    }
}
