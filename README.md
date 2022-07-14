Biblioteca

 🔨 Funcionalidades:

Cadastro de Autores:  Para cadastrar um autor, deve informar nome e biografia. Todos os campos são obrigatórios. Campo nome deve ter 100 caracteres e biografia 1000 caracteres.

Alteração de Autores pelo id: Para a alteração de um autor pelo seu id, é preciso informar obrigatoriamente seu id,podendo alterar seu nome e biografia. Porém ambos os campos devem estar preenchidos, mesmo que não alterados.

Listar todos os autores: Lista todos os autores cadastrados na API e suas informações. A lista deverá aparecer em ordem alfabética, contendo no máximo 5 autores por página.

Listar autor pelo id: É preciso informar obrigatoriamente seu id,o sistema irá retornar o autor e suas informações.

Listar todos os livros do autor pelo id: Para listar todos os livros de um determinado autor é preciso informar obrigatoriamente seu id. O sistema ira retornar todos os livros do autor indicado que estão cadastrados. A lista devera aparecer em ordem alfabética, contendo no máximo 5 livros do autor por página.

Cadastro de livros: Para cadastrar um livro na API, precisamos informar seu título, ano de lançamento e autor(es). O(s) autor(es) precisam estar previamente cadastrado no sistema. O título não pode ter mais que 200 caracteres. Todos os campos são obrigatórios.

Alteração de livros pelo id: É preciso informar obrigatoriamente seu id. Podendo alterar seu título, ano de lançamento e autor(es). Porém os campos devem estar preenchidos, mesmo que não alterados.

Excluir um livro pelo id: Para a exclusão, é preciso informar obrigatoriamente seu id. Resultando na exclusão do id solicitado.

Listar todos os livros: Lista todos os livros cadastrados na API e suas informações. A lista deverá aparecer em ordem alfabética, contendo no máximo 5 livros por página.

Listar livro pelo id: Para realizar a busca de um livro pelo seu id, é preciso informar obrigatoriamente seu id. O sistema irá retornar o livro indicado e suas informações.
                                                      																							
✔️ Técnicas e tecnologias utilizadas:

Java 17;
Spring Boot;
Hibernate;
MySql;
Swagger.																												
		                                            	
🛠️ Abrir e rodar o projeto:

Após baixar o projeto, você pode abrir com o Eclipse. Para isso, na tela incial da IDE no 'Project Explorer' clique com o botão direito e em import > import...

Selecione 'Existing Maven Projects' e next
Clique em 'Browse..' e procure o local onde o projeto está e o selecione (Caso o projeto seja baixado via zip, é necessário extraí-lo antes de procurá-lo)
Por fim clique em Finish
Também é necessário configurar a biblioteca Lombok na IDE
Utilize as configurações do arquivo application.properties para configurar o banco de dados
O Eclipse deve baixar algumas dependencias para configurar o projeto, aguarde até finalizar. Ao finalizar, você pode executar a aplicação  																		

📁 Acesso ao projeto:

Você pode acessar os arquivos do projeto clicando aqui(https://github.com/Danubia98/biblioteca/tree/main/Biblioteca/src)



  📚 Swagger:
  
Após rodar a aplicação você pode acessar a documentação swagger pela url:
http://localhost:8080/swagger-ui/index.html#/
																											
		                                               
																											
																											
																											
																											
																												
																												
