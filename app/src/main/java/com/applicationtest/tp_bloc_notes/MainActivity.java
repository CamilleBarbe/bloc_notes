package com.applicationtest.tp_bloc_notes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Récupération des éléments du GUI (interface)
    private Button hideShow = null;
    private Slider slider = null;
    private RelativeLayout toHide = null;
    private EditText editer = null;
    private TextView text = null;
    private RadioButton colorChooser = null;

    private Button bold = null;
    private Button italic = null;
    private Button underline = null;

    private ImageButton smile = null;
    private ImageButton heureux = null;
    private ImageButton clin = null;

    //Mettre les smileyx dans le texte
    private SmileyGetter getter = null;

    //Couleur actuelle texte
    private String currentColor = "#000000";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        


    }
}
