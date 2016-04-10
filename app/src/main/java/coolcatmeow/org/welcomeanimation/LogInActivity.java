package coolcatmeow.org.welcomeanimation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LogInActivity extends AppCompatActivity {
    public   static String ID = "coolcatmeow.org.welcomeanimation.ID";
    public   static String PASSWORD = "coolcatmewo.org.welcomanimation.PASSWORD";
    public   static String FIRST_NAME = "coolcatmeow.org.welcomeanimation.FIRST_NAME";
    public   static String LAST_NAME = "coolcatmeow.org.welcomeanimation.LAST_NAME";
    public   static String EMAIL = "coolcatmeow.org.welcomeanimation.EMAIL";
    public   static String PHONE = "coolcatmeow.org.welcomeanimation.PHONE";
    public   static String SCHOOL_NAME = "coolcatmeow.org.welcomeanimation.SCHOOL_NAME";
    public   static String MAJOR = "coolcatmeow.org.welcomeanimation.MAJOR";
    public   static String COMPANY_NAME = "coolcatmeow.org.welcomeanimation.COMPANY_NAME";
    public   static String COMPANY_POSITION = "coolcatmeow.org.welcomeanimation.COMPANY_POSITION";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Make all strings NULL
            FIRST_NAME = null;
            LAST_NAME = null;
            EMAIL = null;
            PHONE = null;
            SCHOOL_NAME = null;
            MAJOR = null;
            COMPANY_NAME = null;
            COMPANY_POSITION = null;

        //Save String information




        //Button for Create new Account
        Button goToMainActivity = (Button) findViewById(R.id.buttonNewAccount);
        goToMainActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    //Gets the input of the string
                    EditText id = (EditText) findViewById(R.id.editTextID);
                    final String iden = id.getText().toString();
                    EditText passWord = (EditText) findViewById(R.id.editTextPassWord);
                    final String key  = passWord.getText().toString();
                }
                catch ( NullPointerException e){
                    System.out.print("One of the field is empty");
                }

               // final String firstName = id.getText().toString();

                Intent intent = new Intent(LogInActivity.this, MainActivity.class);
                startActivity(intent);



            }
        });

        //Button for sign in to account
        Button goToYourActivity = (Button) findViewById(R.id.buttonSignIn);
        assert goToMainActivity != null;
        goToYourActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LogInActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });

    }

}
