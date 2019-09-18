import general.*;
public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] students = {
				new Student("Physics", "YG-1","John Way",new Subject[]{
						new Subject("Math",5),
						new Subject("History",2)
						}),
				new Student("Physics", "YG-1","Kolya Mazayev",new Subject[]{
						new Subject("Math",4),
						new Subject("History",9)
						}),
				new Student("Physics", "YG-1","Clown Bespechnyj",new Subject[]{}),
				new Student("Physics", "YG-1","Dima Ilchenko",new Subject[]{
						new Subject("Math",-3),
						new Subject("History",0)
						}),
				new Student("Physics", "YG-1","Alex Stockiy",new Subject[]{
						new Subject("Math",12),
						new Subject("History",10)
						}),
   		        new Student("Math", "M-1","Ivan Petrovich",new Subject[]{}),
   		        new Student("Math", "M-1","Semen Yakovlevich",new Subject[]{
				       new Subject("Math",4),
				       new Subject("History",7)
				       }),
   		        new Student("Math", "M-1","Rostegai Knyajkov",new Subject[]{
				       new Subject("Math",9),
				       new Subject("History",6)
				       }),
   		        new Student("Math", "M-1","Ivan Petrovich",new Subject[]{
				       new Subject("Math",19),
				       new Subject("History",7)
				       })
   		        };
		
		for(Student s: students) {
			System.out.println(s);
		}
		
		for(Student s: students) {
			System.out.println(s.getAverageGrade());
		}		
		
		
	}
	/*
	private static final void printCollection(Collection<NumLen> collection){
        Iterator<NumLen> it = collection.iterator();
        while(it.hasNext()){
        	NumLen numLen = it.next();
        	System.out.print(numLen.getLength() + DEL);
        	System.out.println(numLen.getNumber());
        }
        System.out.println();
	}
	*/
	
}
