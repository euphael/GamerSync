### 3.3.6 Processo 6 – Avaliar jogador

O sistema de avaliação de jogadores será um sistema simples e de fácil compreensão, no qual o usuário irá avaliar os jogadores com os quais jogou após as partidas. 

![image](https://github.com/ICEI-PUC-Minas-PPLES-TI/plf-es-2023-2-ti2-1381100-gamersync/assets/125704966/38ff371a-0ce2-4a59-9fef-b2772fa4f48b)



#### Detalhamento das atividades

Descreva aqui cada uma das propriedades das atividades do processo 6. 
Devem estar relacionadas com o modelo de processo apresentado anteriormente.

Os tipos de dados a serem utilizados são:

* **Área de texto** - campo texto de múltiplas linhas
* **Caixa de texto** - campo texto de uma linha
* **Número** - campo numérico
* **Data** - campo do tipo data (dd-mm-aaaa)
* **Hora** - campo do tipo hora (hh:mm:ss)
* **Data e Hora** - campo do tipo data e hora (dd-mm-aaaa, hh:mm:ss)
* **Imagem** - campo - contendo uma imagem
* **Seleção única** - campo com várias opções de valores que são mutuamente exclusivos (tradicional radio button ou combobox)
* **Seleção múltipla** - campo com várias opções que podem ser selecionadas mutuamente (tradicional checkbox ou listbox)
* **Arquivo** - campo de upload de documento
* **Link** - campo que armazena uma URL
* **Tabela** - campo formado por uma matriz de valores

**Nome da atividade 1**

| **Campo**       | **Tipo**         | **Restrições** | **Valor default** |
| ---             | ---              | ---            | ---               |
| [Nome do campo] | [tipo de dados]  |                |                   |
| ***Exemplo:***  |                  |                |                   |
| Avaliação por estrelas|Seleção multipla| Escolha de 1 a 5 |                |

| **Comandos**         |  **Destino**                   | **Tipo** |
| ---                  | ---                            | ---               |
| [Nome do botão/link] | Atividade/processo de destino  | (default/cancel/  ) |
| ***Exemplo:***       |                                |                   |
| Enviar             | Fim do Processo de avaliação por estrelas            | default           |



**Nome da atividade 2**

| **Campo**       | **Tipo**         | **Restrições** | **Valor default** |
| ---             | ---              | ---            | ---               |
| [Nome do campo] | [tipo de dados]  |                |                   |
| Avaliação por comentario| Caixa de texto |  Maximo 200 letras |                   |

| **Comandos**         |  **Destino**                   | **Tipo**          |
| ---                  | ---                            | ---               |
| [Nome do botão/link] | Atividade/processo de destino  | (default/cancel/  ) |
| Enviar               | Fim do processo de avalição por comentario |                   |
