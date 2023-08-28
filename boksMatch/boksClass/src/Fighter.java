public class Fighter {
    String name;
    int damage,health,weight;
    int dodge;

    Fighter(String name, int damage,int health,int weight,int dodge){
        this.name= name;
        this.damage=damage;
        this.health=health;
        this.weight=weight;
        if (this.dodge>=0 && this.dodge<=100){
            this.dodge=dodge;
        }else {
            this.dodge=0;
        }

    }
    public int hit(Fighter foe){
        System.out.println(this.name+"=> "+foe.name+ " "+this.damage+" hasar vurdu.");
        if(foe.isDodge()){
            System.out.println(foe.name+" hasarı blokladı.");
            System.out.println("--------------------");
            return foe.health;
        }

        if (foe.health- this.damage<=0){
            return 0;
        }
        return foe.health- this.damage;
    }
    boolean isDodge(){
        double random= Math.random()*100;
        return random<=this.dodge; // random üretilen sayı dodge değerinden küçükse o sporcu dodgeler.

    }
}
