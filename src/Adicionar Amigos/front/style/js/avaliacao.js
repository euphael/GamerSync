document.addEventListener('DOMContentLoaded', function() {
    const enviarBtn = document.getElementById('enviarBtn');

    enviarBtn.addEventListener('click', function(event) {
        event.preventDefault(); // Evita o envio padrão do formulário

        // Envia os dados para o backend
        enviarDados();
    });

    function enviarDados() {
        const containers = document.querySelectorAll('.container');
        const promises = [];
        
        containers.forEach(container => {
            const estrelasSelecionadas = container.querySelector('input[type="radio"]:checked');
            const estrelas = estrelasSelecionadas ? parseInt(estrelasSelecionadas.id.split('-')[2]) * 1.0 : 0.0;
            const comentario = container.querySelector('.textarea textarea').value;
    
            const avaliacao = {
                estrelas: estrelas,
                comentario: comentario
            };
    
            const promise = fetch('https://lame-truck-production.up.railway.app/avaliacao', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify(avaliacao)
            })
            .then(response => {
                if (!response.ok) {
                    throw new Error('Erro ao salvar avaliação');
                }
                console.log('Avaliação enviada com sucesso!');
            })
            .catch(error => {
                console.error('Erro:', error);
            });
    
            promises.push(promise);
        });
    
        // Aguarda todas as requisições serem completadas
        Promise.all(promises)
            .then(() => {
                console.log('Todas as avaliações foram enviadas com sucesso!');
            })
            .catch(error => {
                console.error('Erro ao enviar algumas avaliações:', error);
            });
    }
    
    
});
