import java.io.*;
import java.util.*;
class Player
{
public String name;
public int age;
Player(String name, int age)
{
this.name=name;
this.age=age;
}
public String getName()
{
return name;
}
public int getAge()
{
return age;
}
}//close class Player

class Snack
{
public String description;
public double cost;
public String provider;
public Snack(String description, double cost, String provider)
{
this.description=description;
this.cost=cost;
this.provider=provider;
}

public String getDescription()
{
return description;
}

public double getCost()
{
return cost;
}

public String getProvider()
{
return provider;
}
}//close class Snack

class BoardGame
{
public String title,owner;
public int minimumAge;
public double duration;
public int minimumPlayers,maximumPlayers;
public double rating;

public BoardGame(String title, String owner, int minimumAge, double duration, int minimumPlayers, int maximumPlayers, double rating)
{
this.title=title;
this.owner=owner;
this.minimumAge=minimumAge;
this.duration=duration;
this.minimumPlayers=minimumPlayers;
this.maximumPlayers=maximumPlayers;
if(rating>100 || rating<0)
{
System.out.println("Rating percentage not valid.Setting to 0");
{
this.rating=0.0;
}
}
else
{
this.rating=rating;
}
}

public String getTitle()
{
return title;
}

public String getOwner()
{
return owner;
}

public int getMinimumAge()
{
return minimumAge;
}

public double getDuration()
{
return duration;
}

public int getMinimumPlayers()
{
return minimumPlayers;
}
public int getMaximumPlayers()
{
return maximumPlayers;
}
public double getRating()
{
return rating;
}

public void setRating(double r)
{
if(r>100 || r<0)
{
System.out.println("Rating percentage not valid");
}
else
{
rating=r;
}
}
}//close class BoardGame

class GamingParty
{
public String theme, boardGame;
public String players[];
public String snacks[];
public String winner;

public GamingParty(String theme, String boardGame)
{
this.theme=theme;
this.boardGame=boardGame;
winner="";
}

public void addPlayer(String name, int age, int minage)
{
int l=players.length;
if(players[l-1].equals("")==true)
{
for(int i=0;i<l;i++)
{
if(players[i].equalsIgnoreCase(name))
{
System.out.println("The player is already playing at the party");
break;
}//close if
}//close for
if(age<minage)
{
System.out.println("Player does not meet the age requirement for the game");
}//close age if
else
{
for(int i=0;i<l;i++)
{
if(players[i].equalsIgnoreCase(""))
players[i]=name;
}//close inner for
}//coser inner-most else
}//close outer if
else
{
System.out.println("maximum number of players has been reached for this party");
}//close outer else
}//close addPlayer

public void play(int minp)
{
int f=0;
for(int i=0;i<minp;i++)
{
if(players[i].equals("")==false)
f++;
}
if(f>=minp)
System.out.println("Play!");
else
System.out.println("You need "+(minp-f)+" player(s)!");
}//close play()

public void addSnack(String des)
{
int l=snacks.length;
for(int i=0;i<l;i++)
{
if(snacks[i].equals(""))
{
snacks[i]=des;
}
else
{
if(i==(l-1))
System.out.println("There are enough snacks!");
}//close if
}//close for
}//close addSnack

public double getPartyCost( double cost)
{
double sp,tsp=0;
sp=cost;
tsp=tsp+sp;
return tsp;
}//close getPartyCost

public void setWinner(String win, int maxp)
{
if(winner.equals(""))
{
for(int i=0;i<maxp;i++)
{
if(win.equals(players[i]))
{
winner=win;
}
else
{
System.out.println("The player didn't even play the game so cannot win!");
}
}
}
else
{
System.out.println("The winner has already been decided! It was "+winner);
}
}//close setWinner

public String getWinner()
{
return winner;
}

public void outputPartyDetails(String thm, String title, int maxp, int minp)
{
int f=0,f1=0;
System.out.println("Theme:"+thm);
System.out.println("Board game:"+title);

for(int i=0;i<maxp;i++)
{
if(players[i].equals(""))
{
f++;
}
}
for(int i=0;i<2*maxp;i++)
{
if(snacks[i].equals(""))
{
f1++;
}
}

if(f>=minp)
{
System.out.println("Players:");
for(int j=0;j<=f;j++)
{System.out.println(players[j]);
}
System.out.println("Snacks:");
if(f1>0)
{
for(int j=0;j<=f1;j++)
{
System.out.println(snacks[j]);
}
}
System.out.println("Winner:");
System.out.println(getWinner());
}//close outer if

else
{
System.out.println("Players:");
if(f1==0)
System.out.println("Snacks:");
System.out.println("No winner yet!");
}//close else
}//close outputPartyDetails

public void calculateRecommendedSnacks(double time, int maxp)
{
double rem;
int f=0;
time=time/60;
double d=time%10;
if(d>5.0)
time=Math.ceil(time);
else
time=Math.floor(time);
if(time<1)
{
for(int i=0;i<maxp;i++)
{
if(players[i].equals("")==false)
{
f++;
}
}
rem=f;
}
else
{
rem=f*time;
if(rem>(2*maxp))
{
rem=maxp;
} 
}
System.out.println("A total of "+rem+" snack(s) are recommended for the game.");
}//close calculateRecommendedSnacks


public static void main(String args[])
{
String nm,title,des;
int yrs,minp,maxp;
double cp,time;

Player obj1=new Player("Ayushi",20);
Player obj2=new Player("Simran",19);

Snack objt1=new Snack("burger",30,obj1.getName());
Snack objt2= new Snack("Pizza",50,obj2.getName());

BoardGame ob3=new BoardGame("Pictionary","divyanshi",18,120,2,4,75);
System.out.println("Title of the game is "+ob3.getTitle());
System.out.println("Owner of the game is "+ob3.getOwner());
System.out.println("Minimum age of the game is "+ob3.getMinimumAge());
System.out.println("Max number of players of the game is "+ob3.getMaximumPlayers());
System.out.println("Min number of players for the game is "+ob3.getMinimumPlayers());
System.out.println("Duration of the game is "+ob3.getDuration());
System.out.println("Rating of the game is "+ob3.getRating());

GamingParty obj4=new GamingParty("Friends Gathering",ob3.getTitle());
obj4.players=new String[ob3.getMaximumPlayers()];
obj4.snacks=new String[2*(ob3.getMaximumPlayers())];
nm=obj1.getName();
yrs=obj1.getAge();
obj4.addPlayer(obj1.getName(),obj1.getAge(),18);

nm=obj2.getName();
yrs=obj2.getAge();
obj4.addPlayer(nm,yrs,18);

minp=ob3.getMinimumPlayers();
obj4.play(minp);

des=objt1.getDescription();
obj4.addSnack(des);
des=objt2.getDescription();
obj4.addSnack(des);

cp=objt1.getCost();
double amt=obj4.getPartyCost(cp);
cp=objt2.getCost();
double amt2=obj4.getPartyCost(cp);

//nm=obj1.getName();
maxp=ob3.getMaximumPlayers();
obj4.setWinner("Ayushi",maxp);

title=ob3.getTitle();
minp=ob3.getMinimumPlayers();
obj4.outputPartyDetails(obj4.theme,title, maxp, minp);

time=ob3.getDuration();
obj4.calculateRecommendedSnacks(time,maxp);

}//close main()
}//class GamingParty class


