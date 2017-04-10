package pmalik.at.slidepuzzle.customGL;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;

/**
 * Created by Austr on 10.04.2017.
 */

public class TestGLSurfaceView extends GLSurfaceView{

    private final TestGLSurfaceRenderer mRenderer;

    public TestGLSurfaceView(Context ctx, AttributeSet attr) {
        super(ctx, attr);

        setEGLContextClientVersion(2);
        mRenderer = new TestGLSurfaceRenderer();

        setRenderer(mRenderer);
    }
}
