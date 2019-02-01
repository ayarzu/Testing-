package uplodingPackage;
	
	 public static void main(String[] args) {
		    
		    Set<Person> set = new HashSet<>(); 
		    Person p1 = new Person(12,"John") ; 
		    Person p2 = new Person(12,"John") ; 
		     
		    System.out.println(p1);

		    set.add(  p1  ); 
		    set.add(  p2 ) ; 
		    
		    System.out.println(set);

		  }

		}

		class Person{
		  
		  int age; 
		  String name;
		  
		  public Person(int age, String name) {
		    super();
		    this.age = age;
		    this.name = name;
		  }
