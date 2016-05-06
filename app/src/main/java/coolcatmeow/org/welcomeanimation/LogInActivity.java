package coolcatmeow.org.welcomeanimation;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LogInActivity extends AppCompatActivity {
<<<<<<< HEAD
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
=======
    public  final static String ID = "coolcatmeow.org.welcomeanimation.ID";
    private myClass connectionTask = null;
    private ServerConnection serverConnection = null;
    public static String USEREMAIL = "";
    public static String PASSWORD = "";
>>>>>>> master

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

<<<<<<< HEAD
        //Make all strings NULL
            FIRST_NAME = null;
            LAST_NAME = null;
            EMAIL = null;
            PHONE = null;
            SCHOOL_NAME = null;
            MAJOR = null;
            COMPANY_NAME = null;
            COMPANY_POSITION = null;
=======
        //Save String information

        /*
            Juan, we need to set USEREMAIL equal to the user's login email address. That way we can
            use that to sort out who's data to update when updating the database.
         */
>>>>>>> master


        //Button for Create new Account
        Button goToMainActivity = (Button) findViewById(R.id.buttonNewAccount);
        goToMainActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    //Gets the input of the string
                    EditText id = (EditText) findViewById(R.id.editTextID);
                    ID = id.getText().toString();
                    EditText passWord = (EditText) findViewById(R.id.editTextPassWord);
                    PASSWORD = passWord.getText().toString();
                }
                catch ( NullPointerException e){
                    System.out.print("One of the field is empty");
                }

               // final String firstName = id.getText().toString();

                Intent intent = new Intent(LogInActivity.this, MainActivity.class);
                startActivity(intent);
<<<<<<< HEAD



=======
               /*
               TODO
                This is how we can create a new user on the server
                **************************************************
                String command = "::adduser%%";
                String toSend += command;
                toSend += USEREMAIL;
                toSend += PASSWORD;
                connectionTask = new myClass();
                try
                {
                    connectionTask.execute(toSend).get();
                }catch(Exception e)
                {
                    e.printStackTrace();
                }
                **************************************************
                */
>>>>>>> master
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

                /*TODO
                This is how we can log into the server
                **************************************************
                String command = "::login%%";
                String toSend += command;
                toSend += USEREMAIL;
                toSend += PASSWORD;
                String verification = "";
                connectionTask = new myClass();
                try
                {
                    verification = connectionTask.execute(toSend).get();
                }catch(Exception e)
                {
                    e.printStackTrace();
                }
                //This part is a rough guess, we need to do a little more work to be sure
                if(verification.equals("success"))
                    //login
                else if(verification.equals("wrongpassword"))
                    //re-enter password
                else
                    //email doesn't exist
                **************************************************
                */

            }
        });

    }

    /**
     * myClass:
     * the extension of AsyncTask<String, Void, String> allows for database queries to occur
     * in the background. The information retrieved can be fetched by instance.execute().get()
     */
    private class myClass extends AsyncTask<String, Void, String>
    {
        String information = "";

        @Override
        protected String doInBackground(String... foo)
        {
            String info;

            try
            {
                serverConnection = new ServerConnection(foo[0]);
                serverConnection.run();
                info = serverConnection.gMessage;
                information = info;

                Looper.prepare();
            }catch (Exception e)
            {
                e.printStackTrace();
            }
            return information;
        }
    }

}
