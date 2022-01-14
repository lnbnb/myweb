// =====================================侧边栏==============================================

function getAdminUser() {
  //点击user
  document.getElementById("body").innerHTML = "<p>bbbbbb</p>"
}

function mouseOverUserAdmin() {
  //user变颜色
  document.getElementById("userlable").style.backgroundColor = '#404040FF'
}

function mouseOutUserAdmin() {
  //user变颜色
  document.getElementById("userlable").style.backgroundColor = '#303030FF'
}

function getAdminCatagory() {
  //点击cata
  document.getElementById("body").innerHTML = "<p>ccccc</p>"
}

function mouseOverCatagoryAdmin() {
  //Catagory变颜色
  document.getElementById("catagorylable").style.backgroundColor = '#404040FF'
}

function mouseOutCatagoryAdmin() {
  //Catagory变颜色
  document.getElementById("catagorylable").style.backgroundColor = '#303030FF'
}

function getAdminOrder() {
  //点击order
  document.getElementById("body").innerHTML = "<p>cccc</p>"
}

function mouseOverOrderAdmin() {
  //order变颜色
  document.getElementById("orderlable").style.backgroundColor = '#404040FF'
}

function mouseOutOrderAdmin() {
  //order变颜色
  document.getElementById("orderlable").style.backgroundColor = '#303030FF'
}

// ==============================================用户管理==========================

function searchUserByName() {
  var userName = document.getElementById("username_input").value;
  const xhr = new XMLHttpRequest();
  xhttp.onload = function() {


  }
  xhr.open("POST", "localhost:8080/lnb/admin/user/searchbyname?username=" + userName)
  xhr.send();

}