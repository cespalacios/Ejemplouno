package com.ces.exampleuno;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
 
public class MainActivity extends Activity {
 
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final EditText txtNombre = (EditText)findViewById(R.id.TxtNombre);
        final Button btnHola = (Button)findViewById(R.id.BtnHola);
        
        btnHola.setOnClickListener(new OnClickListener() {
        	@Override	
        	public void onClick(View v){
        		 Intent intent = new Intent(MainActivity.this, Saludo.class);
                 Bundle b = new Bundle();
                 b.putString("NOMBRE", txtNombre.getText().toString());
                 intent.putExtras(b);
                 startActivity(intent);
        	}
        
        });
        
    }
 
}
