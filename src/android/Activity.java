package com.youbanban.cordova.plugin;

import android.os.Bundle;
import android.widget.*;
import android.view.*;

public class Activity extends android.app.Activity {
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		Button okButton = new Button(this);
		okButton.setText("ok");
		Button cancelButton = new Button(this);
		cancelButton.setText("cancel");
		LinearLayout content = new LinearLayout(this);
		content.addView(okButton);
		content.addView(cancelButton);
		setContentView(content);
		okButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				setResult(RESULT_OK);
				finish();
			}
		});
		cancelButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				setResult(RESULT_CANCELED);
				finish();
			}
		});
	}
}
