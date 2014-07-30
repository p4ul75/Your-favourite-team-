package com.example.yourfavpremleagueteam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.widget.TextView;

public class LfcLiveGamesActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lfc_live_games);
		TextView textView = (TextView)findViewById(R.id.textView_lfcfixtures);
        
        String data=readTextFile(this, R.raw.lfcfixtures);
        textView.setText(data);
    }

    public static String readTextFile(Context ctx, int resId)
    {
        InputStream inputStream = ctx.getResources().openRawResource(resId);

        InputStreamReader inputreader = new InputStreamReader(inputStream);
        BufferedReader bufferedreader = new BufferedReader(inputreader);
        String line;
        StringBuilder stringBuilder = new StringBuilder();
        try 
        {
            while (( line = bufferedreader.readLine()) != null) 
            {
                stringBuilder.append(line);
                stringBuilder.append('\n');
            }
        } 
        catch (IOException e) 
        {
            return null;
        }
        return stringBuilder.toString();
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.lfc_live_games, menu);
		return true;
	}

}
