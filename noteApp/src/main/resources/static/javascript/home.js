const cookieArr = document.cookie.split("=")
console.log(cookieArr);
const userId = cookieArr[1];

const submitForm = document.getElementById("note-form")
console.log("submit");
console.log(submitForm);
var noteContainer = document.getElementById("note-container")

const noteBody = document.getElementById('note-body')
const updateNoteBtn = document.getElementById('update-note-button')

const headers = { 'Content-Type': 'application/json'}
const baseUrl = "http://localhost:8080/api/v1/notes/"

console.log("user id is: " + userId);

function handleLogout(){
    let c = document.cookie.split(";");
    for(let i in c){
        document.cookie = /^[^=]+/.exec(c[i])[0]+"=;expires=Thu, 01 Jan 2023 00:00:00 GMT"
    }
}

const handleSubmit = async (e) => {
    e.preventDefault()
    let bodyObj = {
        body: document.getElementById("note-input").value
    }
    await addNote(bodyObj);
    document.getElementById("note-input").value = ''
}

async function addNote(obj){
    const response = await fetch(baseUrl + 'user/' + userId, {
        method : "POST",
        body: JSON.stringify(obj),
        headers: headers
    })
    .catch(err => console.error(err.message))
    if(response.status == 200){
        return getNotes(userId);
    }
}

async function getNotes(userId){
    await fetch(baseUrl + 'user/' + userId, {
        method : "GET",
        headers: headers
    })
    .then(response => response.json())
    .then(data => createNoteCards(data))
    .catch(err => console.error(err))
}

async function getNoteById(noteId){
    await fetch(baseUrl + noteId, {
        method : "GET",
        headers: headers
    })
    .then(response => response.json())
    .then(data => populateModal(data))
    .catch(err => console.error(err.message))
}

async function handleNoteEdit(noteId){
    let bodyObj = { id: noteId, body: noteBody.value}
    console.log(bodyObj);
    console.log
    await fetch(baseUrl, {
        method: "PUT",
        body: JSON.stringify(bodyObj),
        headers:headers
    })
    .catch(err => console.error(err))
    return getNotes(userId);
}

async function handleDelete(noteId){
    await fetch(baseUrl + noteId, {
        method: "DELETE",
        headers: headers
    })
    .catch(err => console.error(err))
    return getNotes(userId);
}

const createNoteCards = (array) => {
    console.log(array);
    noteContainer.innerHTML = ''
    array.forEach(object => {
        let noteCard = document.createElement("div")
        noteCard.classList.add("m-2")
        noteCard.innerHTML = `
        <div class = "card d-flex style  = "width: 18rem; height: 18rem;">
            <div class = "card-body d-flex flex-column justify-conten-between" style=height: available">
                <p class ="card-text">` + object.body + `</p>
                <div class = "d-flex justify-content-between">
                    <button class = "btn btn-danger" onclick= "handleDelete(`+ object.id +`)">Delete</button>
                    <button onclick = "getNoteById(`+ object.id +`)" type="button" class ="btn btn-primary" data-bs-toggle ="modal" data-bs-target="#note-edit-modal">Edit</button>
                </div>
            </div>
        </div>
        `
        noteContainer.append(noteCard);
    })

    console.log(noteContainer);
}

const populateModal = (obj) => {
    noteBody.innerText = ''
    noteBody.innerText = obj.body
    console.log(obj.body)
    updateNoteBtn.setAttribute('data-note-id', obj.id)
}

getNotes(userId);
submitForm.addEventListener("submit", handleSubmit)

updateNoteBtn.addEventListener("click",(e) => {
    let noteId = e.target.getAttribute('data-note-id')
    handleNoteEdit(noteId);
})


