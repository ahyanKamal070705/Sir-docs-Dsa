public class sd23VisaOa {
    public static void main(String[] args) {
        //  [ [1,7] , [2,4] , [11,2] ]
        // representation is below for above

        int[][] arr = { 
            {1, 7}, 
            {5, 11}, 
            {7, 9}
        };

        int points [] = {7,1,5,10,9,15};

        int b []= new int[20];

        for(int i =0;i<arr.length;i++){
            int l = arr[i][0];
            int r = arr[i][1];

            b[l]=b[l]+1;
            if(r+1<arr.length){
                b[r+1]=b[r+1]-1;
            }
             
        }

        for(int i = 1;i<b.length;i++){
            b[i]=b[i]+b[i-1];
        }

        for(int i = 0;i<points.length;i++){
          int x =  points[i];
          points[i] = b[x];
        }

        
        for(int i =0;i<points.length;i++){
            System.out.print(points[i]+" ");
        }
        
    }
}
