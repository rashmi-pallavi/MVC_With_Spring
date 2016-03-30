/**
 * http://usejsdoc.org/
 */
var express = require('express');
var bodyParser = require('body-parser');

var app = express();

app.use(express.urlencoded());

app.get('/', function(req, res) {

	console.log("Got a GET request for the homepage");
	res.send('Hello GET');

});

app.get('/About', function(req, res) {

	res.sendfile('./views/Login.html');

});

app.post('/Login', function(req, res) {

	var user_name = req.body.username;
	var password = req.body.password;

	console.log("User Name : " + user_name + " , Password : " + password);
	res.end("done");

});

var server = app.listen(8086, function() {
	try {
		var host = server.address().address;
		var port = server.address().port;

		console.log("Example app listening at http://%s:%s", host, port);
	} catch (err) {
		console.log("Error");

	}
});