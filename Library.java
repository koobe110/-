package com.imooc;
import java.util.Scanner;
import com.imooc.Books;
public class Library {
	public void searchType(Books[] books){
		//System.out.println("first");
		System.out.println("����1�����Ʋ��� 2����Ų���");
		try {	
			Scanner scanner = new Scanner(System.in);
			int bookname = scanner.nextInt();
			if (bookname == 1) {
				System.out.println("��������");
				searchByBookname(books);
			} else if(bookname == 2) {
				System.out.println("�������");
				searchByBooknumber(books);
			} else {
				System.out.println("�����������������");
				RuntimeException errorCommand = new RuntimeException("���������쳣");
				throw errorCommand;
		}
		}catch (Exception errorCommand) {
			System.out.println(errorCommand);
			//errorCommand.printStackTrace();
			searchType(books);
		}

		
	}
	public void searchByBookname(Books[] books){
		Scanner scanner = new Scanner(System.in);
		String bookname = scanner.next();
		try{
			for(int i=0; i<books.length; i++){//��forѭ������ ����ϵͳ���Ƿ���Ҫ���ͼ��
		         if((books[i].name).equals(bookname)){
		             System.out.println("book:"+books[i].num+books[i].name);
		             return;//�������ѭ����û�����׳�һ���쳣
		         }
		    }
			RuntimeException e = new RuntimeException("ͼ�����Ʋ�����");
			throw e;
		}
	    catch(Exception e){
//	    	e.printStackTrace();
	        System.out.println("ͼ�鲻���ڣ�����������");//�쳣����ʽ ��������ͼ��
	        searchByBookname(books);
	    }
		finally{
			scanner.close();
		}
	}
	
	public void searchByBooknumber(Books[] books){
		try{
			Scanner scanner = new Scanner(System.in);
			int booknum = scanner.nextInt();
			for(int i=0; i<books.length; i++){//��forѭ������ ����ϵͳ���Ƿ���Ҫ���ͼ��
		         if((books[i].num)==booknum){
		        	 System.out.println("book:"+books[i].num+books[i].name);
		             return;//�������ѭ����û�����׳�һ���쳣
		         }
		    }
			RuntimeException e = new RuntimeException("ͼ����Ų�����");
			throw e;
		}
	    catch(Exception e){
//	    	e.printStackTrace();
	        System.out.println("ͼ�鲻���ڣ�");//�쳣����ʽ ��������ͼ��
	        searchByBooknumber(books);
	    }
	}

}
