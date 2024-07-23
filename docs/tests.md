## 7. Testes da solução

# Teste de Unidade


**Caso de Teste** | **CT01 - Adicionar Usuario**
 :--------------: | ------------
**Procedimento**  | Pesquisar por um usuário e adicionar à lista de amigos. |
**Dados de entrada** | Nome do usuário a ser adicionado. |
**Resultado obtido** | Envio de notificação para o usuário adicionado e retorno do estado do envio. |
**Teste unitário associado** | `AddUserTest.findFrind()` |

**Caso de Teste** | **CT02 - Adicionar Usuario ja existente na Lista de amigos**
 :--------------: | ------------
**Procedimento**  | Tentar adicionar um usuário que já está na lista de amigos.
**Dados de entrada** | Nome do usuário já presente na lista de amigos.
**Resultado obtido** | Receber mensagem de erro indicando que o usuário já está na lista. 
**Teste unitário associado** | `AddUserTest.tryToAddTheSameUserToFriend()` |

**Caso de Teste** | **CT03 - Postagem de Conteúdo na Timeline
 :--------------: | ------------
**Procedimento**  | Publicar novo conteúdo na timeline do usuário.
**Dados de entrada** | Conteúdo a ser publicado na postagem.
**Resultado obtido** | Sucesso na postagem do conteúdo na timeline.
**Teste unitário associado** | `PostagemTest.shouldPostContentToTimeline()` |

**Caso de Teste** | **CT04 - Adicionar Avaliação ao Usuário
 :--------------: | ------------
**Procedimento**  | 	Adicionar uma avaliação a um usuário.
**Dados de entrada** | 	Classificação de estrelas (entre 1 e 5) e comentário sobre a avaliação.
**Resultado obtido** | 	Inclusão bem-sucedida da avaliação no perfil do usuário.
**Teste unitário associado** | `AvaliacaoControllerTest.shouldCreateAvaliacao()` |

**Caso de Teste** | **CT05 - Procurar times
 :--------------: | ------------
**Procedimento**  | Pesquisar por times disponíveis.
**Dados de entrada** | Nome do jogo, nome do time e informações adicionais, se disponíveis.
**Resultado obtido** | Listagem dos times disponíveis ou indicar a impossibilidade de localizar times.
**Teste unitário associado** | `SearchTeams()` |


## Avaliação dos Testes de Unidade
Os resultados do teste forneceram insights valiosos sobre a solução, destacando tanto pontos fortes quanto áreas a serem aprimoradas. Um dos pontos positivos mais evidentes foi a consistência do desempenho durante o teste de adição de usuários. A apresentação adequada de mensagens e exceções, juntamente com a rápida resposta, reflete a eficácia da solução nesse aspecto.

Entretanto, o teste de adição de um usuário já presente na lista de amigos revelou uma fragilidade inicial na solução. Inicialmente, havia a possibilidade de execução dessa ação, o que poderia resultar em duplicidade de registros na lista de amigos. No entanto, com as correções implementadas, alcançamos aprimoramentos significativos. Agora, o sistema gera exceções apropriadas quando um usuário tenta adicionar alguém já presente na lista, evitando assim redundâncias indesejadas.

Para abordar esses pontos nas próximas iterações, o grupo planeja focar em otimizar ainda mais a usabilidade do sistema. Isso incluirá uma análise mais profunda da experiência do usuário durante a adição e correção de bugs relacionados à manipulação da lista de amigos. Além disso, será realizada uma revisão abrangente do código para identificar e corrigir potenciais áreas de melhoria no desempenho e na robustez da solução.

As falhas detectadas durante os testes servirão como guia para melhorias contínuas. O grupo está comprometido em manter um ciclo de feedback constante, incorporando sugestões e correções à medida que surgem. A transparência na comunicação e o envolvimento ativo dos membros do grupo são essenciais para garantir que cada iteração leve a solução a um estado mais refinado e confiável. Este processo iterativo visa não apenas corrigir as falhas identificadas, mas também aprimorar constantemente a solução em resposta às necessidades e expectativas dos usuários.

