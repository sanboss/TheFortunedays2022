import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static boolean next2IsAphabet(char a,char b) {
		if(a < b ) {
			return true;
		}
		return false;
	}
	public static boolean next3IsAphabetTail(char a,char b, char c){
		if(b <= c && !(a==b && a==c)) {
			return true;
		}
		return false;
	}
	public static boolean next3IsAphabet(char a,char b, char c) {
		if(a <= b && !(a==b && a==c)) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		List<String> listInput = new ArrayList<String>();
        
        Scanner inputCount = new Scanner(System.in);
		int dem = inputCount.nextInt();
		
		String input = inputCount.nextLine();
		
		for(int i =1; i <= dem; i++) {
			input = inputCount.nextLine();
			listInput.add(input);
		}
		int demCase =1;
		
		for(String list : listInput) {
			System.out.print("Case #" + demCase + ":");
			for ( int i = 0; i < list.length(); i++) {
				if(i < list.length() -1) {
					if(i < list.length() -2) {
						if(next3IsAphabet(list.charAt(i),list.charAt(i+1), list.charAt(i+2))) {
							System.out.print(list.charAt(i));
						}
					}else if(i>=2){
					    if(next3IsAphabetTail(list.charAt(i-1),list.charAt(i),list.charAt(i+1))) {
						System.out.print(list.charAt(i));
					    }
					}else{
					    if(next2IsAphabet(list.charAt(i),list.charAt(i+1))) {
						System.out.print(list.charAt(i));
					    }
					}
				}
				System.out.print(list.charAt(i));
			}
			System.out.println("");
			demCase++;
		}
	}
}
