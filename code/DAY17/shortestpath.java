package DAY17;

public class shortestpath {
    public static float getshortestpath(String path){
        int x = 0 , y = 0 ;

        for(int i=0;i<path.length(); i++){
            char dir = path.charAt(i);//south
            if(dir == 'S'){
                y--;
            }
            //North
            else if(dir=='N'){
                y++;
            }
            //West
            else if(dir == 'W'){
                x--;
            }
            //EAST
            else{
                x++;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2 + Y2);
    }

    public static void main(String args[]){
        String path = "WESEEN";
        System.out.println(getshortestpath(path));
    }
    
}

//IN STRINGS THERE DIFFRENCE BETWEEN sring 1 and new string 1,
//== object level pe same hai kya it sees only this much 
//use this s1.equals(s2)
//first whn u creat s1 it will store in heap memory and next time whn u create smae it will store in stack memory but it wont creat in stacke it iwll just point to the heap memory 
//and in stack it never creats it just points to heap ,if run a loop then a then ab then abc then abcd so on it will be created in heap memory and stack will just point 
// it wont just take loop time n it wil take nxstring length timesso it will 26x26 becz its not jsut adding d bit full abcd
//mxn quadratic tc ,copying is werst we can change little little in al prog 
//so we go to string builder here it wont creat  