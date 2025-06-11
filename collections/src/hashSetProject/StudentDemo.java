package hashSetProject;
import java.util.HashSet;
public class StudentDemo 
{
    public static void main(String[] args) 
    {
        Student s1  = new Student("Vansh Gupta", 19, 95, 1);
        Student s2  = new Student("Aarav Sharma", 20, 88, 2);
        Student s3  = new Student("Ananya Roy", 18, 91, 3);
        Student s4  = new Student("Vansh Gupta", 19, 84, 4); // repeated name
        Student s5  = new Student("Krishna Patel", 21, 77, 5);
        Student s6  = new Student("Aarav Sharma", 20, 89, 6); // repeated
        Student s7  = new Student("Megha Singh", 19, 92, 7);
        Student s8  = new Student("Riya Das", 20, 87, 8);
        Student s9  = new Student("Aditya Jain", 21, 90, 9);
        Student s10 = new Student("Sneha Kapoor", 18, 81, 10);
        Student s11 = new Student("Aarav Sharma", 19, 85, 11); // repeated
        Student s12 = new Student("Vansh Gupta", 20, 80, 12);  // repeated
        Student s13 = new Student("Kunal Mehta", 22, 78, 13);
        Student s14 = new Student("Neha Sinha", 19, 83, 14);
        Student s15 = new Student("Rohit Kumar", 21, 86, 15);
        Student s16 = new Student("Pooja Verma", 20, 82, 16);
        Student s17 = new Student("Riya Das", 20, 88, 17);     // repeated
        Student s18 = new Student("Shubham Tiwari", 22, 79, 18);
        Student s19 = new Student("Ishita Bhatt", 18, 90, 19);
        Student s20 = new Student("Manav Khurana", 21, 93, 20);
        Student s21 = new Student("Vansh Gupta", 19, 77, 21);  // repeated
        Student s22 = new Student("Ananya Roy", 20, 82, 22);   // repeated
        Student s23 = new Student("Aman Yadav", 19, 75, 23);
        Student s24 = new Student("Simran Kaur", 18, 94, 24);
        Student s25 = new Student("Kavya Nair", 20, 80, 25);
        Student s26 = new Student("Neha Sinha", 19, 91, 26);   // repeated
        Student s27 = new Student("Rohan Singh", 22, 83, 27);
        Student s28 = new Student("Tanya Bhatia", 21, 86, 28);
        Student s29 = new Student("Abhay Joshi", 20, 89, 29);
        Student s30 = new Student("Riya Das", 21, 84, 30);     // repeated
        Student s31 = new Student("Aditya Jain", 21, 91, 31);  // repeated
        Student s32 = new Student("Nikita Raj", 20, 87, 32);
        Student s33 = new Student("Harsh Vardhan", 22, 79, 33);
        Student s34 = new Student("Shalini Devi", 19, 85, 34);
        Student s35 = new Student("Ravi Patel", 20, 90, 35);
        Student s36 = new Student("Sneha Kapoor", 20, 88, 36); // repeated
        Student s37 = new Student("Kartik Mishra", 18, 92, 37);
        Student s38 = new Student("Ananya Roy", 21, 78, 38);   // repeated
        Student s39 = new Student("Megha Singh", 20, 83, 39);  // repeated
        Student s40 = new Student("Ankit Rawat", 21, 81, 40);
        Student s41 = new Student("Simran Kaur", 19, 90, 41);  // repeated
        Student s42 = new Student("Arjun Kapoor", 20, 76, 42);
        Student s43 = new Student("Tanya Bhatia", 19, 87, 43); // repeated
        Student s44 = new Student("Ishaan Malhotra", 21, 82, 44);
        Student s45 = new Student("Nikita Raj", 20, 84, 45);   // repeated
        Student s46 = new Student("Vansh Gupta", 22, 91, 46);  // repeated
        Student s47 = new Student("Riya Das", 19, 85, 47);     // repeated
        Student s48 = new Student("Aarav Sharma", 21, 79, 48); // repeated
        Student s49 = new Student("Megha Singh", 21, 93, 49);  // repeated
        Student s50 = new Student("Aditya Jain", 20, 90, 50);  // repeated
        Student[] studentClass = {s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20,
    s21, s22, s23, s24, s25, s26, s27, s28, s29, s30,s31, s32, s33, s34, s35, s36, s37, s38, s39, s40,s41, 
    s42, s43, s44, s45, s46, s47, s48, s49, s50};
        

        HashSet<String> classList= new HashSet<>();
        for (int i=0; i<50;i++) 
        {
            classList.add((studentClass[i]).getName());  // adds student to set
        }

        for(String s:classList)
        {
            System.out.println(s);
        }
        
    }
}
