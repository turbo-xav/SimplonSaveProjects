function findAll(){
	var httpRequest = new XMLHttpRequest();
	httpRequest.onreadystatechange = function(){ 
		document.getElementById('findAllResult').innerHTML=httpRequest.responseText;
	};
	httpRequest.open("GET", "/foo");
	httpRequest.send();
}

function findById(){
	var httpRequest = new XMLHttpRequest();
	httpRequest.onreadystatechange = function(){
		document.getElementById('findByIdResult').innerHTML=httpRequest.responseText;
	};
	httpRequest.open("GET", "/foo/1");
	httpRequest.send();
}

function save(){
	var httpRequest = new XMLHttpRequest();	
	
	var inputId 	= document.getElementById('id');		
	var id 			= (inputId.value != undefined)?inputId.value:null;
	
	var inputName 	= document.getElementById('name');		
	var name 		= (inputName.value != undefined)?inputName.value:null;
	
	var fooObj = {id:null, name:""};
	
	if(id){		
		httpRequest.open("PUT", "/foo");
		fooObj.id = id;
		
	}else{
		httpRequest.open("POST", "/foo");
	}
	
	fooObj.name = name;
	
	httpRequest.setRequestHeader("Content-Type", "application/json");
	httpRequest.send(JSON.stringify(fooObj));
	
}

function deleteById(){
	var httpRequest = new XMLHttpRequest();
	var inputDeleteID 	= document.getElementById('deleteId');		
	var deleteID 		= (inputDeleteID.value != undefined)?inputDeleteID.value:null;
	if(deleteId){
		httpRequest.open("DELETE", "/foos/"+deleteID);
		httpRequest.send();
	}
}



window.onload = function(){
	init();
	}


function init(){
	document.getElementById('findAll').onclick = findAll;
	document.getElementById('findById').onclick = findById;	
	document.getElementById('save').onclick = save;
	document.getElementById('delete').onclick = deleteById;
	initList();
}

function initList(){
	var httpRequest = new XMLHttpRequest();	
	httpRequest.open("GET", "/foo");
	httpRequest.onreadystatechange = function(){ 
		if(httpRequest.readyState == 4 && httpRequest.status == '200'){
			var jSonFoos = JSON.parse(httpRequest.responseText);
			var ul = document.getElementById('liste');	
			for(jSonfooIndex in jSonFoos){
				var li = document.createElement('li');
				var texte = document.createTextNode(jSonFoos[jSonfooIndex].id + ' : '+jSonFoos[jSonfooIndex].name);
				li.appendChild(texte);
				ul.appendChild(li);
			}
		}
	}
	httpRequest.send();
}
