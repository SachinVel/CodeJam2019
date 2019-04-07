

package codeJam;
import java.util.Scanner;

public class Maze {
    static String mazeSolve(String input){
        StringBuffer output = new StringBuffer();
        for(int i=0 ; i<input.length() ; i++ ){
            if(input.charAt(i)=='E'){
                output.append('S');
            }else{
                output.append('E');
            }
        }
       return new String(output);
    }
    public static void main(String args[]){
        String input,output;
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        int dim;
        for(int i=1 ; i<=k ; i++ ){
            dim = s.nextInt();
            input = s.next();
            output = mazeSolve(input);
            System.out.println("Case #"+i+": "+output);    
        }
    }
}