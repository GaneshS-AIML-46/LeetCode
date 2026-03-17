class Solution {
    public int dayOfYear(String date) {
     String [] str=date.split("-");
     int ans=0;
     int y=Integer.parseInt(str[0]);
     int m=Integer.parseInt(str[1]);
     int d=Integer.parseInt(str[2]);
     int [] arr={31,28,31,30,31,30,31,31,30,31,30,31};
     if((y%4==0 && y%100!=0)||(y%400==0))
     {
       arr[1]=29;
     }
      for(int i=0;i<m-1;i++)
         ans+=arr[i];
   
       ans=ans+d;
        return ans;

    }
}