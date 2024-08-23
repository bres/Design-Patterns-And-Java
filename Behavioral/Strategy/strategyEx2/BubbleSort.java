package designPatterns.Behavioral.Strategy.strategyEx2;
public class BubbleSort implements SortInterface {
    public void sort(int[] list) {
        int temp; 
        for(int i = 0; i < list.length; i++) {
            for(int j = 0; j < list.length - 1; j++) { 
                if(list[i] < list[j]) {  
                    temp = list[i];      
                    list[i] = list[j];       
                    list[j] = temp;     
                }   
            }
        }
        
    }
} 