class Drumkit{
boolean tophat=true;
boolean snare=true;

void playTopHat(){
System.out.println("ding ding dong...");
}
void playsnare(){
System.out.println("Bang Bang Bang...");
}

}


public class  Drumkittestdrive{
public static void main (String[] args){
Drumkit d = new Drumkit();

if(d.snare==true){
d.playsnare();
}

d.snare=false;
d.playsnare();
d.playTopHat();
}
}