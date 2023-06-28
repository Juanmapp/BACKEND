window.addEventListener('load', function(){
    let listarTodos = 
    (function () {
        let url = '/odontologos';
        let payload = {
            method: 'GET'
        }
        fetch(url,payload)
        .then(response => response.json())
        .then(data => {
            console.log(data);
            for(odontologo of data) {
                console.log("hola2");
                let divOdontologos = document.querySelector('#odontologos-div')
                divOdontologos.innerHTML += `<p> ID : ${odontologo.id} </p>`
                console.log(odontologo.id);
            }
            
        })
    })
    
})