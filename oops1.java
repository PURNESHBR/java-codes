public class oops1 {
    public static class student {//creating a new user defined data type , creating a new class 
        String name ;
        int roll;
        double per;
        public student(){//default constructor 

        }
        public student(String name , int roll , double per){
             this.name = name; 
             this.roll=roll;
             this.per=per;
        }
    }
    public static void fun(student x){
        System.out.println(x.name);
        System.out.println(x.roll);
    }
    public static void main(String[] args) {
        student s1 = new student();//creating a object ,decleration
        s1.name="purnesh";//initilization of object 
        s1.roll=13;
        s1.per=86.33;
        System.out.println(s1.name);
        fun(s1);
        student s2 = new student("purnesh",13,86.33);//for constructor 
        System.out.println(s2.name);
    }
    
}
