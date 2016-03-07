/**
 * 
 */

function showValues(){

var request = new XMLHttpRequest();
var pcode = document.getElementById("pcode");
var pname = document.getElementById("pname");
var age = document.getElementById("age");
var hphone = document.getElementById("hphone");
var email = document.getElementById("email");


request.onreadystatechange = function(response) {
  if (request.readyState === 4) {
    if (request.status === 200) {
       var jsonOptions = JSON.parse(request.responseText);
     jsonOptions.forEach(function(item) {
       if(item.pcode==pcode.value)
    	   {
    	   pname.value = item.pname;
    	   age.value = item.age;
    	   hphone.value = item.hphone;
    	   email.value = item.email;
    	   }
      });

    }
  }
}
request.open('GET', 'json/patient.json', true);
request.send(); 
}

