package com.imooc;
import java.util.Scanner;
import com.imooc.Books;
public class Library {
	public void searchType(Books[] books){
		//System.out.println("first");
		System.out.println("输入1按名称查找 2按序号查找");
		try {	
			Scanner scanner = new Scanner(System.in);
			int bookname = scanner.nextInt();
			if (bookname == 1) {
				System.out.println("输入名称");
				searchByBookname(books);
			} else if(bookname == 2) {
				System.out.println("输入序号");
				searchByBooknumber(books);
			} else {
				System.out.println("输入错误请重新输入");
				RuntimeException errorCommand = new RuntimeException("错误命令异常");
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
			for(int i=0; i<books.length; i++){//用for循环遍历 搜索系统中是否有要借的图书
		         if((books[i].name).equals(bookname)){
		             System.out.println("book:"+books[i].num+books[i].name);
		             return;//有则结束循环，没有则抛出一个异常
		         }
		    }
			RuntimeException e = new RuntimeException("图书名称不存在");
			throw e;
		}
	    catch(Exception e){
//	    	e.printStackTrace();
	        System.out.println("图书不存在！请重新输入");//异常处理方式 重新输入图书
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
			for(int i=0; i<books.length; i++){//用for循环遍历 搜索系统中是否有要借的图书
		         if((books[i].num)==booknum){
		        	 System.out.println("book:"+books[i].num+books[i].name);
		             return;//有则结束循环，没有则抛出一个异常
		         }
		    }
			RuntimeException e = new RuntimeException("图书序号不存在");
			throw e;
		}
	    catch(Exception e){
//	    	e.printStackTrace();
	        System.out.println("图书不存在！");//异常处理方式 重新输入图书
	        searchByBooknumber(books);
	    }
	}

}
