package Controller.ZeneState;

import Controller.ColorGeneration.ColorGenerator;
import Controller.Logger.ProgramLogger;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.nio.file.Paths;

public class Zene2 extends ZeneAllapot {

    ColorGenerator cg = new ColorGenerator();
    ProgramLogger logger = new ProgramLogger();
    private static MediaPlayer mediaPlayer;

    @Override
    public void GombLenyomas(ViewManager vm) {
        mediaPlayer.stop();
        vm.setAllapot(new Zene0());
    }
    public Zene2() {
        new javafx.embed.swing.JFXPanel();
        Media zene = new Media(Paths.get("2.mp3").toUri().toString());
        mediaPlayer = new MediaPlayer(zene);
        mediaPlayer.play();
        logger.LogInfo("Második zenét játsza.");
    }
}