class Maruthi extends car
{
Maruthi(int regno)
{
super(regno);
}
void steering(int  direction)
{
System.out.println("regnum of maruthi="+regno);
System.out.println("maruthi  uses manual steering "+direction);
System.out.println("Please the car");
}
void breaking(int force)
{
System.out.println("Breaking of Maruthi="+force);
System.out.println("Maruthi use Hydrualic breaks");
System.out.println("Apply Breaks stop the car");
}
}