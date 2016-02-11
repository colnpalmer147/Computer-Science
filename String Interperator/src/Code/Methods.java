package Code;

public class Methods {
	
	public Methods(){
	//	x2tem("1101",2);
		String input = "yellow";
		char letter1 = 'y';
		char letter2 = 'w';
		count_e(input);
		stringeditor(input);
		count_one_char(input, letter1);
		count_two_char(input, letter1, letter2);
	}
	
	public int count_two_char (String input, char letter1, char letter2){
		int counter1 = 0;
		int counter2 = 0;
		
		for(int i=0; i < input.length(); i++){
			if(input.charAt(i) == letter1){
				counter1 = counter1 + 1;
			}
		}
		
		for(int i=0; i < input.length(); i++){
			if(input.charAt(i) == letter2){
				counter2 = counter2 + 1;
			}
		}
		System.out.println("There is " + counter1 + " "+ letter1+ " and " + counter2 + " " + letter2 + " in " + input);
		return counter1 + counter2;
	}
		
	public int count_one_char (String input, char letter1){
		int counter = 0;
		
		for(int i=0; i < input.length(); i++){
			if(input.charAt(i) == letter1){
				counter = counter + 1;
			}
		}
		System.out.println("There is " + counter + " "+ letter1+ " in " + input);
		return counter;
	}
	
	public int count_e(String input){
		int counter = 0;
		
		for(int i=0; i < input.length(); i++){
			if(input.charAt(i) == 'e'){
				counter = counter + 1;
			}
		}
		System.out.println(counter + " e in " + input);
		return counter;
	}
	
	public String stringeditor(String input){
		String newinput = "";
		
		for (int i=0; i < input.length();i = i+2){
			newinput = newinput + input.charAt(i);
		}
		System.out.println(input + " => " + newinput);	
		return input;
	}
	/*
	public int x2tem (String input, int base){
		int length = input.length();
		int base10 = 0;
		
		for(int i = length; i <= length; i++){
			
			if (input.charAt(i) == 0){
				if (input.charAt(i) == 1){
					if(base <= 10){
						base10 = base10 + i ^ base;
					}
					if(base > 10){
						return 101;
					}
				}
			}
			else {
				return -1;
			}
		}
		System.out.println(base10);
		return base10;
	}*/
}