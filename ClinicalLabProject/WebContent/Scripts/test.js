/**
 * 
 */


function testValues1(){

var request = new XMLHttpRequest();
var tcode = document.getElementById("tcode1");
var tname = document.getElementById("tname1");
var amt = document.getElementById("amt1");

request.onreadystatechange = function(response) {
  if (request.readyState === 4) {
    if (request.status === 200) {
       var jsonOptions = JSON.parse(request.responseText);
     jsonOptions.forEach(function(item) {
       if(item.tcode==tcode.value)
    	   {
    	   tname.value = item.tname;
    	   amt.value = item.amt;
    	   }
      });

    }
  }
}
request.open('GET', 'json/test.json', true);
request.send(); 
}

function addTest(){
	var table=document.getElementById("tab3");
	var row=table.insertRow(1);
	var cell1=row.insertCell(0);
	var cell2=row.insertCell(1);
	var cell3=row.insertCell(2);
	cell1.innerHTML="<input type='text'>";
	cell2.innerHTML="<input type='text'>";
	cell3.innerHTML="<input type='text'>";
} 

$("tcode1").click(testValues1());