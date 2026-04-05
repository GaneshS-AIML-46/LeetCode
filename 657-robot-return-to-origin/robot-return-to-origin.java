class Solution {
    public boolean judgeCircle(String moves) {
       char []arr=moves.toCharArray();
        
        int x=0;
        int y=0;

        for(char ch:arr)
        {
            if(ch=='U')
            y++;

            else if(ch=='D')
            y--;
            else if(ch=='R')
            x++;
            else
            x--;

        }

        if(x==0 &&y==0)
        return true; 
        else 
        return false;

    }
}