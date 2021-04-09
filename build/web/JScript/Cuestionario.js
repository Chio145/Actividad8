/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */window.addEventListener("load", function(){
    let inputName = document.querySelector("#input-nombre");
    let result = document.querySelector("#resultado");
    let button = document.querySelector("#boton");
    let save = document.querySelector("#salvar");
    
    
   button.disabled = true;
   let Inicio = () => {
       if(typeof(Storage) !== "undefined"){
           localStorage.setItem('Nombre', inputName.value);
           result.innerHTML = `<span>Bienvenido ${localStorage.Nombre}</span>`;

       } else{
           document.getElementById(result).innerHTML = "Nombre no registrado";
           }
   };
   save.addEventListener('click', function (){
       Inicio();
       button.disabled = false;
   });
 });
