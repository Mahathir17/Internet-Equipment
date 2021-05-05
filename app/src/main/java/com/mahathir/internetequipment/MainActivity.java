package com.mahathir.internetequipment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView routerTextView, microtikRouterTextView, eightSwTextView, sixteenSwTextView, twintySwTextView, gigabitSwTextView, normalMcTextView, gigabitMcTextView, sepTextView, radioTextView, repTextView;
    private Button routerUpButton, routerDownButton, microtikUpButton, micotikDownButton, eightSwUpButton, eightSwDownButton, sixteenSwUpButton, sixteenSwDownButton, twintySwUpButton, twintySwDownButton, gigabitSwUpButton, gigabitSwDownButton, normalMcUpButton, normalMcDownButton, gigabitMcUpButton, gigabitMcDownButton, sepUpButton, sepDownButton, radioUpButton, radioDownButton, repUpButton, repDownButton,exitButton;
    private EditText routerEditText, microtikEditText, eightSwEditText, sixteenSwEditText, twintySwEditText, gigabitSwEditText, normalMcEditText, gigabitMcEditText, sepEditText, radioEditText, repEditText;
    private int routerScore, microtikScore, eightSwScore, sixteenSwScore, twintySwScore, gigabitSwScore, normalMcScore, gigabitMcScore, sepScore, radioScore, repScore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Finding ID
        //Router ID
        routerTextView = findViewById(R.id.routerTextViewID);
        routerUpButton = findViewById(R.id.routerUpButtonID);
        routerDownButton = findViewById(R.id.routerDownButtonID);
        routerEditText = findViewById(R.id.routerEditTextID);

        //Microtik Router ID
        microtikRouterTextView = findViewById(R.id.mrTextViewID);
        microtikUpButton = findViewById(R.id.mrUpButtonID);
        micotikDownButton = findViewById(R.id.mrDownButtonID);
        microtikEditText = findViewById(R.id.mrEditTextID);

        //8 Port Switch ID
        eightSwTextView = findViewById(R.id.eight_swTextViewID);
        eightSwUpButton = findViewById(R.id.eight_swUpButtonID);
        eightSwDownButton = findViewById(R.id.eight_swDownButtonID);
        eightSwEditText = findViewById(R.id.eight_swEditTextID);

        //16 Port Switch ID
        sixteenSwTextView = findViewById(R.id.sixteenPortSwitchTextViewID);
        sixteenSwUpButton = findViewById(R.id.sixteenPortSwitchUpButtonID);
        sixteenSwDownButton = findViewById(R.id.sixteenPortSwitchDownButtonID);
        sixteenSwEditText = findViewById(R.id.sixteenPortSwitchEditTextID);

        //24 Port Switch
        twintySwTextView = findViewById(R.id.twintyPortSwitchTextViewID);
        twintySwUpButton = findViewById(R.id.twintyPortSwitchUpButtonID);
        twintySwDownButton = findViewById(R.id.twintyPortDownButtonID);
        twintySwEditText = findViewById(R.id.twintyPortEditTextID);

        //Gigabit Switch
        gigabitSwTextView = findViewById(R.id.gigabitSwTextViewID);
        gigabitSwUpButton = findViewById(R.id.gigabitSwUpButtonID);
        gigabitSwDownButton= findViewById(R.id.gigabitSwDownButtonID);
        gigabitSwEditText = findViewById(R.id.gigabitSwEditTextID);

        //Normal MC
        normalMcTextView = findViewById(R.id.normalMcTextViewID);
        normalMcUpButton = findViewById(R.id.normalMcUpButtonID);
        normalMcDownButton = findViewById(R.id.normalMcDownButtonID);
        normalMcEditText = findViewById(R.id.normalMcEditTextID);

        //Gigabit MC
        gigabitMcTextView = findViewById(R.id.gigabitMcTextViewID);
        gigabitMcUpButton = findViewById(R.id.gigabitMcUpButtonID);
        gigabitMcDownButton = findViewById(R.id.gigabitMcDownButtonID);
        gigabitMcEditText = findViewById(R.id.gigabitMcEditTextID);

        //Sep Module
        sepTextView = findViewById(R.id.sepTextViewID);
        sepUpButton = findViewById(R.id.sepUpButtonID);
        sepDownButton = findViewById(R.id.sepDownButtonID);
        sepEditText = findViewById(R.id.sepEditTextID);

        //Radio Link
        radioTextView = findViewById(R.id.radioTextViewID);
        radioUpButton = findViewById(R.id.radioUpButtonID);
        radioDownButton = findViewById(R.id.radioLinkDownButtonID);
        radioEditText = findViewById(R.id.radioEditTextID);

        //Repeater
        repTextView = findViewById(R.id.repeaterTextViewID);
        repUpButton = findViewById(R.id.repeaterUpButtonID);
        repDownButton = findViewById(R.id.repeaterDownButtonID);
        repEditText = findViewById(R.id.repeaterEditTextID);

        //Exit
        exitButton = findViewById(R.id.exitButtonID);


        //Set Onclick Listener

        //Router
        routerUpButton.setOnClickListener(this);
        routerDownButton.setOnClickListener(this);

        //Microtik Router
        microtikUpButton.setOnClickListener(this);
        micotikDownButton.setOnClickListener(this);

        //8 Port Switch
        eightSwUpButton.setOnClickListener(this);
        eightSwDownButton.setOnClickListener(this);

        //16 Port Switch
        sixteenSwUpButton.setOnClickListener(this);
        sixteenSwDownButton.setOnClickListener(this);

        //24 Port Switch
        twintySwUpButton.setOnClickListener(this);
        twintySwDownButton.setOnClickListener(this);

        //Gigabit Switch
        gigabitSwUpButton.setOnClickListener(this);
        gigabitSwDownButton.setOnClickListener(this);

        //Normal MC
        normalMcUpButton.setOnClickListener(this);
        normalMcDownButton.setOnClickListener(this);

        //Gigabit MC
        gigabitMcUpButton.setOnClickListener(this);
        gigabitMcDownButton.setOnClickListener(this);

        //SFP Module
        sepUpButton.setOnClickListener(this);
        sepDownButton.setOnClickListener(this);

        //Radio Link
        radioUpButton.setOnClickListener(this);
        radioDownButton.setOnClickListener(this);

        //Repeater
        repUpButton.setOnClickListener(this);
        repDownButton.setOnClickListener(this);

        //Exit
        exitButton.setOnClickListener(this);

        if (routerLoadScore()!=0){
            routerTextView.setText("You have :"+routerLoadScore());
        }
        if (mrLoadScore()!=0){
            microtikRouterTextView.setText("You have :"+mrLoadScore());
        }
        if (eLoadScore()!=0){
            eightSwTextView.setText("You have :"+eLoadScore());
        }
        if (sLoadScore()!=0){
            sixteenSwTextView.setText("You have :"+sLoadScore());
        }
        if (tLoadScore()!=0){
            twintySwTextView.setText("You have :"+tLoadScore());
        }
        if (gsLoadScore()!=0){
            gigabitSwTextView.setText("You have :"+gsLoadScore());
        }
        if (nmLoadScore()!=0){
            normalMcTextView.setText("You have :"+nmLoadScore());
        }
        if (gmLoadScore()!=0){
            gigabitMcTextView.setText("You have :"+gmLoadScore());
        }
        if (sepLoadScore()!=0){
            sepTextView.setText("You have :"+sepLoadScore());
        }
        if (radioLoadScore()!=0){
            radioTextView.setText("You have :"+radioLoadScore());
        }
        if (repLoadScore()!=0){
            repTextView.setText("You have :"+repLoadScore());
        }
    }

    @Override
    public void onClick(View v) {

        //For exit
        if (v.getId() == R.id.exitButtonID){
            finish();
        }

        //Router
        try {
            String rNumber = routerEditText.getText().toString();


            int rNum = Integer.parseInt(rNumber);



            if (v.getId() == R.id.routerUpButtonID){
                routerScore = routerLoadScore();
                routerScore += rNum;
                routerTextView.setText("You have :"+routerScore);
                routerSaveScore(routerScore);

            }else if (v.getId() == R.id.routerDownButtonID){
                if (routerLoadScore() !=0){
                    routerScore = routerLoadScore();
                    if (rNum > routerScore){
                        Toast.makeText(MainActivity.this, "You don't have "+rNum+" routers", Toast.LENGTH_SHORT).show();
                    }else {
                        routerScore -= rNum;
                        routerTextView.setText("You have :"+routerScore);
                        routerSaveScore(routerScore);
                    }

                }

            }



        }catch (Exception e){
            //Toast.makeText(MainActivity.this, "Please enter number", Toast.LENGTH_SHORT).show();
        }

        //Microtik Router
        try {
            String mrNumber = microtikEditText.getText().toString();

            int mrNum = Integer.parseInt(mrNumber);

            if (v.getId() == R.id.mrUpButtonID){
                microtikScore = mrLoadScore();
                microtikScore += mrNum;
                microtikRouterTextView.setText("You have :"+microtikScore);
                mrSaveScore(microtikScore);

            }else if (v.getId() == R.id.mrDownButtonID){
                if (mrLoadScore() !=0){
                    microtikScore = mrLoadScore();
                    if (mrNum > microtikScore){
                        Toast.makeText(MainActivity.this, "You don't have "+mrNum+" routers", Toast.LENGTH_SHORT).show();
                    }else {
                        microtikScore -= mrNum;
                        microtikRouterTextView.setText("You have :"+microtikScore);
                        mrSaveScore(microtikScore);
                    }

                }

            }



        }catch (Exception e){
            //Toast.makeText(MainActivity.this, "Please enter number", Toast.LENGTH_SHORT).show();
        }

        //8 Port Switch
        try {
            String eightSwNumber = eightSwEditText.getText().toString();

            int eightSwNum = Integer.parseInt(eightSwNumber);

            if (v.getId() == R.id.eight_swUpButtonID){
                eightSwScore = eLoadScore();
                eightSwScore += eightSwNum;
                eightSwTextView.setText("You have :"+eightSwScore);
                eSaveScore(eightSwScore);

            }else if (v.getId() == R.id.eight_swDownButtonID){
                if (eLoadScore() !=0){
                    eightSwScore = eLoadScore();
                    if (eightSwNum > eightSwScore){
                        Toast.makeText(MainActivity.this, "You don't have "+eightSwNum+" 8 port Switch", Toast.LENGTH_SHORT).show();
                    }else {
                        eightSwScore -= eightSwNum;
                        eightSwTextView.setText("You have :"+eightSwScore);
                        eSaveScore(eightSwScore);
                    }

                }

            }

        }catch (Exception e){
            //Toast.makeText(MainActivity.this, "Please enter number", Toast.LENGTH_SHORT).show();
        }

        //16 Port Switch
        try {
            String sSwNumber = sixteenSwEditText.getText().toString();

            int sSwNum = Integer.parseInt(sSwNumber);

            if (v.getId() == R.id.sixteenPortSwitchUpButtonID){
                sixteenSwScore = sLoadScore();
                sixteenSwScore += sSwNum;
                sixteenSwTextView.setText("You have :"+sixteenSwScore);
                sSaveScore(sixteenSwScore);

            }else if (v.getId() == R.id.sixteenPortSwitchDownButtonID){
                if (sLoadScore() !=0){
                    sixteenSwScore = sLoadScore();
                    if (sSwNum > sixteenSwScore){
                        Toast.makeText(MainActivity.this, "You don't have "+sSwNum+" 16 port Switch", Toast.LENGTH_SHORT).show();
                    }else {
                        sixteenSwScore -= sSwNum;
                        sixteenSwTextView.setText("You have :"+sixteenSwScore);
                        sSaveScore(sixteenSwScore);
                    }

                }

            }

        }catch (Exception e){
            //Toast.makeText(MainActivity.this, "Please enter number", Toast.LENGTH_SHORT).show();
        }

        //24 Port Switch
        try {
            String tSwNumber = twintySwEditText.getText().toString();

            int tSwNum = Integer.parseInt(tSwNumber);

            if (v.getId() == R.id.twintyPortSwitchUpButtonID){
                twintySwScore = tLoadScore();
                twintySwScore += tSwNum;
                twintySwTextView.setText("You have :"+twintySwScore);
                tSaveScore(twintySwScore);

            }else if (v.getId() == R.id.twintyPortDownButtonID){
                if (tLoadScore() !=0){
                    twintySwScore = tLoadScore();
                    if (tSwNum > twintySwScore){
                        Toast.makeText(MainActivity.this, "You don't have "+tSwNum+" 24 port Switch", Toast.LENGTH_SHORT).show();
                    }else {
                        twintySwScore -= tSwNum;
                        twintySwTextView.setText("You have :"+twintySwScore);
                        tSaveScore(twintySwScore);
                    }

                }

            }

        }catch (Exception e){
            //Toast.makeText(MainActivity.this, "Please enter number", Toast.LENGTH_SHORT).show();
        }

        //Gigabit Switch
        try {
            String gsSwNumber = gigabitSwEditText.getText().toString();

            int gsSwNum = Integer.parseInt(gsSwNumber);

            if (v.getId() == R.id.gigabitSwUpButtonID){
                gigabitSwScore = gsLoadScore();
                gigabitSwScore += gsSwNum;
                gigabitSwTextView.setText("You have :"+gigabitSwScore);
                gsSaveScore(gigabitSwScore);

            }else if (v.getId() == R.id.gigabitSwDownButtonID){
                if (gsLoadScore() !=0){
                    gigabitSwScore = gsLoadScore();
                    if (gsSwNum > gigabitSwScore){
                        Toast.makeText(MainActivity.this, "You don't have "+gsSwNum+" Gigabit Switch", Toast.LENGTH_SHORT).show();
                    }else {
                        gigabitSwScore -= gsSwNum;
                        gigabitSwTextView.setText("You have :"+gigabitSwScore);
                        gsSaveScore(gigabitSwScore);
                    }

                }

            }

        }catch (Exception e){
            //Toast.makeText(MainActivity.this, "Please enter number", Toast.LENGTH_SHORT).show();
        }

        //Normal MC
        try {
            String nmNumber = normalMcEditText.getText().toString();

            int nmNum = Integer.parseInt(nmNumber);

            if (v.getId() == R.id.normalMcUpButtonID){
                normalMcScore = nmLoadScore();
                normalMcScore += nmNum;
                normalMcTextView.setText("You have :"+normalMcScore);
                nmSaveScore(normalMcScore);

            }else if (v.getId() == R.id.normalMcDownButtonID){
                if (nmLoadScore() !=0){
                    normalMcScore = nmLoadScore();
                    if (nmNum > normalMcScore){
                        Toast.makeText(MainActivity.this, "You don't have "+nmNum+" Normal MC", Toast.LENGTH_SHORT).show();
                    }else {
                        normalMcScore -= nmNum;
                        normalMcTextView.setText("You have :"+normalMcScore);
                        nmSaveScore(normalMcScore);
                    }

                }

            }

        }catch (Exception e){
            //Toast.makeText(MainActivity.this, "Please enter number", Toast.LENGTH_SHORT).show();
        }

        //Gigabit MC
        try {
            String gmNumber = gigabitMcEditText.getText().toString();

            int gmNum = Integer.parseInt(gmNumber);

            if (v.getId() == R.id.gigabitMcUpButtonID){
                gigabitMcScore = gmLoadScore();
                gigabitMcScore += gmNum;
                gigabitMcTextView.setText("You have :"+gigabitMcScore);
                gmSaveScore(gigabitMcScore);

            }else if (v.getId() == R.id.gigabitMcDownButtonID){
                if (gmLoadScore() !=0){
                    gigabitMcScore = gmLoadScore();
                    if (gmNum > gigabitMcScore){
                        Toast.makeText(MainActivity.this, "You don't have "+gmNum+" Gigabit MC", Toast.LENGTH_SHORT).show();
                    }else {
                        gigabitMcScore -= gmNum;
                        gigabitMcTextView.setText("You have :"+gigabitMcScore);
                        gmSaveScore(gigabitMcScore);
                    }

                }

            }

        }catch (Exception e){
            //Toast.makeText(MainActivity.this, "Please enter number", Toast.LENGTH_SHORT).show();
        }

        //SFP Module
        try {
            String sepNumber = sepEditText.getText().toString();

            int sepNum = Integer.parseInt(sepNumber);

            if (v.getId() == R.id.sepUpButtonID){
                sepScore = sepLoadScore();
                sepScore += sepNum;
                sepTextView.setText("You have :"+sepScore);
                sepSaveScore(sepScore);

            }else if (v.getId() == R.id.sepDownButtonID){
                if (sepLoadScore() !=0){
                    sepScore = sepLoadScore();
                    if (sepNum > sepScore){
                        Toast.makeText(MainActivity.this, "You don't have "+sepNum+" SFP Module", Toast.LENGTH_SHORT).show();
                    }else {
                        sepScore -= sepNum;
                        sepTextView.setText("You have :"+sepScore);
                        sepSaveScore(sepScore);
                    }

                }

            }

        }catch (Exception e){
            //Toast.makeText(MainActivity.this, "Please enter number", Toast.LENGTH_SHORT).show();
        }

        //Radio Link
        try {
            String radioNumber = radioEditText.getText().toString();

            int radioNum = Integer.parseInt(radioNumber);

            if (v.getId() == R.id.radioUpButtonID){
                radioScore = radioLoadScore();
                radioScore += radioNum;
                radioTextView.setText("You have :"+radioScore);
                radioSaveScore(radioScore);

            }else if (v.getId() == R.id.radioLinkDownButtonID){
                if (radioLoadScore() !=0){
                    radioScore = radioLoadScore();
                    if (radioNum > radioScore){
                        Toast.makeText(MainActivity.this, "You don't have "+radioNum+" Radio Link", Toast.LENGTH_SHORT).show();
                    }else {
                        radioScore -= radioNum;
                        radioTextView.setText("You have :"+radioScore);
                        radioSaveScore(radioScore);
                    }

                }

            }

        }catch (Exception e){
            //Toast.makeText(MainActivity.this, "Please enter number", Toast.LENGTH_SHORT).show();
        }

        //Repeater
        try {
            String repNumber = repEditText.getText().toString();

            int repNum = Integer.parseInt(repNumber);

            if (v.getId() == R.id.repeaterUpButtonID){
                repScore = repLoadScore();
                repScore += repNum;
                repTextView.setText("You have :"+repScore);
                repSaveScore(repScore);

            }else if (v.getId() == R.id.repeaterDownButtonID){
                if (repLoadScore() !=0){
                    repScore = repLoadScore();
                    if (repNum > repScore){
                        Toast.makeText(MainActivity.this, "You don't have "+repNum+" Repeater", Toast.LENGTH_SHORT).show();
                    }else {
                        repScore -= repNum;
                        repTextView.setText("You have :"+repScore);
                        repSaveScore(repScore);
                    }

                }

            }

        }catch (Exception e){
            //Toast.makeText(MainActivity.this, "Please enter number", Toast.LENGTH_SHORT).show();
        }

    }
    //Router Method
    private void routerSaveScore(int score){
        SharedPreferences sharedPreferences = getSharedPreferences("gameScore", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("lastScore", score);
        editor.commit();
    }
    private int routerLoadScore(){
        SharedPreferences sharedPreferences = getSharedPreferences("gameScore", Context.MODE_PRIVATE);
        int score = sharedPreferences.getInt("lastScore", 0);
        return score;
    }

    //Microtik Router Method
    private void mrSaveScore(int mrscore){
        SharedPreferences mrSharedPreferences = getSharedPreferences("mrgameScore", Context.MODE_PRIVATE);
        SharedPreferences.Editor mrEditor = mrSharedPreferences.edit();
        mrEditor.putInt("mrlastScore", mrscore);
        mrEditor.commit();
    }
    private int mrLoadScore(){
        SharedPreferences mrSharedPreferences = getSharedPreferences("mrgameScore", Context.MODE_PRIVATE);
        int mrscore = mrSharedPreferences.getInt("mrlastScore", 0);
        return mrscore;
    }

    //8 Port Switch Method
    private void eSaveScore(int escore){
        SharedPreferences esharedPreferences = getSharedPreferences("egameScore", Context.MODE_PRIVATE);
        SharedPreferences.Editor eeditor = esharedPreferences.edit();
        eeditor.putInt("elastScore", escore);
        eeditor.commit();
    }
    private int eLoadScore(){
        SharedPreferences esharedPreferences = getSharedPreferences("egameScore", Context.MODE_PRIVATE);
        int escore = esharedPreferences.getInt("elastScore", 0);
        return escore;
    }

    //16 Port Switch Method
    private void sSaveScore(int sscore){
        SharedPreferences ssharedPreferences = getSharedPreferences("sgameScore", Context.MODE_PRIVATE);
        SharedPreferences.Editor seditor = ssharedPreferences.edit();
        seditor.putInt("slastScore", sscore);
        seditor.commit();
    }
    private int sLoadScore(){
        SharedPreferences ssharedPreferences = getSharedPreferences("sgameScore", Context.MODE_PRIVATE);
        int sscore = ssharedPreferences.getInt("slastScore", 0);
        return sscore;
    }

    //24 Port Switch Method
    private void tSaveScore(int tscore){
        SharedPreferences tsharedPreferences = getSharedPreferences("tgameScore", Context.MODE_PRIVATE);
        SharedPreferences.Editor teditor = tsharedPreferences.edit();
        teditor.putInt("tlastScore", tscore);
        teditor.commit();
    }
    private int tLoadScore(){
        SharedPreferences tsharedPreferences = getSharedPreferences("tgameScore", Context.MODE_PRIVATE);
        int tscore = tsharedPreferences.getInt("tlastScore", 0);
        return tscore;
    }

    //Gigabit Switch Method
    private void gsSaveScore(int gsscore){
        SharedPreferences gssharedPreferences = getSharedPreferences("gsgameScore", Context.MODE_PRIVATE);
        SharedPreferences.Editor gseditor = gssharedPreferences.edit();
        gseditor.putInt("gslastScore", gsscore);
        gseditor.commit();
    }
    private int gsLoadScore(){
        SharedPreferences gssharedPreferences = getSharedPreferences("gsgameScore", Context.MODE_PRIVATE);
        int gsscore = gssharedPreferences.getInt("gslastScore", 0);
        return gsscore;
    }

    //Normal MC Method
    private void nmSaveScore(int nmscore){
        SharedPreferences nmsharedPreferences = getSharedPreferences("nmgameScore", Context.MODE_PRIVATE);
        SharedPreferences.Editor nmeditor = nmsharedPreferences.edit();
        nmeditor.putInt("nmlastScore", nmscore);
        nmeditor.commit();
    }
    private int nmLoadScore(){
        SharedPreferences nmsharedPreferences = getSharedPreferences("nmgameScore", Context.MODE_PRIVATE);
        int nmscore = nmsharedPreferences.getInt("nmlastScore", 0);
        return nmscore;
    }

    //Gigabit MC Method
    private void gmSaveScore(int gmscore){
        SharedPreferences gmsharedPreferences = getSharedPreferences("gmgameScore", Context.MODE_PRIVATE);
        SharedPreferences.Editor gmeditor = gmsharedPreferences.edit();
        gmeditor.putInt("gmlastScore", gmscore);
        gmeditor.commit();
    }
    private int gmLoadScore(){
        SharedPreferences gmsharedPreferences = getSharedPreferences("gmgameScore", Context.MODE_PRIVATE);
        int gmscore = gmsharedPreferences.getInt("gmlastScore", 0);
        return gmscore;
    }

    //SFP Module Method
    private void sepSaveScore(int sepscore){
        SharedPreferences sepsharedPreferences = getSharedPreferences("sepgameScore", Context.MODE_PRIVATE);
        SharedPreferences.Editor sepeditor = sepsharedPreferences.edit();
        sepeditor.putInt("seplastScore", sepscore);
        sepeditor.commit();
    }
    private int sepLoadScore(){
        SharedPreferences sepsharedPreferences = getSharedPreferences("sepgameScore", Context.MODE_PRIVATE);
        int sepscore = sepsharedPreferences.getInt("seplastScore", 0);
        return sepscore;
    }

    //Radio Link
    private void radioSaveScore(int radioscore){
        SharedPreferences radiosharedPreferences = getSharedPreferences("radiogameScore", Context.MODE_PRIVATE);
        SharedPreferences.Editor radioeditor = radiosharedPreferences.edit();
        radioeditor.putInt("radiolastScore", radioscore);
        radioeditor.commit();
    }
    private int radioLoadScore(){
        SharedPreferences radiosharedPreferences = getSharedPreferences("radiogameScore", Context.MODE_PRIVATE);
        int radioscore = radiosharedPreferences.getInt("radiolastScore", 0);
        return radioscore;
    }
    //Repeater Method
    private void repSaveScore(int repscore){
        SharedPreferences repsharedPreferences = getSharedPreferences("repgameScore", Context.MODE_PRIVATE);
        SharedPreferences.Editor repeditor = repsharedPreferences.edit();
        repeditor.putInt("replastScore", repscore);
        repeditor.commit();
    }
    private int repLoadScore(){
        SharedPreferences repsharedPreferences = getSharedPreferences("repgameScore", Context.MODE_PRIVATE);
        int repscore = repsharedPreferences.getInt("replastScore", 0);
        return repscore;
    }
}

