package rearray;

public class ijkfactorial {
    public static int afac(int a){

        
        if(a<0){
            a=a*-1;
        }
        int factorial=1;
        for(int h=1;h<=a;h++){
           factorial=factorial*h;
        }
        return factorial;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};

        for(int i=0;i<arr.length;i++){
            int ifactorial=afac(arr[i]);
            
            for(int j=0;j<arr.length;j++){
                if(arr[j]!=arr[i]){
                    int jfactorial=afac(arr[j]);

                for(int k=0;k<arr.length;k++){
                    if(arr[k]!=arr[i] & arr[k]!=arr[j]){
                        
                        if(ifactorial==arr[j] & ifactorial==arr[k] & jfactorial==arr[k]){
                            System.out.println("*");
                            int sum=arr[i]+arr[j]+arr[k];
                            if(sum==0){
                                System.out.println("["+arr[i]+","+arr[j]+","+arr[k]+"]");
                            }
    
                        }
                    }
                    

                }
                }
            }
        }
    
}
}
