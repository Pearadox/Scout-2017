package com.pearadox.scout_5414;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.app.Activity;

import static com.pearadox.scout_5414.R.id.button_GoToOtherActivity;

/**
 * Created by mlm.02000 on 2/5/2017.
 */

public class TeleopScoutActivity extends Activity {


    String TAG = "TeleopScoutActivity";      // This CLASS name
    TextView txt_dev, txt_stud, txt_match, txt_MyTeam;
    private Button button_GoToOtherActivity;


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "<< Teleop Scout >>");
        setContentView(R.layout.activity_teleop_scout);
        Bundle bundle = this.getIntent().getExtras();


        button_GoToOtherActivity = (Button) findViewById(R.id.button_GoToOtherActivity);


        button_GoToOtherActivity.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.i(TAG, "Clicked Comments");
                Intent smast_intent = new Intent(TeleopScoutActivity.this, OtherActivity.class);
                Bundle SMbundle = new Bundle();
                smast_intent.putExtras(SMbundle);
                startActivity(smast_intent);
           }
        });


        String param1 = bundle.getString("dev");
        String param2 = bundle.getString("stud");
        Log.d(TAG, param1 + " " + param2);      // ** DEBUG **
        Log.i(TAG, "<< before calling Other Activty >>");

    }

//    public void onClick(View view) {
//        Log.i(TAG, "<< calling Other Activty >>");
//        switch (view.getId()){
//            case button_GoToOtherActivity:
//                Log.i(TAG, "<< Comment Button Pushed >>");
//                Intent smastintent = new Intent(this, OtherActivity.class);
//                startActivity(smastintent);
//                break;
//            default:
//                break;
//        }
//    }


}
