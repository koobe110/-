package com.imooc;
public class Initial {
//	static int abc;
//	static public Library niubiLibrary = new Library();
	public static void main(String[] args) {
		Library library = new Library();
		Books[] books = {new Books(1, "����"), new Books(2, "���ݽṹ")};
		library.searchType(books);
	}
}