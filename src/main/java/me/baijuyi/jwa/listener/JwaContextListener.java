package me.baijuyi.jwa.listener;

import me.baijuyi.jwa.entity.Department;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.ArrayList;

@WebListener("JwaContextListener")
public class JwaContextListener implements ServletContextListener {

    // Public constructor is required by servlet spec
    public JwaContextListener() {
    }

    // -------------------------------------------------------
    // ServletContextListener implementation
    // -------------------------------------------------------
    public void contextInitialized(ServletContextEvent sce) {
      /* This method is called when the servlet context is
         initialized(when the Web application is deployed). 
         You can initialize servlet context related data here.
      */
      System.out.println("ServletContextListener--------->Set the Container of Department");
      sce.getServletContext().setAttribute("departments",new ArrayList<Department>());
      System.out.println("ServletContextListener--------->Set the Container of Department is Done!");
    }

    public void contextDestroyed(ServletContextEvent sce) {
      /* This method is invoked when the Servlet Context 
         (the Web application) is undeployed or 
         Application Server shuts down.
      */
    }


}
