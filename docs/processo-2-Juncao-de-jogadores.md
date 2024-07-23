### 3.3.2 Processo 2 – JUNÇÃO DE JOGADORES 

Esse processo visa juntar os jogadores para a criação de times através de seus nicknames linkados ao de certo jogo, além da possibilidade do jogador já inserido ter a opção de convidar outro membro para este time. 
![image](https://github.com/ICEI-PUC-Minas-PPLES-TI/plf-es-2023-2-ti2-1381100-gamersync/assets/125492933/7213cc71-546c-4844-b39d-c48cd7f690e6)


#### Detalhamento das atividades

Descreva aqui cada uma das propriedades das atividades do processo 2. 
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

**Procurar Jogadores**

| **Campo**       | **Tipo**         | **Restrições** | **Valor default** |
| ---             | ---              | ---            | ---               |
| Search        | Caixa de Texto   |Possuir código pessoal |  ---              |

| **Comandos**         |  **Destino**                   | **Tipo** |
| ---                  | ---                            | ---               |
| Procurar               | Início do Processo de Junção de Jogadores             | search           |


**Aceitar convite para time**

| **Campo**       | **Tipo**         | **Restrições** | **Valor default** |
| ---             | ---              | ---            | ---               |
| Aceitar o convite |  Botão de Alternância  |  ---           |   ---                |

| **Comandos**         |  **Destino**                   | **Tipo**          |
| ---                  | ---                            | ---               |
| Button |  Fim do processo de aceitar convite | default |

