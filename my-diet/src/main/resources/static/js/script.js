$(document).ready(
		function(evt){
			initEvents();
			loadAliments();	
		}
);


function initEvents(){
	$('#saveAliment').bind('click',function(evt){ saveAliment(evt); });
}


function saveAliment(evt){
	evt.preventDefault();
	console.log('save');
			
	var cat = {
				
				'id':null,
				'name':'popo'
				
				,
				'dietComponents':
				[
					
					    {
							'name'			:	$('#name').val(),
							'description'	:	'Super description',
							'proteins'		:	$('#protein').val(),
							'glucids'		:	$('#glucids').val(),
							'lipids'		:	$('#lipids').val(),
							'ig'			:	$('#ig').val()
						}					
				]
	};
	
	console.log(cat);
	
	$.ajax({
        type: "POST",
        contentType: "application/json",
        url: "/category",
        data: JSON.stringify(cat),
        dataType: 'json',
        cache: false,
        timeout: 600000,
        success: function (data) {

            var json = "<h4>Ajax Response</h4><pre>"
                + JSON.stringify(data, null, 4) + "</pre>";
           
            console.log("SUCCESS : ", data);
           

        },
        error: function (e) {

            var json = "<h4>Ajax Response</h4><pre>"
                + e.responseText + "</pre>";
            $('#feedback').html(json);

            console.log("ERROR : ", e);
            $("#btn-search").prop("disabled", false);

        }
    });
	
	
	
	
}

function loadAliments(){

	 $.ajax({url: "/aliment", success: function(result){
	       
		 for(var i in result){
			 $("ul#list").append('<li>'+result[i].name+'</li>');
		 }
	    }});
	
}