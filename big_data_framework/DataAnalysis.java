public class DataAnalysis{

    public static void main(String [] args){
        ActorDatabase database = new ActorDatabase();

	long j=0;
	
	while(j<database.length()-1){
		int i=0;
		while(i<database.length()-1){

			
		Actor a1= database.get(i);
		Actor a2= database.get(i+1);
		long a1= a1();
		long a2= a2();

	 		if(a1Average < a2Average){
				Actor temp=database.get(i);
				database.set(i, database.get(i+1));
				database.set(i+1, temp);
		
			}
		i=i+1;
		}
	j=j+1;
	}

	database.print();

    }
}
