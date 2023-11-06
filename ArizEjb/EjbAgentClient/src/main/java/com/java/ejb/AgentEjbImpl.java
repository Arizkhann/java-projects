package com.java.ejb;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.naming.NamingException;

public class AgentEjbImpl {

	public List<Agent> showAgentEjb() throws ClassNotFoundException, SQLException, NamingException{
		
		AgentEjbBeanRemote remote=
							RemoteHelper.lookupRemoteStatelessEmploy();
		return remote.showAgent();
		
		}
	
public String addAgentEjb(Agent agent) throws NamingException, ClassNotFoundException, SQLException {
		
		AgentEjbBeanRemote remote=
							RemoteHelper.lookupRemoteStatelessEmploy();
		 remote.addAgent(agent);
		 return "ShowAgent.jsp?faces-redirect=true";
	}
	
public String searchAgentEjb(int agentID) throws ClassNotFoundException, SQLException, NamingException {
	
AgentEjbBeanRemote remote=
RemoteHelper.lookupRemoteStatelessEmploy();
Agent agent=remote.searchAgent(agentID);
Map<String,Object> sessionMap=
		FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
sessionMap.put("editAgent", agent);
return"UpdateAgent.jsp?faces-redirect=true";
}

public String updateAgentEjb(Agent editAgent) throws ClassNotFoundException, SQLException, NamingException{
	
	AgentEjbBeanRemote remote=
						RemoteHelper.lookupRemoteStatelessEmploy();
	remote.updateAgent(editAgent);
	return "ShowAgent.jsp?faces-redirect=true";

}
public String deleteAgentEjb(int agentID) throws ClassNotFoundException, SQLException, NamingException {
	
	AgentEjbBeanRemote remote=
	RemoteHelper.lookupRemoteStatelessEmploy();
	String agent=remote.deleteAgent(agentID);
	Map<String,Object> sessionMap=
			FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
	sessionMap.put("deleteAgent", agentID);
	return"Record Deleted";
}


}
