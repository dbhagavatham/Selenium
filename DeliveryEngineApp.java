//*****************************************************  General Information ****************************************
// Name of the Author : Jagan Malla
// Name of the Class : Common
// Purpose of the Class : This class will contain global generic variable and method declaration used across framework.
// Date Created : Jul 27, 2016
// Last Date Updated : Jul 29, 2016
// Last updated By: Jagan
// Reviewed By : Jagan
// Last Reviewed Date : Jul 29,2016
//*******************************************************************************************************************

//********************************************************  packages ************************************************
package com.hp.exstream.qa.commonlib;

//import java.io.BufferedReader;
import java.io.IOException;
import java.util.Calendar;
//import java.io.InputStreamReader;
import java.util.List;






import java.util.Map;






//import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;





import com.hp.exstream.qa.bean.ScheduleBean;
//import com.hp.exstream.qa.commonlib.UIRenderIds.MENU.JOBDEF;
import com.hp.exstream.qa.deliveryQueues.CreateQueues.QueuesTypes;
import com.hp.exstream.qa.deliveryQueues.UpdateQueue;
import com.hp.exstream.qa.schedule.CreateScheduleCleanup.ScheduleTypes;
import com.hp.exstream.qa.utils.DateUtility;



//****************************************************  Class Information ********************************************
public class DeliveryEngineApp {

	//public static ArrayList<Variables> variablesLis = new ArrayList<Variables>();
	public static MessageBox msgbox = new MessageBox();
	public static WebDriver driver;

	public static class MenuNavigation
	{

		public static final String JOBS = "";
		public static final String JOB_DEFINITIONS = "";
		public static final String DELIVERY_QUEUES = "";
		public static final String REAL_TIME_APPS = "";
		public static final String SCHEDULES = "";
		public static final String NOTIFICATION_CHANNELS = "";
		public static final String DELIVERY_ENGINE = "";
		public static final String CONFIGURATION = "";	

		public static final String MANAGE_USERS = "";	
		public static final String MANAGE_ENGINES = "";	
		public static final String MANAGE_SHARED_PHASES = "";	
		public static final String MANAGE_DATA_CHANNELS = "";	
		public static final String SYSTEM_INFORMATION = "";	
		public static final String BUNDLES = "";	

	}

	public static class LeftMenuNavigation
	{

		public static final String JOBS_NEW = "";
		public static final String JOBS_CANCEL = "";
		public static final String JOBS_PAUSE = "";
		public static final String JOBS_RESUME = "";
		public static final String JOBS_RESUBMIT = "";
		public static final String JOBS_DELETE = "";
		public static final String JOBS_DELETEFILTERED = "";

		public static final String JOBDEFINITION_NEW = "";
		public static final String JOBDEFINITION_IMPORT = "";
		public static final String JOBDEFINITION_EXPORTALL = "";

		public static final String DELIVERYQUEUES_NEW = "";

		public static final String REALTIME_NEW = "";
		public static final String REALTIME_IMPORT = "";
		public static final String REALTIME_EXPORTALL = "";

		public static final String SCHEDULE_NEW = "";	

		public static final String NOTIFICATION_NEW = "";	
		public static final String NOTIFICATION_IMPORT = "";	
		public static final String NOTIFICATION_EXPORTALL = "";	

		public static final String DELIVERYENGINE_NEWDESTINATION = "";	
		public static final String DELIVERYENGINE_LISTDESTINATION = "";	
		public static final String DELIVERYENGINE_NEWDELIVERYREPORT = "";	
		public static final String DELIVERYENGINE_LISTDELIVERYREPORT = "";
		public static final String DELIVERYENGINE_DELETEDELIVERYREPORT = "";

		public static final String DELIVERYENGINE_DELETEJOBHISTORY = "";

		public static final String CONFIGURATION_MANAGEUSERS_USER = "";	
		public static final String CONFIGURATION_MANAGEUSERS_ROLE = "";	
		public static final String CONFIGURATION_MANAGEUSERS_PERMISSION = "";	

		public static final String CONFIGURATION_MANAGEENGINE_ADD = "";	

		public static final String CONFIGURATION_MANAGESHAREDPHASES_IMPORT = "";	
		public static final String CONFIGURATION_MANAGESHAREDPHASES_EXPORTALL = "";	

		public static final String CONFIGURATION_MANAGEDATACHANELS_NEW = "";
		public static final String CONFIGURATION_MANAGEDATACHANELS_IMPORT = "";	
		public static final String CONFIGURATION_MANAGEDATACHANELS_EXPORTALL = "";		

	}

	public static boolean isDeliveryManagerExists()
	{
		boolean flag = false;
		try{
			if((DeliveryEngineApp.driver.findElement(By.id("CCLoginUsernameField")).isDisplayed()) ==  true)
			{
				System.out.println("Message : Command center Application is UP and RUNNING.....");
				flag = true;				
			}
			else
			{
				flag = false;
			}			
		}
		catch (NoSuchElementException e) {
			System.out.println("CAUTION : Command center Application is Not UP......");
		}
		return flag;
	}

	public static void menuSelection(String mainMenuItem)
	{
		switch(mainMenuItem)
		{
		case "DeliveryEngineApp.MenuNavigation.JOBS":
			DeliveryEngineApp.driver.findElement(By.id("CCMENU_JOB_LIST")).click();
			break;
		case "DeliveryEngineApp.MenuNavigation.JOB_DEFINITIONS":
			DeliveryEngineApp.driver.findElement(By.id("CCMENU_JOB_DEFINITION_LIST")).click();				
			break;
		case "DeliveryEngineApp.MenuNavigation.DELIVERY_QUEUES":
			DeliveryEngineApp.driver.findElement(By.id("CCMENU_DELIVERY_QUEUES_LIST")).click();
			break;
		case "DeliveryEngineApp.MenuNavigation.REAL_TIME_APPS":
			DeliveryEngineApp.driver.findElement(By.id("CCMENU_ENGINE_POOL_LIST")).click();
			break;
		case "DeliveryEngineApp.MenuNavigation.SCHEDULES":
			DeliveryEngineApp.driver.findElement(By.id("CCMENU_SCHEDULES_LIST")).click();
			break;
		case "DeliveryEngineApp.MenuNavigation.NOTIFICATION_CHANNELS":
			DeliveryEngineApp.driver.findElement(By.id("CCMENU_NOTIFICATIONS")).click();
			break;
		case "DeliveryEngineApp.MenuNavigation.DELIVERY_ENGINE":
			DeliveryEngineApp.driver.findElement(By.id("CCMENU_DELIVERY_ENGINE")).click();
			break;
		case "DeliveryEngineApp.MenuNavigation.CONFIGURATION":
			DeliveryEngineApp.driver.findElement(By.id("CCMENU_CONFIGURATION")).click();
			break;
		case "DeliveryEngineApp.MenuNavigation.MANAGE_USERS":
			DeliveryEngineApp.driver.findElement(By.id("CCMENU_USER_MANAGEMENT")).click();
			break;
		case "DeliveryEngineApp.MenuNavigation.MANAGE_ENGINES":
			DeliveryEngineApp.driver.findElement(By.id("CCMENU_ENGINE_MANAGEMENT")).click();
			break;
		case "DeliveryEngineApp.MenuNavigation.MANAGE_SHARED_PHASES":
			DeliveryEngineApp.driver.findElement(By.id("CCMENU_SHAREDPHASES")).click();
			break;
		case "DeliveryEngineApp.MenuNavigation.MANAGE_DATA_CHANNELS":
			DeliveryEngineApp.driver.findElement(By.id("CCMENU_DATACHANNELS")).click();
			break;
		case "DeliveryEngineApp.MenuNavigation.SYSTEM_INFORMATION":
			DeliveryEngineApp.driver.findElement(By.id("CCCONFIG_SUBMENU_SYSTEM_INFO")).click();
			break;
		case "DeliveryEngineApp.MenuNavigation.BUNDLES":
			DeliveryEngineApp.driver.findElement(By.id("CCCONFIG_SUBMENU_BUNDLES")).click();
			break;
		default:
			break;
		}
	}

