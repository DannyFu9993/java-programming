//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class DannyFu_COMP228Lab1 {
    public static void main(String[] args) {

        //No argument constructor, and setAll.
        System.out.println("========================");
        Singers singer1 =  new Singers();
        System.out.println(singer1.getAll());
        System.out.println("========================");

        //1 value, also setSingerID;
        Singers singer2 = new Singers(1);
        singer2.setSingerID(123);
        System.out.println(singer2.getSingerID());
        System.out.println("========================");

        //2 parameter, setSingerID, setSingerName setSingerAddress
        Singers singer3 = new Singers(2, "Ronnie Radke");
        singer3.setSingerID(124);
        singer3.setSingerName("Mike Shinoda");
        singer3.setSingerAddress("1234 Los Angeles Street");
        System.out.println(singer3.getSingerID() + " - " + singer3.getSingerName() + " - " + singer3.getSingerAddress());
        System.out.println("========================");

        //3 parameter
        Singers singer4 = new Singers(3, "Chester Bennington", "1234 Los Angeles Studio");
        singer4.setSingerDOB(19760320);
        System.out.println(singer4.getSingerDOB());
        System.out.println("========================");

        //4 parameter
        Singers singer5 = new Singers(4, "Mafumafu", "123456 Tokyo Apartment", 19911018);
        singer5.setNumOfAlbumPublished(1000);
        System.out.println(singer5.getAlbumPublished());
        System.out.println("========================");

        //5 parameter
        Singers singer6 = new Singers(5, "Lilas Ikuta", "1345 Tokyo House", 20000925, 7);
        singer6.setAll(100, "Rei", "34567 Kyoto House", 20500101, 3);
        System.out.println(singer6.getAll());
        System.out.println("========================");
    }
}
class Singers {
    public int singerID = 0;
    public String singerName = "No Name";
    public String singerAddress = "No Address";
    public int dateOfBirth = 0;
    public int numOfAlbumPublished = 0;

    //SingerID getter and setter================================
    public String getSingerID(){
        return "ID: " + singerID;
    }
    public void setSingerID(int setID){
        this.singerID = setID;
    }
    //================================================================

    //singerName getter and setter================================
    public String getSingerName(){
        return "Singer name: " + singerName;
    }
    public void setSingerName(String setName){
        this.singerName = setName;
    }
    //================================================================

    //singerAddress getter and setter================================
    public String getSingerAddress(){
        return "Singer address: " + singerAddress;
    }
    public void setSingerAddress(String setAddress){
        this.singerAddress = setAddress;
    }
    //================================================================

    //dateOfBirth getter and setter================================
    public String getSingerDOB(){
        return "Singer date of birth: " + dateOfBirth;
    }
    public void setSingerDOB(int setDOB){
        this.dateOfBirth = setDOB;
    }
    //================================================================

    //numOfAlbumPublished getter and setter================================
    public String getAlbumPublished(){
        return "Albums published: " + numOfAlbumPublished;
    }
    public void setNumOfAlbumPublished(int setAlbumPublished){
        this.numOfAlbumPublished = setAlbumPublished;
    }
    //================================================================

    //==========================Get All and Set All====================
    public String getAll(){
        return "ID: " + singerID + " - Singer name: " + singerName + " - Singer address: " +
                singerAddress + " - Singer date of birth: " + dateOfBirth +  " - Albums published: " +
                numOfAlbumPublished;
    }

    public void setAll(int setID, String setName, String setAddress, int setDOB, int setAlbumPublished){
        this.singerID = setID;
        this.singerName = setName;
        this.singerAddress = setAddress;
        this.dateOfBirth = setDOB;
        this.numOfAlbumPublished = setAlbumPublished;
    }

    //================= CONSTRUCTOR =======================

    //Default constructor???/ no argument constructor===========================

    public Singers(){
    }

    //1 argument constructor
    public Singers(int setID){
        singerID = setID;
    }
    //2 argument constructor
    public Singers(int setID, String setName){
        singerID = setID;
        singerName = setName;

    }

    //3 argument constructor
    public Singers(int setID, String setName, String setAddress){
        singerID = setID;
        singerName = setName;
        singerAddress = setAddress;
    }

    //4 argument constructor
    public Singers(int setID, String setName, String setAddress, int setDOB){
        singerID = setID;
        singerName = setName;
        singerAddress = setAddress;
        dateOfBirth = setDOB;
    }

    //5 argument constructor
    public Singers(int setID, String setName, String setAddress, int setDOB, int setAlbumPublished){
        this.singerID = setID;
        this.singerName = setName;
        this.singerAddress = setAddress;
        this.dateOfBirth = setDOB;
        this.numOfAlbumPublished = setAlbumPublished;
    }




}