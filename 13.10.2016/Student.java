

public class Student {
   private String surname;// variables for student's personal data
   private String name;
   private String middleName;
   private int age;
   private int course;
   private String faculty;
    

   private StudentUniversity title;// variables for student's university data
   private StudentUniversity year;

   private StudentHome street;// variables for student's home data
   private StudentHome district;
   private StudentHome numberOfFloors;

    int countAgesOfEducation(int beginAge){//this function return the year, when student finishing university

        return beginAge + 4;

    }

    String getStatusOfEducation(String isInUniversity){//this function returns the result, if student study in university

        return isInUniversity;

    }

    String isActive(String activity){//this function returns is student ative in university

        return activity;

    }

    int looksPointsOnEGE(int points){//this function returns student's points of EGE

        return points;

    }

    String academicRecordAtSchool(String record){//this function return student's academic record at school

        return record;

    }

    //getters and setters for or variables:

    void setSurname(String studentSurname){

        surname = studentSurname;

    }
    
    String getSurname(){

        return surname;

    }

    void setName(String studentName){

        name = studentName;

    }

    String getName(){

        return name;

    }

    void setMiddleName(String studentMiddleName){

        middleName = studentMiddleName;

    }

    String getMiddleName(){

        return middleName;

    }

    void setAge(int studentAge){

        age = studentAge;

    }

    int getAge(){

        return age;

    }

    void setCourse(int studentCourse){

        course = studentCourse;

    }

    int getCourse(){

        return course;

    }

    void setFaculty(String studentFaculty){

        faculty = studentFaculty;

    }

    String getFaculty(){

        return faculty;

    }

    

    void setTitleOfUniversity(StudentUniversity officialTitle){

    	title = officialTitle;

    }

    StudentUniversity getTitleOfUniversity(){

    	return title;

    }

    void setUniversityYearOfFoundation(StudentUniversity yearOfFoundation){

    	year = yearOfFoundation;

    }

    StudentUniversity getUniversityYearOfFoundation(){

        return year;

    }

    void setHomeStreet(StudentHome primaryStreet){

        street = primaryStreet;

    }

    StudentHome getHomeStreet(){

        return street;

    }

    void setDistrict(StudentHome primaryDistrict){

        district = primaryDistrict;

    }

    StudentHome getDistrict(){

        return district;

    }

    void setNumberOfFloors(StudentHome floors){

        numberOfFloors = floors;

    }

    StudentHome getNumberOfFloors(){

        return numberOfFloors;

    }
}
