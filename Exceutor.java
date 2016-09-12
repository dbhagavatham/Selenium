package com.hp.exstream.qa.JobPhases;



import com.hp.exstream.qa.bean.AddPhasesBean;
import com.hp.exstream.qa.commonlib.BrowserHandlers;
import com.hp.exstream.qa.commonlib.BrowserHandlers.Browsers;
import com.hp.exstream.qa.commonlib.DeliveryEngineApp;
import com.hp.exstream.qa.commonlib.GlobalConst;
import com.hp.exstream.qa.commonlib.Login;

public class Exceutor {
	
	static DeliveryEngineApp commandCenter = new DeliveryEngineApp();
	static BrowserHandlers b = new BrowserHandlers();
	static boolean applicationAvailable;

	public static void main(String[] args) {
		b.invokeBrowser(Browsers.CHROME, GlobalConst.BrowserDriversPath.CHROME_DRIVER_PATH);
		Login deLogin = new Login();
		applicationAvailable = deLogin.invokeApplication("http://localhost:8081/cc-webgui/app","admin","admin");
		if(applicationAvailable == true)
		{
			System.out.println("CCis UP");
		}
		DeliveryEngineApp.menuSelection("DeliveryEngineApp.MenuNavigation.JOB_DEFINITIONS");
		commandCenter.editItemFromTable("Sample Normal One Step");
		
		//doFileManagement();
		//doDataValidation();
		//doFirstComposition();
		//doSecondComposition();
		//doTriggering();
		//doCleanup();
		//doDelivery();
		//doMessaging();
		
		//doJavaScript();
		//doSortFileCollection();
		//doVariableAssignementPhase();
		//doExternalManagement();
		//doImportedVariableAssignment();
		//doRealTimeComposition();
	}
	public static void doFirstComposition(){			
				AddPhasesBean fBean = new AddPhasesBean();
				fBean.setPhasetype("First Composition");
				fBean.setphaseName("FCname");
				fBean.setSavetosharedPhase(true);
				fBean.setSharedphasename("FCSharedPhase");
				fBean.setmainAppPackagelist("Letter.pub");
				fBean.setAvailableFiles(new String[]{"Letter.pub","dlf.pub"});
				fBean.setSelectedFiles(new String[]{"Letter.pub"});
				fBean.setArchivePackageBtn(true);
				fBean.setoutputtypefile("FCOp");
				fBean.setRetcode("Warnings");
				fBean.setCustomSwitchExp("Custom Switch");
				
				Phase phase = new FirstComposition(fBean);
				phase.execute();		
	}
	public static void doSecondComposition(){			
				AddPhasesBean fBean = new AddPhasesBean();
				fBean.setPhasetype("Second Composition");
				fBean.setphaseName("SCname");
				fBean.setSavetosharedPhase(true);
				fBean.setSharedphasename("SCSharedPhase");
				fBean.setAvailableFiles(new String[]{"Composition"});
				fBean.setSelectedFiles(new String[]{"Composition"});
				fBean.setRetcode("Warnings");
				fBean.setCustomSwitchExp("Custom Switch");
				
				Phase phase = new SecondComposition(fBean);
				phase.execute();		
	}
	public static void doDataValidation(){			
				AddPhasesBean fBean = new AddPhasesBean();
				fBean.setPhasetype("Data Validation");
				fBean.setphaseName("DVname");
				fBean.setSavetosharedPhase(true);
				fBean.setSharedphasename("DVSharedPhase");
				fBean.setDatafilepathExp("DataValFilePathExp");
				fBean.setValidationType("XML Schema");
				fBean.setValidationTextExp("valTextExp");
				fBean.setActionOnErrContn(true);
				fBean.setActionOnErrStop(false);
				
				Phase phase = new DataValidation(fBean);
				phase.execute();		
	}
	
