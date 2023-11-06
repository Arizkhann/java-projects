package com.java.hib;

 

import org.hibernate.Criteria;

import org.hibernate.Query;

import org.hibernate.Session;

import org.hibernate.SessionFactory;

import org.hibernate.Transaction;

import org.hibernate.criterion.Order;

import org.hibernate.criterion.Restrictions;

import com.java.hib.SessionHelper;
import com.java.hib.Agent;
import com.java.hib.Agent;

import java.util.List;
import java.util.Map;

import javax.faces.context.FacesContext;

 

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

    public List<Agent> showAgentCr() {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Criteria cr = session.createCriteria(Agent.class);
		cr.addOrder(Order.asc("basic"));
		List<Agent> agentList = cr.list();
		return agentList;
	}
	
	public Agent searchAgentCr(int agentID) {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Criteria cr = session.createCriteria(Agent.class);
		cr.add(Restrictions.eq("agentID", agentID));
		Agent agent = searchAgentCr(agentID);
		return agent;
	}

    public String searchAgentById(int agentID) {

        sf = SessionHelper.getConnection();

		Map<String,Object> sessionMap=
				FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Query query = session.createQuery("from Agent where agentID="+agentID);
		List<Agent> agentList = query.list();
		
		Agent agent=agentList.get(0);
		sessionMap.put("editAgent", agent);
		return "UpdateAgent.xhtml?faces-redirect=true";
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

    	Agent agentFound = searchAgentCr(agentID);
		
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Transaction trans = session.beginTransaction();
		session.delete(agentFound);
		trans.commit();
		return "AgentShow.xhtml?faces-redirect=true";
	}

    



	@Override
	public String updateAgentDao(Agent agentUpdated) {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Transaction trans = session.beginTransaction();
		session.update(agentUpdated);
		trans.commit();
		return "ShowAgent.xhtml?faces-redirect=true";
	}

}