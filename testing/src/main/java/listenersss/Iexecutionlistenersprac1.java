package listenersss;

import org.testng.annotations.Test;
import org.testng.IExecutionListener;
import org.testng.IExecutionListener;


 
	// ExecutionListener1


	
	 

	  public class Iexecutionlistenersprac1 implements IExecutionListener {
	    private long startTime;
	    public void onExecutionStart() {
	          startTime = System.currentTimeMillis();
	          System.out.println("Starting On execution test from ExecutionListener1 ");
	          
	      }

	      public void onExecutionFinish() {
	          System.out.println("execution test  has finished, took around " + (System.currentTimeMillis() - startTime) + "ms");
	      }
	  

	  // ExecutionListener2

  }

