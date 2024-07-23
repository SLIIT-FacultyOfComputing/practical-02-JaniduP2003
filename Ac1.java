import java.util.Scanner;


class ac1 {
    public static void main(String[] args) {
        
			Scanner sc =new Scanner(System.in);
			StringBuilder sb = new StringBuilder(); 
			
			System.out.printf("what is your first name :");
			
			String name1 =sc.nextLine();
			
			System.out.printf("what is your second name :");
			
			String name2 =sc.nextLine();
			
			
			System.out.printf("what is your last name :");
			
			String name3 =sc.nextLine();
			sc.nextLine();
			
			
			sb.append(name3);
			sb.append(" ");	
			sb.append(name1);
			sb.append(" ");				
			sb.append(name2);
			sb.append(" ");				
			
			String result = sb.toString();
			System.out.printf("your full name is %s\n\n",result);
			System.out.printf("Enter the second  full name:");
			
			String namefull =sc.nextLine();
			
			int comp =namefull.compareTo(result);
			
			if(comp == 0){
				System.out.printf("its the same name");
			} else {
				System.out.printf("its not the same name");
			}
    }
}
