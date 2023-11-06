package com.java.hib;

 

import java.util.List;

import com.java.hib.Agent;

 

public interface AgentDAO {

    List<Agent> showAgentsOrderedByBasic();

    String searchAgentById(int agentID);

    String addAgent(Agent agent);

    String deleteAgent(int agentID);

    String updateAgentDao(Agent agentUpdated);
}

 