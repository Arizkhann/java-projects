package com.java.hib;

 

import java.util.List;

import java.util.Scanner;

import org.hibernate.Query;

import org.hibernate.Session;

import org.hibernate.SessionFactory;

import org.hibernate.Transaction;

import org.hibernate.cfg.AnnotationConfiguration;

import org.hibernate.cfg.Configuration;

 

public class AgentDeleteMain {

    public static void main(String[] args) {

        // Declare variables and initialize Scanner

        int agentID;

        Scanner sc = new Scanner(System.in);

 

        // Prompt the user to enter Agent ID

        System.out.println("Enter Agent ID: ");

        agentID = sc.nextInt();

 

       

        Configuration cfg = new AnnotationConfiguration().configure();

        SessionFactory sf = cfg.buildSessionFactory();

 

    

        Session session = sf.openSession();

 

    

        Query query = session.createQuery("from Agent where agentID=" + agentID);

        List<Agent> agentList = query.list();

 

     

        if (agentList.size() > 0) {

            Agent agent = agentList.get(0);

 

          

            Transaction tran = session.beginTransaction();

 

            session.delete(agent);

 

 

            tran.commit();

 

    

            System.out.println("***Agent Record Deleted****");

        } else {

           

            System.out.println("***Agent Record Not Found****");

        }

 

        session.close();

        sc.close();

    }

}