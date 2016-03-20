package com.imooc;
public class Initial {
//	static int abc;
//	static public Library niubiLibrary = new Library();
	public static void main(String[] args) {
		Library library = new Library();
		Books[] books = {new Books(1, "高数"), new Books(2, "数据结构")};
		library.searchType(books);
	}
}