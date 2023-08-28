public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight, maxWeight;
    int startA;
    int startB;
    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight,int startA,int startB){
        this.f1=f1;
        this.f2=f2;
        this.maxWeight=maxWeight;
        this.minWeight=minWeight;
        if (startA==50 && startB==50){
            this.startA=startA;
            this.startB=startB;
        }
        else{
            System.out.println("Doğru sonuç için sporcuların başlama olasılığının eşit olmasına dikkat ediniz.");
        }
    }
    public void run(){
        if ((this.f1.weight>=this.minWeight && this.f1.weight<=this.maxWeight) && (this.f2.weight>=this.minWeight && this.f2.weight<=this.maxWeight)) {
            int sayac=1;
            while(this.f1.health>0 && this.f2.health>0){

                System.out.println("------------------YENİ ROUND------------------");
                if (isStart()==true){
                    System.out.println("İlk başlayan: "+ this.f1.name);
                    this.f2.health=this.f1.hit(this.f2);
                    if (isWin()){
                        break;
                    }
                }
                else{
                    System.out.println("İlk başlayan: "+ this.f2.name);
                    this.f1.health=this.f2.hit(this.f1);
                    if (isWin()){
                        break;
                    }
                }
                sayac++;
                System.out.println(this.f1.name+"'nın Canı:" +this.f1.health+"\n"+this.f2.name+"'nin Canı: "+this.f2.health);
            }
            System.out.println("Toplam mac= "+sayac);
        }else{
            System.out.println("Sporcuların sikletleri uymuyor...");
        }
        }
        boolean isWin(){
        if (this.f1.health==0){
            System.out.println(this.f2.name+" kazandı.");
            return true;
        }
        if (this.f2.health==0){
            System.out.println(this.f1.name+" kazandı.");
            return true;
        }
        return false;
        }
        boolean isStart(){
        double random= Math.random()*100;
        if(random<=this.startA){
            return true;
        } else if (random<=this.startB) {
            return false;
        }
        return false;
        }

    }

