package cl.ecmdevelop.example2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText nombre;
    TextView saludo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre = findViewById(R.id.txtNombre);
        saludo = findViewById(R.id.txtSaludo);

        Animation a;
    }

    public void saludar(View view){
        String name = nombre.getText().toString();
        saludo.setText(new StringBuilder().append("Bienvenido ").append(name).toString());
    }


}