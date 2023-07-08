package array.program;

import java.util.*;

public class SortedGame implements Comparable<SortedGame>{
    
	String name;
	int salary;

	public SortedGame(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return name + " " + salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ms = sc.nextInt();
		int n = sc.nextInt();
		List<SortedGame> emp = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			String name = sc.next();
			int sa = sc.nextInt();
			emp.add(new SortedGame(name, sa));
		}
		Collections.sort(emp);
        for(SortedGame a:emp){
        	if(a.salary>ms && a.salary<100){
        	System.out.println(a);
        	}
        }
	}

	@Override
	public int compareTo(SortedGame o) {
		if(this.salary>o.salary) return -1;
		else if(this.salary<o.salary) return 1;
		return this.name.compareTo(o.name);
		
	}

}
