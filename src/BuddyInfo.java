public class BuddyInfo {

    public String name;
    public String address;
    public String phoneNumber;


    public BuddyInfo(){
        name = "Christine Markova";
        address = "Carleton University";
        phoneNumber = "123-456-7890";

    }

    public BuddyInfo(String name, String address, String phoneNumber){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;

    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public static void main(String[] args) {
        BuddyInfo buddyInfo = new BuddyInfo("Christine Markova", "101300150", "SYSC 3110");
        System.out.println("Hello, " + buddyInfo.getName() + "!");
    }
}
