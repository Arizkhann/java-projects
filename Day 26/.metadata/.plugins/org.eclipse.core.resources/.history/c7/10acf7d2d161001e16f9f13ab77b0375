package com.java.hib;

 

import org.hibernate.Criteria;

import org.hibernate.Query;

import org.hibernate.Session;

import org.hibernate.SessionFactory;

import org.hibernate.Transaction;

import org.hibernate.criterion.Order;

import org.hibernate.criterion.Restrictions;

 

import java.util.List;

 

public class AgentDAOImpl implements AgentDAO {

    private SessionFactory sf;

    private Session session;

 

    public List<Agent> showAgentsOrderedByBasic() {

        sf = SessionHelper.getConnection();

        session = sf.openSession();

 

        Criteria cr = session.createCriteria(Agent.class);

        cr.addOrder(Order.asc("Premium"));

 

        List<Agent> agentList = cr.list();

 

        return agentList;

    }

 

    public Agent searchAgentById(int agentID) {

        sf = SessionHelper.getConnection();

        session = sf.openSession();

 

        Criteria cr = session.createCriteria(Agent.class);

        cr.add(Restrictions.eq("agentID", agentID));

 

        Agent agent = (Agent) cr.uniqueResult();

 

        return agent;

    }

 

    @Override

    public String addAgent(Agent agent) {

        sf = SessionHelper.getConnection();

        session = sf.openSession();

        Transaction trans = session.beginTransaction();

        session.save(agent);

        trans.commit();

        return "Agent Record Inserted";

    }

 

    @Override

    public String deleteAgent(int agentID) {

        Agent agentFound = searchAgentById(agentID);

        if (agentFound != null) {

            sf = SessionHelper.getConnection();

            session = sf.openSession();

            Transaction trans = session.beginTransaction();

            session.delete(agentFound);

            trans.commit();

            return "Agent Record Deleted";

        }

        return "Agent Not Found";

    }

}