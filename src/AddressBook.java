// Test editing code outside IntelliJ

import java.util.ArrayList;

public class AddressBook {
    private final ArrayList<BuddyInfo> myBuddies;

    public AddressBook(){
        myBuddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo aBuddy){
        if(aBuddy != null) {
            myBuddies.add(aBuddy);
        }
    }

    public BuddyInfo removeBuddy(int index){
        if(index >= 0 && index < myBuddies.size()){
            return myBuddies.remove(index);
        }
        return null;
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "1234567890");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        BuddyInfo delBuddy = addressBook.removeBuddy(0);
    }
}

