### 3.3.5 Processo 5 – VALIDAÇÃO DE CRIAÇÃO DE TIME


O processo de validação de criação de time em jogos online verifica critérios como número mínimo de jogadores e equilíbrio de habilidades para garantir partidas justas.

<img width="979" alt="Screenshot 2023-09-17 at 10 29 14 PM" src="https://github.com/ICEI-PUC-Minas-PPLES-TI/plf-es-2023-2-ti2-1381100-gamersync/assets/72320508/6d11b0bb-2088-4da7-88ce-424fb460d31b">






#### Detalhamento das atividades

A validação de criação de time em uma plataforma de jogos online desempenha um papel crucial para garantir que as partidas sejam justas e equilibradas. Durante esse processo, o sistema verifica automaticamente critérios como o número mínimo de jogadores, o equilíbrio de habilidades e as restrições de gênero e região. Se todas as condições forem atendidas, a validação é bem-sucedida, permitindo que os jogadores avancem e desfrutem de partidas competitivas. No entanto, se houver discrepâncias ou não conformidades, os jogadores podem ser orientados a fazer ajustes em sua equipe, como a busca por jogadores adicionais ou a correção de desequilíbrios. Esse processo garante uma experiência de jogo mais justa e satisfatória para todos os envolvidos.

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

**Informar o jogo e o nome do time**

| **Campo**       | **Tipo**         | **Restrições** | **Valor default** |
| ---             | ---              | ---            | ---               |
| [Nome do campo] | [tipo de dados]  |                |                   |
|Seleção de game  | Seleção única    |                | League of legends |
|Nome do Time     | Caixa de Texto   | formato de nome|                   |
| estilo de jogo  | Caixa de Texto   |                |                   |
|Seleção de idioma| Seleção única    |                |                   |

| **Comandos**         |  **Destino**                   | **Tipo** |
| ---                  | ---                            | ---               |
| [Nome do botão/link] | Atividade/processo de destino  | (default/cancel/  ) |
| Prosseguir      | Prossegue para a prox página  | (default/cancel/  )          |

**Definir critérios para avaliação dos candidatos**

| **Campo**       | **Tipo**         | **Restrições** | **Valor default** |
| ---             | ---              | ---            | ---               |
| [Nome do campo] | [tipo de dados]  |                |                   |
|Seleção de game  | Seleção única    |                | League of legends |
|Nome do Jogador    | Caixa de Texto   | formato de nome|                   |
|Seleção nível exp | Seleção única    |                |                   |
|Seleção de idioma| Seleção única    |                 |                 |

| **Comandos**         |  **Destino**                   | **Tipo** |
| ---                  | ---                            | ---               |
| [Nome do botão/link] | Atividade/processo de destino  | (default/cancel/  ) |
| Prosseguir      | Prossegue para a prox página  | (default/cancel/  )          |


