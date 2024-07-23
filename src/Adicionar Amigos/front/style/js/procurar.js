document.addEventListener('DOMContentLoaded', function() {
  const pesquisarBtn = document.getElementById('pesquisarBtn');
  const searchInput = document.getElementById('exampleInput');

  const checkbox = document.getElementById('exampleCheck1');
  const caixaTexto = document.getElementById('caixa-texto');

  checkbox.addEventListener('change', function() {
    if (this.checked) {
      caixaTexto.classList.remove('hidden');
    } else {
      caixaTexto.classList.add('hidden');
    }
  });

  pesquisarBtn.addEventListener('click', function(event) {
    event.preventDefault();

    const value = searchInput.value;
    const url = `mostrarTime.html?parametro=${value}`;

    window.location.href = url;
  });
});