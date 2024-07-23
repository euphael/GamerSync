### 3.3.1 Processo 1 – Procurar times para jogar

Esse processo visa procurar times para jogar no aplicativo, apresentando uma ferramenta de busca, bem como um campo para filtrar times dos jogos aos quais o usuário poderá escolher. Além disso, o usuário pode escolher o nível de habilidade e as posições no mapa, caso o jogo as tenha.

<img width="900" alt="Diagramap1" src="https://github.com/ICEI-PUC-Minas-PPLES-TI/plf-es-2023-2-ti2-1381100-gamersync/assets/102549377/ce1f357e-bdae-41e5-99ce-4021410d2462">

#### Detalhamento das atividades

O procedimento descrito acima refere-se à busca de times para jogar em nossa plataforma. Esse processo envolve a interação entre o usuário e o sistema que estamos prestes a criar. Para encontrar um time, o usuário deve solicitar a busca e fornecer detalhes sobre suas preferências. Em seguida, o sistema entra em ação, realizando uma análise para garantir que o time esteja de acordo com as especificações antes de conectá-lo com o restante da comunidade de jogadores.

Os tipos de dados a serem utilizados são:

* **Área de texto** - campo texto de múltiplas linhas
* **Caixa de texto** - campo texto de uma linha
* **Número** - campo numérico
* **Imagem** - campo contendo uma imagem
* **Seleção única** - campo com várias opções de valores que são mutuamente exclusivos (tradicional radio button ou combobox)
* **Seleção múltipla** - campo com várias opções que podem ser selecionadas mutuamente (tradicional checkbox ou listbox)
* **Arquivo** - campo de upload de documento
* **Link** - campo que armazena uma URL
* **Tabela** - campo formado por uma matriz de valores

**Informar o jogo**

| **Campo**       | **Tipo**         | **Restrições** | **Valor default** |
| ---             | ---              | ---            | ---               |
| [Nome do campo] | [tipo de dados]  |                |                   |
| Seleção de game |  **Seleção única**         |                | League of legends |
| Estilo de jogo  | **Caixa de texto**   |                |                   |


| **Comandos**         |  **Destino**                   | **Tipo** |
| ---                  | ---                            | ---               |
| [Nome do botão/link] | Atividade/processo de destino  | (default/cancel/  ) |
| Prosseguir      | Prossegue para a prox página  | (default/cancel/  )          |



**Informar o nível de exp**

| **Campo**       | **Tipo**         | **Restrições** | **Valor default** |
| ---             | ---              | ---            | ---               |
| [Nome do campo] | [tipo de dados]  |                |                   |
| Seleção nível exp |  **Seleção única**      |                |                   |


| **Comandos**         |  **Destino**                   | **Tipo** |
| ---                  | ---                            | ---               |
| [Nome do botão/link] | Atividade/processo de destino  | (default/cancel/  ) |
| Pesquisar     | Pesquisa times dísponiveis | (search  )          |


**Informações adicionais**

| **Campo**       | **Tipo**         | **Restrições** | **Valor default** |
| ---             | ---              | ---            | ---               |
| [Nome do campo] | [tipo de dados]  |                |                   |
| Gênero          | **Seleção única**         |                | Prefiro não informar|
| Idioma          | select           |                | Português Pt-br   |
| Inf. adicionais | **Caixa de texto** |                | Não tenho.        |

| **Comandos**         |  **Destino**                   | **Tipo** |
| ---                  | ---                            | ---               |
| [Nome do botão/link] | Atividade/processo de destino  | (default/cancel/  ) |
| Pesquisar     | Pesquisa times dísponiveis | (search  )          |  |

**Escolher time**

| **Campo**       | **Tipo**         | **Restrições** | **Valor default** |
| ---             | ---              | ---            | ---               |
| [Nome do campo] | [tipo de dados]  |                |                   |
| Times         | **Seleção única**         |                |     |

| **Comandos**         |  **Destino**                   | **Tipo** |
| ---                  | ---                            | ---               |
| [Nome do botão/link] | Atividade/processo de destino  | (default/cancel/  ) |
| Confirmar escolha      | retorna para a tela principal com um aviso.  | (default/cancel/  )          |




