public class Main {
    public static void main(String[] args) {
        //This program will kind of tell a story about a guy called Tonald Drump and his friend, Boe Jiden.
        //First, they are created
        Person Tonald = new Person("Tonald", "Drump", "06/14/1946", 63, 180);
        Person Boe = new Person("Boe", "Jiden", "11/20/1942", 54, 130);

        //First, they need to complete high school. Tonald choses to take "Bad Choices", while Boe choses to take "Dementia".
        Course BadChoices = new Course("XBC3M", "Bad Choices", "Grade 11");
        //Boe is a few years older, but got held back due to dementia.
        Course Dementia = new Course("XDM4U", "Dementia", "Grade 12");

        //They both enroll in their respective courses:
        BadChoices.setStatus("enrolled");
        Dementia.setStatus("enrolled");

        //Boe is late on his first day of school and gets a 50% on the first (and only) assignment:
        Dementia.addLates((byte)1);
        Dementia.setMark(50f);

        //Tonald is absent on his first and second day due to making bad choices:
        BadChoices.addAbsences((byte)2);
        //He aces the first and only assignment with an 80%:
        BadChoices.setMark(80f);

        //A bit later, they both finish their respective courses. They get 1 email each:
        String emailForBoe = "Dear Boe, congratulations on finishing " + Dementia.getLevel()
         + " " + Dementia.getName() + " (" + Dementia.getCode() + "), with an astonishing grade of " 
         + Dementia.getMark() + "%, which is a(n) " + Dementia.getMarkG() + ". \n You had a total of " +
          Dementia.getAbsences() + " absences and " + Dementia.getLates() + " lates. \n Your status in the course has been set from " 
          + Dementia.getStatus() + " to \"failed\". Thank you very much!";
        Dementia.setStatus("failed");

        System.out.println(emailForBoe);
        System.out.println();

        String emailForTonald = "Dear Tonald, congratulations on finishing " + BadChoices.getLevel()
         + " " + BadChoices.getName() + " (" + BadChoices.getCode() + "), with an astonishing grade of " 
         + BadChoices.getMark() + "%, which is a(n) " + BadChoices.getMarkG() + ".\n You had a total of " +
          BadChoices.getAbsences() + " absences and " + BadChoices.getLates() + " lates.\n Your status in the course has been set from " 
          + BadChoices.getStatus() + " to \"completed\". Thank you very much!";
        BadChoices.setStatus("completed");
        System.out.println(emailForTonald);
        System.out.println();
        
        //Since they have completed highschool, it's only fair that they both grow a little bit.
        Tonald.setHeight(74);
        Boe.setHeight(68);
        Tonald.setWeight(250);
        Boe.setWeight(180);

        //Now having finished highschool, they each decided to open a bank account.
        //Tonald, having a very affluent family, knows exactly what to do.
        Account TonaldsAccount = new Account(1111111111111111l, "chequing", 100.00);
        TonaldsAccount.setInterestRate(1.2f);        
        //His dad gives him 3000 dollars to put into the account to start off:
        TonaldsAccount.deposit(3000);

        //Boe isn't so lucky, with only a few dollars. However, his interest is slightly higher.
        Account BoesAccount = new Account(1000000000000001l, "savings", 5.00);
        BoesAccount.setInterestRate(3.8f);
        BoesAccount.deposit(34.23);

        System.out.println();
        //One month later, they each recieve their account statements:
        TonaldsAccount.calcInterest();
        BoesAccount.calcInterest();
        String tonaldBankStatement = "Dear Tonald, the balance of your " + TonaldsAccount.getType() 
        + " account (account no. " + TonaldsAccount.getAccount() + ") is currently " + TonaldsAccount.getBalance() + ". Thank you for banking with us!";
        System.out.println(tonaldBankStatement);
        System.out.println();

        String boeBankStatement = "Dear Boe, the balance of your " + BoesAccount.getType() 
        + " account (account no. " + BoesAccount.getAccount() + ") is currently " + BoesAccount.getBalance() + ". Thank you for banking with us!";
        System.out.println(boeBankStatement);
        System.out.println();


        System.out.println("3 months later...");
        //They now both decide to get a job. After 3 months of hard work, they get their statements again:
        //when applying, they each fill in their information:
        String boeBankInfo = "My name is " + Boe.getName() + ". I was born on the " + Boe.getDOB_day() + "th of the " + Boe.getDOB_month() + "th month, in the year " + Boe.getDOB_year() + ".";
        System.out.println(boeBankInfo);
        String tonaldBankInfo = "My name is " + Tonald.getName() + ". My date of birth is " + Tonald.getDOB() + ". I am " + Tonald.getHeight() + " inches tall and " + Tonald.getWeight() + " pounds.";
        System.out.println(tonaldBankInfo);
        System.out.println();
        BoesAccount.deposit(20000);
        TonaldsAccount.deposit(50000);
        for(int i = 0; i < 3; i++) {
            TonaldsAccount.calcInterest();
            BoesAccount.calcInterest();
        }
        

        String tonaldBankStatementNew = "Dear Tonald, the balance of your " + TonaldsAccount.getType() 
        + " account (account no. " + TonaldsAccount.getAccount() + ") is currently " + TonaldsAccount.getBalance() + ". Thank you for banking with us!";
        System.out.println(tonaldBankStatementNew);
        System.out.println();
       
         String boeBankStatementNew = "Dear Boe, the balance of your " + BoesAccount.getType() 
        + " account (account no. " + BoesAccount.getAccount() + ") is currently " + BoesAccount.getBalance() + ". Thank you for banking with us!";
        System.out.println(boeBankStatementNew);
        System.out.println();


        //They now decide to each buy a car.
        Vehicle TonaldsCar = new Vehicle("car", "Ford", "F150", (short)2004, "blue", (byte)4, 80f);
        Vehicle BoesCar = new Vehicle("car", "Honda", "Civic", (short)1989, "red", (byte)4, 50f);
        TonaldsAccount.withdraw(30000);
        BoesAccount.withdraw(15000);
        //The car dealer fills them up:
        TonaldsCar.gasUp(20);
        BoesCar.gasUp(1);
        //The both drive home. Or try to, at least...
        TonaldsCar.drive(100);
        BoesCar.drive(60);
        //Boe has the call a tow truck.
        String boeCall = "Hello, I'm Boe. My " + BoesCar.getColor() + " " + BoesCar.getYear() + " " + BoesCar.getManufact() + " " + BoesCar.getModel() + " is out of gas. Can you come with " + BoesCar.getTankSize() + " liters of gas to fill me up?";
        System.out.println(boeCall);
        BoesCar.gasUp((int)BoesCar.getTankSize());
        //The service costs him 30 dollars.
        BoesAccount.withdraw(30);
        System.out.println();
        //Meanwhile, Tonald's American Made Ford F150 needs new wheels, for some reason.
        TonaldsCar.drive(40);
        String tonaldCall = "Hi Mr. Mechanic. My truck needs new wheels. Can you hook me up? Yes, it's the " + TonaldsCar.getDoors() + " door version.";
        System.out.println(tonaldCall);
        //Since the mechanic is cheap, he only gives him 2 wheels. They don't even match.
        Wheel w1 = new Wheel("Pirelli","Offroad", 18, "Winter");
        Wheel w2 = new Wheel("Firestone", "Race", 21, "Summer");
        //Little did he know, the wheels were actually in very poor condition.
        w1.update_KM_usage(69990);
        w2.update_KM_usage(74990);
        //He also decides to paint his car a patriotic blue.
        TonaldsCar.paint("blue");
        //The mechanic bills him 4000 dollars.
        TonaldsAccount.withdraw(4000);
        //He then drives to the gas station to fill up.
        TonaldsCar.drive(100);
        TonaldsCar.gasUp(10);
        w1.update_KM_usage(140);
        w2.update_KM_usage(140);
        //Angrily, Tonald calls the mechanic.
        String tonaldCall2 = "Hey, you put wheels with " + w2.getKM()  +"km on them. This one's in " + w2.getTreadCondition() + " condition! They don't even match! You put one " + w1.getSize() 
        + " inch " + w1.getBrand() + " " + w1.getModel() + " " + w1.getSeason() + " tyre, and one " + w2.getSize() 
        + " inch " + w2.getBrand() + " " + w2.getModel() + " " + w2.getSeason() + " tyre. I want a refund.";
        System.out.println(tonaldCall2);
        //The mechanic gives him 200 dollars to make up for it.
        TonaldsAccount.deposit(200);

        


    }
}
