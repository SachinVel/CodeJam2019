

package codeJam;
import java.util.*;
import java.lang.Math;
public class CryptoPangrams2 {
    static boolean isPrime(int num){
        if (num %2==0) 
        return false;
        int sqrt = (int) Math.sqrt(num);
        for (int i = 3; i<=sqrt ; i+=2) 
            if (num % i == 0) 
                return false;
        return true; 
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int len,i,count=0,t;
        t = s.nextInt();
        for( int k=1 ; k<=t ; k++ ){
            String unwanted = s.next();
            len = s.nextInt();
            int prod[] = new int[len];
            for( int ind=0 ; ind<len ; ind++)
                prod[ind] = s.nextInt();
            char result[] = new char[len+1];
            Character ch = 'A';
            boolean flag = false;
            if(prod[0]%2==0 && prod[1]!=0){
                result[0] = ch;
                flag=true;
            }
            for(i=0 ; i<len-1 ; i++){
                if(prod[i]%2==0 && prod[i+1]%2==0){
                    result[i+1] = ch;
                    flag=true;
                }
            }
            if(prod[i]%2==0 && prod[i-1]!=0){
                result[i+1] = ch;
                flag=true;

            }
            if( flag==true ){
                ch++;
                flag=false;
                count++;
            }
            for(int num=3 ; ch!='[' ; num+=2 ){
                if(isPrime(num)){
                    if(prod[0]%num==0 && prod[1]%num!=0){
                    result[0] = ch;
                    flag=true;
                    }
                    for(i=0 ; i<(len-1) ; i++){
                        if(prod[i]%num==0 && prod[i+1]%num==0){
                            result[i+1] = ch;
                            flag=true;
                        }
                    }
                    if(prod[i]%num==0 && prod[i-1]%num!=0){
                        result[i+1] = ch;
                        flag=true;
                    }
                    if( flag==true ){
                        ch++;
                        flag=false;
                    }
                }
            }
            System.out.print("Case #"+k+": ");
            for(i=0 ; i<len+1 ; i++)
                System.out.print(result[i]);
            System.out.printf(" \n");
            
        }
    }
}
