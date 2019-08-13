package com.rohit.suthar.xylophone;

import android.media.AudioManager;
import android.media.SoundPool;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private SoundPool mSoundPool;
    private float LEFT_VOULUME = 1.0f;
    private float RIGHT_VOLUME = 1.0f;
    private int PRIORITY = 0;
    private int LOOP = 0;
    private float RATE = 1.0f;

    private int note1;
    private int note2;
    private int note3;
    private int note4;
    private int note5;
    private int note6;
    private int note7;
    private int note8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSoundPool = new SoundPool(7, AudioManager.STREAM_MUSIC,0);
        note1 = mSoundPool.load(getApplicationContext(),R.raw.note1_c,1);
        note2 = mSoundPool.load(getApplicationContext(),R.raw.note2_d,1);
        note3 = mSoundPool.load(getApplicationContext(),R.raw.note3_e,1);
        note4 = mSoundPool.load(getApplicationContext(),R.raw.note4_f,1);
        note5 = mSoundPool.load(getApplicationContext(),R.raw.note5_g,1);
        note6 = mSoundPool.load(getApplicationContext(),R.raw.note6_a,1);
        note7 = mSoundPool.load(getApplicationContext(),R.raw.note7_b,1);
        note8 = mSoundPool.load(getApplicationContext(),R.raw.note8_c,1);

    }

    public void playnote1(View view) {
        mSoundPool.play(note1,LEFT_VOULUME,RIGHT_VOLUME,PRIORITY,LOOP,RATE);
    }

    public void playnote2(View view) {
        mSoundPool.play(note2,LEFT_VOULUME,RIGHT_VOLUME,PRIORITY,LOOP,RATE);
    }

    public void playnote3(View view) {
        mSoundPool.play(note3,LEFT_VOULUME,RIGHT_VOLUME,PRIORITY,LOOP,RATE);
    }

    public void playnote4(View view) {
        mSoundPool.play(note4,LEFT_VOULUME,RIGHT_VOLUME,PRIORITY,LOOP,RATE);
    }

    public void playnote5(View view) {
        mSoundPool.play(note5,LEFT_VOULUME,RIGHT_VOLUME,PRIORITY,LOOP,RATE);
    }

    public void playnote6(View view) {
        mSoundPool.play(note6,LEFT_VOULUME,RIGHT_VOLUME,PRIORITY,LOOP,RATE);
    }

    public void playnote7(View view) {
        mSoundPool.play(note7,LEFT_VOULUME,RIGHT_VOLUME,PRIORITY,LOOP,RATE);
    }

    public void playnote8(View view) {
        mSoundPool.play(note8,LEFT_VOULUME,RIGHT_VOLUME,PRIORITY,LOOP,RATE);
    }
}
