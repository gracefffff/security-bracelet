function checkParams() {
    var fio = $('#username').val();
    var surname = $('#surname').val();
    var phone = $('#pasport').val();
    var email = $('#email').val();
    var password = $('#password').val();
    var checkbox = document.getElementById("check");
    var gender = document.getElementById("gender");
    var gender1 = document.getElementById("gender1");


    if(fio.length != 0 && email.length != 0 && phone.length != 0 && password.length!=0 && surname!=0 && checkbox.checked && (gender1.checked || gender.checked) ){
        $('#submit').removeAttr('disabled');
    } else {
        $('#submit').attr('disabled', 'disabled');
    }
}