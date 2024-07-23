### 3.3.4 PROCESSO 4 - Adicionar Outros Usuários

Este processo tem como objetivo estabelecer conexões de amizade entre usuários, promovendo a construção de uma comunidade no universo dos games.

![image](https://github.com/ICEI-PUC-Minas-PPLES-TI/plf-es-2023-2-ti2-1381100-gamersync/assets/103153987/476f99b1-75f0-4c4a-aa93-dc2c23467754)

#### Detalhamento das Atividades

* **Buscar Outro Usuário:** </br>
  Nesta atividade, o usuário principal deve inserir o nome e o código pessoal do outro usuário que deseja encontrar.</br>
* **Adicionar como Amigo:** </br>
  Ao encontrar o usuário desejado, o usuário principal terá a opção de adicioná-lo como amigo.</br>
* **Mensagem:**</br>
  Após a adição, o outro usuário receberá uma notificação informando que o usuário principal deseja adicioná-lo como amigo.</br>
* **Gateway:**</br>
  O usuário que recebeu a notificação tem a opção de aceitar ou recusar a solicitação de amizade. Se aceitar, o usuário principal receberá uma MENSAGEM e será registrado no banco de dados como amigo do outro usuário, encerrando o processo.</br>
  Caso o usuário que recebeu a notificação recuse o pedido de amizade, o usuário principal será notificado e o processo será finalizado.

**Procurar Usuário**

| **Campo**       | **Tipo**         | **Restrições**          | **Valor Padrão** |
| --------------- | --------------- | ----------------------- | ---------------- |
| Buscar          | Caixa de Texto   | Deve possuir código pessoal | ---              |

| **Comandos**    |  **Destino**               | **Tipo**   |
| --------------- | -------------------------- | ---------- |
| Procurar        | Início do processo de adição| search     |


**Enviar Pedido de Amizade**

| **Campo**           | **Tipo**        | **Restrições** | **Valor Padrão** |
| ------------------- | --------------- | -------------- | ---------------- |
| Adicionar Usuário   | Seleção Única    | ---            | ---              |

| **Comandos**        |  **Destino**             | **Tipo**    |
| ------------------- | ------------------------ | ----------- |
| Botão               | Fim do processo de adição| padrão      |