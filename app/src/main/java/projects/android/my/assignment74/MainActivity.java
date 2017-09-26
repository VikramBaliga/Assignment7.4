package projects.android.my.assignment74;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText userName;
    EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userName = (EditText) findViewById(R.id.userName);
        password = (EditText) findViewById(R.id.password);
    }

    public void loginUser(View view)
    {
        Intent newScreen = new Intent(MainActivity.this,HomeScreen.class);
        // Get the data from edit text
        String uname = userName.getText().toString();
        String upassword = password.getText().toString();

        //Store the data to pass
        newScreen.putExtra("userName",uname);
        //Load the new screen
        startActivity(newScreen);
    }
}
