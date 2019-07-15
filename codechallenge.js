window.onload = function(){
   // document.getElementById("Miyazaki Movies").onclick=function(){
       sendAjaxGet('https://ghibliapi.herokuapp.com/films', movie)
};
//}
function sendAjaxGet(url,func){
    let xhr = new XMLHttpRequest() || new ActiveXObject("Microsoft.HTTPRequest");
    // step 2 
    xhr.onrleteadystatechange = function(){
     let data =JSON.parse(this.response)
        if (this.readyState == 4 && this.status== 200){
            data.forEach(movie =>{
                console.log(movie.title)
            })
        } else{
            console.log('error')
        }
    }
// step 3 
xhr.open("GET", url, true );

// step 4 
xhr.send();

}

   





   
//function showMovies (xhr){
  //  let movieObj= JSON.parse(xhr.responseText);
    //console.log(movieObj);
   // document.getElementById("My Neighbor Totoro").innerText;
    //document.getElementById("Naussica and the Valley of the Wind ").innerText;
    //document.getElementById("Howls Moving Castle").innerText;

