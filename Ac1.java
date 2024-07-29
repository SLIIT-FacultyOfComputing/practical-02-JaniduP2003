import java.util.Scanner;

class Ac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        // Part 1: String Concatenation
        System.out.print("Enter your first name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter your middle name: ");
        String middleName = sc.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = sc.nextLine();

        
            sb.append(lastName);
			sb.append(" ");	
			sb.append(firstName);
			sb.append(" ");				
			sb.append(middleName);
			sb.append(" ");				
			
			String fullName = sb.toString();
			System.out.printf("your full name is %s\n\n",fullName);
			 

        // Part 2: String Comparison
        System.out.print("Enter another full name: ");
        String anotherFullName = sc.nextLine();

        int comp =anotherFullName.compareTo(fullName);
			
			if(comp == 0){
				System.out.printf("its the same name\n");
			} else {
				System.out.printf("its not the same name\n");
			}

       /*  if (fullName.equalsIgnoreCase(anotherFullName)) {
            System.out.println("The names are the same.");
        } else {
            System.out.println("The names are different.");
        } */

        // Part 3: String Modification
        
        String modifiedFullName = fullName.replace('a', '@').replace('e', '3');
        modifiedFullName = modifiedFullName.toUpperCase();
        System.out.println("Modified Full Name: " + modifiedFullName);

        // Part 4: String Splitting
        
        String[] nameParts = fullName.split(",\\s*|\\s+"); //split and add to name parts
        System.out.println("Last Name: " + nameParts[0]);
        System.out.println("First Name: " + nameParts[1]);
        if (nameParts.length > 2) {
            System.out.println("Middle Name: " + nameParts[2]);
        }

        // Part 5: String Trimming
        System.out.print("Enter a string with leading and trailing spaces: ");
        String stringWithSpaces = sc.nextLine();
        // Trim the spaces from the string
        String trimmedString = stringWithSpaces.trim();
        System.out.println("Trimmed String: " + trimmedString);

        // Part 6: vovl count
        int vowelCount = 0;
        for (char c : fullName.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelCount++;
            }
        }
        System.out.println("Number of vowels in the full name: " + vowelCount);

        
        sc.close();
    }
}