	public static void doDelivery(){			
				AddPhasesBean fBean = new AddPhasesBean();
				fBean.setPhasetype("Delivery");
				fBean.setphaseName("DelPhaname");
				fBean.setSavetosharedPhase(false);
				fBean.setSharedphasename("DelSharedPhase");
				
				Phase phase = new Delivery(fBean);
				phase.execute();		
}
	public static void doFileManagement(){			
				AddPhasesBean fBean = new AddPhasesBean();
				fBean.setPhasetype("File Management");
				fBean.setphaseName("FMname");
				fBean.setSavetosharedPhase(false);
				fBean.setSharedphasename("FMSharedName");
				fBean.setActionOnFileOrFolder("Move");
				fBean.setFileOrFolderNameExp("CopyFolderexp");
				fBean.setCopyto("Copyto");
				fBean.setMoveto("Moveto");
				fBean.setMoveDelRenameReadOnly(false);
				fBean.setskipfileOrFolder(false);
				fBean.setStopOrReportError(false);
				
				Phase phase = new FileManagement(fBean);
				phase.execute();		
}
	public static void doTriggering(){			
				AddPhasesBean fBean = new AddPhasesBean();
				fBean.setPhasetype("Triggering");
				fBean.setphaseName("TrigPhaname");
				fBean.setSavetosharedPhase(true);
				fBean.setSharedphasename("TrigSharedPhase");
				
				Phase phase = new Triggering(fBean);
				phase.execute();		
}
	public static void doCleanup(){			
				AddPhasesBean fBean = new AddPhasesBean();
				fBean.setPhasetype("Clean Up");
				fBean.setphaseName("Cleanup Name");
				fBean.setSavetosharedPhase(false);
				fBean.setSharedphasename("Cleanup shared");
				fBean.setAvailableFiles(new String[]{"DD:CUSTOMER (Composition)","DD:BRANCH (Composition)"});
				fBean.setSelectedFiles(new String[]{"DD:BRANCH (Composition)"});
				
				Phase phase = new Cleanup(fBean);
				phase.execute();		
}
	public static void doMessaging(){			
				AddPhasesBean fBean = new AddPhasesBean();
				fBean.setPhasetype("Messaging");
				fBean.setphaseName("MessagingPhase");
				fBean.setSavetosharedPhase(true);
				fBean.setSharedphasename("Mesaaging shared");

				Phase phase = new Messaging(fBean);
				phase.execute();		
}
	public static void doSortFileCollection(){                    
		        AddPhasesBean fBean = new AddPhasesBean();
		        fBean.setPhasetype("Sort Files Collection");
		        fBean.setphaseName("SortFilePhname");
		        fBean.setSavetosharedPhase(false);
		        fBean.setSharedphasename("SorFileSharedName");
		        fBean.setAvailableFiles(new String[]{"Composition"});
		        fBean.setSelectedFiles(new String[]{"Composition"});
		        
		        Phase phase = new SortFileCollection(fBean);
		        phase.execute();           
}
 public static void doExternalManagement(){                    
		        AddPhasesBean fBean = new AddPhasesBean();
		        fBean.setPhasetype("External Management");
		        fBean.setphaseName("ExterMgmtPhname");
		        fBean.setSavetosharedPhase(false);
		        fBean.setSharedphasename("ExterSHPhaName");
		        
		        Phase phase = new ExternalManagement(fBean);
		        phase.execute();           
}
 public static void doImportedVariableAssignment(){                   
		        AddPhasesBean fBean = new AddPhasesBean();
		        fBean.setPhasetype("Imported Variable Assignment");
		        fBean.setphaseName("ImportPhname");
		        fBean.setSavetosharedPhase(false);
		        fBean.setSharedphasename("ImpoShPhname");
		        
		        Phase phase = new ImportedVariableAssignment(fBean);
		        phase.execute();           
}
 public static void doVariableAssignementPhase(){                     
		        AddPhasesBean fBean = new AddPhasesBean();
		        fBean.setPhasetype("Variable Assignment");
		        fBean.setphaseName("VAPhaseName");
		        fBean.setSavetosharedPhase(false);
		        fBean.setSharedphasename("Vashared");
		        
		        Phase phase = new VariableAssignementPhase(fBean);
		        phase.execute();
}
 public static void doJavaScript(){              
		        AddPhasesBean fBean = new AddPhasesBean();
		        fBean.setPhasetype("JavaScript");
		        fBean.setphaseName("JavaPhName");
		        fBean.setSavetosharedPhase(false);
		        fBean.setSharedphasename("JavaShareName");
		        
		        Phase phase = new JavaScript(fBean);
		        phase.execute();
}
 public static void doRealTimeComposition(){                   
		        AddPhasesBean fBean = new AddPhasesBean();
		        fBean.setPhasetype("Real Time Composition");
		        fBean.setphaseName("RTPhName");
		        fBean.setSavetosharedPhase(false);
		        fBean.setSharedphasename("RTShaName");
		        
		        Phase phase = new RealTimeComposition(fBean);
		        phase.execute();
}


	
}
