package Strings;
public class shortest_path {
    public static double shortpath(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char dir = path.charAt(i);
            if(dir =='N'){
                y++;
            }
            else if(dir =='S'){
                y--;
            }
            else if(dir =='E'){
                x++;
            }
            else{
                x--;
            }
        }
        double a=x*x;
        double b=y*y;
        double sum=a+b;
        double distance=Math.sqrt(sum);
        return distance;
    }
    public static void main(String[] args) {
        String path="WNEENESENNN";
        System.out.println(shortpath(path));

    }
    
}
