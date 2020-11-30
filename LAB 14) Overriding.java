Class super
{
int x;
super(int x)
{
this.x=x;
}
void display()
{
System.out.println("superx="+x);
}
}
class sub extends super
{
int y;
sub(intx,inty)
{
super(x);
this.y=y;
}
void display()
{
System.out.println("superx="+x);
System.out.println("suby="+y);
}
}