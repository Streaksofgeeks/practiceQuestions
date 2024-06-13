/*First occurence of a vowel
 * Example: 
 * Input: Management
 * Output: a
*/
import java.util.*;
public class Question25 {
    

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int k = s.length();
		for(int i = 0; i<k; i++){
		    char ch = s.charAt(i);
		    if (ch == 'a'|| ch == 'A'){
		        System.out.println(ch);
		        break;
		        
		    } else if (ch == 'e'|| ch == 'E'){
		        System.out.println(ch);
		        break;
		        
		    }else if (ch == 'i'|| ch == 'I'){
		        System.out.println(ch);
		        break;
		        
		    }else if (ch == 'o'||ch == 'O'){
		        System.out.println(ch);
		        break;
		        
		    }else if (ch == 'u'|| ch== 'U'){
		        System.out.println(ch);
		        break;
		        
		    }
		}
	}
}

