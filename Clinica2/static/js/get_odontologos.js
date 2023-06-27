window.addEventListener('load', function(){
    
    (function () {
        let url = '/odontologos';
        let payload = {
            method: 'GET'
        }
        fetch(url,payload)
        .then(response => response.json())
        .then(data => {
            console.log("hola1");
            for(odontologo of data) {
                let divOdontologos = document.querySelector('#odontologos-div')
                divOdontologos.innerHTML += `<p> ID : ${odontologo.id} </p>`
                console.log(odontologo.id);
            }
            
        })
    })
    console.log("hola");
})