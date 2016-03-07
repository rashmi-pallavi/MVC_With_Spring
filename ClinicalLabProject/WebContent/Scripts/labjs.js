 
/**
/**
 * 
 */
var dataList = document.getElementById('json-datalist');
var input = document.getElementById('ajaxList');

var request = new XMLHttpRequest();
request.onreadystatechange = function(response) {
  if (request.readyState === 4) {
    if (request.status === 200) {
       var jsonOptions = JSON.parse(request.responseText);
     jsonOptions.forEach(function(item) {
       var option = document.createElement('option');
        option.value = item.labcode;
        dataList.appendChild(option);
      });

    } else {
      input.placeholder = "Couldn't load datalist options";
    }
  }
};request.open('GET', 'json/labcode.json', true);
request.send(); 


