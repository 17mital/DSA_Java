public class Buy_sellstock {
    public static int buyandsellstock(int prices[]){
        int bp=Integer.MAX_VALUE;
        int mp=0;
        int profit;
        for(int i=0; i<prices.length;i++){
            if(bp<prices[i]){
                profit=prices[i]-bp;
                mp=Math.max(mp,profit);
            }
            else{
                bp=prices[i];
            }
        }
        return mp;
    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        System.out.println("Maximum profit we get "+buyandsellstock(prices));

        

    }
    
}
