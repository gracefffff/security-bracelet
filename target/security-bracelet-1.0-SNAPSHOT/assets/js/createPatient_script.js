function checkParams() {

    var fname = $('#firstname').val();
    var lname = $('#lastname').val();
    var number = $('#number').val();
  ;


    if(fname.length != 0  && lname.length!=0 && number!=0 ){
        $('#submit').removeAttr('disabled');
    } else {
        $('#submit').attr('disabled', 'disabled');
    }
}