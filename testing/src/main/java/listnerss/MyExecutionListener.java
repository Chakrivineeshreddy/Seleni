package listnerss;

import org.testng.IExecutionListener;

public class MyExecutionListener implements IExecutionListener {

    
    public void onExecutionStart() {
        System.out.println("Test suite execution has started.");
        // Initialize resources or perform setup tasks here
    }

   
    public void onExecutionFinish() {
        System.out.println("Test suite execution has finished.");
        // Clean up resources or generate reports here
    }
}
