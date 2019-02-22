function validateMail() {
  var x = document.querySelector("#email").value;
  var pattern = /^\w+@[a-zA-Z_]+?\.[a-zA-Z]{2,3}$/;
  if (!x.match(pattern)) {
    var alert = document.querySelector("#mailerror");
    
    alert.innerHTML =  "Please enter a valid e-mail.";
    alert.style.color =  "red";
    
    if (x == "") {
        return alertNull("mailerror");
      }
  }
  else{
	  return true;
  } 
   
    return false;
}