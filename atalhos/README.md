# Atalhos do Intellij Idea

Uma das formas de incrementar a produtividade em programação é a utilização de atalhos tanto do IDE ou Editor de código
pelo programador. Então, abaixo segue uma série de atalhos que facilitam a vida dos desenvolvedores Java que utilizam
o [IDE Intellij Idea Comunnity](https://www.jetbrains.com/idea/download/), que no caso é a versão gratuita da versão
Enterprise do mesmo software mantido pela empresa JetBrains.

## Navegação

 Atalho             |                                           Ação                                           
|:-------------------|:----------------------------------------------------------------------------------------:      
| Ctrl + 1           |                               Abre e fecha a aba "project"                               
| Alt + Insert       |                     (aba) - cria classe, interface, enum ou anotação                     
| Alt + Insert       | (dentro na classe) - generate - construtor, métodos getters e setters, equals e hashcode 
| Alt + ← →           |                               Seguir (alternar) entre as abas (tabs).                               
| Alt + Shift + X    |                               Fecha todas as abas (tabs).                                
| Ctrl + Shift + F12 |                                     Maximiza a tela.                                     
| Ctrl + Shift + S   |                           (settings) configurações do projeto.                           
| Ctrl + B           |   Inspeciona diretamente a implementação do construtor ou método selecionado, ou seja,   

já segue diretamente para a linha correspondente desta implemetação
| Alt + 1 | Alterna entre o Project (árvore do projeto) e o código.

## Pesquisas

 Atalho                |                                                    Ação                                                     
|:----------------------|:-----------------------------------------------------------------------------------------------------------:
| Ctrl + N              |                                            Pesquisa por classes                                             
| Ctrl + Shift + A      |                                Pesquisa por todos atalhos - **Find Action**                                 
| Ctrl + ,              |                                     Vai para o problem / error anterior                                     
| F4 na variável        |                                       Exibe a implementação da classe                                       
| Ctrl + K              | Procura pelo texto selecionado ou se nada estiver selecionado procura pela ultima pesquisa do Find dialog.  
| Ctrl + Shift + G	     |                           No editor java, pesquisa por referencias no workspace.                            
| Ctrl + W              | Seleciona o código por progressão, ou seja, a parte selecionada e depois expandido para todo o código java. 
| Ctrl + Shift + P      |            Seleciona o { ou } do seu codigo java. O cursor precisa estar entre as "{}" (Chaves).            
| Ctrl + P              |             (entre os { } ) do método - mostra qual parâmetros são válidos para aquele método.              
| Alt + F7 ou Ctrl + F7 |                            Encontrar usos de algum Artefato - Classe ou Método.                             
| Ctrl + F12            |                                 Encontrar usos de algum Método selecionado.                                 
| Ctrl + Shift + F7     |                                           Colore usos no arquivo                                            
| Ctrl + E              |                                  Navega pelo arquivo recentemente abertos                                   
| Ctrl + F              | Pesquisa por tudo dentro do projeto dentre arquivos, variáveis, classes e métodos  (__Search Everywhere__). 
| Shift+ Shift          |                        Pesquisa por textos contidos no arquivos (__Find in Path__).                         
| Ctrl + Alt + F7       |                                        Mostra todos usos no projeto                                         | 

## Execução de programas

 Atalho            |                                Ação                                 
|:------------------|:-------------------------------------------------------------------:
| Alt + Shift + F10 |   Executa uma classe pela primeira vez (construção da compilação)   
| Shift + F10       | Executa uma classe já tenha sido indexada (anteriormente executada) 

## Modo Debug (Depuração)

 Atalho    |                                   Ação                                   
|:----------|:------------------------------------------------------------------------:
| F11       |          Uma vez executado o modo Debug, sempre será executado.          
| F5        |                     Segue para dentro de um método.                      
| F6        |                            Executa uma linha.                            
| F7        |                            Retorna uma linha.                            
| F8	       | executar até o proximo breakpoint se houver, ou até o final da execução. 
| Ctrl + F2 |          Executa o projeto, depois que executado anteriormente.          

## Manipulando linhas

 Atalho               |                                    Ação                                     
|:---------------------|:---------------------------------------------------------------------------:
| Ctrl + Shift + ↑, ↓  | Move a linha ou seleção para cima ou para baixo somente no escopo da linha. 
| Alt + Shift + ↑, ↓   |      Move a linha ou seleção para cima ou para baixo em todo o código.      
| Alt + Shift + Insert |          Deixa o cursor no modo seleção em blocos ou por colunas.           
| Ctrl + D             |                         Duplica a linha ou seleção.                         

## Deleção de código (linhas)

 Atalho              |                   Ação                    
|:--------------------|:-----------------------------------------:
| Ctrl + Shift + DEL	 | Deleta a linha do lado direito do cursor. 
| Ctrl + DEL          |        Deleta o próximo elemento.         
| Ctrl + BACKSPACE    |        Deleta o elemento anterior.        
| Ctrl + y            |           Deleta linha inteira.           

## Manipulação de linhas

 Atalho                |                                         Ação                                          
|:----------------------|:-------------------------------------------------------------------------------------:
| Shift + Enter         | Adiciona uma linha em branco abaixo da linha atual e move o cursor para a nova linha. 
| Ctrl + Shift + Enter	 |                   Mesmo que o anterior, porém com efeito para cima.                   
| Ctrl + /	             |                            Comenta as linhas selecionadas.                            

## Classes e Objetos

 Atalho      |                                    Ação                                     
|:------------|:---------------------------------------------------------------------------:
| F5          |                        Faz uma cópia de uma classe.                         
| F6          |                       Move uma classe para um pacote.                       
| Alt + Enter | Sugestões inteligentes para criação de variáveis locais, testes de classes. 

## Refatoração

 Atalho                 |                     Ação                      
|:-----------------------|:---------------------------------------------:
| Ctrl + Alt + M         |                Extrair método                 
| Shift + F6             |        Move uma classe para um pacote.        
| Ctrl + Alt + L         | Formatação ou autoformatação rápida do código 
| Ctrl + Alt + Shift + T |   Refactor this - encapsulamento melhorado    

## Snippets ou Templates

 Atalho                                   |                                Ação                                 
|:-----------------------------------------|:-------------------------------------------------------------------:
| .var - depois de new classe()            |                      cria uma varíavel local.                       
| Ctrl + Alt + V - depois de new classe()  |                      Mesmo efeito (Variable).                       
| .field - depois de new classe()          |                  cria um campo (field) na classe.                   
| Ctrl + Alt + F - depois de new classe()  |                            Mesmo efeito.                            
| Ctrl + Alt + C - depois de new classe()  |                Torna uma variável em uma constante.                 
| Ctrl + Alt + T - depois de new classe()  | Deixa o código dentro de um escopo de condicional, laço ou exceção. 
| Ctrl + J - depois de um . de uma  classe | Deixa o código dentro de um escopo de condicional, laço ou exceção. 
