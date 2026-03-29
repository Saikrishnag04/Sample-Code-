class Santro extends car
{
Santro(int regno)
{
super(regno);
}
void steering(int  direction)
{
System.out.println("regnum of Santro="+regno);
System.out.println("Santro has Power steering");
System.out.println("Drive the car");
}
void breaking(int force)
{
System.out.println("Breaking ="+force);
System.out.println("Santro use Gas breaks");
System.out.println(" stop the car");
}
}