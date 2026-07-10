class Solution {
    public double findMedianSortedArrays(int[] n1, int[] n2) {
        int size=n1.length+n2.length;
        int[] n=new int[size];
        int i=0;
        int j=0;
        int k=0;
        int length1=n1.length;
        int length2=n2.length;

        while(i<length1&&j<length2){
            if(n1[i]<=n2[j]){
                n[k]=n1[i];
                i++;
            }
            else{
                n[k]=n2[j];
                j++;
            }
            k++;
        }
        if(i!=n1.length){
            while(i!=n1.length){
                n[k]=n1[i];
                i++;
                k++;
            }
        }
        else
            {
                while(j!=n2.length){
                 n[k]=n2[j];
                j++;
                k++;
                }
            }
        
        if(size%2==0){
            int index1= size/2-1;
            int index2= size/2;
            double mid =(n[index1]+n[index2])/2.0;
            return mid;

        }
        else{
            int index=size/2;
            int mid=n[index];
            return mid;
        }


    

         
    }
}