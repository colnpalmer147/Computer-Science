package Code;

public class Methods {
	private String _input = null;
	
	public Methods(){
		
	}
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
						
					}
				}
			}
			else {
				return -1;
			}
		}
		System.out.println(base10);
		return base10;
	}
}