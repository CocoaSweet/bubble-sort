package estruturaDeDados;


public class BubbleSort{
	public static void main(String[] args) {
		
		int vetor[] = {6,7,2,10,3,8,1,4,9,5};
		int vetorMelhorCaso[] = {1,2,3,4,5,6,7,8,9,10};
		int vetorPiorCaso[] = {10,9,8,7,6,5,4,3,2,1};
		
		System.out.println("Teste vetor padrão");
		bubbleSort(vetor);
		System.out.println("Vetor melhor caso");
		bubbleSort(vetorMelhorCaso);
		System.out.println("Vetor pior caso");
		bubbleSort(vetorPiorCaso);
		
	}
	

static void bubbleSort (int[] vetor){
int aux;
for(int i = 0; i < vetor.length; i++){
	System.out.printf("\nParte %d\n\n",(i+1));
	for(int h = 0; h < vetor.length; h++) {
		System.out.printf("\n%d.%d\n", (i+1),(h+1));
		verificaVetor(vetor);
		System.out.println();
		for(int j = 0; j < vetor.length-1; j++){
	     if (vetor[j] > vetor[j+1]){
	       aux = vetor[j];
	       vetor[j] = vetor[j+1];
	       vetor[j+1] = aux;
	      }
	    }
	}
	   
  }
 }

static void verificaVetor(int[] vetor){
	for(int i = 0; i < vetor.length; i++) {
		System.out.print(vetor[i] + " ");
	}
 }
}

