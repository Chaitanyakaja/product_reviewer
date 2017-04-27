package alienware.projectapplication;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;

public class signin extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
    }
    public void onClick(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
    public void onClick1(View view){
        Intent j = new Intent(this, signup.class);
        startActivity(j);
    }
}

