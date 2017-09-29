package org.pltw.examples.synthesizer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;

import java.util.ArrayList;

class MainActivity extends AppCompatActivity {

    private final int WHOLE_NOTE = 1000;
    private Button fButton;
    private Button PlayButton;
    private Button sButton;
    private NumberPicker Npicker;
    private NumberPicker NumPicker;
    private static final String TAG = MainActivity.class.getName();
    MediaPlayer mpE;
    MediaPlayer mpF;
    MediaPlayer mpG;
    MediaPlayer mpA;
    MediaPlayer mpB;
    MediaPlayer mpC;
    MediaPlayer mpD;
    MediaPlayer mpFs;
    MediaPlayer mpDs;
    MediaPlayer mpGs;
    MediaPlayer mpBs;
    MediaPlayer mpCs;
    MediaPlayer mphE;
    MediaPlayer mphF;
    MediaPlayer mphS;
    MediaPlayer mphG;
    ArrayList<MediaPlayer> notesArray;


    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synthesizer);
        notesArray = new ArrayList<>();
        notesArray.add(mpE);
        notesArray.add(mpF);
        notesArray.add(mpG);
        notesArray.add(mpA);
        notesArray.add(mpB);
        notesArray.add(mpC);
        notesArray.add(mpD);
        notesArray.add(mpFs);
        notesArray.add(mpDs);
        notesArray.add(mpGs);
        notesArray.add(mpBs);
        notesArray.add(mpCs);
        notesArray.add(mphE);
        notesArray.add(mphF);
        notesArray.add(mphS);
        notesArray.add(mphG);

        NumPicker = (NumberPicker) findViewById(R.id.numberPicker2);
        Npicker = (NumberPicker) findViewById(R.id.numberPicker1);
        Npicker.setMaxValue(15);
        Npicker.setMinValue(0);
        NumPicker.setMinValue(0);
        NumPicker.setMaxValue(9);

        sButton = (Button) findViewById(R.id.button3);
        fButton = (Button) findViewById(R.id.button1);
        PlayButton = (Button) findViewById(R.id.button2);
        mpE = MediaPlayer.create(this, R.raw.scalee);
        mpF = MediaPlayer.create(this, R.raw.scalef);
        mpG = MediaPlayer.create(this, R.raw.scaleg);
        mpA = MediaPlayer.create(this, R.raw.scalea);
        mpB = MediaPlayer.create(this, R.raw.scaleb);
        mpC = MediaPlayer.create(this, R.raw.scalec);
        mpD = MediaPlayer.create(this, R.raw.scaled);
        mpFs = MediaPlayer.create(this, R.raw.scalefs);
        mpDs = MediaPlayer.create(this, R.raw.scaleds);
        mpGs = MediaPlayer.create(this, R.raw.scalegs);
        mpBs = MediaPlayer.create(this, R.raw.scalebb);
        mpCs = MediaPlayer.create(this, R.raw.scalecs);
        mphE = MediaPlayer.create(this, R.raw.scalehighe);
        mphF = MediaPlayer.create(this, R.raw.scalehighf);
        mphS = MediaPlayer.create(this, R.raw.scalehighfs);
        mphG = MediaPlayer.create(this, R.raw.scalehighg);

        .setOnClick

        fButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG, "Yay it worked, Button1");
                mpF.start();
                delayPlaying(WHOLE_NOTE/2);
                mpF.seekTo(0);

            }
        });
        PlayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int times = NumPicker.getValue();
                for (int i = 0; i<times; i++){
                    notesArray.get(Npicker.getValue()).seekTo(0);
                    notesArray.get(Npicker.getValue()).start();
                    delayPlaying(WHOLE_NOTE);
                }
            }
        });
        sButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                mpE.start();
                delayPlaying(WHOLE_NOTE/2);
                mpE.seekTo(0);

                mpFs.start();
                delayPlaying(WHOLE_NOTE/2);
                mpFs.seekTo(0);

                mpG.start();
                delayPlaying(WHOLE_NOTE/2);
                mpG.seekTo(0);

                mpA.start();
                delayPlaying(WHOLE_NOTE/2);
                mpA.seekTo(0);

                mpB.start();
                delayPlaying(WHOLE_NOTE/2);
                mpB.seekTo(0);

                mpCs.start();
                delayPlaying(WHOLE_NOTE/2);
                mpCs.seekTo(0);

                mpD.start();
                delayPlaying(WHOLE_NOTE/2);
                mpD.seekTo(0);

                mpE.start();
                delayPlaying(WHOLE_NOTE/2);
                mpE.seekTo(0);
            }
        });

    }

    private void delayPlaying(int delay){
        try{
            Thread.sleep(delay);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}

