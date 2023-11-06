package com.java.ejb;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.faces.context.FacesContext;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CustPolicyImpl {
	SessionFactory sf;
	Session session;

	public String redirectToTakePolicy(int insId) {
		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("insId", insId);
		return "takePolicy.jsp?faces-redirect=true";
	}

	public String addCustomerPolicy(CustPolicy custpolicy) {
		sf = SessionHelper.getConnection();
		Transaction trans = session.beginTransaction();

		try {
			// Get the insurance amount and pay mode from the CustPolicy object
			double insuranceAmount = custpolicy.getInsAmount();
			String payMode = custpolicy.getPaymode();
			double initialAmount = 0.0; // Initialize initialAmount to zero

			// Calculate the initial amount based on pay mode
			if (payMode.equals("MONTHLY")) {
				initialAmount = insuranceAmount / 12.0;
			} else if ("QUARTERLY".equals(payMode)) {
				initialAmount = insuranceAmount / 4.0;
			} else if ("HALFYEARLY".equals(payMode)) {
				initialAmount = insuranceAmount / 2.0;
			} else if ("YEARLY".equals(payMode)) {
				initialAmount = insuranceAmount;
			}

			// Set the initial amount in the CustPolicy object
			custpolicy.setInitialAmount(initialAmount);

			// Save the CustPolicy object into the database
			session.save(custpolicy);

			// Commit the transaction
			trans.commit();

			return "Policy added successfully";
		} catch (Exception e) {
			// Handle exceptions and roll back the transaction if necessary
			trans.rollback();
			return "Error: " + e.getMessage();
		} finally {
			session.close();
		}

	}

	public String takePolicy(CustPolicy policyNew) throws ParseException {
		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		String custIdStr = (String) sessionMap.get("loggedCustId");
		String insuranceIdStr = (String) sessionMap.get("insuranceId");
		int custId = Integer.parseInt(custIdStr);
		int insuranceId = Integer.parseInt(insuranceIdStr);
		policyNew.setCustId(custId);
		policyNew.setInsId(insuranceId);
		;
		String payMode = policyNew.getPaymode().toString();
		double insuranceAmount = policyNew.getInsAmount();
		double initialAmount = calculateInitialAmount(insuranceAmount, payMode);
		policyNew.setInitialAmount(initialAmount);

		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String formattedDate = sdf.format(date);
		System.out.println("Current Date is : " + sdf.parse(formattedDate));
		policyNew.setRegdDate(sdf.parse(formattedDate));
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(policyNew);
		transaction.commit();
		return "Policy Added";
	}

	double calculateInitialAmount(double insuranceAmount, String PayMode) {
		if (PayMode.equals("MONTHLY")) {
			return insuranceAmount / 12;
		} else if (PayMode.equals("QUARTERLY")) {
			return insuranceAmount / 4;
		} else if (PayMode.equals("HALFYEARLY")) {
			return insuranceAmount / 2;
		} else {
			return insuranceAmount;
		}
	}
	
	public String addCustomerPolicy2(CustPolicy policy) {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Transaction trans = session.beginTransaction();
		String policymode=policy.getPaymode();
		if(policymode.equals("MONTHLY")) {
			System.out.println(policy.getPaymode());
			double amount=policy.getInsAmount();
			double price=(amount/12);
			policy.setInitialAmount(price);
			session.save(policy);
			session.getTransaction().commit();
			return"ShowCustomerPolicy.jsp?faces-redirect=true";
 
		}else if(policymode.equals("QUARTERLY")) {
			System.out.println(policy.getPaymode());
			double amount=policy.getInsAmount();
			double price=(amount/4);
			policy.setInitialAmount(price);
			session.save(policy);
			session.getTransaction().commit();
			return"ShowCustomerPolicy.jsp?faces-redirect=true";
 
 
		}else if(policymode.equals("HALFYEARLY")) {
			System.out.println(policy.getPaymode());
			double amount=policy.getInsAmount();
			double price=(amount/2);
			policy.setInitialAmount(price);
			session.save(policy);
			session.getTransaction().commit();
			return"ShowCustomerPolicy.jsp?faces-redirect=true";
 
		}else if(policymode.equals("YEARLY")) {
			System.out.println(policy.getPaymode());
			
			policy.setInitialAmount(policy.getInsAmount());
			session.save(policy);
			session.getTransaction().commit();
			return"ShowCustomerPolicy.jsp?faces-redirect=true";
 
		}
		return"";
	}

}
