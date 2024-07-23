
const urlParams = new URLSearchParams(window.location.search);
const value = urlParams.get('parametro');

const url = `https://lame-truck-production.up.railway.app/times/${value}`;


function show(Time) {
    let tab = `<thead>
   <th>ID</th>
   <th>Nome</th>
   <th>Status</th>
   <th>Ação</th>
   </thead>`;

    for (let Times of Time) {
        tab += `<tr>
    <td scope="row">${Times.idTimeDisp}</td>
    <td scope="row">${Times.nomeTime}</td>
    <td scope="row">${Times.statusTime}</td>
    <td scope="row"><button class="btn btn-primary" type="button" data-bs-toggle="offcanvas" data-bs-target="#offcanvasScrolling">Entrar</button></td> 
    </tr>`;
    } document.getElementById("tasks").innerHTML = tab;
}



async function getAPI(url) {
    const res = await fetch(url, { method: "GET" });
    var data = await res.json();
    console.log(data);
    if (res) {
        console.log("sucesso");
        show(data);
    } else {
        console.log("erro")
    }
}

getAPI(url);
