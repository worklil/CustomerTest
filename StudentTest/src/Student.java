public class Student{
    private String name;
    private String campus;
    private String bannerID;

    public Student(String name, String campus, String bannerID){
        this.name=name;
        this.campus=campus;
        this.bannerID=bannerID;
    }
	
    public void changeCampus(String newCampus){
        this.campus=newCampus;
    }
	
    public Boolean matchFound(String bannerID){
        return this.bannerID.equals(bannerID);
    }

    public String toString(){
        return "name: "+this.name+" campus: "+this.campus+" bannerID: "+this.bannerID;
    }
}