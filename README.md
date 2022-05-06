<h2><strong>Calculadora de Anúncios</strong></h2>

<h3>:floppy_disk: <strong>prjCalculadora</strong></h3>


Esta calculadora de alcance de anúncios foi desenvolvida em Java e a partir da IDE Eclipse Ver. Oxygen.3a Release (4.7.3a). 
Recomenda-se que esta IDE seja o programa de execução da calculadora.

:arrow_down: [Download Eclipse IDE](https://www.eclipse.org/downloads/packages/release/oxygen/3a/eclipse-ide-java-developers)

Também é necessário possuir o JRE (Recomendado: Version 8 Update 291).

:arrow_down: [Download JRE](https://www.java.com/en/download/)

Uma vez que capgemini\src\capgeminiCalc\Calculadora for encontrado, basta abrir e executar.


<h3>:floppy_disk: <strong>prjInventarioDivulgaTudo</strong></h3>

Este sistema em duas camadas foi desenvolvido em Java (Apache NetBeans IDE 12.3) e MySQL (MySQL Workbench 8.0). 

Faça o download do WampServer (Versão compatível com o seu sistema operacional), instale-o e inicialize-o, selecionando “Start All Services” (Port 3306).

![image](https://user-images.githubusercontent.com/84102140/124397206-fb32d980-dce4-11eb-917e-b81a32eb2304.png)

*Start All Services no Wampserver 2.2*

:arrow_down: [Download WampServer](https://sourceforge.net/projects/wampserver/files/)

Em seguida, faça o download do MySQL Workbench 8.0.25, instale-o e execute o arquivo dbinfo (prjInventarioDivulgaTudo\dumps\dbinfo)

![image](https://user-images.githubusercontent.com/84102140/124397217-11409a00-dce5-11eb-8ba5-9d517c4d0a2b.png)

Em prjInventarioDivulgaTudo\src\br\com\divulgatudo\dal\ModuloConex.java, substitua "USUARIO" e "SENHA" de acordo com o seu Workbench

![image](https://user-images.githubusercontent.com/84102140/124398143-86fb3480-dcea-11eb-8120-896271ac3943.png)

:arrow_down: [Download MySQL Workbench 8.0.25](https://dev.mysql.com/downloads/workbench/)
 
Finalmente, faça o download e a instalação do Apache NetBeans IDE 12.3, em seguida abra o projeto prjInventarioDivulgaTudo. Caso <strong>rs2xml.jar</strong> e <strong>mysql-connector-java-8.0.25.jar</strong> não se encontrem dentro de Libraries, basta adicioná-las a partir de prjInventarioDivulgaTudo\lib

:arrow_down: [Download Apache NetBeans IDE](https://netbeans.apache.org/download/nb123/nb123.html)

Em seguida, execute o projeto, fazendo login com usuário Admin e senha admin.

<strong>Funcionalidades do programa</strong>

<strong>Tela de login</strong>

Confirma a conexão DAL e precede a tela principal do projeto.

![WhatsApp Image 2022-05-06 at 11 28 45](https://user-images.githubusercontent.com/84102140/167153825-c5ceb8b2-32b2-4490-b89d-f186ce303595.jpeg)

<strong>Tela de cadastro</strong>

Digite um código (exemplos do número 1 ao 5 disponíveis no sistema) e clique em consultar. Todas as funcionalidades estão disponíveis e possuem confirmação de operação bem sucedida – Incluir, consultar, modificar e excluir. 
 
![WhatsApp Image 2022-05-06 at 11 28 45](https://user-images.githubusercontent.com/84102140/167153737-8adc956d-afae-460c-9654-dfe7e9c0a1d6.jpeg)

<strong>Tela de relatório</strong>

Esta tela exibe em forma de tabela os itens cadastrados e também uma projeção dos valores solicitados a partir da calculadora. A função pesquisar é do tipo “enquanto for digitando” e busca pelo nome do cliente. Esta tela está incompleta.

![WhatsApp Image 2022-05-06 at 11 29 12](https://user-images.githubusercontent.com/84102140/167153873-1758eed8-c54f-4b10-87cc-edec5a978ca4.jpeg)

