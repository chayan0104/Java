package OOPS.Inheritance.Is_A;

public class Doc {
    void DocDetails(){
        System.out.println("doctor Details");
    }
    static class Surgeon extends Doc{
        void SurgeDetails(){
            System.out.println("surgeon details");
        }
    }
    }
class Hospital{
    public static void main(String[] args) {
        Doc.Surgeon s = new Doc.Surgeon();
        s.DocDetails();
        s.SurgeDetails();
    }
}
