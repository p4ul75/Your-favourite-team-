package com.example.yourfavpremleagueteam;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class LfcPlayerStatsActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lfc_player_stats);
	}

	public void lfcWebOnClick(View view){
		Toast.makeText(getApplicationContext(), 
                "Connecting to Liverpool Fc web page", Toast.LENGTH_SHORT).show();
    	Intent browserIntent = 
                 new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.liverpoolfc.com/team/player-stats/11618/Gerrard"));
	    startActivity(browserIntent); 
	}

}
