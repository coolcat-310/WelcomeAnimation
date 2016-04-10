package coolcatmeow.org.welcomeanimation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ResumeActivity extends AppCompatActivity {
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
        setContentView(R.layout.activity_resume);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        Button goToDisplay = (Button) findViewById(R.id.buttonGoToDisplay);
        goToDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //COPY THE TEXT IN THE FIRST NAME
                EditText fn = (EditText) findViewById(R.id.editTextFistName);
                final String firstName = fn.getText().toString();

                EditText ln = (EditText) findViewById(R.id.editTextLastName);
                final String lastName = ln.getText().toString();

                EditText email = (EditText) findViewById(R.id.editTextEmail);
                final String eMail = email.getText().toString();

                EditText phone = (EditText) findViewById(R.id.editTextPhone);
                final String phtext = phone.getText().toString();

                EditText scName =(EditText) findViewById(R.id.editTextSchoolName);
                final String schoolName = scName.getText().toString();

                EditText majorText = (EditText) findViewById(R.id.editTextMajor);
                final String major = majorText.getText().toString();

                EditText companyText = (EditText) findViewById(R.id.editTextWorkName);
                final String companyName = companyText.getText().toString();

                EditText positionText = (EditText) findViewById(R.id.editTextWorkTittle);
                final String companyPosition = positionText.getText().toString();


                Intent save = new Intent(ResumeActivity.this, DisplayResumeActivity.class);
                save.putExtra(FIRST_NAME,firstName);
                save.putExtra(LAST_NAME,lastName);
                save.putExtra(EMAIL, eMail);
                save.putExtra(PHONE,phtext);
                save.putExtra(SCHOOL_NAME,schoolName);
                save.putExtra(MAJOR,major);
                save.putExtra(COMPANY_NAME,companyName);
                save.putExtra(COMPANY_POSITION,companyPosition);

                startActivity(save);
            }
        });


    }

}
