package Controller.ZeneState;
import Controller.ColorGeneration.ColorGenerator;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.nio.file.Paths;

public class Zene1 extends ZeneAllapot {

    ColorGenerator cg = new ColorGenerator();

    @Override
    public void GombLenyomas(ViewManager vm) {
        mediaPlayer.stop();
        vm.setAllapot(new Zene2());
    }

    public Zene1(){
        new javafx.embed.swing.JFXPanel();
        Villogtat();

    }

    private static MediaPlayer mediaPlayer;
    private void Villogtat(){
        String bip = "1.mp3";

        Media hit = new Media(Paths.get(bip).toUri().toString());
        mediaPlayer = new MediaPlayer(hit);
        mediaPlayer.play();

    }

}
