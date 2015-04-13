package com.mycompany.olamundo;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class OlaMundoActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ola_mundo);
        Log.i("Ciclo de vida", "OnCreate");

        Button btnCopiar = (Button) findViewById(R.id.btnCopy);

        btnCopiar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                EditText etNome = (EditText) findViewById(R.id.etNome);
                TextView tvNome = (TextView) findViewById(R.id.tvNome);

                tvNome.setText(etNome.getText());
                etNome.setText("");
            }
        });

        Button btnAlert = (Button) findViewById(R.id.btnAlert);
        btnAlert.setOnClickListener(new AlertClass(this));
    }

    @Override
    protected  void onStart(){
        super.onStart();
        Log.i("Ciclo de vida", "onStart");
    }

    @Override
    protected  void onResume(){
        super.onResume();
        Log.i("Ciclo de vida", "onResume");
    }

    @Override
    protected  void onPause(){
        super.onPause();
        Log.i("Ciclo de vida", "onPause");
    }

    @Override
    protected  void onStop(){
        super.onStop();
        Log.i("Ciclo de vida", "onStop");
    }

    @Override
    protected  void onDestroy(){
        super.onDestroy();
        Log.i("Ciclo de vida", "onDestroy");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_ola_mundo, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
