package designPatterns.Behavioral.Strategy.strategyEx2;

public class TestDrive { 
        public static void main(String[] args) {  
            int[] list = {1,2,7,3,1,0,10,14,12,16,17,21,19};
            SortingContext context = new SortingContext();
            context.setSorter(new BubbleSort());
            context.sortInt(list); 
            for(int i =0; i< list.length; i++) {
                System.out.print(list[i]+", ");
            }
        }
    }

