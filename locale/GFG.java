// Java program to get a specific character 
// from a given String at a specific index 

class GFG { 

	// Function to get the specific character 
	public static char
	getCharFromString(String str, int index) 
	{ 
		return str 
			// Convert String into IntStream 
			.chars() 

			// Convert IntStream into Stream<Character> 
			.mapToObj(ch -> (char)ch) 

			// Convert Stream<Character> into Character[] 
			// and get the element at the specific index 
			.toArray(Character[] ::new)[index]; 
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 
		// Get the String 
		String str = "GeeksForGeeks"; 

		// Get the index 
		int index = 5; 

		// Get the specific character 
		char ch = getCharFromString(str, index); 

		System.out.println("Character from " + str 
						+ " at index " + index 
						+ " is " + ch); 
	} 
} 
