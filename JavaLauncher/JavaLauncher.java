/*PLEASE NOTE:
This is a Simple Java Launcher Program
- The result of this program takes a bit time. Output is verified...
- To find the exe files--->>> go to task manager (with ctrl+shift+esc)----->>> And Click Open File Location
And Copy paste the exe files location here.
*/


import java.io.*;
import java.util.*;
class JavaLauncher{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
try{
System.out.println("Welcome To Our Java Launcher");
System.out.println("1)Paint, 2)Spotify, 3)Chrome 4)Excel 5)Word 6)Terminal 7) Exit");
int choice=sc.nextInt();
Process p;
switch(choice){
case 1: p=Runtime.getRuntime().exec("C:/Windows/System32/mspaint.exe");
break;
case 2:p=Runtime.getRuntime().exec("C:/Users/Geet/AppData/Roaming/Spotify/Spotify.exe");
break;
case 3: p=Runtime.getRuntime().exec("C:/Program Files (x86)/Google/Chrome/Application/chrome.exe");
break;
case 4: p=Runtime.getRuntime().exec("C:/Program Files (x86)/Microsoft Office/Office16/EXCEL.EXE");
break;
case 5:p=Runtime.getRuntime().exec("C:/Program Files (x86)/Microsoft Office/Office16/WINWORD.EXE");
break;
case 6: p=Runtime.getRuntime().exec("C:/Windows/SysWOW64/cmd.exe");
break;
case 7:
System.out.println("Invalid");

}
}
catch(IOException e){
	
e.printStackTrace();

}
finally{
	System.out.println("Thanks For Using");

}
}
}
