package hackerrank;

public class TrieNode {
	final static int ALPHABET_SIZE=26;
	
	public TrieNode []children = new TrieNode[ALPHABET_SIZE];
	public boolean isEndWord;
	public TrieNode() {
		isEndWord=false;
		for(int i=0;i<ALPHABET_SIZE;i++) {
			children[i]=null;			
		}
	}
	
}
