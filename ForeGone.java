

package codeJam;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class ForeGone {
    public static List<StringBuffer> divideNum(String num)
    {
        StringBuffer res1 = new StringBuffer();
        StringBuffer res2 = new StringBuffer();
        List<StringBuffer> result = new ArrayList<StringBuffer>();
        char  digit;
        for( int i=1 ; i<=num.length() ; i++ ){
            digit = num.charAt(num.length()-i);
            if( digit=='4' ){
                res1 = res1.append('2');
                res2 = res2.append('2');
            }else{
                res1 = res1.append(digit);
                res2 = res2.append('0');
            }
        }
        res1 = res1.reverse();
        res2 = res2.reverse();
        while(true){
            if(res2.charAt(0)=='0'){
                res2.deleteCharAt(0);
            }else{
                break;
            }
        }
        result.add(res1);
        result.add(res2);
        return result;
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int k;
        String temp;
        k = s.nextInt();
        List<StringBuffer> num = new ArrayList<StringBuffer>();
        for( int i=1 ; i<=k ; i++ ){
            temp = s.next();
            num = divideNum(temp);
            System.out.print("Case #"+i+": "+num.get(0)+" "+num.get(1));
        }
    }
}
