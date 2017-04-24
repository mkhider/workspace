$(document).ready(function () {

	// show section switch menu
	$('#sectionCategory').hide();
	$('#sectionUser').hide();
	$('#userMenu').click(function(){
		$('#sectionActor').hide();
		$('#sectionCategory').hide();
		$('#sectionUser').show();
	});
	$('#actorMenu').click(function(){
   		$('#sectionActor').show();
		$('#sectionCategory').hide();
		$('#sectionUser').hide();
	});
	$('#categoryMenu').click(function(){
		$('#sectionCategory').show();
		$('#sectionActor').hide();
		$('#sectionUser').hide();
		//load of datatable
		loadDatatableCategory();
		
	});
	
	//search user
    $("#search-form").submit(function (event) {

        //stop submit the form, we will post it manually.
        event.preventDefault();

        fire_ajax_submit();

    });

});

function fire_ajax_submit() {

    var search = {}
    search["username"] = $("#username").val();
    //search["email"] = $("#email").val();

    $("#btn-search").prop("disabled", true);

    $.ajax({
        type: "POST",
        contentType: "application/json",
        url: "/search/user",
        data: JSON.stringify(search),
        dataType: 'json',
        cache: false,
        timeout: 600000,
        success: function (data) {

            var json = "<h4>Ajax Response</h4><pre>"
                + JSON.stringify(data, null, 4) + "</pre>";
            $('#feedbackuser').html(json);

            console.log("SUCCESS : ", data);
            $("#btn-search").prop("disabled", false);

        },
        error: function (e) {

            var json = "<h4>Ajax Response</h4><pre>"
                + e.responseText + "</pre>";
            $('#feedbackuser').html(json);

            console.log("ERROR : ", e);
            $("#btn-search").prop("disabled", false);

        }
    });

}