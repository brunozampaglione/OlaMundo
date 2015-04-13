package com.mycompany.olamundo;

import android.app.AlertDialog;
import android.view.View;
import android.widget.EditText;

public class AlertClass implements View.OnClickListener {
    OlaMundoActivity activity;
    AlertClass(OlaMundoActivity activity){
        super();
        this.activity = activity;
    }

    @Override
    public void onClick(View v) {
        EditText etNome = (EditText) this.activity.findViewById(R.id.etNome);

        AlertDialog.Builder builder = new AlertDialog.Builder(v.getContext());
        builder.setTitle("Titulo do Alert");
        builder.setMessage(etNome.getText());
        builder.setNeutralButton("Ok", null);
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
