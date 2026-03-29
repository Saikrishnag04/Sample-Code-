abstract class car
{
int regno;
car(int regno)
{
this.regno=regno;
}
void fillTank()
{
System.out.println("FillTank");
}
abstract void steering(int direction);
abstract void breaking(int force);
}