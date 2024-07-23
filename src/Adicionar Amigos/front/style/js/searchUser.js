document.getElementById("showProfile").addEventListener("click", function() {

  var profileContainer = document.getElementById("profile-container");

  if (profileContainer.style.display === "none" || profileContainer.style.display === "") {
    profileContainer.style.display = "block"; 
  } else {
    profileContainer.style.display = "none"; 
  }
});