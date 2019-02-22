function validatePassword() {
var x = document.querySelector("#password").value;
var pattern = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#\$%\^\&*\)\(+=._-])[0-9a-zA-Z!@#\$%\^\&*\)\(+=._-]{8,}$/;
if (!x.match(pattern)) {
  var alert = document.querySelector("#passworderror");
  alert.innerHTML =  "Password requires minimum 8 character," +
  		"1 Upper case letter and 1 special character(!#$%&()*+,-./:;<=>?@[\]^_`{|}~)";
  alert.style.color =  "red";
  if (x == "") {
      return alertNull("passworderror");
    }
}else  
	{
	  return true;
	} 
return false;
}