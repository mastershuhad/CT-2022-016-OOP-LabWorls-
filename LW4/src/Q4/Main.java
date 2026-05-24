package Q4;
class Owner {
    // Data Member
    private String OwnerName;
    private String phoneNo;

    //Constructor: Initializes the data member
    public Owner() {
        OwnerName = "Unknown";
        phoneNo = "Unknown";
    }
    public Owner(String name, String num) {
        OwnerName = name;
        phoneNo = num;
    }

    //Returns the name of this bicycle's owner
    public String getOwnerName() {
        return OwnerName;
    }

    //Assigns the name of this bicycle's owner
    public void setOwnerName(String name) {
        OwnerName = name;
    }

    public String getPhoneNo(){
        return phoneNo;
    }

    public void setPhoneNo(String phone){
        phoneNo = phone;
    }
}
class Bicycle {
   private Owner owner;

   public Bicycle(){
       this.owner = new Owner();
   }
   public Bicycle(Owner owner){
       this.owner = owner;
   }
   public Owner getOwner(){
       return owner;
   }
   public void setOwner(Owner owner){
       this.owner = owner;
   }

   public String getOwnerName(){
       return owner.getOwnerName();
   }
   public String getPhoneNo(){
       return owner.getPhoneNo();
   }
}

public class Main{
    public static void main(String[] args){
        Owner owner1;
        owner1 = new Owner("Kumar","0771234567");
        Bicycle cycle1;
        cycle1 = new Bicycle(owner1);

        System.out.println("Owner: "+cycle1.getOwnerName());
        System.out.println("Phone: "+cycle1.getPhoneNo());
    }
}
