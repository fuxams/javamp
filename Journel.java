import java.util.Scanner;
public class Journel {
 private String author_name;
 private String title;
 private String Date_Of_submission;
 Journel(String name,String title,String submission_date){
 this.author_name=name;
 this.title=title;
 this.Date_Of_submission=submission_date;
 }
 void display_Details(){
 System.out.println("Journal paper details:");
 System.out.printf("Author: %s Title: %s Date:%s",author_name,getSubmissionDetails(),Date_Of_submission); 

 }
 String getSubmissionDetails(){
 String[] words = title.split(" ");
 for(int i = 0;i < words.length; i++){
 words[i]=Character.toUpperCase(words[i].charAt(0))+words[i].substring(1);
 }
 return String.join(" ",words);
 }
 public static void main(String[] args) {
 String name,title,date;
 Scanner input = new Scanner(System.in);
 System.out.println("Enter author name : ");
 name = input.nextLine();
 System.out.println("Enter title of the paper : ");
 title = input.nextLine();
 System.out.println("Enter date of submission(dd/mm/yyyy)");
 date = input.next();
 Journel j=new Journel(name,title,date);
 j.display_Details();
 }
}