	public boolean importFile(String importFrom,String importFileName, String autoItExe_BrowseWndFileLocation) throws IOException, InterruptedException
	{
		AutoIt_Library AutoLib = new AutoIt_Library();
		boolean flag;
		menuSelection(importFrom);
		driver.findElement(By.xpath("//*[contains(@id, 'IMPORT') or contains(@id, 'Import')]")).click();
		driver.findElement(By.id("CCEnginePoolImportButton")).click();
		driver.findElement(By.xpath("//*[@id='CCupload']/form/input")).click();
		String importFile = autoItExe_BrowseWndFileLocation + " " + importFileName;
		System.out.println("importfile : "+importFile);
		if (AutoLib.browseWndFile(importFile) != 0)
		{
			flag = false;			
		}
		else
		{
			flag = true;			
		}	
		Thread.sleep(5000);		
		driver.findElement(By.xpath("//*[@id='CCImportCloseButton']")).click();
		String value = driver.findElement(By.xpath("//*[@id='CCJobDefinitionsTable']/table/tbody")).getText();
		System.out.println(value);		
		return flag; 

	}

	public static void selectLeftMenuItem(String menuItem)
	{
		switch(menuItem)
		{
		case "DeliveryEngineApp.LeftMenuNavigation.JOBS_NEW":
			DeliveryEngineApp.driver.findElement(By.id("CCNEW_JOB")).click();
			break;
		case "DeliveryEngineApp.LeftMenuNavigation.JOBS_CANCEL":
			DeliveryEngineApp.driver.findElement(By.id("CCJobsCancelButton")).click();
			break;
		case "DeliveryEngineApp.LeftMenuNavigation.JOBS_PAUSE":
			DeliveryEngineApp.driver.findElement(By.id("CCJobsPauseButton")).click();
			break;
		case "DeliveryEngineApp.LeftMenuNavigation.JOBS_RESUME":
			DeliveryEngineApp.driver.findElement(By.id("CCJobsResumeButton")).click();
			break;
		case "DeliveryEngineApp.LeftMenuNavigation.JOBS_RESUBMIT":
			DeliveryEngineApp.driver.findElement(By.id("CCJobsResubmitButton")).click();
			break;
		case "DeliveryEngineApp.LeftMenuNavigation.JOBS_DELETE":
			DeliveryEngineApp.driver.findElement(By.id("CCJobsDeleteButton")).click();
			break;
		case "DeliveryEngineApp.LeftMenuNavigation.JOBS_DELETEFILTERED":
			DeliveryEngineApp.driver.findElement(By.id("CCJobsCleanupButton")).click();
			break;
		case "DeliveryEngineApp.LeftMenuNavigation.JOBDEFINITION_NEW":
			DeliveryEngineApp.driver.findElement(By.id("CCNEW_JOB_DEFINITION")).click();
			break;
		case "DeliveryEngineApp.LeftMenuNavigation.JOBDEFINITION_IMPORT":
			DeliveryEngineApp.driver.findElement(By.id("CCIMPORT_JOB_DEFINITION")).click();
			break;
		case "DeliveryEngineApp.LeftMenuNavigation.JOBDEFINITION_EXPORTALL":
			DeliveryEngineApp.driver.findElement(By.id("CCEXPORT_ALL_JOB_DEFINITIONS")).click();
			break;
		case "DeliveryEngineApp.LeftMenuNavigation.DELIVERYQUEUES_NEW":
			DeliveryEngineApp.driver.findElement(By.id("CCDeliveryQueuesNewButton")).click();
			break;
		case "DeliveryEngineApp.LeftMenuNavigation.REALTIME_NEW":
			DeliveryEngineApp.driver.findElement(By.id("CCEnginePoolNewButton")).click();
			break;
		case "DeliveryEngineApp.LeftMenuNavigation.REALTIME_IMPORT":
			DeliveryEngineApp.driver.findElement(By.id("CCEnginePoolImportButton")).click();
			break;
		case "DeliveryEngineApp.LeftMenuNavigation.REALTIME_EXPORTALL":
			DeliveryEngineApp.driver.findElement(By.id("CCEnginePoolExportButton")).click();
			break;
		case "DeliveryEngineApp.LeftMenuNavigation.SCHEDULE_NEW":
			DeliveryEngineApp.driver.findElement(By.id("CCSchedulesNewButton")).click();
			break;
		case "DeliveryEngineApp.LeftMenuNavigation.NOTIFICATION_NEW":
			DeliveryEngineApp.driver.findElement(By.id("CCNotificationsNewButton")).click();
			break;
		case "DeliveryEngineApp.LeftMenuNavigation.NOTIFICATION_IMPORT":
			DeliveryEngineApp.driver.findElement(By.id("CCNotificationsImportButton")).click();
			break;
		case "DeliveryEngineApp.LeftMenuNavigation.NOTIFICATION_EXPORTALL":
			DeliveryEngineApp.driver.findElement(By.id("CCNotificationsExportAllButton")).click();
			break;
		case "DeliveryEngineApp.LeftMenuNavigation.DELIVERYENGINE_NEWDESTINATION":
			DeliveryEngineApp.driver.findElement(By.id("CCDeliveryDestinationsNewDestination")).click();
			break;
		case "DeliveryEngineApp.LeftMenuNavigation.DELIVERYENGINE_LISTDESTINATION":
			DeliveryEngineApp.driver.findElement(By.id("CCDeliveryDestinationsListDestinations")).click();
			break;
		case "DeliveryEngineApp.LeftMenuNavigation.DELIVERYENGINE_NEWDELIVERYREPORT":
			DeliveryEngineApp.driver.findElement(By.id("CCDeliveryReportNewDeliveryReport")).click();
			break;
		case "DeliveryEngineApp.LeftMenuNavigation.DELIVERYENGINE_LISTDELIVERYREPORT":
			DeliveryEngineApp.driver.findElement(By.id("CCDeliveryReportListReports")).click();
			break;
		case "DeliveryEngineApp.LeftMenuNavigation.DELIVERYENGINE_DELETEDELIVERYREPORT":
			DeliveryEngineApp.driver.findElement(By.id("CCDeliveryReportDeleteSelected")).click();
			break;
		case "DeliveryEngineApp.LeftMenuNavigation.DELIVERYENGINE_DELETEJOBHISTORY":
			DeliveryEngineApp.driver.findElement(By.id("CCDeliveryJobAccounting")).click();
			break;
		case "DeliveryEngineApp.LeftMenuNavigation.CONFIGURATION_MANAGEUSERS_USER":
			DeliveryEngineApp.driver.findElement(By.id("CCUserManagementNewUserButton")).click();
			break;
		case "DeliveryEngineApp.LeftMenuNavigation.CONFIGURATION_MANAGEUSERS_ROLE":
			DeliveryEngineApp.driver.findElement(By.id("CCUserManagementNewRoleButton")).click();
			break;
		case "DeliveryEngineApp.LeftMenuNavigation.CONFIGURATION_MANAGEUSERS_PERMISSION":
			DeliveryEngineApp.driver.findElement(By.id("CCUserManagementPermissionEditButton")).click();
			break;
		case "DeliveryEngineApp.LeftMenuNavigation.CONFIGURATION_MANAGEENGINE_ADD":
			DeliveryEngineApp.driver.findElement(By.id("CCEngineManagementNewEngineButton")).click();
			break;
		case "DeliveryEngineApp.LeftMenuNavigation.CONFIGURATION_MANAGESHAREDPHASES_IMPORT":
			DeliveryEngineApp.driver.findElement(By.id("CCSharedPhasesImportButton")).click();
			break;
		case "DeliveryEngineApp.LeftMenuNavigation.CONFIGURATION_MANAGESHAREDPHASES_EXPORTALL":
			DeliveryEngineApp.driver.findElement(By.id("CCSharedPhasesExportAllButton")).click();
			break;
		case "DeliveryEngineApp.LeftMenuNavigation.CONFIGURATION_MANAGEDATACHANELS_NEW":
			DeliveryEngineApp.driver.findElement(By.id("CCNEW_DATA_CHANNEL")).click();
			break;
		case "DeliveryEngineApp.LeftMenuNavigation.CONFIGURATION_MANAGEDATACHANELS_IMPORT":
			DeliveryEngineApp.driver.findElement(By.id("CCIMPORT_DATA_CHANNEL")).click();
			break;
		case "DeliveryEngineApp.LeftMenuNavigation.CONFIGURATION_MANAGEDATACHANELS_EXPORTALL":
			DeliveryEngineApp.driver.findElement(By.id("CCEXPORT_ALL_DATA_CHANNEL")).click();
			break;
		default:
			break;
		}
	}