O teste de postagem verifica se o sistema permite que um usuário publique conteúdo na sua timeline com sucesso. Ele envolve inserir um conteúdo válido e verificar se esse conteúdo é corretamente adicionado à timeline do usuário sem erros, garantindo o funcionamento adequado da funcionalidade de postagem. Ele assegura que o sistema permite aos usuários publicar conteúdo em suas timelines sem erros, o que é uma funcionalidade fundamental.Validação de Integração: Verifica se a interação entre a interface do usuário e a lógica por trás da postagem está funcionando corretamente. Ajuda a manter a qualidade do sistema ao garantir que novas implementações ou mudanças no código não afetem negativamente a capacidade de postar na timeline. Testar essa funcionalidade é crucial para proporcionar uma boa experiência ao usuário, pois a capacidade de postar conteúdo é uma das principais interações em muitas plataformas online. Caso existam problemas na lógica de postagem ou na integração com outros componentes do sistema, o teste pode revelar essas falhas antes que afetem os usuários reais.

Os testes se concentram na funcionalidade de avaliação de usuários. Aqui estão os principais pontos: Garante que seja possível encontrar uma avaliação específica pelo seu ID. Verifica se é possível adicionar uma nova avaliação para um usuário, validando se a inserção é bem-sucedida. Certifica-se de que a atualização de uma avaliação existente é possível sem erros. Garante que a remoção de uma avaliação do sistema funcione corretamente. A validação dos dados de entrada também é importante para garantir que os valores de estrelas e comentários estejam dentro dos limites especificados e que os campos obrigatórios sejam fornecidos para uma avaliação.

Os testes da capacidade de pesquisar e interagir com times é um elemento fundamental para a experiência dos usuários no aplicativo. Permitir que os usuários busquem por times específicos, visualizem informações relevantes sobre eles e interajam de maneira intuitiva pode aprimorar significativamente a utilidade e o engajamento na plataforma. Testar a funcionalidade de pesquisa de times assegurará não apenas a facilidade de encontrar e se conectar com equipes desejadas, mas também garantirá uma experiência fluída e satisfatória ao explorar e participar de diferentes grupos ou comunidades dentro do aplicativo.

# Testes de Usabilidade

 - Ana

Ana é uma usuária frequente de aplicativos de compras online. Ela tem 35 anos e geralmente utiliza seu smartphone para realizar compras. O cenário de teste para Ana envolve a funcionalidade de adicionar itens ao carrinho de compras e concluir a compra. A ferramenta utilizada para medir o tempo de conclusão da tarefa foi um cronômetro, e a satisfação foi dada pela nota 3

- João

João é um estudante universitário de 22 anos, acostumado a utilizar aplicativos de organização e produtividade. O cenário de teste para João concentra-se na funcionalidade de criar e gerenciar tarefas. Ele foi solicitado a criar uma nova tarefa, atribuir uma data de conclusão e marcá-la como concluída. O tempo para conclusão da tarefa foi medido e a satisfação foi dada pela nota 4.

- Maria

Maria, com 45 anos, é uma profissional que utiliza aplicativos de gerenciamento financeiro. O cenário de teste para Maria envolve a funcionalidade de categorizar despesas e gerar um relatório mensal. O tempo para conclusão da tarefa foi registrado,e a satisfação foi dada pela nota 5. Maria também foi questionada sobre a facilidade de navegação durante o processo.

- Carlos

Carlos, de 28 anos, é um entusiasta de redes sociais. O cenário de teste para Carlos concentra-se na funcionalidade de postar e interagir com conteúdo. Ele foi solicitado a criar uma postagem, adicionar uma imagem e interagir com pelo menos dois outros posts. O tempo para conclusão da tarefa foi medido, e a satisfação foi dada pela nota 4.

- Raphael
  
Raphael, um jogador ávido de 30 anos, é apaixonado por jogos online e está sempre em busca de comunidades para interagir e competir em seu jogo favorito. No cenário de teste para Raphael, o foco está na funcionalidade de pesquisa e interação com times ou grupos dentro do aplicativo de jogos. Ele é solicitado a encontrar times relacionados ao seu jogo favorito, visualizar informações sobre esses grupos e interagir, seja solicitando participação ou se conectando de alguma forma. O tempo gasto para encontrar um time adequado e a satisfação com a facilidade de navegação serão registrados para avaliação. Satisfação nota 6.


