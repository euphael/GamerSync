const usersEndpoint = "https://lame-truck-production.up.railway.app/friend";

function hideLoader() {
  document.getElementById("loading").style.display = "none";
}

function show(users) {
  let tab = `<thead>
            <th scope="col"></th>
            <th scope="col">Name</th>
        </thead>`;

  for (let user of users) {
    tab += `
            <tr>
                <th scope="row"><img src="${user.avatar}" alt="avatar"/></th>
                <td>${user.username}</td>
            </tr>
        `;
  }

  document.getElementById("users").innerHTML = tab;
}

async function getAPI(endpoint) {
  try {
    const response = await fetch(endpoint, {
      method: "GET",
      headers: {
        "Content-Type": "application/json",
      },
    });

    if (!response.ok) {
      throw new Error(`HTTP error! Status: ${response.status}`);
    }

    const data = await response.json();
    console.log(data);
    hideLoader();
    show(data);
  } catch (error) {
    console.error("Error fetching data:", error.message);
  }
}

function searchUserProfile() {

  const searchTerm = document.getElementById('searchInput').value;

  const backendUrl = 'https://lame-truck-production.up.railway.app/user/username/' + searchTerm;

  fetch(backendUrl)
    .then(response => response.json())
    .then(data => {
      document.getElementById('userName').innerText = data.name;
      document.getElementById('userLanguage').innerText = data.language;
      document.getElementById('userAvatar').src = data.avatar;
    })
    .catch(error => console.error('Erro:', error));
}

function insertData() {

  var userName = document.getElementById('userName').innerText;
  var userAvatar = document.getElementById('userAvatar').src;
  if (window.Notification && Notification.permission === "granted") {
    const notification = new Notification("Pedido de amizade", {
      body: "Você recebeu um pedido de amizade. Aceitar?",
    });


    notification.onclick = function () {
      
      const resposta = confirm("Aceitar pedido de amizade?");
      if (resposta) {
  fetch('https://lame-truck-production.up.railway.app/friend', {
    method: 'POST',
    headers: {
      'Content-Type': 'application/json',
    },
    body: JSON.stringify({
      username: userName,
      avatar: userAvatar,
      online: true,
      playing: "Cs 2",
    }),
  })
  .then(response => {
    if (response.ok) {
      alert('Envio bem-sucedido');
    } else {
      alert('Erro no envio. Verifique o console para mais detalhes.');
      console.error(response.statusText);
    }
  })
  .catch(error => {
    alert('Erro na conexão. Verifique o console para mais detalhes.');
    console.error(error);
  });
        console.log("Pedido aceito!");
      } else {
        console.log("Pedido recusado!");
        return;
      }
    };
  } else if (window.Notification) {
   
    Notification.requestPermission().then(function (permission) {
      if (permission === "granted") {
        insertData();  
      }
    });
  }

}

getAPI(usersEndpoint);
