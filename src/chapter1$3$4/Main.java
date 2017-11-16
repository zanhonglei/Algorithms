package chapter1$3$4;

public class Main {
	public static void main(String[] args) {
		String str = "[{()(}())]";
		Main m = new Main();
		System.out.println(m.check(str));
	}
	public boolean check(String str) {
		MyStack<Character> s = new MyStack<>();
		char[] charArray = str.trim().toCharArray();
		int len = charArray.length;
		if(len%2!=0) {
			return false;
		}
		for(int i = 0;i<len;i++) {
			if(charArray[i] == ')') {
				if(!s.pop().equals('(')) {
					 return false;
				}
			}else if(charArray[i] == '}'){
				if(!s.pop().equals('{')) {
					  return false;
				}
				
			}else if(charArray[i] == ']') {
				if(!s.pop().equals('[')) {
					return false;
				}
			}else if(charArray[i] == ' ') {
				return false;
			}else {
				s.push(charArray[i]);
			}
		}
		return true;
	}
}
