package com.asprogramming.saving_squid;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.graphics.PixelFormat;
import android.hardware.Camera;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;


import java.io.IOException;


public class CameraViewActivity extends Activity implements
        SurfaceHolder.Callback, View.OnClickListener {

    private Camera mCamera;
    private SurfaceHolder mSurfaceHolder;
    private boolean isCameraviewOn = false;

    ImageView pointerIcon;


    private ImageView img;


    TranslateAnimation a;



    @SuppressLint("NewApi")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ra);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        img = (ImageView) findViewById(R.id.img);
        img.setOnClickListener(this);

        pointerIcon = (ImageView) findViewById(R.id.icon);
        pointerIcon.setOnClickListener(this);

        setupLayout();



        SpriteClass sprite3 = new SpriteClass(this, pointerIcon, "squid_sprite3.png");
        sprite3.setFrameW(350);
        sprite3.setFrameH(349);
        sprite3.setCountX(4);
        sprite3.setCountY(1);
        sprite3.setNbFrames(4);
        sprite3.startSprite();

        pointerIcon.setVisibility(View.VISIBLE);

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Runtime.getRuntime().gc();
    }


    private void setupLayout() {

        getWindow().setFormat(PixelFormat.UNKNOWN);
        SurfaceView surfaceView = (SurfaceView) findViewById(R.id.cameraview);
        mSurfaceHolder = surfaceView.getHolder();
        mSurfaceHolder.addCallback(this);
        mSurfaceHolder.setType(SurfaceHolder.SURFACE_TYPE_PUSH_BUFFERS);
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width,
                               int height) {
        if (isCameraviewOn) {
            mCamera.stopPreview();
            isCameraviewOn = false;
        }

        if (mCamera != null) {
            try {
                mCamera.setPreviewDisplay(mSurfaceHolder);
                mCamera.startPreview();
                isCameraviewOn = true;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        try{
            mCamera = Camera.open();
        }catch(Exception e){
            Log.e("Error", ""+e);
        }

        mCamera.setDisplayOrientation(90);
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {
        mCamera.stopPreview();
        mCamera.release();
        mCamera = null;
        isCameraviewOn = false;
    }

    @Override
    public void onClick(View v) {


    }
}
