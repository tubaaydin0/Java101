public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    Employee(String name, double salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;

    }
    public double tax(){
        if(this.salary>1000){
            return salary*0.03;
        }
        return 0;
    }
    public double bonus(){
        if(this.workHours>40){
            return (this.workHours-40)*30;
        }
        return 0;
    }
    public double raiseSalary(){
        int year=2021-this.hireYear;
        if (year<10){
            return salary*0.05;
        }else if (year>9 && year<20){
            return  salary*0.10;
        }else if(year>19){
            return salary*0.15;
        }
        return 0;
    }
    void toStrng(){
        System.out.println("Adı: "+this.name);
        System.out.println("Maaşı: "+ this.salary);
        System.out.println("Çalışma saati: "+this.workHours);
        System.out.println("Başlangıç yılı: "+ this.hireYear);
        System.out.println("Vergi: "+tax());
        System.out.println("Bonus: "+ bonus());
        System.out.println("Maaş artışı: "+raiseSalary());
        System.out.println("Vergi ve bonuslarla birlikte maaş: "+(this.salary-tax()+bonus()));
        System.out.println("Toplam maaş: "+(this.salary+raiseSalary()));

    }


    }


