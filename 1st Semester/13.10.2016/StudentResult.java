

public class StudentResult {
    public static void main(String[] args){

    	Student s1 = new Student();//intializing the student
    	StudentHome sh1 = new StudentHome();//initializing the student's home
    	StudentUniversity stun1 = new StudentUniversity();//initializing the student's university

        System.out.println();

    	s1.setSurname("Romanov"); // using of Student methods
    	s1.setName("Andrey");
    	s1.setMiddleName("Vladimirovich");
    	s1.setAge(18);
    	s1.setCourse(1);
    	s1.setFaculty("ITIS");

    	sh1.street = "Saban"; // Making the StudentHome properties
    	sh1.district = "Moskovskii";
    	sh1.numberOfFloors = 9;


    	stun1.title = "KPFU";// Making the StudentUniversity properties
    	stun1.year = 1804;

    	s1.setHomeStreet(sh1);// Assignment of all properties to Student
    	s1.setDistrict(sh1);
    	s1.setNumberOfFloors(sh1);

    	s1.setTitleOfUniversity(stun1);
    	s1.setUniversityYearOfFoundation(stun1);
        //printing of all information and fucntions
    	System.out.println("Profile");
    	System.out.println();

    	System.out.println("Surname: " + s1.getSurname());
    	System.out.println("Name: " + s1.getName());
    	System.out.println("Middle Name: " + s1.getMiddleName());
    	System.out.println("Age: " + s1.getAge());
    	System.out.println("Course: " + s1.getCourse());
    	System.out.println("Faculty: " + s1.getFaculty());

    	System.out.println();
 
    	System.out.println("Address");
    	System.out.println();

    	System.out.println("Street: " + s1.getHomeStreet().street);
    	System.out.println("District: " + s1.getDistrict().district);
    	System.out.println("Number of floors of house: " + s1.getNumberOfFloors().numberOfFloors);

    	System.out.println();

    	System.out.println("University");
    	System.out.println();

    	System.out.println("Title of University: " + s1.getTitleOfUniversity().title);
    	System.out.println("Year of foundation: " + s1.getUniversityYearOfFoundation().year);
    	System.out.println("Year of finishing of University: " + s1.countAgesOfEducation(2016));
    	System.out.println("Is he studing at university? " + s1.getStatusOfEducation("Yes"));
    	System.out.println("Is he active? " + s1.isActive("Yes"));
    	System.out.println("Points of EGE: " + s1.looksPointsOnEGE(221));
    	System.out.println("Academic record of school: " + s1.academicRecordAtSchool("Good"));

        System.out.println();
    }
  }  
