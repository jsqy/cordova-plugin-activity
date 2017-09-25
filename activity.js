exports.start = function (onsucceed, onerror) {
	cordova.exec(onsucceed, onerror, "Activity", "start", []);
};
