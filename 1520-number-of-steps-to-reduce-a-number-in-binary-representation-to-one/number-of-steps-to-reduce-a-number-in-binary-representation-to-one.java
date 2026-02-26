
class Solution {
    public int numSteps(String s) {
    int step=0;
    int c=0;
    for(int i=s.length()-1;i>0;i--){
        int n=s.charAt(i)-'0';
        if(n+c==1){
            step=step+2;
            c=1;

        }
        else
        step=step+1;

    }
      return step+c;
    }
}



//     int c=0;
    //     int x=0;
        
    //    Long ans=Long.parseLong(s,2);
    //     while(ans>1)
    //     {
    //         if(ans%2==0){
    //         ans=ans/2;
    //         c++;
    //         }
    //         else if(ans%2!=0){
    //         ans=ans+1;
    //          c++;
    //         }
    //     }

        //System.out.println(ans);
       // return c;