package coolcatmeow.org.welcomeanimation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class QrActivity extends AppCompatActivity {

    public final static String SENDEMAIL = "coolcatmeow.org.welcomeanimation.SENDEMAIL";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qr);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        Button goToMainActivity = (Button) findViewById(R.id.infoButton);
            goToMainActivity.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    EditText fn = (EditText) findViewById(R.id.editText2);
                    final String sendEmail = fn.getText().toString();

                    Intent save = new Intent(QrActivity.this, MainActivity.class);
                    save.putExtra(SENDEMAIL,sendEmail);
                }
            });

    }

}
