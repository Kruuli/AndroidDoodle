package fi.kruuli.gonnamakemillions;

/**
 * Created by sami on 4.11.2015.
 */
import org.andengine.engine.camera.Camera;
import org.andengine.engine.options.resolutionpolicy.RatioResolutionPolicy;
import org.andengine.entity.scene.Scene;
import org.andengine.entity.scene.background.Background;
import org.andengine.engine.options.EngineOptions;
import org.andengine.engine.options.ScreenOrientation;
import org.andengine.ui.activity.SimpleBaseGameActivity;
import org.andengine.util.adt.color.Color;

public class GameActivity extends SimpleBaseGameActivity {

    private Camera camera;
    private static final int CAMERA_WIDTH = 540;
    private static final int CAMERA_HEIGHT = 960;

    @Override public EngineOptions onCreateEngineOptions() {
        camera = new Camera(0, 0, GameActivity.CAMERA_WIDTH, GameActivity.CAMERA_HEIGHT);

        RatioResolutionPolicy ratioResolutionPolicy = new RatioResolutionPolicy(
                GameActivity.CAMERA_WIDTH, GameActivity.CAMERA_HEIGHT);
        EngineOptions engineOptions = new EngineOptions(true, ScreenOrientation.PORTRAIT_FIXED,
                ratioResolutionPolicy, camera);

        return engineOptions;
    }

    @Override protected Scene onCreateScene() {
        Scene scene = new Scene();
        scene.setBackground(new Background(Color.BLUE));
        return scene;
    }

    @Override protected void onCreateResources() {
    }
}