## Cenários de Teste de Usabilidade

| Nº do Cenário | Descrição do cenário |
|---------------|----------------------|
| 1             | Você é uma pessoa querendo fazer postagens sobre o mundo dos games  |
| 2             | Voce quer adicionar outros usuários para jogarem juntos |
| 3             | Voce quer avaliar um jogador que jogou com voçê |
| 3             | Voce quer procurar times sobre seu jogo favorito |



## Registro de Testes de Usabilidade

Cenário 1: Você é uma pessoa querendo fazer postagens sobre o mundo dos games 

| Usuário | Taxa de sucesso | Satisfação subjetiva | Tempo para conclusão do cenário |
|---------|-----------------|----------------------|---------------------------------|
| 1       | SIM             | 5                    | 15.44 segundos                  |
| 2       | SIM             | 3                   | 40.3 segundos                  |
| 3       | SIM             | 2                    | 25.49 segundos                  |
|  |  |  |  |
| **Média**     | 100%           | 3,333                | 27.076 segundos                           |


    Comentários dos usuários: 
    - Achei bem tranquilo de criar meus posts e poder editar ou deletar eles
    - Gostei da ideia mas achei bem dificil de ler oq eu estava postando 
    - Boa ideia mas tive dificuldade de criar post e achei as cores do site bem fortes, cansando minha vista




Cenário 2: Voce quer adicionar outros usuários para jogarem juntos.

| Usuário | Taxa de sucesso | Satisfação subjetiva | Tempo para conclusão do cenário |
|---------|-----------------|----------------------|---------------------------------|
| 1       | SIM             | 4                    | 45.23 segundos                          |
| 2       | SIM             | 4                    | 43.65 segundos                          |
| 3       | SIM             | 4                    | 38.09 segundos                          |
|  |  |  |  |
| **Média**     | 100%           | 4              | 42.323333 segundos                           |


    Comentários dos usuários: 
     - Gostei da funcionalidade mas achei que demorou muito pra adicionar o usuario e tive que dar F5 para 
     poder ver os usuarios que eu adicionei 

Cenário 3: Voce quer avaliar os usuario que jogaram com voçê

| Usuário | Taxa de sucesso | Satisfação subjetiva | Tempo para conclusão do cenário |
|---------|-----------------|----------------------|---------------------------------|
| 1       | SIM             | 5                    | 55.10 segundos                           |
| 2       | SIM             | 4                    | 53.75 segundos                       |
| 3       | SIM             | 5                    | 49.30 segundos                        |
|  |  |  |  |
| **Média**     | 100%           | 4              | 52.38 segundos                          |

     Comentários dos usuários: 
     - Funcionalidade pratica facil e rapida

| Usuário | Taxa de sucesso | Satisfação subjetiva | Tempo para conclusão do cenário |
|---------|-----------------|----------------------|---------------------------------|
| 1       | SIM             | 4                    | 40 segundos                   |
| 2       | SIM             | 6                    | 41 segundos                       |
| 3       | SIM             | 5                    | 39 segundos                       |
|  |  |  |  |
| **Média**     | 100%           | 4              | 40 segundos                          |

## Avaliação dos Testes de Usabilidade


Os comentários dos usuários fornecem insights valiosos para possíveis melhorias. Algumas sugestões incluem:

**Melhor Legibilidade do Texto:**

    Avaliar o design para tornar o conteúdo postado mais legível.
    Considerar ajustes no tamanho da fonte, espaçamento e contraste para facilitar a leitura.

**Aprimoramento na Criação de Posts:**

    Simplificar o processo de criação de posts, tornando-o mais intuitivo e fácil de usar.
    Identificar pontos específicos que os usuários encontraram desafiadores e implementar soluções para tornar essa experiência mais fluída.

**Revisão das Cores do Site:**

    Realizar uma análise das cores utilizadas na interface do aplicativo.
    Considerar a modificação da paleta de cores para reduzir a fadiga visual e garantir melhor visibilidade.

**Otimização na Adição de Usuários:**

    Investigar o processo de adição de usuários para identificar possíveis gargalos.
    Implementar atualizações que permitam a adição de usuários sem a necessidade de recarregar a página, se possível.
