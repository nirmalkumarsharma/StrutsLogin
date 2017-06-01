import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class CustomerAction extends Action
{
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
	{
		ActionForward nextPage=null;
		CustomerForm customerForm= (CustomerForm) form;
		String firstName=customerForm.getFirstName();
		String lastName=customerForm.getLastName();
		Customer customer=new Customer();
		customer.setFirstName(firstName);
		customer.setLastName(lastName);
		saveCustomer(customer);
		System.out.println("Customer First name is " + firstName);
		System.out.println("Customer Last name is " + lastName);
		nextPage = mapping.findForward("success");
		return nextPage; 
	}
	
	public void saveCustomer(Customer customer)
	{
		SessionFactory sessionFactory=new AnnotationConfiguration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(customer);
		transaction.commit();
		session.flush();
		session.close();
		System.out.println("Customer saved successfully");
	}
}
