### 3.3.3 Processo 3 – Publicar conteudo

Este processo visa promover uma comunicação mais efetiva entre os usuários do aplicativo e, ao mesmo tempo, assegurar a conformidade das postagens com as diretrizes estabelecidas pelo site, priorizando a segurança e a qualidade do conteúdo compartilhado.

![image](https://github.com/ICEI-PUC-Minas-PPLES-TI/plf-es-2023-2-ti2-1381100-gamersync/assets/125704966/6d7c2ef8-674b-4b4f-94fe-41d171ec38af)




#### Detalhamento das atividades

O procedimento descrito acima refere-se à publicação de conteúdo em nossa plataforma. Esse processo implica na interação entre o usuário e o sistema que estamos prestes a criar. Para realizar uma postagem, o usuário deve solicitar a inclusão de um texto e fornecer detalhes sobre o que deseja publicar. Em seguida, o sistema entra em ação, realizando uma análise para assegurar que o conteúdo esteja em conformidade com nossas diretrizes antes de compartilhá-lo com o restante da comunidade.

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
| Escrever conteudo| Caixa de Texto   | Maximo 2000 caracteres  |                |



| **Comandos**         |  **Destino**                   | **Tipo** |
| ---                  | ---                            | ---               |
| [Nome do botão/link] | Atividade/processo de destino  | (default/cancel/  ) |
| ***Exemplo:***       |                                |                   |
|Escrever conteudo     | Início do proceso de postagem  |                   |


**Nome da atividade 2**

| **Campo**       | **Tipo**         | **Restrições** | **Valor default** |
| ---             | ---              | ---            | ---               |
| [Nome do campo] | [tipo de dados]  |                |                   |
| Enviar postagem |  Seleção única   |                |                   |

| **Comandos**         |  **Destino**                   | **Tipo**          |
| ---                  | ---                            | ---               |
| [Nome do botão/link] | Atividade/processo de destino  | (default/cancel/  ) |
| Postar               |   Fim do processo de postagem  |                   |
| Cancelar             |   Cancela o processo  |                   |
