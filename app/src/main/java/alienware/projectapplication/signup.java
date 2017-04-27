package alienware.projectapplication;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;

public class signup extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }
    public void onClick(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
    public void onClick1(View view){
        Intent i = new Intent(this, signin.class);
        startActivity(i);
    }
}