	public boolean selectIdByNameFromTable(String itemName)
	{
		boolean flag = false;
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("CCfilterField")));
		DeliveryEngineApp.driver.findElement(By.id("CCfilterField")).click();
		DeliveryEngineApp.driver.findElement(By.id("CCfilterField")).sendKeys(itemName);
		DeliveryEngineApp.driver.findElement(By.id("CCJobsRefreshButton")).click();
		DeliveryEngineApp.driver.findElement(By.id("CCfilterField")).click();

		int numOfRowItems = DeliveryEngineApp.driver.findElements(By.id("CCEDIT_ENTITY_0")).size();

		if(numOfRowItems !=0)
		{

			for(int i=0; i<=numOfRowItems; i++)
			{
				System.out.println("CCEDIT_ENTITY_"+i);
				String Jobname = DeliveryEngineApp.driver.findElement(By.id("CCEDIT_ENTITY_"+i)).getText();
				System.out.println(Jobname+":nameofthejob");	

				if (Jobname.equals(itemName))
				{
					System.out.println(itemName+" :Item Found in Table ");
					flag = true;
					break;
				}
			}
		}
		else {
			System.out.println(itemName+" :Item Not Found in Table ");
		}
		return flag;				
	}	

	public boolean deleteItemFromTable(String itemName)
	{
		boolean flag = false;	
		flag = selectIdByNameFromTable(itemName);
		if (flag == true)
		{
			DeliveryEngineApp.driver.findElement(By.id("CCDELETE_ENTITY_0")).click();	
			if(msgbox.isExists()== true)
			{
				msgbox.accept();
				flag = true;				
			}
			else
			{
				flag = false;
			}
			return flag;
		}
		else
		{
			flag = false;
			return flag;
		}		
	}

	public boolean editItemFromTable(String itemName)
	{
		boolean flag = false;	
		flag = selectIdByNameFromTable(itemName);
		if (flag == true)
		{
			DeliveryEngineApp.driver.findElement(By.id("CCEDIT_ENTITY_0")).click();	
			if(msgbox.isExists()== true)
			{
				msgbox.accept();
				flag = true;				
			}
			else
			{
				flag = false;
			}
			return flag;
		}
		else
		{
			flag = false;
			return flag;
		}		
	}

	public boolean searchItemFromTable(String itemName)
	{
		boolean flag = false;	
		flag = selectIdByNameFromTable(itemName);
		if (flag == true)
		{
			DeliveryEngineApp.driver.findElement(By.id("CCEDIT_ENTITY_0")).click();	
			if(msgbox.isExists()== true)
			{
				msgbox.accept();
				flag = true;				
			}
			else
			{
				flag = false;
			}
			return flag;
		}
		else
		{
			flag = false;
			return flag;
		}		
	}

	public boolean exportItemFromTable(String itemName)
	{
		boolean flag = false;	
		flag = selectIdByNameFromTable(itemName);
		if (flag == true)
		{
			DeliveryEngineApp.driver.findElement(By.id("CCEXPORT_ENTITY_0")).click();	
			if(msgbox.isExists()== true)
			{
				msgbox.accept();
				flag = true;				
			}
			else
			{
				flag = false;
			}
			return flag;
		}
		else
		{
			flag = false;
			return flag;
		}		
	}

	//Creates Delivery Queue Based on Queue Type
	public void CreateQueue(String Queuename,String QueueType,Map<String,Boolean> QueueBooleanList,Map<String,String> QueuesVariableList){
		DeliveryEngineApp.menuSelection("DeliveryEngineApp.MenuNavigation.DELIVERY_QUEUES");
		DeliveryEngineApp.selectLeftMenuItem("DeliveryEngineApp.LeftMenuNavigation.DELIVERYQUEUES_NEW");
		DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.VARIABLE_NEW_DELIVERY_QUEUE_NAME)).sendKeys(Queuename);
		//Select the Queue Type Based on Parameter "QueueType"
		Select select = new Select(DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.VARIABLE_NEW_DELIVERY_QUEUE_TYPE)));
		select.selectByVisibleText(QueueType);
		switch(QueueType)
		{
		//Creates the LocalFolder Queue	
		case QueuesTypes.LocalFolderQueue:
			System.out.println("Creating the Local folder Queue...");
			DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.VARIABLE_PATH)).sendKeys(QueuesVariableList.get(DeliveryEngineUI_ID.VARIABLE_PATH));
			if(QueueBooleanList.get(DeliveryEngineUI_ID.VARIABLE_OVERWRITECHECKBOX) == true)
			{	
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.VARIABLE_OVERWRITECHECKBOX)).click();
			}
			if(QueueBooleanList.get(DeliveryEngineUI_ID.VARIABLE_SIGNALFILE) == true)
			{	
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.VARIABLE_SIGNALFILE)).click();
			}
			//Verifies whether Local File field is exists or not
			try{
				boolean GeneratesignalfileIconPresence = DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.VARIABLE_SIGNALFILEEXP)).isDisplayed();
				if (GeneratesignalfileIconPresence == true ){
					if (UpdateQueue.QueuesString.get(DeliveryEngineUI_ID.VARIABLE_SIGNALFILEEXP)!=null && !UpdateQueue.QueuesString.get(DeliveryEngineUI_ID.VARIABLE_SIGNALFILEEXP).equalsIgnoreCase("")){
						DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.VARIABLE_SIGNALFILEEXP)).clear();
						DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.VARIABLE_SIGNALFILEEXP)).sendKeys(QueuesVariableList.get(DeliveryEngineUI_ID.VARIABLE_SIGNALFILEEXP));
					}
				}

			}catch(Exception e){
				System.out.println("Signal file (exp) field is not displayed");
			}

			DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.VARIABLE_PREFIXFIELD)).sendKeys(QueuesVariableList.get(DeliveryEngineUI_ID.VARIABLE_PREFIXFIELD));
			DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.VARIABLE_QUEUES_DESCRIPTION)).sendKeys(QueuesVariableList.get(DeliveryEngineUI_ID.VARIABLE_QUEUES_DESCRIPTION));
			break;
			//Creates the FTP Queue
		case QueuesTypes.FTPQueue:
			System.out.println("Creating the FTP Queue...");
			if (UpdateQueue.QueuesString.get(DeliveryEngineUI_ID.FTP_HOST)!=null && !UpdateQueue.QueuesString.get(DeliveryEngineUI_ID.FTP_HOST).equalsIgnoreCase("")){
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.FTP_HOST)).clear();
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.FTP_HOST)).sendKeys(QueuesVariableList.get(DeliveryEngineUI_ID.FTP_HOST));
			}
			if (UpdateQueue.QueuesString.get(DeliveryEngineUI_ID.FTP_PORT)!=null && !UpdateQueue.QueuesString.get(DeliveryEngineUI_ID.FTP_PORT).equalsIgnoreCase("")){
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.FTP_PORT)).clear();
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.FTP_PORT)).sendKeys(QueuesVariableList.get(DeliveryEngineUI_ID.FTP_PORT));
			}
			if (UpdateQueue.QueuesString.get(DeliveryEngineUI_ID.FTP_USER)!=null && !UpdateQueue.QueuesString.get(DeliveryEngineUI_ID.FTP_USER).equalsIgnoreCase("")){
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.FTP_USER)).clear();
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.FTP_USER)).sendKeys(QueuesVariableList.get(DeliveryEngineUI_ID.FTP_USER));
			}
			DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.FTP_PASS)).sendKeys(QueuesVariableList.get(DeliveryEngineUI_ID.FTP_PASS));
			DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.VARIABLE_PATH)).sendKeys(QueuesVariableList.get(DeliveryEngineUI_ID.VARIABLE_PATH));
			if(QueueBooleanList.get(DeliveryEngineUI_ID.VARIABLE_OVERWRITECHECKBOX) == true)
			{	
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.VARIABLE_OVERWRITECHECKBOX)).click();
			}
			if(QueueBooleanList.get(DeliveryEngineUI_ID.VARIABLE_SIGNALFILE) == true)
			{	
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.VARIABLE_SIGNALFILE)).click();
			}
			//Verifies whether Local File field is exists or not
			try{
				boolean GeneratesignalfileIconPresence = DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.VARIABLE_SIGNALFILEEXP)).isDisplayed();
				if (GeneratesignalfileIconPresence == true ){
					if (UpdateQueue.QueuesString.get(DeliveryEngineUI_ID.VARIABLE_SIGNALFILEEXP)!=null && !UpdateQueue.QueuesString.get(DeliveryEngineUI_ID.VARIABLE_SIGNALFILEEXP).equalsIgnoreCase("")){
						DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.VARIABLE_SIGNALFILEEXP)).clear();
						DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.VARIABLE_SIGNALFILEEXP)).sendKeys(QueuesVariableList.get(DeliveryEngineUI_ID.VARIABLE_SIGNALFILEEXP));
					}
				}

			}catch(Exception e){
				System.out.println("Signal file (exp) field is not displayed");
			}
			DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.VARIABLE_PREFIXFIELD)).sendKeys(QueuesVariableList.get(DeliveryEngineUI_ID.VARIABLE_PREFIXFIELD));
			DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.VARIABLE_QUEUES_DESCRIPTION)).sendKeys(QueuesVariableList.get(DeliveryEngineUI_ID.VARIABLE_QUEUES_DESCRIPTION));
			break;
			//Creates the JMS Queue
		case QueuesTypes.JMSQueue:
			System.out.println("Creating the JMS Queue...");
			DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.JMS_CONNECTION_FACTORY)).sendKeys(QueuesVariableList.get(DeliveryEngineUI_ID.JMS_CONNECTION_FACTORY));
			if(QueueBooleanList.get(DeliveryEngineUI_ID.JMS_REAL_QUEUE) == true)
			{	
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.JMS_REAL_QUEUE)).click();
			}
			DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.JMS_QUEUE_NAME)).sendKeys(QueuesVariableList.get(DeliveryEngineUI_ID.JMS_QUEUE_NAME));
			DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.JMS_USER)).sendKeys(QueuesVariableList.get(DeliveryEngineUI_ID.JMS_USER));
			DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.JMS_PASS)).sendKeys(QueuesVariableList.get(DeliveryEngineUI_ID.JMS_PASS));
			DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.JMS_CORRELATIONFIELD)).sendKeys(QueuesVariableList.get(DeliveryEngineUI_ID.JMS_CORRELATIONFIELD));
			DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.JMS_MESSAGEFIELD)).sendKeys(QueuesVariableList.get(DeliveryEngineUI_ID.JMS_MESSAGEFIELD));
			Select selectJmsMessageType = new Select(DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.JMS_MESSAGELIST)));
			selectJmsMessageType.selectByVisibleText(QueuesVariableList.get(DeliveryEngineUI_ID.JMS_MESSAGELIST));
			DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.VARIABLE_QUEUES_DESCRIPTION)).sendKeys(QueuesVariableList.get(DeliveryEngineUI_ID.VARIABLE_QUEUES_DESCRIPTION));

			break;
		default:
			//Creates the LPR Queues 
			System.out.println("Creating the LPR Queue...");
			if (UpdateQueue.QueuesString.get(DeliveryEngineUI_ID.LPR_QUEUEFIELD)!=null && !UpdateQueue.QueuesString.get(DeliveryEngineUI_ID.LPR_QUEUEFIELD).equalsIgnoreCase("")){
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.LPR_QUEUEFIELD)).clear();
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.LPR_QUEUEFIELD)).sendKeys(QueuesVariableList.get(DeliveryEngineUI_ID.LPR_QUEUEFIELD));
			}
			if (UpdateQueue.QueuesString.get(DeliveryEngineUI_ID.LPR_HOSTNAME)!=null && !UpdateQueue.QueuesString.get(DeliveryEngineUI_ID.LPR_HOSTNAME).equalsIgnoreCase("")){
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.LPR_HOSTNAME)).clear();
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.LPR_HOSTNAME)).sendKeys(QueuesVariableList.get(DeliveryEngineUI_ID.LPR_HOSTNAME));
			}	
			if (UpdateQueue.QueuesString.get(DeliveryEngineUI_ID.LPR_PORT)!=null && !UpdateQueue.QueuesString.get(DeliveryEngineUI_ID.LPR_PORT).equalsIgnoreCase("")){
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.LPR_PORT)).clear();
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.LPR_PORT)).sendKeys(QueuesVariableList.get(DeliveryEngineUI_ID.LPR_PORT));
			}
			DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.VARIABLE_QUEUES_DESCRIPTION)).sendKeys(QueuesVariableList.get(DeliveryEngineUI_ID.VARIABLE_QUEUES_DESCRIPTION));
			break;
		}
		DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.APPLICATION_WINDOW_OK)).click();	
		//Verifies whether Delivery Queue is Created or not
		if(msgbox.isExists() == true)
		{
			System.out.println(msgbox.getText());
			msgbox.dismiss();
			DeliveryEngineApp.driver.findElement(By.xpath("//*[@id='CCCOMMAND_CANCEL']")).click();								
		}
		else
		{				
			System.out.println(Queuename +" :Delivery Queue created Sucessfully");		
		}
	}
	//Update the Queue based on Queue type
	public void UpdateQueue(String QueueName,Map<String,Boolean> QueueBooleanList,Map<String,String> QueuesVariableList){
		boolean flag = false;	
		flag = selectIdByNameFromTable(QueueName);
		if (flag == true)
		{
			DeliveryEngineApp.driver.findElement(By.id("CCEDIT_ENTITY_0")).click();
		}
		//Verifies whether Queue is which type based on that it will update.
		Select selectQueueType = new Select(DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.VARIABLE_NEW_DELIVERY_QUEUE_TYPE)));
		WebElement Queuetype =  selectQueueType.getFirstSelectedOption();
		String QueueType = Queuetype.getText();	
		switch(QueueType)
		{
		//Updates the LocalFolderQueue 	
		case QueuesTypes.LocalFolderQueue:
			System.out.println("Updating the Local folder Queue...");
			if (UpdateQueue.QueuesString.get(DeliveryEngineUI_ID.VARIABLE_PATH)!=null && !UpdateQueue.QueuesString.get(DeliveryEngineUI_ID.VARIABLE_PATH).equalsIgnoreCase("")){
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.VARIABLE_PATH)).clear();
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.VARIABLE_PATH)).sendKeys(QueuesVariableList.get(DeliveryEngineUI_ID.VARIABLE_PATH));
			}
			if(QueueBooleanList.get(DeliveryEngineUI_ID.VARIABLE_OVERWRITECHECKBOX) == true)
			{	
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.VARIABLE_OVERWRITECHECKBOX)).click();
			}
			if(QueueBooleanList.get(DeliveryEngineUI_ID.VARIABLE_SIGNALFILE) == true)
			{	
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.VARIABLE_SIGNALFILE)).click();
			}
			//Verifies whether Local File field is exists or not
			try{
				boolean GeneratesignalfileIconPresence = DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.VARIABLE_SIGNALFILEEXP)).isDisplayed();
				if (GeneratesignalfileIconPresence == true ){
					if (UpdateQueue.QueuesString.get(DeliveryEngineUI_ID.VARIABLE_SIGNALFILEEXP)!=null && !UpdateQueue.QueuesString.get(DeliveryEngineUI_ID.VARIABLE_SIGNALFILEEXP).equalsIgnoreCase("")){
						DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.VARIABLE_SIGNALFILEEXP)).clear();
						DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.VARIABLE_SIGNALFILEEXP)).sendKeys(QueuesVariableList.get(DeliveryEngineUI_ID.VARIABLE_SIGNALFILEEXP));
					}

				}

			}catch(Exception e){
				System.out.println("Signal file (exp) field is not displayed");
			}
			if (UpdateQueue.QueuesString.get(DeliveryEngineUI_ID.VARIABLE_PREFIXFIELD)!=null && !UpdateQueue.QueuesString.get(DeliveryEngineUI_ID.VARIABLE_PREFIXFIELD).equalsIgnoreCase("")){
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.VARIABLE_PREFIXFIELD)).clear();
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.VARIABLE_PREFIXFIELD)).sendKeys(QueuesVariableList.get(DeliveryEngineUI_ID.VARIABLE_PREFIXFIELD));
			}
			if (UpdateQueue.QueuesString.get(DeliveryEngineUI_ID.VARIABLE_QUEUES_DESCRIPTION)!=null && !UpdateQueue.QueuesString.get(DeliveryEngineUI_ID.VARIABLE_QUEUES_DESCRIPTION).equalsIgnoreCase("")){
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.VARIABLE_QUEUES_DESCRIPTION)).clear();
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.VARIABLE_QUEUES_DESCRIPTION)).sendKeys(QueuesVariableList.get(DeliveryEngineUI_ID.VARIABLE_QUEUES_DESCRIPTION));
			}
			break;
			//Updates the FTP Queue
		case QueuesTypes.FTPQueue:
			System.out.println("Updating the FTP Queue...");
			if (UpdateQueue.QueuesString.get(DeliveryEngineUI_ID.FTP_HOST)!=null && !UpdateQueue.QueuesString.get(DeliveryEngineUI_ID.FTP_HOST).equalsIgnoreCase("")){
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.FTP_HOST)).clear();
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.FTP_HOST)).sendKeys(QueuesVariableList.get(DeliveryEngineUI_ID.FTP_HOST));
			}
			if (UpdateQueue.QueuesString.get(DeliveryEngineUI_ID.FTP_PORT)!=null && !UpdateQueue.QueuesString.get(DeliveryEngineUI_ID.FTP_PORT).equalsIgnoreCase("")){
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.FTP_PORT)).clear();
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.FTP_PORT)).sendKeys(QueuesVariableList.get(DeliveryEngineUI_ID.FTP_PORT));
			}
			if (UpdateQueue.QueuesString.get(DeliveryEngineUI_ID.FTP_USER)!=null && !UpdateQueue.QueuesString.get(DeliveryEngineUI_ID.FTP_USER).equalsIgnoreCase("")){
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.FTP_USER)).clear();
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.FTP_USER)).sendKeys(QueuesVariableList.get(DeliveryEngineUI_ID.FTP_USER));
			}
			if (UpdateQueue.QueuesString.get(DeliveryEngineUI_ID.FTP_PASS)!=null && !UpdateQueue.QueuesString.get(DeliveryEngineUI_ID.FTP_PASS).equalsIgnoreCase("")){
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.FTP_PASS)).clear();
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.FTP_PASS)).sendKeys(QueuesVariableList.get(DeliveryEngineUI_ID.FTP_PASS));
			}
			if (UpdateQueue.QueuesString.get(DeliveryEngineUI_ID.VARIABLE_PATH)!=null && !UpdateQueue.QueuesString.get(DeliveryEngineUI_ID.VARIABLE_PATH).equalsIgnoreCase("")){
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.VARIABLE_PATH)).clear();
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.VARIABLE_PATH)).sendKeys(QueuesVariableList.get(DeliveryEngineUI_ID.VARIABLE_PATH));
			}
			if(QueueBooleanList.get(DeliveryEngineUI_ID.VARIABLE_OVERWRITECHECKBOX) == true)
			{	
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.VARIABLE_OVERWRITECHECKBOX)).click();
			}
			if(QueueBooleanList.get(DeliveryEngineUI_ID.VARIABLE_SIGNALFILE) == true)
			{	
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.VARIABLE_SIGNALFILE)).click();
			}
			//Verifies whether Local File field is exists or not
			try{
				boolean GeneratesignalfileIconPresence = DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.VARIABLE_SIGNALFILEEXP)).isDisplayed();
				if (GeneratesignalfileIconPresence == true ){

					if (UpdateQueue.QueuesString.get(DeliveryEngineUI_ID.VARIABLE_SIGNALFILEEXP)!=null && !UpdateQueue.QueuesString.get(DeliveryEngineUI_ID.VARIABLE_SIGNALFILEEXP).equalsIgnoreCase("")){
						DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.VARIABLE_SIGNALFILEEXP)).clear();
						DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.VARIABLE_SIGNALFILEEXP)).sendKeys(QueuesVariableList.get(DeliveryEngineUI_ID.VARIABLE_SIGNALFILEEXP));
					}
				}

			}catch(Exception e){
				System.out.println("Signal file (exp) field is not displayed");
			}
			if (UpdateQueue.QueuesString.get(DeliveryEngineUI_ID.VARIABLE_PREFIXFIELD)!=null && !UpdateQueue.QueuesString.get(DeliveryEngineUI_ID.VARIABLE_PREFIXFIELD).equalsIgnoreCase("")){
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.VARIABLE_PREFIXFIELD)).clear();
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.VARIABLE_PREFIXFIELD)).sendKeys(QueuesVariableList.get(DeliveryEngineUI_ID.VARIABLE_PREFIXFIELD));
			}
			if (UpdateQueue.QueuesString.get(DeliveryEngineUI_ID.VARIABLE_QUEUES_DESCRIPTION)!=null && !UpdateQueue.QueuesString.get(DeliveryEngineUI_ID.VARIABLE_QUEUES_DESCRIPTION).equalsIgnoreCase("")){
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.VARIABLE_QUEUES_DESCRIPTION)).clear();
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.VARIABLE_QUEUES_DESCRIPTION)).sendKeys(QueuesVariableList.get(DeliveryEngineUI_ID.VARIABLE_QUEUES_DESCRIPTION));
			}

			break;
			//Update the JMS Queue
		case QueuesTypes.JMSQueue:
			System.out.println("Updating the JMS Queue...");
			if (UpdateQueue.QueuesString.get(DeliveryEngineUI_ID.JMS_CONNECTION_FACTORY)!=null && !UpdateQueue.QueuesString.get(DeliveryEngineUI_ID.JMS_CONNECTION_FACTORY).equalsIgnoreCase("")){
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.JMS_CONNECTION_FACTORY)).clear();
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.JMS_CONNECTION_FACTORY)).sendKeys(QueuesVariableList.get(DeliveryEngineUI_ID.JMS_CONNECTION_FACTORY));
			}
			if(QueueBooleanList.get(DeliveryEngineUI_ID.JMS_REAL_QUEUE) == true)
			{	
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.JMS_REAL_QUEUE)).click();
			}
			if (UpdateQueue.QueuesString.get(DeliveryEngineUI_ID.JMS_QUEUE_NAME)!=null && !UpdateQueue.QueuesString.get(DeliveryEngineUI_ID.JMS_QUEUE_NAME).equalsIgnoreCase("")){
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.JMS_QUEUE_NAME)).clear();
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.JMS_QUEUE_NAME)).sendKeys(QueuesVariableList.get(DeliveryEngineUI_ID.JMS_QUEUE_NAME));
			}
			if (UpdateQueue.QueuesString.get(DeliveryEngineUI_ID.JMS_USER)!=null && !UpdateQueue.QueuesString.get(DeliveryEngineUI_ID.JMS_USER).equalsIgnoreCase("")){
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.JMS_USER)).clear();
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.JMS_USER)).sendKeys(QueuesVariableList.get(DeliveryEngineUI_ID.JMS_USER));
			}
			if (UpdateQueue.QueuesString.get(DeliveryEngineUI_ID.JMS_PASS)!=null && !UpdateQueue.QueuesString.get(DeliveryEngineUI_ID.JMS_PASS).equalsIgnoreCase("")){
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.JMS_PASS)).clear();
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.JMS_PASS)).sendKeys(QueuesVariableList.get(DeliveryEngineUI_ID.JMS_PASS));
			}
			if (UpdateQueue.QueuesString.get(DeliveryEngineUI_ID.JMS_CORRELATIONFIELD)!=null && !UpdateQueue.QueuesString.get(DeliveryEngineUI_ID.JMS_CORRELATIONFIELD).equalsIgnoreCase("")){
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.JMS_CORRELATIONFIELD)).clear();
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.JMS_CORRELATIONFIELD)).sendKeys(QueuesVariableList.get(DeliveryEngineUI_ID.JMS_CORRELATIONFIELD));
			}
			if (UpdateQueue.QueuesString.get(DeliveryEngineUI_ID.JMS_MESSAGEFIELD)!=null && !UpdateQueue.QueuesString.get(DeliveryEngineUI_ID.JMS_MESSAGEFIELD).equalsIgnoreCase("")){
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.JMS_MESSAGEFIELD)).clear();
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.JMS_MESSAGEFIELD)).sendKeys(QueuesVariableList.get(DeliveryEngineUI_ID.JMS_MESSAGEFIELD));
			}
			Select selectJmsMessageType = new Select(DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.JMS_MESSAGELIST)));
			selectJmsMessageType.selectByVisibleText(QueuesVariableList.get(DeliveryEngineUI_ID.JMS_MESSAGELIST));
			if (UpdateQueue.QueuesString.get(DeliveryEngineUI_ID.VARIABLE_QUEUES_DESCRIPTION)!=null && !UpdateQueue.QueuesString.get(DeliveryEngineUI_ID.VARIABLE_QUEUES_DESCRIPTION).equalsIgnoreCase("")){
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.VARIABLE_QUEUES_DESCRIPTION)).clear();
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.VARIABLE_QUEUES_DESCRIPTION)).sendKeys(QueuesVariableList.get(DeliveryEngineUI_ID.VARIABLE_QUEUES_DESCRIPTION));
			}

			break;
		default:
			//Updates the LPR Queue
			System.out.println("Updating the LPR Queue...");
			if (UpdateQueue.QueuesString.get(DeliveryEngineUI_ID.LPR_QUEUEFIELD)!=null && !UpdateQueue.QueuesString.get(DeliveryEngineUI_ID.LPR_QUEUEFIELD).equalsIgnoreCase("")){
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.LPR_QUEUEFIELD)).clear();
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.LPR_QUEUEFIELD)).sendKeys(QueuesVariableList.get(DeliveryEngineUI_ID.LPR_QUEUEFIELD));
			}
			if (UpdateQueue.QueuesString.get(DeliveryEngineUI_ID.LPR_HOSTNAME)!=null && !UpdateQueue.QueuesString.get(DeliveryEngineUI_ID.LPR_HOSTNAME).equalsIgnoreCase("")){
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.LPR_HOSTNAME)).clear();
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.LPR_HOSTNAME)).sendKeys(QueuesVariableList.get(DeliveryEngineUI_ID.LPR_HOSTNAME));
			}	
			if (UpdateQueue.QueuesString.get(DeliveryEngineUI_ID.LPR_PORT)!=null && !UpdateQueue.QueuesString.get(DeliveryEngineUI_ID.LPR_PORT).equalsIgnoreCase("")){
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.LPR_PORT)).clear();
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.LPR_PORT)).sendKeys(QueuesVariableList.get(DeliveryEngineUI_ID.LPR_PORT));
			}
			if (UpdateQueue.QueuesString.get(DeliveryEngineUI_ID.VARIABLE_QUEUES_DESCRIPTION)!=null && !UpdateQueue.QueuesString.get(DeliveryEngineUI_ID.LPR_PORT).equalsIgnoreCase("")){
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.VARIABLE_QUEUES_DESCRIPTION)).clear();
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.VARIABLE_QUEUES_DESCRIPTION)).sendKeys(QueuesVariableList.get(DeliveryEngineUI_ID.VARIABLE_QUEUES_DESCRIPTION));
			}

			break;
		}
		DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.APPLICATION_WINDOW_OK)).click();	
		//Verifies whether Queue is Updated or not
		if(msgbox.isExists() == true)
		{
			System.out.println(msgbox.getText());
			msgbox.dismiss();
			DeliveryEngineApp.driver.findElement(By.xpath("//*[@id='CCCOMMAND_CANCEL']")).click();								
		}
		else
		{				
			System.out.println(QueueName +" :Delivery Queue Updated Sucessfully");		
		}

	}


	public void verifyTableData(String tableName, String tableId, List<String> compareData, List<String> compareDataWith)
	{

	}


	//Creating Schedules with Schedule type and action type

	public void newScheduleCreationCleanup(String Schedule,String ScheduleType,String ScheduleActionType,boolean checkboxStatus)
	{

		DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.CREATE_SCHEDULE)).click();
		DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.CREATE_NEWSCHEDULE)).click();
		DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.CREATE_SCHEDULENAME)).sendKeys(Schedule);
		Select selectType = new Select(DeliveryEngineApp.driver.findElement(By.xpath(DeliveryEngineUI_ID.SELECT_SCHEDULETYPE)));
		selectType.selectByVisibleText(ScheduleType);//Selects schedule type Recurring or One-time

		switch(ScheduleType)
		{
		case ScheduleTypes.ScheduleOnetime:
			DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.SCHEDULE_ONETIME)).clear();

			// This function adds minutes from the current Dates
			//Calendar.HOUR
			//Calendar.MINUTE
			//Calendar.DATE
			//Calendar.SECOND
			//DateUtility.addTime(Calendar.HOUR, 1);
			//System.out.println(DateUtility.addTime(Calendar.HOUR, 1));

			DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.SCHEDULE_ONETIME)).sendKeys(DateUtility.addTime(Calendar.HOUR, 1,DateUtility.Format.FORMAT1));

			//Verification for check box enable or disable
			if(checkboxStatus == true)	
			{
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.SELECT_CHECKBOX)).click();
			}
			else
			{
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.SELECT_CHECKBOX)).isSelected();
			}

			Select actionType = new Select(DeliveryEngineApp.driver.findElement(By.xpath(DeliveryEngineUI_ID.SCHEDULE_ACTIONTYPE)));
			actionType.selectByVisibleText(ScheduleActionType);

			switch(ScheduleActionType)
			{
			case ScheduleTypes.ActionCleanupType:
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.ADD_REMOVE_JOBDEF_SCHEDULE)).click();
				Select select = new Select(DeliveryEngineApp.driver.findElement(By.xpath(DeliveryEngineUI_ID.SCHEDULE_JOBDEFLIST)));
				selectOptions(select, new String[]{"Sample Normal One Step", "Sample One Step RT"});

				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.SELECT_CCJDTORIGHT)).click();
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.SELECT_JOBDEF_WINDOW_SAVE)).click();

				//Selecting Job state for schedule
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.ADD_REMOVE_JOBSTATES)).click();
				Select selectJobStatus = new Select(DeliveryEngineApp.driver.findElement(By.xpath(DeliveryEngineUI_ID.SCHEDULE_JOBSTATE_LIST)));
				selectOptions(selectJobStatus, new String[]{"ERROR","DELETED"});
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.SELECT_JDSTATETORIGHT)).click();

				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.APPLICATION_WINDOW_OK)).click();
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.SELECT_JOBDEF_WINDOW_SAVE)).click();
				break;

			default:
			}

			//DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.APPLICATION_WINDOW_OK)).click();

			break;
		default:
			DeliveryEngineApp.driver.findElement(By.id("CCSchedulesNewCronField")).clear();//Recurring
			DeliveryEngineApp.driver.findElement(By.id("CCSchedulesNewCronField")).sendKeys(DeliveryEngineUI_ID.SCHEUDLE_RECURRING_TIME);

			if(checkboxStatus == true)	
			{
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.SELECT_CHECKBOX)).click();
			}
			else
			{
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.SELECT_CHECKBOX)).isSelected();

			}
			Select actionTyperecurring = new Select(DeliveryEngineApp.driver.findElement(By.xpath(DeliveryEngineUI_ID.SCHEDULE_ACTIONTYPE)));
			actionTyperecurring.selectByVisibleText(ScheduleActionType);

			switch(ScheduleActionType)
			{
			case ScheduleTypes.ActionCleanupType:
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.ADD_REMOVE_JOBDEF_SCHEDULE)).click();
				Select select = new Select(DeliveryEngineApp.driver.findElement(By.xpath(DeliveryEngineUI_ID.SCHEDULE_JOBDEFLIST)));
				selectOptions(select, new String[]{"Sample Normal One Step", "Sample One Step RT"});

				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.SELECT_CCJDTORIGHT)).click();
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.SELECT_JOBDEF_WINDOW_SAVE)).click();

				//Selecting Job state for schedule
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.ADD_REMOVE_JOBSTATES)).click();
				Select selectJobStatus = new Select(DeliveryEngineApp.driver.findElement(By.xpath(DeliveryEngineUI_ID.SCHEDULE_JOBSTATE_LIST)));
				selectOptions(selectJobStatus, new String[]{"ERROR","DELETED"});
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.SELECT_JDSTATETORIGHT)).click();

				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.APPLICATION_WINDOW_OK)).click();
				DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.SELECT_JOBDEF_WINDOW_SAVE)).click();
				break;

			default:

			}
		}
		DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.APPLICATION_WINDOW_OK)).click();
		if(msgbox.isExists() == true)
		{
			System.out.println(msgbox.getText());
			msgbox.dismiss();
			DeliveryEngineApp.driver.findElement(By.xpath("//*[@id='CCCOMMAND_CANCEL']")).click();                                                   
		}
		else
		{                          
			System.out.println( Schedule+" :Schedule Created Sucessfully");            
		}

	}

	public void selectOptions(Select select, String[] input){
		for (int i = 0; i < input.length; i++) {
			select.selectByVisibleText(input[i]);
		}
	}


	public void updateScheduleCleanup(String Schedule,boolean checkboxStatus, ScheduleBean schedule){
		
		boolean flag = false;	
		flag = selectIdByNameFromTable(Schedule);

		if (flag == true){
			DeliveryEngineApp.driver.findElement(By.id("CCEDIT_ENTITY_0")).click();	
		}

		Select selectSchedule = new Select(DeliveryEngineApp.driver.findElement(By.xpath(DeliveryEngineUI_ID.SELECT_SCHEDULETYPE)));
		WebElement schedulType = selectSchedule.getFirstSelectedOption();
		String ScheduleType = schedulType.getText();


		Select selectScheduleAction = new Select(DeliveryEngineApp.driver.findElement(By.xpath(DeliveryEngineUI_ID.SCHEDULE_ACTIONTYPE)));
		WebElement actionType = selectScheduleAction.getFirstSelectedOption();
		String ScheduleActionType = actionType.getText();
		System.out.println(ScheduleActionType);


		if(checkboxStatus == true)	{
			DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.SELECT_CHECKBOX)).click();
		}
		else{
			DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.SELECT_CHECKBOX)).isSelected();
		}

		// Time set for One time.
		if(ScheduleType.equals(ScheduleTypes.ScheduleRecurring)){
			DeliveryEngineApp.driver.findElement(By.id("CCSchedulesNewCronField")).clear();//Recurring
			DeliveryEngineApp.driver.findElement(By.id("CCSchedulesNewCronField")).sendKeys(DeliveryEngineUI_ID.SCHEUDLE_RECURRING_TIME);
		}else{
			DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.SCHEDULE_ONETIME)).clear();
			DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.SCHEDULE_ONETIME)).sendKeys(DateUtility.addTime(Calendar.HOUR, 1,DateUtility.Format.FORMAT1));
		}

		switch (ScheduleActionType) {

		case ScheduleTypes.ActionCleanupType:

			doCleanUpUpdate(schedule);
			break;

		case ScheduleTypes.Others:
			doOthers(schedule);
			break;

		default:
			break;
		}

	}


	public void doCleanUpUpdate(ScheduleBean schedule){

		DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.ADD_REMOVE_JOBDEF_SCHEDULE)).click();

		if(schedule.getTargetjobDefinition()!=null){
			Select RemoveJD = new Select(DeliveryEngineApp.driver.findElement(By.xpath(DeliveryEngineUI_ID.SELECTED_JOBDEF)));
			selectOptions(RemoveJD, schedule.getTargetjobDefinition());
			DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.SELECTED_JOBDEFTOLEFT)).click();
		}

		if(schedule.getSrcjobDefinition()!=null){
			Select select = new Select(DeliveryEngineApp.driver.findElement(By.xpath(DeliveryEngineUI_ID.SCHEDULE_JOBDEFLIST)));
			selectOptions(select, schedule.getSrcjobDefinition());
			DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.SELECT_CCJDTORIGHT)).click();
			DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.SELECT_JOBDEF_WINDOW_SAVE)).click();
		}
		//Selecting Job state for schedule

		if(schedule.getJobState()!=null){
			DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.ADD_REMOVE_JOBSTATES)).click();
			Select RemoveJDState = new Select(DeliveryEngineApp.driver.findElement(By.xpath(DeliveryEngineUI_ID.SELECTED_JOBSTATE)));
			selectOptions(RemoveJDState, schedule.getJobState());
			DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.SCHEDULE_JOBSTATETOLEFT)).click();

		}

		if(schedule.getSrcjobState()!=null){
			Select selectJobStatus = new Select(DeliveryEngineApp.driver.findElement(By.xpath(DeliveryEngineUI_ID.SCHEDULE_JOBSTATE_LIST)));
			selectOptions(selectJobStatus, schedule.getSrcjobState());
			DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.SELECT_JDSTATETORIGHT)).click();
			DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.SELECT_JOBDEF_WINDOW_SAVE)).click();
		}

		DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.APPLICATION_WINDOW_OK)).click();


	}

	public void doOthers(ScheduleBean schedule){

		DeliveryEngineApp.driver.findElement(By.xpath(DeliveryEngineUI_ID.ACTIONTYPE_XMl)).clear();
		DeliveryEngineApp.driver.findElement(By.xpath(DeliveryEngineUI_ID.ACTIONTYPE_XMl)).sendKeys(schedule.getXmlContent());
		DeliveryEngineApp.driver.findElement(By.id(DeliveryEngineUI_ID.APPLICATION_WINDOW_OK)).click();

	}
}







