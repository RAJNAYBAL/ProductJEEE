package MapProject2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ProdInfo {

	Scanner sc=new Scanner(System.in);


	public Map<String, List<Products>> insert()
	{
		int ch;
		int c;
			List<Products> list1=new LinkedList<Products>();
			List<Products> list2=new LinkedList<Products>();
     		List<Products> list3=new LinkedList<Products>();
		Products p1 = null;
		Products p2=null;
		Products p3=null;
		do {
			System.out.println("What Do You Want Choose the Option");
			System.out.println("\n 1 : Laptop  \n 2 Books \n 3 Mobile");
			c=sc.nextInt();

			//	p1=new LinkedList<Products>();
			switch(c)
			{
			case 1:
				do {
				System.out.println("Enter the Laptop ID");
				int lid=sc.nextInt();
				System.out.println("Enter the Laptop Name");
				String lnm=sc.next();
				System.out.println("Enter the Laptop Price");
				Double lprice=sc.nextDouble();
				//	p1.add(new Products(lid, lnm, lprice));
				p1 =new Products(lid, lnm, lprice);
				list1.add(new Products(lid, lnm, lprice));
				
				System.out.println("Add More Laptoph  press 1 otherwise 0");
				ch=sc.nextInt();
			}while(ch==1);
//				for(Products l:list1) {
//					System.out.println(l.getId()+"\t"+l.getProdNm()+"\t"+l.getProdPrice());
//				}
				break;

			case 2:
				do {
		
				System.out.println("Enter the BOOK ID");
				int bid=sc.nextInt();
				System.out.println("Enter the BOOK Name");
				String bnm=sc.next();
				System.out.println("Enter the BOOK Price");
				Double bprice=sc.nextDouble();
				list2.add(new Products(bid, bnm, bprice));

				p2=new Products(bid, bnm, bprice);
				System.out.println("Add More Book  press 1 otherwise 0");
				ch=sc.nextInt();
			}while(ch==1);
				break;

			case 3:
				do
				{
				
				System.out.println("Enter the Mobile ID");
				int mid=sc.nextInt();
				System.out.println("Enter the Mobile Name");
				String mnm=sc.next();
				System.out.println("Enter the Mobile Price");
				Double mprice=sc.nextDouble();
				list3.add(new Products(mid, mnm, mprice));
				p3=new Products(mid, mnm, mprice);
				System.out.println("Add More Mobile  press 1 otherwise 0");
				ch=sc.nextInt();
			}while(ch==1);
				break;

			default :
				System.out.println("INVALID OPTION PLEASE  ENTER CORRECT OPTION");
			}

			System.out.println("\nDo you want to add Another Product Press 1");
			ch=sc.nextInt();
		}while(ch==1);
//		Map<String,Products> mlist=new HashMap<String,Products>();
//		mlist.put("laptop", p1);
//		mlist.put("book", p2);
//		mlist.put("mobile", p3);
		
		
		Map<String, List<Products>> mlist=new HashMap<String, List<Products>>();
		mlist.put("laptop", list1);
		mlist.put("book", list2);
		mlist.put("mobile", list3);
		return mlist;
	}




	public void display(Map<String, List<Products>> pli)
	{
		String b;
		do {
			Set<String> s=pli.keySet();

			System.out.println("\n Whiich Data Do You Want select the Option");
			System.out.println("- - - - - - - - - - - - - - - - - - - - - - - \n");
			System.out.println("\n 1 : Laptop  \n 2 : BOOK  \n 3 : Mobile");
			int choice = sc.nextInt();

			switch(choice)
			{

			case 1:
				System.out.println("============================Laptop Data Available=========================\n");
				for(String a:s)
				{
					

					if(a.equals("laptop"))
					{
						List<Products> p=pli.get(a);
						for(Products x : p)
							System.out.println(x);
				//		System.out.println("DATA IS :  "+p.getId()+"\t"+p.getProdNm()+"\t"+p.getProdPrice());
					}
					
				}
				break;
			case 2:
				System.out.println("============================Book Data Available=========================\n");
				for(String a:s)
				{

					if(a.equals("book"))
					{
						List<Products> p=pli.get(a);
						for(Products x : p)
							System.out.println(x);
				//		System.out.println("DATA IS :  "+p.getId()+"\t"+p.getProdNm()+"\t"+p.getProdPrice());
					}
					
				}
				
				break;


			case 3:
				System.out.println("============================PHONES Data Available=========================\n");
				for(String a:s)
				{

					if(a.equals("mobile"))
					{
						List<Products> p=pli.get(a);
						for(Products x : p)
							System.out.println(x);
				//		System.out.println("DATA IS :  "+p.getId()+"\t"+p.getProdNm()+"\t"+p.getProdPrice());
					}
				}
				break;

			}
			System.out.println("==============================================================");
			System.out.println("\nDisplay Another Data press Yes");
			b=sc.next();
		}while(b.equalsIgnoreCase("yes"));

	}

}
