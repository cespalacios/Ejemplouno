package com.ces.exampleuno;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
 
public class Saludo extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantallados);
        
        TextView txtSaludo = (TextView)findViewById(R.id.TxtSaludo);
        Bundle bundle = this.getIntent().getExtras();
        txtSaludo.setText("Hola " + bundle.getString("NOMBRE"));
        
       }
}