package org.computer;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Collection extends Poli1 {
	public static void main(String[] args) {
		List<Collection> e=new LinkedList<>();
		Set<Collection> f=new HashSet<>();
		Collection c=new Collection();
		c.setEmpName("saran");
		c.setEmail("saran@gmail.com");
		c.setId(331);
		Collection d=new Collection();
		d.setEmpName("Ramesh");
		d.setEmail("Ramesh@gmail.com");
		d.setId(335);
		Collection b=new Collection();
		b.setEmpName("Ravi");
		b.setEmail("Ravi@gmail.com");
		b.setId(336);
		e.add(b);
		e.add(c);
		e.add(d);
		for (Collection s : e) {
			
			System.out.println(s.getEmail());
			System.out.println(s.getEmpName());
			System.out.println(s.getId());
			
		}

		f.addAll(e);
		for (Collection a : f) {
			System.out.println(a.getEmpName());
			System.out.println(a.getEmail());
			System.out.println(a.getId());
			
			
		}
	}
	


}
