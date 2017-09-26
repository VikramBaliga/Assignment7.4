package projects.android.my.assignment74;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HomeScreen extends AppCompatActivity {

    TextView user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        user = (TextView) findViewById(R.id.user);
        String userName = getIntent().getExtras().get("userName").toString();

        user.setText("Welcome "+userName+" !!");
    }
}
