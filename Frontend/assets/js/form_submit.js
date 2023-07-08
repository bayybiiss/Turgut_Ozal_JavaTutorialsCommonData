//FORM SUBMIT

let form = document.querySelector('#projectForm')
form.addEventListener('submit', formSubmit)

let downloadButton = document.querySelector('#json');
downloadButton.addEventListener('click', downloadJSON);

function formSubmit (event){
    event.preventDefault()
    console.log("İşlem gerçekleşti")
    let formData = new FormData(form);
    let data = Object.fromEntries(formData);
    let jsonData = JSON.stringify(data);

    fetch('https://jsonplaceholder.typicode.com/posts',{
        method: 'POST',
        headers:{
            'Content-Type': 'application/json'
        },
        body: jsonData
    }).then(res => res.json())
    .then(result => console.log(result))
    .catch(err => console.log(err));


    // let nameInputDom = document.querySelector('#name1');
    // console.log(nameInputDom.value);
    // localStorage.setItem('name1', nameInputDom.value);
}


// JSON verisini indirme işlemi için fonksiyon tanımla
function downloadJSON() {
    let formData = new FormData(form);
    let data = Object.fromEntries(formData);
    let jsonData = JSON.stringify(data);
    

    let downloadData = encodeURIComponent(jsonData);
    let downloadLink = document.createElement('a');
    downloadLink.href = 'data:text/json;charset=utf-8,' + downloadData;
    downloadLink.download = `${data.projeAdi}.json`;
    downloadLink.style.display = 'none';
    document.body.appendChild(downloadLink);
    downloadLink.click();
    document.body.removeChild(downloadLink);
}
