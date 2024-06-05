package com.ey.Question3;


import java.util.*;

public class MoviesTester {
	public static void main(String[] args) {
		MoviesValidator mv=new MoviesValidator();
		
		Movies m1= new Movies("Movie-1","27-07","Director","Producer",3.30);
		Movies m2= new Movies("Movie-2","27-07","Director","Producer",2.50);
		Movies m3= new Movies("Movie-3","27-07","Director","Producer",3.30);
		Movies m4= new Movies("Movie-4","27-07","Director","Producer",3.45);
		mv.addmovie(m1);
		mv.addmovie(m2);
		mv.addmovie(m3);
		mv.addmovie(m4);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("1-create");
		System.out.println("2-sort by director");
		System.out.println("3-sort by producer");
		System.out.println("enter your choice");
		int a = sc.nextInt();
		
		if (a==1) {
			System.out.println("enter the movie name");
			String s1=sc.next();
			System.out.println("enter the movie date");
			String s2=sc.next();
			System.out.println("enter the movie director name");
			String s3=sc.next();
			System.out.println("enter the movie producer name");
			String s4=sc.next();
			System.out.println("enter the movie duration");
			Double d1=sc.nextDouble();
			Movies m= new Movies(s1,s2,s3,s4,d1);
			mv.addmovie(m);
			mv.list();
			
			
		}
		else if (a==2) {
			mv.directorsort();
			
		}
		else if (a==3) {
			mv.producersort();
			
		}
		
	}


}
