package javaPractice;
class A {
int a=10;
int b=20;
public void selIDE(){
System.out.println("IDE");
}
}
class B extends A{
int x=30;
int y=40;
public void selWD(){
System.out.println("WD");
System.out.println(a+b); //accessing from class A
}
}
public class C extends B{
public void selRC(){
System.out.println("RC");
System.out.println(x+y); //accessing from class B
System.out.println(a+b); //accessing from class A
}
public static void main(String args[]){
C obj = new C();

obj.selIDE(); //accessing methods of class A without creating object for class A
obj.selWD(); //accessing methods of class A without creating object for class B
obj.selRC();
}
}

