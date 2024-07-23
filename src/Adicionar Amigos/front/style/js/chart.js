document.addEventListener("DOMContentLoaded", function () {
    // Dados para os gráficos (exemplos)
    var data1 = {
        labels: ["1° Trimestre", "2° Trimestre", "3° Trimestre", "4° Trimestre"],
        datasets: [{
            label: "Adição de amigos bem sucedidas",
            backgroundColor: "rgba(75,192,192,0.4)",
            borderColor: "rgba(75,192,192,1)",
            borderWidth: 2,
            data: [15, 38, 30, 12]
        }]
    };

    var data2 = {
        labels: ["1° Trimestre", "2° Trimestre", "3° Trimestre", "4° Trimestre"],
        datasets: [{
            label: "Times Criados",
            backgroundColor: "rgba(75,192,192,0.4)",
            borderColor: "rgba(75,192,192,1)",
            borderWidth: 2,
            data: [12, 12, 11, 23]
        }]
    };

    var data3 = {
        labels: ["1° Trimestre", "2° Trimestre", "3° Trimestre", "4° Trimestre"],
        datasets: [{
            label: "Taxa de Postagens no APP",
            backgroundColor: "rgba(75,192,192,0.4)",
            borderColor: "rgba(75,192,192,1)",
            borderWidth: 2,
            data: [6, 15, 17, 12]
        }]
    };

    // Configurações dos gráficos
    var options = {
        responsive: true,
        maintainAspectRatio: false,
        scales: {
            y: {
                beginAtZero: true
            }
        }
    };

    // Obtenha os contextos dos canvas
    var ctx1 = document.getElementById('chart1').getContext('2d');
    var ctx2 = document.getElementById('chart2').getContext('2d');
    var ctx3 = document.getElementById('chart3').getContext('2d');
    var ctx4 = document.getElementById('chart4').getContext('2d');

    // Crie os gráficos
    var chart1 = new Chart(ctx1, {
        type: 'doughnut',
        data: data1,
        options: options
    });

    var chart2 = new Chart(ctx2, {
        type: 'doughnut',
        data: data2,
        options: options
    });

    var chart3 = new Chart(ctx3, {
        type: 'doughnut',
        data: data3,
        options: options
    });


});
