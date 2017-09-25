package com.youbanban.cordova.plugin;

import org.apache.cordova.*;
import org.json.*;
import android.content.Intent;

public class ActivityPlugin extends CordovaPlugin {

CallbackContext callbackContext;

@Override
public boolean execute(String action, JSONArray args, CallbackContext callbackContext) {
	if (action.equals("start")) {
		this.callbackContext = callbackContext;
		start();
		return true;
	}
	return false;
}

void start() {
	Intent intent = new Intent().setClass(cordova.getActivity(), Activity.class);
	this.cordova.startActivityForResult(this, intent, 0);
}

@Override
public void onActivityResult(int requestCode, int resultCode, Intent data) {
	PluginResult.Status status =
		resultCode == Activity.RESULT_OK ?
			PluginResult.Status.OK :
			PluginResult.Status.ERROR;
	PluginResult result = new PluginResult(status);
	callbackContext.sendPluginResult(result);
}

}
