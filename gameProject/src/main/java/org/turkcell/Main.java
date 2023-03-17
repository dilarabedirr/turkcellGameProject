package org.turkcell;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Gamer gamer=new Gamer(1,"gamer@gmail.com","1234","dilara","bedir",new Date(1997,5,13),"12345678901");

        GamerUserManager gamerUserManager=new GamerUserManager(new MernisCheckUserManager());
        gamerUserManager.save(gamer);
        gamerUserManager.update(gamer);
        gamerUserManager.delete(gamer);

        Employee employee=new Employee(2,"employee@gmail.com","1234");

        EmployeeUserManager employeeUserManager=new EmployeeUserManager();
        employeeUserManager.save(employee);

        Game game=new Game(1,"Fifa 23",699.99);
        Game game2=new Game(2,"Forza Horizon 5",599);
        Game game3=new Game(2,"Grand Theft Auto V",735);

        SalesManager salesManager=new SalesManager(new SpringFestCampaignManager());
        salesManager.sales(game3,gamer);



    }
}