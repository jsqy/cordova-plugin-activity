package com.youbanban.cordova.plugin;

import org.apache.cordova.*;
import org.json.*;
import android.content.Intent;

public class ActivityPlugin extends CordovaPlugin {

@Override
public boolean execute(String action, JSONArray args, CallbackContext callbackContext) {
	if (action.equals("start")) {
		start();
		return true;
	}
	return false;
}

void start() {
	Intent intent = new Intent().setClass(cordova.getActivity(), Activity.class);
	this.cordova.startActivityForResult(this, intent, 0);
}

}
