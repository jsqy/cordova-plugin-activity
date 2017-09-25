exports.start = function () {
	cordova.exec(undefined, undefined, "Activity", "start", []);
};
