package com.ey.q1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;





public class Author {
	public static void main(String[] args) {
		Author1[] a= {new Author1(1111l, "First1", "Last1", LocalDate.of(2002, 6, 26), "male", "Place1", 12345),
				new Author1(2222l, "First2", "Last2", LocalDate.of(2002, 8, 6), "female", "Place2", 56789), 
				new Author1(3333l, "First3", "Last3", LocalDate.of(2002, 8, 6), "male", "Place3", 54321),
				new Author1(4444l, "First4", "Last4", LocalDate.of(2002, 8, 6), "female", "Place4", 98765)};
		List<Author1> a1=new ArrayList<>(Arrays.asList(a));
		AuthorServiceImp1 as=new AuthorServiceImp1();
		System.out.println(as.getUniqueSurnames(a1));
		System.out.println(as.getAuthorsByCity(a1, "Place1"));
		System.out.println(as.femaleAverageAge(a1));
		System.out.println(as.getMobileByAdhar(a1,1111l));
	}
}
