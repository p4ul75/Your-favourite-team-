package com.example.yourfavpremleagueteam;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class ChelseaActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_chelsea);
	}

	public void cfcWebOnClick(View view){
		Toast.makeText(getApplicationContext(), 
                "Connecting to Chelsea Fc web page", Toast.LENGTH_SHORT).show();
    	Intent browserIntent = 
                 new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.chelseafc.com/"));
	    startActivity(browserIntent); 
	}
	
	public void mediaLinksOnClick(View view){
		Toast.makeText(getApplicationContext(), 
                "Connecting to Chelsea Fc web media watch", Toast.LENGTH_SHORT).show();
    	Intent browserIntent = 
                 new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.chelseafc.com/news/latest-news.html"));
	    startActivity(browserIntent); 
	}

}
