Como jogar:
1 - Escolha uma das operações
2 - Responda todas as operações corretamente
antes do tempo acabar. (45 segundos)
3 - Vence ao acertar todas as questões (30 questoes)

---------------------------------------------------------------------
Mudanças                                                            |
---------------------------------------------------------------------
	Adicionado tecla de atalho enter para o botão "Confirmar";
	TextView bloqueada;

---------------------------------------------------------------------
Mini wiki do Jogo.                                                  |
---------------------------------------------------------------------
A classe BaseJogo:

   Atributos private int: nível, acertos, erros, num1, num2.
   Atributos private String: barra.

Métodos abstratos:
   
   public abstract boolean getResult(int n);
   public abstract void randomNum1();
   public abstract void randomNum2();
    
   Cada classe filha (Adicao, Subtracao, Multiplicacao) implementará esses métodos
   de acordo com as propriedades de cada operação (matemática).
   
   Pq randomNum1 e randomNum2 é um método abstrato e não um método concreto da
   classe BaseJogo: 
     A randomização possui uma formula Math.random() *  (Math.pow(10,super.getNivel())) + 1;
   essa formula é diferente para as operações de multiplicacao para que o jogo não fique tão
   dificil.

Métodos concretos:
   BaseJogo() = Responsável por zerar as variaveis.

   public void fimDeJogo() = Mostrar mensagem na tela se o jogador venceu ou ganhou
                             dada as condições de vitória/derrota.

   public String incrementaBarra() = Incrementar a String barra.
   
   public void sobeNivel() = aumenta o número de acertos e sobe o nível se atender às
                             condições.
   
   public String decrementaBarra() = diminui o tamanho da barra e chama o método sobeNivel().

   public int getNum1 e getNum2() = retorna os numeros randomicos criados na classes filhas.
  
   public void setNum1 e setNum2() = acesso aos atributos num1 e num2.

   public int getNivel() = acesso de leitura ao atributo nível.
   
   public int getAcertos() = acesso de leitura ao atributo acertos.

   public int getErros() = acesso de leitura ao atributo erros.

   public void setErros() = incrementar o numero de erros.


---------------------------------------------------------------------
A classe Adicao extends BaseJogo (filha de BaseJogo):               |
---------------------------------------------------------------------
	Não há atributos.

Métodos:
	public void randomNum1 e randomNum2() = Possui a formula de randomizacao (citada no tópico
		Métodos Abstratos na classe base jogo) dado o nível que o jogador está
		e modifica os atributos num1 e num2 da classe pai.

	public boolean getResult(int n) = Se o argumento for igual num1 + num2 deve-se retornar true.

---------------------------------------------------------------------
A classe Subtracao extends BaseJogo (filha de BaseJogo):            |
---------------------------------------------------------------------
	Não há atributos.

Métodos:
	public void randomNum1 e randomNum2() = Possui a formula de randomizacao (citada no tópico
		Métodos Abstratos na classe base jogo) dado o nível que o jogador está
		e modifica os atributos num1 e num2 da classe pai.

	public boolean getResult(int n) = Se o argumento for igual num1 - num2 deve-se retornar true.


---------------------------------------------------------------------
A classe Multiplicacao extends BaseJogo (filha de BaseJogo):        |
---------------------------------------------------------------------
	Não há atributos.

Métodos:
	public void randomNum1 e randomNum2() = Possui a formula de randomizacao diferente. E
		modifica os atributos num1 e num2 da classe pai. 
		Formula: Math.random() *  (10 * super.getNivel()) + 1;

	public boolean getResult(int n) = Se o argumento for igual num1 * num2 deve-se retornar true.
   	

---------------------------------------------------------------------
A classe Incrementa extends TimerTask (filha de TimerTask):         |
---------------------------------------------------------------------

Essa classe pode ser vista no Construtor Game(String op) da classe Game.java no pacote views.

Ela sobrescreve o método run() da classe pai TimerTask chamando os métodos incrementarBarra()
e fimDeJogo da classe abstrata BaseJogo.

Esse método run da classe incrementa é chamado a cada 1200 milisegundos pelo metodo timer.schedule()
e assim a barra é incrementada e é verificado se o jogador perde ou ganha.