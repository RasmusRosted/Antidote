package antidote.antidote;

import android.content.Intent;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity; //TODO not use app.ActionBar?
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupBtnSaveALife();
        setupBtnFindYourAntidote();
        setupBtnDrugUsage();
    }

    private void setupBtnSaveALife() {
        Button btnSaveALife = (Button) findViewById(R.id.btnSaveALife);
        btnSaveALife.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(MainActivity.this, SaveALife.class));
                }
            }
        );
    }

    private void setupBtnFindYourAntidote() {
        Button btnSaveALife = (Button) findViewById(R.id.btnFindYourAntidote);
        btnSaveALife.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(MainActivity.this, FindYourAntidote.class));
                }
            }
        );

    }

    private void setupBtnDrugUsage() {
        Button btnSaveALife = (Button) findViewById(R.id.btnDrugUsage);
        btnSaveALife.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(MainActivity.this, DrugUsage.class));
                }
            }
        );

    }
}
