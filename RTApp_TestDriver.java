package com.hp.exstream.qa.realtimeApps;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.hp.exstream.qa.commonlib.BrowserHandlers;
import com.hp.exstream.qa.commonlib.DeliveryEngineApp;
import com.hp.exstream.qa.commonlib.GlobalConst;
import com.hp.exstream.qa.commonlib.Login;
import com.hp.exstream.qa.commonlib.BrowserHandlers.Browsers;

public class RTApp_TestDriver {
	
	public static DeliveryEngineApp commandCenter = new DeliveryEngineApp();
	public static RealTimeApps RTApp = new RealTimeApps();

	public static void main(String[] args) throws IOException, InterruptedException {
		BrowserHandlers b = new BrowserHandlers();
		boolean applicationAvailable;
		b.invokeBrowser(Browsers.CHROME, GlobalConst.BrowserDriversPath.CHROME_DRIVER_PATH);
		Login deLogin = new Login();
		applicationAvailable = deLogin.invokeApplication("http://localhost:8081/cc-webgui/app","admin","admin");
		if(applicationAvailable == true)
		{
			//System.out.println(b.isDeliveryEngineSessionExpired());
			//ManageEngine.addEngine("RTENGINE1","DEMO ENGINE", "C:\\engine9\\ProdEngine.exe","C:\\engine9\\MsgResource_en-us.dat","C:\\engine9\\JavaEnabler.dll","C:\\engine9\\dda_connect","C:\\engine9\\SBCS.ekf",true);

			Map<String,String> hmap=new HashMap<String,String>();
			hmap.put(RealTimeApps.NEW_RTAPP_DESC, "NeWRTAPP_Creation");	
			hmap.put(RealTimeApps.NEW_RTAPP_STARTUPTYPE, "Manual");
			hmap.put(RealTimeApps.NEW_RTAPP_ENGINE, "RTENGINE");
			hmap.put(RealTimeApps.NEW_RTAPP_PACKAGE_EXP, "two-step-letter.pub");
			hmap.put(RealTimeApps.NEW_RTAPP_ENGINE_CUSTOM_SWITCH_EXP, "1");
			hmap.put(RealTimeApps.NEW_RTAPP_POOL_ENGINES, "1");
			hmap.put(RealTimeApps.NEW_RTAPP_POOL_ENGINE_ERROR_LEVEL, "ERRORS");
			hmap.put(RealTimeApps.NEW_RTAPP_POOL_RESTART_ENGINE_MAX_COUNT, "5");
			hmap.put(RealTimeApps.NEW_RTAPP_POOL_ARCHIVE_ENGINE_MAX_COUNT, "99");
			hmap.put(RealTimeApps.NEW_RTAPP_POOL_ARCHIVE_ENGINE_MAX_AGE, "720"); 
			hmap.put(RealTimeApps.EDIT_RTAPP_DESC, "NeWRTAPP_Updation");	
			hmap.put(RealTimeApps.EDIT_RTAPP_STARTUPTYPE, "Automatic");
			hmap.put(RealTimeApps.EDIT_RTAPP_ENGINE, "DEFENGINE");
			hmap.put(RealTimeApps.EDIT_RTAPP_PACKAGE_EXP, "one-step-letter.pub");
			//hmap.put(RealTimeApps.EDIT_RTAPP_ENGINE_CUSTOM_SWITCH_EXP, "2");
			hmap.put(RealTimeApps.EDIT_RTAPP_POOL_ENGINES, "1");
			hmap.put(RealTimeApps.EDIT_RTAPP_POOL_ENGINE_ERROR_LEVEL, "ERRORS");
			hmap.put(RealTimeApps.EDIT_RTAPP_POOL_RESTART_ENGINE_MAX_COUNT, "5");
			hmap.put(RealTimeApps.EDIT_RTAPP_POOL_ARCHIVE_ENGINE_MAX_COUNT, "99");
			hmap.put(RealTimeApps.EDIT_RTAPP_POOL_ARCHIVE_ENGINE_MAX_AGE, "720"); 
			System.out.println("hmap is :"+hmap.size());
		
		//RTApp.NewRTApp("Managed","RTAPPDEMO",true,true,true,hmap);
		commandCenter.importFile("DeliveryEngineApp.MenuNavigation.REAL_TIME_APPS","D:\\Automation_Workspace\\Delivery\\src\\com\\hp\\exstream\\qa\\resources\\RT-Sample_One_Step.xml","D:\\Automation_Workspace\\Delivery\\src\\com\\hp\\exstream\\qa\\resources\\ImportFile.exe");
		//RTApp.UpdateRTApp("RTAPPDEMO",true,true,true,hmap);
		//RTApp.SearchRTApp("ABC");
		//RTApp.DeleteRTApp("ABC11");
		//RTApp.ExportRTApp("ABC123");
		//RTApp.ExportAllRTApp();
		//b.closeBrowser();
		}
	}
}

	
