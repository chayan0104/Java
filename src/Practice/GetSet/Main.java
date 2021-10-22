package Practice.GetSet;

public class Main {
    public static void main(String[] args) {
        Student st = new Student();
        st.setName("chayan");
        st.setAge(24);

        System.out.println("the name is: "+st.getName()+
                " and age is: "+st.getAge());

    }
}
