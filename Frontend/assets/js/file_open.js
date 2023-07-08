// let createButton = document.querySelector('#klasor');
// createButton.addEventListener('submit', createFolder);
// document.getElementById("projectForm").addEventListener("submit", createFolder);
//document.getElementById("projectForm").addEventListener("submit", createFolder);
$("#klasor").click(function(event) {
    event.preventDefault();

    var folderName = $("#projeAdi").val();

    $.ajax({
        type: "POST",
        url: "/folderController/createFolder",
        contentType: "application/json",
        data: JSON.stringify(folderName),
        success: function(response) {
            alert(response);
        }
    });
});




    function createTxtFiles() {
        let checkboxes = document.querySelectorAll('.form-check-input');
        let selectedNotes1 = [];
        let selectedNotes2 = [];
    
        checkboxes.forEach((checkbox) => {
            if (checkbox.checked) {
                let noteText = checkbox.nextElementSibling.textContent;
                if (checkbox.id === 'flexCheckChecked') {
                    selectedNotes1.push(noteText);
                } else if (checkbox.id === 'flexCheckChecked1') {
                    selectedNotes2.push(noteText);
                }
            }
        });
    
        let notesContent1 = selectedNotes1.join('\n');
        let notesContent2 = selectedNotes2.join('\n');
    
        // Dosya adlarını ve içeriklerini belirleyin
        const fileName1 = 'uyarilar.txt';
        const fileName2 = 'notlar.txt';
        const fileContent1 = notesContent1;
        const fileContent2 = notesContent2;
    
        // Dosyaları indirme işlemi
        downloadTxtFile(fileName1, fileContent1);
        downloadTxtFile(fileName2, fileContent2);
    }
    
    function downloadTxtFile(fileName, fileContent) {
        const element = document.createElement('a');
        element.setAttribute('href', 'data:text/plain;charset=utf-8,' + encodeURIComponent(fileContent));
        element.setAttribute('download', fileName);
        element.style.display = 'none';
        document.body.appendChild(element);
        element.click();
        document.body.removeChild(element);
    }

    
    
