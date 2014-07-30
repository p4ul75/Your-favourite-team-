package com.example.yourfavpremleagueteam;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class MediaLinksActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_media_links);
	}
	/*public void lfcWebOnClick(View view){
		Toast.makeText(getApplicationContext(), 
                "Connecting to Liverpool Fc web page", Toast.LENGTH_SHORT).show();
    	Intent browserIntent = 
                 new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.liverpoolfc.com/news/media-watch"));
	    startActivity(browserIntent); 
	}*/

	

}
