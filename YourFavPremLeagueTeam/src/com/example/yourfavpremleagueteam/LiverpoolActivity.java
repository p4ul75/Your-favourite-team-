package com.example.yourfavpremleagueteam;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class LiverpoolActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_liverpool);
	}

	public void lfcWebOnClick(View view){
		Toast.makeText(getApplicationContext(), 
                "Connecting to Liverpool Fc web page", Toast.LENGTH_SHORT).show();
    	Intent browserIntent = 
                 new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.liverpoolfc.com"));
	    startActivity(browserIntent); 
	}
	
	public void mediaLinksOnClick(View view){
		Toast.makeText(getApplicationContext(), 
                "Connecting to Liverpool Fc web media watch", Toast.LENGTH_SHORT).show();
    	Intent browserIntent = 
                 new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.liverpoolfc.com/news/media-watch"));
	    startActivity(browserIntent); 
	}
	
	public void lfcPlayerOnClick(View view){
		Toast.makeText(getApplicationContext(), 
                "Liverpool FC PLayer Stats", Toast.LENGTH_SHORT).show();
    	Intent intent = 
                 new Intent(this,LfcPlayerStatsActivity.class); 
	    startActivity(intent);
	}
	
	public void lfcHonoursOnClick(View view){
		Toast.makeText(getApplicationContext(), 
                "Liverpool FC Honours", Toast.LENGTH_SHORT).show();
    	Intent intent = 
                 new Intent(this,LfcHonoursActivity.class); 
	    startActivity(intent);
	}
	
	public void lfcgamesOnClick(View view){
		Toast.makeText(getApplicationContext(), 
                "Liverpool Live Games", Toast.LENGTH_SHORT).show();
    	Intent intent = 
                 new Intent(this,LfcLiveGamesActivity.class); 
	    startActivity(intent);
	}
	
	/*public void lfcPlayerOnClick(View view){
		Toast.makeText(getApplicationContext(), 
                "Connecting to Liverpool Fc web page", Toast.LENGTH_SHORT).show();
    	Intent browserIntent = 
                 new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.liverpoolfc.com/team/player-stats/24726/Suarez"));
	    startActivity(browserIntent); 
	}*/
	

}
