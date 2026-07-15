public class SelectionSortExamScores {
    public static void selectionSort(int[] scores){
        int n=scores.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++)
                if(scores[j]<scores[min]) min=j;
            int t=scores[i]; scores[i]=scores[min]; scores[min]=t;
        }
    }
    public static void main(String[] args){
        int[] scores={70,55,99,81,67};
        selectionSort(scores);
        for(int s:scores) System.out.print(s+" ");
    }
}