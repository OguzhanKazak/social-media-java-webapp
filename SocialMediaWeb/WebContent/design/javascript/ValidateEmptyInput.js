function alertNull(textAreaId){
  var x = document.querySelector("#"+textAreaId);
  x.innerHTML = "You must fill here";
  x.style.color = "red";  
    return false;
}

