/**
 * 
 */

function dshowValues(){

var request = new XMLHttpRequest();
var dcode = document.getElementById("dcode");
var dname = document.getElementById("dname");

request.onreadystatechange = function(response) {
  if (request.readyState === 4) {
    if (request.status === 200) {
       var jsonOptions = JSON.parse(request.responseText);
     jsonOptions.forEach(function(item) {
       if(item.dcode==dcode.value)
    	   {
    	   dname.value = item.dname;
    	 
    	   }
      });

    }
  }
}
request.open('GET', 'json/doctor.json', true);
request.send(); 
}