# Para Instalar

### Documentaçâo
Favor considerar a seguiente informaçao.

* Executar o arquivo inicio.sql, do banco de dados em MYSQL.
* Executar maven install, foi feito pelo IDE Intelli-J.
* Testar.

### Link Acceso
* Link para adicionar cliente. Methodo POST
  * http://localhost:9191/adicionarCliente
  ```sh
      {
         "mail":"xxx@gov.com.br",
         "cpf": "07294970158",
         "cep": "24350115",
         "nome": "Prova",
         "sobrenome": "Sinistra"
      }
  ```
* Link para consultar um cliente. Methodo GET.
  * http://localhost:9191/procurarClientePorMail/{mail}



Obrigado.


