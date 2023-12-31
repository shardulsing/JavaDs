package Trie;

public class TrieClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trie trie = new Trie();
		trie.addWord("arts");
		trie.addWord("art");
		trie.addWord("bug");
		trie.addWord("boy");
		trie.addWord("se");
		trie.addWord("seen");
		trie.addWord("see");
		trie.addWord("amit");
		trie.display();
		System.out.println(trie.numWords());
//		System.out.println(trie.search("art"));
//		System.out.println(trie.search("arts"));
//		System.out.println(trie.search("arpit"));
		
		System.out.println("******************************");
		trie.remove("arts");
		trie.remove("art");
		trie.display();
		
		System.out.println(trie.numWords());
		

	}

}
