// import java.util.Scanner;
// import java.time.*;
// import java.text.*;
// import java.util.Date;




// // program 3a is calage

// public class Program3a {
    
//     private String Dob;
//     private String Currdate;

//     void Set_dob(String Date){
//         this.Dob = Date;

//     }
//     void Set_curr(String cdate){
//         this.Currdate = cdate;
//     }

//     double get_age(){
//         LocalDate today = LocalDate.parse(Currdate);
//         LocalDate Date = LocalDate.parse(Dob);
//         Period diff = Period.between(Date,today);
//         return diff.getYears()+(diff.getMonths()*0.1);

//     }

    

// }
// public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter dob:");
//     String Date = sc.next();
//     String[] ddmmyy = Date.split("/");
//     int day = Integer.parseInt(ddmmyy[0]);
//     int month = Integer.parseInt(ddmmyy[1]);
//     int year = Integer.parseInt(ddmmyy[2]);

//     if (month<1 || month>12 || day<1 || day>31 || year>2024) {
//         System.out.println("Invalid date");
//     }
//     else if(month==2){
//         if ((year%4==0)&&(year%100!=0)||(year%400==0)) {
//             if (day>29) {
//                 System.out.println("invalid date");
//             }
            
//         }

//     }
//     else {
//         Program3a c = new Program3a();
//         LocalDate db = LocalDate.of(year, month, day);
       
//         LocalDate currentDate = LocalDate.now();
//         c.Set_dob(db.toString());
//         c.Set_curr(currentDate.toString());
//         System.out.println("Age up to till date: "+c.get_age());
//         }
//  }
import java.util.Scanner;
import java.time.*;
import java.text.*;
import java.util.Date;
public class CalAge {
 private String Date_Of_Birth;
 private String Current_Date;
 void set_DOB(String dob) {
 this.Date_Of_Birth = dob;

 }
 void set_Current_Date(String cdate) {
 this.Current_Date = cdate;
 }
 double get_Age() {
 LocalDate today = LocalDate.parse(Current_Date);
 LocalDate dob = LocalDate.parse(Date_Of_Birth);
 Period diff = Period.between(dob,today);
 return diff.getYears()+(diff.getMonths()*0.1);
 }
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 System.out.println("Enter date of birth : ");
 String dob = input.next();
 String[] ddmmyyy = dob.split("/");
 int day = Integer.parseInt(ddmmyyy[0]);
 int month = Integer.parseInt(ddmmyyy[1]);
 int year = Integer.parseInt(ddmmyyy[2]);
 if (month < 1 || month > 12 || day < 1 || day > 31 || year > 2024) {
 System.out.println("invalid date");
 }
 else if (month == 2) {
 if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
 if (day > 29) {
 System.out.println("invalid date");
 }
 }
 else{
 if (day > 28) {
 System.out.println("invalid date");
 }
 }
 }
 else {
 CalAge c = new CalAge();
 LocalDate db = LocalDate.of(year, month, day);

 LocalDate currentDate = LocalDate.now();
 c.set_DOB(db.toString());
 c.set_Current_Date(currentDate.toString());
 System.out.println("Age up to till date: "+c.get_Age());
 }
 }
}


