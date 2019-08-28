package challenges;

import java.util.Scanner;

/*

4
add hack
add hackerrank
find hac
find hak

*/

public class LSET_Trie_Contacts {
	
	public static TrieNode root;
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int n = scanner.nextInt();
		for (int nItr = 0; nItr < n; nItr++) {
            String[] opContact = scanner.nextLine().split(" ");

            String op = opContact[0];
            String contact = opContact[1];
            if(op.equals("add")) {
            	insert(contact);
            }
            else if(op.equals("find")) {
            	// int res=search(contact);
            }
            
        }

        scanner.close();
    }
	private static int search(String key) {
		// TODO Auto-generated method stub
		int total=0;
		int level; 
        int length = key.length(); 
        int index; 
        
        TrieNode temp_node = root; 
       
        for (level = 0; level < length; level++) { 
            index = key.charAt(level) - 'a';        
            if (temp_node.children[index]!= null) {
                
            }
            temp_node = temp_node.children[index];
        } 
       // return (temp_node != null && temp_node.isEndWord); 	
				
		return total;
				
	}
	public static void insert(String key) {
		// TODO Auto-generated method stub
		TrieNode temp=root;
		
		int level;
		int length=key.length();
		int index;
		for(level=0;level<length;level++) {
			index= key.charAt(level)-'a';
			if(temp.children[index]==null) {
				temp.children[index]= new TrieNode();				
			}
			temp=temp.children[index];			
		}
		temp.isEndWord=true;	
	}
}

