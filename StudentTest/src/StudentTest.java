public class StudentTest{
    public static void main(String[] args){
        String name=Input.getString("name: ");
        String campus=Input.getString("campus: ");
        String bannerID=Input.getString("bannerID: ");
        Student student=new Student(name,campus,bannerID);
        Integer option;
        do{
            System.out.println("0: quit");
            System.out.println("1: change campus");
            System.out.println("2: match against bannerID");
            System.out.println("3: display");
            option=Input.getInteger("option: ");
            switch(option){
                case 0:
                    System.out.println("quitting program");
                    break;
                case 1:
                    campus = Input.getString("new campus: ");
                    student.changeCampus(campus);
                    break;
                case 2:
                    bannerID = Input.getString("bannerID to match: ");
                    if (student.matchFound(bannerID))
                        System.out.println("match found");
                    else
                        System.out.println("no match");
                    break;
                case 3:
                    System.out.println(student);
                    break;
                default:
                    System.out.println("invalid option");
            }
        }while(option!=0);
    }
}