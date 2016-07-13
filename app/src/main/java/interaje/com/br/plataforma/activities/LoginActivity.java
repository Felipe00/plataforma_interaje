package interaje.com.br.plataforma.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import interaje.com.br.plataforma.R;

public class LoginActivity extends AppCompatActivity {

    EditText username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText) findViewById(R.id.loginActivity_email);
        password = (EditText) findViewById(R.id.loginActivity_password);

    }

    public void signIn(View v) {
        String u = username.getText().toString();
        String p = password.getText().toString();

        if (!u.isEmpty() && !p.isEmpty()) {
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);
        } else {
            Toast.makeText(LoginActivity.this, "Preencha os campos", Toast.LENGTH_SHORT).show();
        }
    }
}