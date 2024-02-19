public class FilaEstatica {
  public Integer[] elementos;
  private Integer primeiro;
  private Integer ultimo;

  public FilaEstatica(int tamanho){
    this.elementos = new Integer[tamanho];
    this.primeiro = 0;
    this.ultimo = 0;

  }
  
  public void enqueue(Integer valor){
    if (isEmpty() || !isFull() ) {
      elementos[ultimo % elementos.length] = valor;
      ultimo++;
    }else {
      throw new IllegalStateException("Fila is Full");
    }
  }

  public boolean isFull(){
    return (ultimo - primeiro) == elementos.length;
  }

  public Integer dequeue(){
    if (isEmpty()) {
      System.out.println("A fila está vazia. Não é possível remover elementos.");
      return null; 
    } else {
      Integer valor = elementos[primeiro];
      elementos[primeiro] = null; 
      primeiro = (primeiro + 1) % elementos.length;
      return valor;
    }
  }

  public boolean isEmpty(){
    return this.primeiro == this.ultimo;
  }
}
