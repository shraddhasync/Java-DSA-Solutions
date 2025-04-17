package strinngs;

public class shortestpath {
    public static float getshortestpath(String path){
        int x=0;
        int y=0;

        for(int i=0;i<path.length();i++){
            int dir=path.charAt(i);
            if(dir=='N'){
                y++;
            }
            else if(dir=='S'){
                y--;
            }
            else if(dir=='E'){
                x++;
            }
            else{
                x--;
            }

        }
        int X2=x*x;
        int Y2=y*y;
        return ((float)Math.sqrt(X2 + Y2));
    }
    public static void main(String[] args) {
        String path="WNEENESENNN";
        System.out.println(getshortestpath(path));
    }
    
}
