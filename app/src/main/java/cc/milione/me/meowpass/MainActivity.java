package cc.milione.me.meowpass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText tagText,uPassText,passText;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        tagText = (EditText) findViewById(R.id.tagEditText);
        uPassText = (EditText) findViewById(R.id.upassEditText);
        passText = (EditText) findViewById(R.id.passText);

        findViewById(R.id.buttonGen).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Meow!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
