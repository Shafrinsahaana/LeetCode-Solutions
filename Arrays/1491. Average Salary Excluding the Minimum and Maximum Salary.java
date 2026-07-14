class Solution {
    public double average(int[] salary) {
        double max=salary[0];
        double min=salary[0];
        int i;
        for(i=1;i<salary.length;i++){
            if(salary[i]>max){
                max=salary[i];
            }
        }
        for(i=1;i<salary.length;i++){
            if(salary[i]<min){
                min=salary[i];
            }
        }
        double average=0;
        int count=0;
        for(i=0;i<salary.length;i++){
            if(salary[i]<max &&salary[i]>min){
                average=average+salary[i];
                count++;
            }
        }
        double result=average/count;
        return result;
        
    }
}
