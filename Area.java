import java.io.*;
class Area{
double length;
double breadth;

void setDim(double l,double b){
length=l;
breadth=b;
}


double getArea(){

System.out.println("length="+length);
System.out.println("breadth="+breadth);
return length*breadth;
}

public static void main(String args[])
{
 Area a=new Area();
 a.setDim(2.3,4);
 a.getArea();
System.out.println("Area="+ a.getArea());
}
}



