class Student {
	String index;
	String firstName;
	String lastName;
int [] grades={6,7,7,8,9};

	//TODO constructor
public Student(String index, String firtstName, String lastName,int [] grades){
this.index=index;
this.firstName = firstName;
this.lastName = lastName;
this.grades = grades;}


	//TODO seters & getters
public String getindex() {
                return index;
        }

public void setindex(String index) {
                this.index = index;
        }

public String getFirstname() {
                return firstName;
        }

public void setFirstname(String firstName) {
                this.firstName = firstName;
}
public String getLastname() {
                return lastName;
}

public void setLastname(String lastName) {
                this.lastName = lastName;
}
public int[] getgrades() {
                return grades;
        }

public double getAverage() {	
int max=0;
	//TODO
for(int i=0;i<grades.lenght;i++){
max+=grades[i];
	}
return max/grades.lenght;
}
	public int ECTSCredits() {
	int brojac=0;	//TODO
for(int i=0;i<grades.lenght;i++){
if(grades[i]>5){
brojac++;}
}
return brojac*6;
	}

