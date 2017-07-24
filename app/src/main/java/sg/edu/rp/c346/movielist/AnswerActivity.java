package sg.edu.rp.c346.movielist;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {
    TextView Title;
    TextView Year;
    TextView Description;
    TextView WatchOn;
    TextView WatchAt;
    ImageView icon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display);
        Title=(TextView)findViewById(R.id.textViewNewTitle);
        Year=(TextView)findViewById(R.id.textViewTime);
        Description=(TextView)findViewById(R.id.textViewNewDescription);
        WatchOn=(TextView)findViewById(R.id.textViewTime);
        WatchAt=(TextView)findViewById(R.id.textViewWatchAt);
        icon=(ImageView)findViewById(R.id.imageViewIcon) ;


        Intent intentReceived = getIntent();
        String ShoeModel =intentReceived.getStringExtra("Model");
        String ShoeModelNumber=intentReceived.getStringExtra("Model Number");
        String Price=intentReceived.getStringExtra("Price");
        String Address =intentReceived.getStringExtra("Address");
        String ContectNum =intentReceived.getStringExtra("Contact Number");







    }
}
