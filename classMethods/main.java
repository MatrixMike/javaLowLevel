/*
 * main.java 
 * 
 */
 
import java.io.*;
class Parent {
    private String name;
    private String text1;
    private String text2;
    private String checkedtype;
    private Integer cv;
    private boolean checked;

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public String getText2() {
         return text2;
     }

     public void setText2(String text2) {
         this.text2 = text2;
     }

     public Integer getCv() {
         return cv;
     }

     public void setCv(Integer cv) {
         this.cv = cv;
     }
         @Override
    public String toString() {
        return "Parent{" +
                "name='" + name + '\'' +
                ", text1='" + text1 + '\'' +
                ", text2='" + text2 + '\'' +
                ", checkedtype='" + checkedtype + '\'' +
                ", cv=" + cv +
                ", checked=" + checked +
                '}';
    }
}
public class main {
	
	public static void main (String[] args) {
	Parent  p1 = new Parent();
    Integer x = p1.getCv();
    p1.setName("  UPpeRCASE WORD  ");
    p1.setText2("some text 2");
    p1.setCv(34);
	String s = p1.getName().toLowerCase().trim().trim(); //.toUpperCase(Locale.getDefault()); 
	
	// https://www.tutorialspoint.com/java/java_string_touppercase.htm
	System.out.println(s);
	System.out.println(p1.toString());
	}
}

