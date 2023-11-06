package com.java.hib;

 

import java.util.Scanner;

 

public class AgentInsertMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Agent agent = new Agent();

 

        System.out.println("Enter Agent Name: ");

        agent.setName(sc.nextLine());

 

        System.out.println("Enter Agent Gender (Male/Female): ");

        String genderStr = sc.nextLine();

        Gender gender = Gender.valueOf(genderStr.toUpperCase());

        agent.setGender(gender);

 

        System.out.println("Enter Agent City: ");

        agent.setCity(sc.nextLine());

 

        System.out.println("Enter Agent Premium: ");

        agent.setPremium(sc.nextDouble());

 

        AgentDAO dao = new AgentDAOImpl();

        String result = dao.addAgent(agent);

 

        System.out.println(result);

    }

}

 