# Atalhos do Intellij Idea

******************

Uma das formas de incrementar a produtividade em programação é a utilização de atalhos tanto do IDE ou Editor de código
pelo programador. Então, abaixo segue uma série de atalhos que facilitam a vida dos desenvolvedores Java que utilizam
o [IDE Intellij Idea Comunnity](https://www.jetbrains.com/idea/download/), que no caso é a versão gratuita da versão
Enterprise do mesmo software mantido pela empresa JetBrains.

## Navegação e comandos gerais
---

| Atalho                                                    |                                              Ação                                              |
|:----------------------------------------------------------|:----------------------------------------------------------------------------------------------:|
| Ctrl + 1                                                  | Abre e fecha a aba "project", ou seja, Alterna entre o Project (árvore do projeto) e o código. |
| Ctrl + Space                                              |                                      Autocompletar básico                                      |
| Ctrl + Q                                                  |                 Exibe informações ou documentação básica do item selecionado.                  |
| Ctrl + F1                                                 |                     Quando houver erro de compilação, exibe o *Quick Fix*.                     |
| Ctrl + Shift + Space                                      |                                   Autocompletar inteligente.                                   |
| Ctrl + Shift + Enter                                      |                      Move o curso para o início para o da linha de baixo.                      |
| Alt + Insert                                              |                 (aba) - **generate** cria classe, interface, enum ou anotação.                 |
| Alt + Insert                                              |  (dentro na classe) - **generate** - construtor, métodos getters e setters, equals e hashcode  |
| Alt + ← →                                                 |                            Seguir (alternar) entre as abas (tabs).                             |
| Alt + Shift + X                                           |                                  Fecha todas as abas (tabs).                                   |
| Ctrl + Shift + F12                                        |                                   Maximiza a tela do editor                                    |
| Ctrl + Shift + S                                          |               (settings) Abre caixa de diálogo para configurações gerais da IDE.               |
| Ctrl + Alt + Shift + S                                    |             (settings) Abre caixa de diálogo para configurações gerais do projeto.             |
| Ctrl + Alt + Y                                            |                                   Inicia modo sincronização                                    |
| Ctrl + B                                                  |          Inspeciona diretamente a implementação do construtor ou método selecionado.           |
| Ctrl + **- (Sinal de MENOS do teclado numérico)**         |                   Colapsar apenas o techo de código do **item selecionado**.                   |
| Ctrl + **+ (Sinal de MAIS do teclado numérico)**          |                   Colapsar apenas o techo de código do **item selecionado**.                   |
| Ctrl + Shift + **- (Sinal de MENOS do teclado numérico)** |              Colapsar tudo, ou seja, contrair a visualização o item selecionado.               |
| Ctrl + Shift + **+ (Sinal de MAIS do teclado numérico)**  |                Expadir tudo, ou seja, Exibir a visualização o item selecionado.                |

---

## Pesquisas e substituições de textos

---

| Atalho                           |                                                                         Ação                                                                         |                                                              
|:---------------------------------|:----------------------------------------------------------------------------------------------------------------------------------------------------:|
| Ctrl + N                         |                                                                 Pesquisa por classes                                                                 |                                                      
| Ctrl + Shift + A                 |                                                     Pesquisa por todos atalhos - **Find Action**                                                     |                                          
| Ctrl + ,                         |                                                         Vai para o problem / error anterior                                                          |                                               
| F4 na variável                   |                                                           Exibe a implementação da classe                                                            |                                                 
| Ctrl + K                         |                      Procura pelo texto selecionado ou se nada estiver selecionado procura pela ultima pesquisa do Find dialog.                      |           
| Ctrl + Shift + G                 |                                                No editor java, pesquisa por referencias no workspace.                                                |                                     
| Ctrl + W                         | Seleciona o código por progressão (_Extend Selection_), ou seja, a parte selecionada e depois expandindo do escopo mais interno para o mais externo. | 
| Ctrl + Shift + W                 |                                                          Faz a seleção inversa da anterior.                                                          | 
| Ctrl + Shift + P                 |                                Seleciona o { ou } do seu codigo java. O cursor precisa estar entre as "{}" (Chaves).                                 |                      
| Ctrl + P                         |              (entre os { } ) do método - mostra informações de parâmetros, ou seja, qual os parâmetros são válidos para aquele método.               |                       
| Alt + F7                         |             Mostra todas as ocorrências de uso daquela classe pelo projeto, incluindo em outros arquivos, métodos, imports e declarações             |                                      
| Ctrl + F12                       |                                                     Encontrar usos de algum Método selecionado.                                                      |                                           
| Ctrl + Shift + F7                |                                                               Colore usos no arquivo.                                                                |                                                     
| Ctrl + E                         |                                                 Exibe e/ou Navega pelo arquivo recentemente abertos                                                  |                                            
| Shift + Shift (**double shift**) |                                             Pesquisa por textos contidos no arquivos (__Find in Path__).                                             |                                  
| Ctrl + F                         |                                                    Pesquisa por um texto dentro no arquivo atual.                                                    |           
| Ctrl + Shift + F                 |                                        (**__Find in path__**) Pesquisa por um texto dentro de todo o projeto.                                        |           
| Ctrl + R                         |                                         (**Replace**) Substitui um texto por outro dentro no arquivo atual.                                          |           
| Ctrl + Shift + R                 |                                 (**Replace in path**) Substitui um texto localizado outro dentro de todo o projeto.                                  |           
| Ctrl + Alt + F7                  |                                                            Mostra todos usos no projeto.                                                             | 
| Alt + J                          |                            a cada vez pressionada, acrescente um novo cursor em **cada ocorrência** do item selecionado.                             | 
| Shift + Alt + J                  |                                                         Retira o cursor do item selecionado.                                                         | 
| Shift + Ctrl + Alt + J           |                                       Acrescente um novo cursor em **_todas_** ocorrência do item selecionado.                                       |

---

## Execução de programas

---

| Atalho            |                                Ação                                 |                                 
|:------------------|:-------------------------------------------------------------------:|
| Alt + Shift + F10 |   Executa uma classe pela primeira vez (construção da compilação)   |   
| Shift + F10       | Executa uma classe já tenha sido indexada (anteriormente executada) |

---

## Testando e debugando o projeto - Modo Debug (Depuração)

---

| Atalho            |                                         Ação                                         |                                         
|:------------------|:------------------------------------------------------------------------------------:|
| Shift + F5        |                               Rexecutar em modo Debug                                |                                
| F7                |              Step Into (Seguir para parte mais interna do breakpoint).               |               
| F8                | Step Over (executar até o proximo breakpoint se houver, ou até o final da execução). | 
| F9                |                          Continuar a execução do programa.                           |                           
| Shift + F7        |                                   Smart Step into                                    |                                       
| Shift + F8        |                                    Smart Step out                                    |                                       
| Shift + F9        |                                Executar em modo Debug                                |                                
| Ctrl + Shift + F8 |                               Ver todos os Breakpoints                               |

---

## Manipulando linhas

---

| Atalho               |                                         Ação                                          |                                     
|:---------------------|:-------------------------------------------------------------------------------------:|
| Ctrl + Shift + ↑, ↓  |      Move a linha ou seleção para cima ou para baixo somente no escopo da linha.      | 
| Alt + Shift + ↑, ↓   |           Move a linha ou seleção para cima ou para baixo em todo o código.           |      
| Alt + Shift + Insert |               Deixa o cursor no modo seleção em blocos ou por colunas.                |           
| Ctrl + D             |                              Duplica a linha ou seleção.                              |
| Ctrl + Shift + DEL   |                       Deleta a linha do lado direito do cursor.                       |
| Ctrl + DEL           |                              Deleta o próximo elemento.                               |         
| Ctrl + BACKSPACE     |                              Deleta o elemento anterior.                              |        
| Ctrl + y             |                                 Deleta linha inteira.                                 |
| Shift + Enter        | Adiciona uma linha em branco abaixo da linha atual e move o cursor para a nova linha. | 
| Ctrl + Shift + Enter |                   Mesmo que o anterior, porém com efeito para cima.                   |                   
| Ctrl + /             |                            Comenta as linhas selecionadas.                            |
| Ctrl + Shift + /     |          Comenta as linhas selecionadas com formatação de múltiplas linhas.           |
| Ctrl + O             |      Mostra os métodos que foram sobrescritos em relação ao método selecionado.       |

---

## Classes e Objetos

---

| Atalho             |                                           Ação                                            |                                     
|:-------------------|:-----------------------------------------------------------------------------------------:|
| F3                 |                     Encontra a próxima ocorrência do item selecionado                     |                         
| Shift + F3         |                    Encontra a ocorrência anterior do item selecionado                     |                         
| F5                 |                               Faz uma cópia de uma classe.                                |                         
| F6                 |                              Move uma classe para um pacote.                              |                       
| Alt + Enter        | Sugestões inteligentes, ou intenções para criação de variáveis locais, testes de classes. | 
| ctrl + shift + I   |       Inspeciona, ou seja, mostra detalhes de variáveis locais, testes de classes.        |
| Alt + ↑ ou Alt + ↓ |                   Move o cursor navegando de um escopo no mesmo arquivo                   |

---

## Refatoração

---

| Atalho                 |                         Ação                          |                      
|:-----------------------|:-----------------------------------------------------:|
| Ctrl + Alt + M         |                    Extrair método                     |                 
| Shift + F6             | Renomeia um item do projeto (classe, pacote, método). |        
| Ctrl + Alt + L         |     Formatação ou autoformatação rápida do código     | 
| Ctrl + Alt + O         |          Otimiza imports de outras classes.           | 
| Ctrl + Alt + Shift + T |       Refactor this - encapsulamento melhorado        |

---

# Snippets (Live Templates)
---

- Digite o atalho do snippet no editor Java do IntelliJ IDEA
- Pressione **Tab** ou **Enter** para expandir o template no código.
- Você pode personalizar ou criar seus próprios snippets em:  
  `File > Settings > Editor > Live Templates`

---

| Atalho    | Descrição                             | Exemplo gerado                                     |
|-----------|---------------------------------------|----------------------------------------------------|
| `psvm`    | Método main                           | `public static void main(String[] args) {}`        |
| `sout`    | Print linha                           | `System.out.println();`                            |
| `fori`    | Loop for padrão com índice            | `for (int i = 0; i < ; i++) {}`                    |
| `iter`    | Loop for-each (enhanced for)          | `for (Tipo var : array) {}`                        |
| `ifn`     | If null check                         | `if (obj == null) {}`                              |
| `inn`     | If not null                           | `if (obj != null) {}`                              |
| `else`    | Else statement                        | `else {}`                                          |
| `try`     | Try-catch block                       | `try { } catch(Exception e) { }`                   |
| `tryf`    | Try-finally                           | `try { } finally { }`                              |
| `tryc`    | Try-with-resources                    | `try (Resource res = ) { } catch(Exception e) { }` |
| `soutv`   | Print variável com nome               | `System.out.println("var = " + var);`              |
| `private` | Declaração rápida de private variable | `private Tipo nome;`                               |
| `pub`     | Declaração rápida de public method    | `public void nomeMetodo() {}`                      |
| `psf`     | Declaração rápida de static final     | `public static final Tipo NOME = ;`                |
| `enum`    | Declaração de enum                    | `enum Nome { }`                                    |
| `lambda`  | Expressão lambda                      | `(params) -> { }`                                  |
| `new`     | Criação rápida de objeto              | `new ClassName()`                                  |
| `anon`    | Classe anônima                        | `new Interface() {}`                               |
| `field`   | Gera campos com getter/setter         | Campos privados e seus getters/setters             |
| `todo`    | Comentário TODO                       | `// TODO: `                                        |
| `foreach` | Loop for-each (sinônimo de iter)      | `for (Tipo var : array) {}`                        |
| `switch`  | Estrutura switch                      | `switch(var) { case : break; default: }`           |
| `case`    | Caso em switch                        | `case : break;`                                    |
| `assert`  | Declaração assert                     | `assert condition;`                                |
| `sysout`  | Sinônimo para System.out.println      | `System.out.println();`                            |

---

## Outros exemplos (formas) de Snippets

---

| Atalho                                   |                                Ação                                 |                                 
|:-----------------------------------------|:-------------------------------------------------------------------:|
| Ctrl + J                                 |                             Lista os S                              |            
| .var - depois de new classe()            |                      cria uma varíavel local.                       |                       
| Ctrl + Alt + V - depois de new classe()  |                      Mesmo efeito (Variable).                       |                       
| .field - depois de new classe()          |                  cria um campo (field) na classe.                   |                   
| Ctrl + Alt + F - depois de new classe()  |                            Mesmo efeito.                            |                            
| Ctrl + Alt + C - depois de new classe()  |                Torna uma variável em uma constante.                 |                 
| Ctrl + Alt + T - depois de new classe()  | Deixa o código dentro de um escopo de condicional, laço ou exceção. | 
| Ctrl + J - depois de um . de uma  classe | Deixa o código dentro de um escopo de condicional, laço ou exceção. | 

---


