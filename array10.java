public class array10 {
    public static int TrappingRainWater(int hight[]){
        int n = hight.length;
        // left max boundy -array
        int leftmax[] = new int[n];
        leftmax[0] =hight[0];
        for(int i =1; i<n; i++){
            leftmax[i] = Math.max(hight[i], leftmax[i-1]);
        }
        // right max boundry - array 
        int rightmax[] = new int[n];
        rightmax[n-1]=hight[n-1];
        for(int i = n-2; i>=0; i--){
            rightmax[i]=Math.max(hight[i], rightmax[i+1]);
        }

        //loop
        int trappedWater = 0;
    
        for(int i= 0; i<n; i++){
            //water level = min(left max ,right max)
            int WaterLevel = Math.min(leftmax[i],rightmax[i]);
            //trapping water = water level - hight
            trappedWater += WaterLevel-hight[i];

        }
        return trappedWater;
    }
    public static void main(String arg[]){
        int hight[] = {4,2,0,6,3,2,5};
        
        System.out.println(TrappingRainWater(hight));


    }
}
