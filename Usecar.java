class Usecar
{
public static void main(String args[])
{
//creating objects to maruthi,santro
Maruthi m=new Maruthi(6666);
Santro s=new Santro(9999);
//create a reference to class class
car c,c1;
c=m;
c1=s;
c.fillTank();
c.steering(2);
c.breaking(200);
c1.fillTank();
c1.steering(3);
c1.breaking(300);
}
}