/**
    buscarEExibirPostagens:
        É uma função assíncrona que busca postagens de uma URL local (http://localhost:8080/postagem).
        Aguarda a resposta e a converte para um formato JSON.
        Captura o contêiner do feed no documento.

    Loop de processamento das postagens:
        Para cada postagem obtida, cria um elemento HTML div para representar a postagem.
        Estrutura interna do elemento:
            post_body: Contém os elementos de cabeçalho e rodapé da postagem.
            post_header: Inclui o título e informações do autor.
            post_footer: Inclui ícones para interações como repostar, curtir e comentar.
        O conteúdo da postagem é preenchido com os dados obtidos, como o ID e o conteúdo do post.

    Inclusão na interface:
        Cada postagem, após ser montada no elemento div, é anexada ao feed, permitindo que as postagens sejam exibidas na interface da página web.

    Tratamento de erros:
        Em caso de falha ao buscar as postagens, a função captura e exibe o erro no console.

    Evento DOMContentLoaded:
        Quando o documento é completamente carregado, a função buscarEExibirPostagens é acionada para exibir as postagens na página.
 */

        const url = "https://lame-truck-production.up.railway.app/postagem";


        async function buscarEExibirPostagens() {
            try {
                const respostaPostagens = await fetch('https://lame-truck-production.up.railway.app/postagem');
                const postagens = await respostaPostagens.json();
        
                const respostaUsuarios = await fetch("https://lame-truck-production.up.railway.app/friend");
                const usuarios = await respostaUsuarios.json();
        
                const feedPostsContainer = document.querySelector('.feedPostsContainer');
                const promises = [];
        
                // Limpar as postagens existentes
                feedPostsContainer.innerHTML = '';
        
                // Inverter a ordem das postagens para exibir as mais recentes primeiro
                for (let i = postagens.length - 1; i >= 0; i--) {
                    const postagem = postagens[i];
                    const usuarioAtual = usuarios[i % usuarios.length];
        
                    const elementoPostagem = document.createElement('div');
                    elementoPostagem.classList.add('post');
        
                    const postagemHTML = `
                <div class="post_avatar">
                    <img src="${usuarioAtual.avatar}" alt="${usuarioAtual.username}'s avatar"/>
                </div>
                <div class="post_body">
                    <div class="post_header">
                        <div class="post_headerText">
                            <h3>
                                ${usuarioAtual.username}
                                <span class="post_headerSpecial">@${usuarioAtual.username}</span>
                            </h3>
                        </div>
                        <div class="post_headerDescription">
                            <p>${postagem.conteudo}</p>
                        </div>
                    </div>
                    <div class="post_footer">
                        <span class="material-symbols-outlined">repeat</span>
                        <span class="material-symbols-outlined">mood</span>
                        <span class="material-symbols-outlined">arrow_downward</span>
                    </div>
                </div>
            `;
        
                    elementoPostagem.innerHTML = postagemHTML;
        
                    promises.push(new Promise((resolve) => {
                        feedPostsContainer.appendChild(elementoPostagem); // Adiciona as postagens ao contêiner
                        resolve();
                    }));
                }
        
                await Promise.all(promises);
            } catch (erro) {
                console.error('Erro ao buscar postagens:', erro);
            }
        }
        
        
        document.addEventListener('DOMContentLoaded', buscarEExibirPostagens);
        
        document.addEventListener('DOMContentLoaded', () => {
            buscarEExibirPostagens();
        
            const form = document.querySelector('.postBox form');
            form.addEventListener('submit', async (event) => {
                event.preventDefault(); // Impede o comportamento padrão do formulário de recarregar a página
        
                const input = document.querySelector('.postBox_input input');
                const conteudo = input.value.trim();
        
                if (conteudo !== '') {
                    try {
                        const response = await fetch('https://lame-truck-production.up.railway.app/postagem', {
                            method: 'POST',
                            headers: {
                                'Content-Type': 'application/json'
                            },
                            body: JSON.stringify({ conteudo }) // Envia o conteúdo para o backend em formato JSON
                        });
        
                        if (response.ok) {
                            // Se a postagem for criada com sucesso, atualiza as postagens exibidas
                            buscarEExibirPostagens();
                            input.value = ''; // Limpa o campo de entrada
                        } else {
                            console.error('Falha ao criar a postagem:', response.statusText);
                        }
                    } catch (erro) {
                        console.error('Erro ao enviar a postagem:', erro);
                    }
                }
            });
        });
        