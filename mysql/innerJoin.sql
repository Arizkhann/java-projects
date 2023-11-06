select a.agentid,firstname,lastname,city ,ssn,
p.policyid,appnumber,modalpremium,paymentmodeid
from Agent a inner join agentpolicy AP
on a.agentid=ap.agentid
inner join policy p on p.policyid=ap.policyid;