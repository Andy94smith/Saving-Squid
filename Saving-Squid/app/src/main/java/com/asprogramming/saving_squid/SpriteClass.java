package com.asprogramming.saving_squid;

import android.app.Activity;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Jason on 19/02/2017.
 */

public class SpriteClass {

    // frame width
    private int FRAME_W = 110;
    // frame height
    private int FRAME_H = 101;
    // number of frames
    private int NB_FRAMES = 14;
    // nb of frames in x
    private int COUNT_X = 5;
    // nb of frames in y
    private int COUNT_Y = 3;
    // frame duration

    AnimationDrawable animation;

    // we can slow animation by changing frame duration
    private static final int FRAME_DURATION = 100; // in ms !
    // scale factor for each frame
    private static final int SCALE_FACTOR = 5;

    private ImageView img;
    // stores each frame
    private Bitmap[] bmps;

    private Activity mainActivity;
    private String sprite_name;

    public SpriteClass(Activity mainActivity, ImageView img, String sprite_name){
        this.mainActivity = mainActivity;
        this.img = img;
        this.sprite_name = sprite_name;
    }

    public void setFrameW(int frameW) {
        FRAME_W = frameW;
    }

    public void setFrameH(int frameH) {
        FRAME_H = frameH;
    }

    public void setNbFrames(int nbFrames) {
        NB_FRAMES = nbFrames;
    }

    public void setCountX(int countX) {
        COUNT_X = countX;
    }

    public void setCountY(int countY) {
        COUNT_Y = countY;
    }

    public void startSprite(){
        // load bitmap from assets
        Bitmap birdBmp = getBitmapFromAssets(mainActivity, sprite_name);

        if (birdBmp != null) {
            // cut bitmaps from bird bmp to array of bitmaps
            bmps = new Bitmap[NB_FRAMES];
            int currentFrame = 0;

            for (int i = 0; i < COUNT_Y; i++) {
                for (int j = 0; j < COUNT_X; j++) {
                    bmps[currentFrame] = Bitmap.createBitmap(birdBmp, FRAME_W
                            * j, FRAME_H * i, FRAME_W, FRAME_H);

                    // apply scale factor
                    bmps[currentFrame] = Bitmap.createScaledBitmap(
                            bmps[currentFrame], FRAME_W * SCALE_FACTOR, FRAME_H
                                    * SCALE_FACTOR, true);

                    if (++currentFrame >= NB_FRAMES) {
                        break;
                    }
                }
            }

            // create animation programmatically
            animation = new AnimationDrawable();
            animation.setOneShot(false); // repeat animation

            for (int i = 0; i < NB_FRAMES; i++) {
                animation.addFrame(new BitmapDrawable(mainActivity.getResources(), bmps[i]),
                        FRAME_DURATION);
            }

            // load animation on image
            if (Build.VERSION.SDK_INT < 16) {
                img.setBackgroundDrawable(animation);
            } else {
                img.setBackground(animation);
            }

            // start animation on image
            img.post(new Runnable() {

                @Override
                public void run() {
                    animation.start();
                }

            });

        }
    }

    public void startAnimation(){
        animation.start();
    }

    public void stopAnimation(){
        animation.stop();
    }

    private Bitmap getBitmapFromAssets(Activity mainActivity,
                                       String filepath) {
        AssetManager assetManager = mainActivity.getAssets();
        InputStream istr = null;
        Bitmap bitmap = null;

        try {
            istr = assetManager.open(filepath);
            bitmap = BitmapFactory.decodeStream(istr);
        } catch (IOException ioe) {
            // manage exception
        } finally {
            if (istr != null) {
                try {
                    istr.close();
                } catch (IOException e) {
                }
            }
        }

        return bitmap;
    }

}
