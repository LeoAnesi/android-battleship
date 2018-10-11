package com.excilys.formation.battleships.android.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import battleships.formation.excilys.com.battleships.R;

public class PlayerNameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_name);
    }

    public void onClickButton(View view) {
        EditText editText = (EditText) findViewById(R.id.text_name);
        String playerName =  editText.getText().toString();

        BattleShipsApplication.getGame().init(playerName);
    }
}
