package com.hp.exstream.qa.commonlib;

public class DeliveryEngineUI_ID {

	public static final String LOGIN_USERNAME = "CCLoginUsernameField";
	public static final String LOGIN_PASSWORD = "CCLoginPasswordField";
	public static final String LOGIN_SERVERNAME = "CCLoginServerField";
	public static final String LOGIN_OK = "CCOkButton";
	
	public static final String MESSAGEBOX_YES = "CCLoginUsernameField";
	public static final String MESSAGEBOX_NO = "CCLoginPasswordField";
	public static final String MESSAGEBOX_OK = "CCCOMMAND_OK";	

	public static final String JOB_ID = "CCJobsIdField";
	public static final String JOB_CCJOBSPAGESELECTFIELD = "CCJobsPageSelectField";
	public static final String JOB_JOBCHECKBOXFIELD = "CCjob_0";
	public static final String JOB_JOBIDFIELD = "CCVIEW_JOB_0";
	public static final String JOB_JOBJOB_OUTPUT = "CCVIEW_JOB_OUTPUT_0";
	
	//CCJobsPageSelectField
	//.//*[@id='CCjob_0']/input
	//.//*[@id='CCVIEW_JOB_0']
	//.//*[@id='CCVIEW_JOB_OUTPUT_0']
	
	public static final String JOB_SelectJobDefinition = "CCJobsNewJobDefinitionsButton";
	public static final String JOB_UserDefinedId = "CCJobsNewCusomIdField";
	public static final String JOB_PRIORITY = "CCJobsNewPriorityField";
	public static final String JOB_ENGINENAME = "CCEngineList";
	public static final String JOB_RUNJOB = "CCJobsNewRunJobButton";
	public static final String JOB_CANCEL = "CCJobsNewCancelButton";
	
	
	
	public static final String VIEWJOB_REFRESH = "CCJobsViewRefreshButton";
	public static final String VIEWJOB_FILEVIEW = "CCJobsViewOutputButton";
	public static final String VIEWJOB_UPDATE = "CCJobsViewUpdateButton";
	public static final String VIEWJOB_RESTART = "CCJobsViewRestartButton";
	public static final String VIEWJOB_RESUBMIT = "CCJobsViewResubmitButton";
	public static final String VIEWJOB_DELETE = "CCJobsViewDeleteButton";
	public static final String VIEWJOB_CLOSE = "CCJobsViewCloseButton";
	public static final String VIEWJOB_JOBHISTORY = "CCLog";
	
	
	public static final String JOBDEF_WINDOW_NAME = "CCjd_name";
	public static final String JOBDEF_WINDOW_PROPERTY = "CCvar_type";
	
	public static final String APPLICATION_WINDOW_SAVE = "CCOkButton";
	public static final String APPLICATION_WINDOW_CANCEL = "CCCOMMAND_CANCEL";
	public static final String APPLICATION_WINDOW_OK = "CCCOMMAND_OK";

	
	public static final String VARIABLE_WINDOW_NAME = "CCvar_name";
	public static final String VARIABLE_WINDOW_TYPE = "CCvar_type";
	public static final String VARIABLE_WINDOW_DESC = "CCvar_description";
	public static final String VARIABLE_WINDOW_VALUEEXP = "CCvar_value";
	public static final String VARIABLE_WINDOW_LOCKVALUE = "//*[@id='CCvar_locked']/input";
	
	//JOBDEF
	public static final String NEW_JOBDEF_SAVE_BUTTON  = "//*[@id='CCJobDefinitionsNewSaveButton']";
	
	//Real-TimeApp // Durgaprasad //
	//public static final String NEW_RTAPP_TYPE_MANAGED ="//span  [@id='CCEnginePoolNewDataManagedRadioButton']/input";
	public static final String NEW_RTAPP_TYPE_NOTMANAGED ="CCEnginePoolNewDataNotManagedRadioButton";
	public static final String NEW_RTAPP_TYPE_MANAGED ="CCEnginePoolNewDataManagedRadioButton";
	public static final String NEW_RTAPP_TYPE_CONTINUE ="CCEnginePoolNewContinueButton";
	public static final String NEW_RTAPP_NAME ="CCEnginePoolEditNameField";
	public static final String NEW_RTAPP_DESC ="CCEnginePoolEditDescriptionField";
	public static final String NEW_RTAPP_STARTUPTYPE ="CCEnginePoolEditStartupField";
	public static final String NEW_RTAPP_ENGINE ="CCEnginePoolEditStartupField";
	public static final String NEW_RTAPP_PACKAGE_BUTTON ="CCEnginePoolEditPackageNameButton";
	public static final String NEW_RTAPP_PACKAGE_EXP ="CCEnginePoolEditPackageNameField";
	public static final String NEW_RTAPP_PACKAGE_LIST = "CCfc_list";
	public static final String NEW_RTAPP_ARCHIVE_PACKAGE_CHKBOX = "CCEnginePoolEditArchivePackageCheckBox";
	public static final String NEW_RTAPP_ENGINE_CUSTOM_SWITCH = "CCEnginePoolEditCustomSwitchesField";
	public static final String NEW_RTAPP_EDIT_CUSTOM_VARIABLES = "CCEnginePoolEditCustomVariablesButton";
	public static final String NEW_RTAPP_EDIT_LOGICAL_NAMES = "CCEnginePoolEditLogicalNamesButton";
	public static final String NEW_RTAPP_ADD_VARIABLE = "CCEnginePoolEditAddVariableButton";
	public static final String NEW_RTAPP_APPEND_ENIVIRONMENT_RADIO_BUTTON = "CCEnginePoolEditAddNativeEnvironmentRadioButton";
	public static final String NEW_RTAPP_REPLACE_ENIVIRONMENT_RADIO_BUTTON = "CCEnginePoolEditReplaceNativeEnvironmentRadioButton";
	public static final String NEW_RTAPP_POOL_ENGINES = "CCEnginePoolEditCountMaxField";
	public static final String NEW_RTAPP_POOL_ENGINE_ERROR_LEVEL = "CCEnginePoolEditErrorLevelField";
	public static final String NEW_RTAPP_POOL_RESTART_ENGINE_AUTO_CHKBOX = "CCEnginePoolEditAutoRestartCheckBox";
	public static final String NEW_RTAPP_POOL_ARCHIVE_ENGINE_DIR_CHKBOX = "CCEnginePoolEditArchiveEngineCheckBox";
	public static final String NEW_RTAPP_POOL_RESTART_ENGINE_MAX_COUNT = "CCEnginePoolEditAutoRestartMaxField";
	public static final String NEW_RTAPP_POOL_ARCHIVE_ENGINE_MAX_COUNT  = "CCEnginePoolEditArchiveCountMaxField";
	public static final String NEW_RTAPP_POOL_ARCHIVE_ENGINE_MAX_AGE  = "CCEnginePoolEditArchiveAgeMaxField";
	public static final String NEW_RTAPP_SAVE_BUTTON  = "CCEnginePoolEditSaveButton";
	public static final String NEW_RTAPP_CANCEL_BUTTON  = "CCEnginePoolEditCancelButton";
	
	//JOBDEFINITION PHASES*****************************************************************************
    public static final String JOBDEF_ADD_PHASE_LINK = "CCADD_PHASE_EVENT";
    public static final String JOBDEF_ADD_PHASE_NAME = "CCph_name";
    public static final String JOBDEF_ADD_PHASE_SAVETO_SHAREDPHASE_CHKBOX = "CCph_shared";
    public static final String JOBDEF_ADD_PHASE_SAVETO_SHAREDPHASE_NAME = "CCph_sharedname";
    //Add Phase->Clean-up Phase Window
    public static final String JOBDEF_ADD_PHASE_TYPE ="CCph_type";
    public static final String JOBDEF_ADD_PHASE_CLEANUP_NAME = "CCph_name";
    public static final String JOBDEF_ADD_PHASE_CLEANUP_SAVETO_SHAREDPHASE_CHKBOX = "CCph_shared";
    public static final String JOBDEF_ADD_PHASE_CLEANUP_SAVETO_SHAREDPHASE_NAME = "CCph_sharedname";
    public static final String JOBDEF_ADD_PHASE_CLEANUP_DEL_FILE_FROM_FILEMAPPING = "//*[@id='CC1585']";
    public static final String JOBDEF_ADD_PHASE_CLEANUP_AVAILABLE_FILES_LEFT = "CCf_left";
    public static final String JOBDEF_ADD_PHASE_CLEANUP_SELECTED_FILES_RIGHT = "CCf_right";
    public static final String JOBDEF_ADD_PHASE_CLEANUP_RIGHT_ARROW = "CCf_toRight";
    public static final String JOBDEF_ADD_PHASE_CLEANUP_LEFT_ARROW = "CCf_toLeft";
    public static final String JOBDEF_ADD_PHASE_CLEANUP_DELETE_USER_DEFINED_FILES = "//*[@id='CC1637']";
    public static final String JOBDEF_ADD_PHASE_CLEANUP_DELETE_CONTROL_FILE_CHKBOX = "//*[@id='CC1640']/input";
    public static final String JOBDEF_ADD_PHASE_CLEANUP_DELETE_REPORT_FILE_CHKBOX = "//*[@id='CC1641']/input";
    public static final String JOBDEF_ADD_PHASE_CLEANUP_PHASE_LABEL_ALREADY_EXISTS = "//*[@id='CC1641']/input";

    //Add Phase->File Management Phase Window
    public static final String JOBDEF_ADD_PHASE_FM_NAME = "CCph_name";   
    public static final String JOBDEF_ADD_PHASE_FM_SAVETO_SHAREDPHASE_CHKBOX = "CCph_shared";
    public static final String JOBDEF_ADD_PHASE_FM_SAVETO_SHAREDPHASE_NAME = "CCph_sharedname";
    public static final String JOBDEF_ADD_PHASE_FM_IGNORE_CONTINUE = "//*[@id='CC300']/input";
    public static final String JOBDEF_ADD_PHASE_FM_REPORT_STOP = "//*[@id='CC301']/input";
    public static final String JOBDEF_ADD_PHASE_FM_ADD_OPERATION = "CCADD_PROGRAM_EVENT";
    public static final String JOBDEF_ADD_PHASE_FM_DELETE_OPERATION = "CCDELETE_PROGRAM_EVENT";
    public static final String JOBDEF_ADD_PHASE_FM_ADD_OPR_ACTION_TYPE = "CCsf_0";
    public static final String JOBDEF_ADD_PHASE_FM_ADD_OPR_FILE_SOURCE = "CCfsource_0";
    public static final String JOBDEF_ADD_PHASE_FM_ADD_OPR_FILE_DEST = "CCdest_0";
    public static final String JOBDEF_ADD_PHASE_FM_ADD_OPR_COPY_TO = "CCdest_0";
    public static final String JOBDEF_ADD_PHASE_FM_DELETE_OPR_CHK_BOX = "//*[@id='CCps_0']/input";

    //Add Phase->Delivery Phase Window
    public static final String JOBDEF_ADD_PHASE_DELIVERY_NAME = "CCph_name";   
    public static final String JOBDEF_ADD_PHASE_DELIVERY_SAVETO_SHAREDPHASE_CHKBOX = "CCph_shared";
    public static final String JOBDEF_ADD_PHASE_DELIVERY_SAVETO_SHAREDPHASE_NAME = "CCph_sharedname";
    public static final String JOBDEF_ADD_PHASE_DELIVERY_ADD_ROUTE = "//*[@id='CC565']";
    public static final String JOBDEF_ADD_PHASE_DELIVERY_ROUTE_QUEUE = "CCdr_queue";
    public static final String JOBDEF_ADD_PHASE_DELIVERY_FILTER_PATTERN = "CCdr_pattern";
    public static final String JOBDEF_ADD_PHASE_DELIVERY_ADD_CONDITION = "//*[@id='CC677']";
    public static final String JOBDEF_ADD_PHASE_DELIVERY_ADD_CONDITION_RULE = "CCCONDITION_TYPE_EVENT";
    public static final String JOBDEF_ADD_PHASE_DELIVERY_ADD_CONDITION_EXPRESSION = "CCcrw__expressionText";

    //Add Phase->DataValidation
    public static final String JOBDEF_ADD_PHASE_DATAVAL_NAME = "CCph_name";   
    public static final String JOBDEF_ADD_PHASE_DATAVAL_SAVETO_SHAREDPHASE_CHKBOX = "CCph_shared";
    public static final String JOBDEF_ADD_PHASE_DATAVAL_SAVETO_SHAREDPHASE_NAME = "CCph_sharedname";
    public static final String JOBDEF_ADD_PHASE_DATAVAL_ADDVAL =  "CCADD_PROGRAM_EVENT";
    public static final String JOBDEF_ADD_PHASE_DATAVAL_ADDVAL_FILEPATH =  "CCfilepath_0";
    public static final String JOBDEF_ADD_PHASE_DATAVAL_ADDVAL_VALTYPE =  "CCtype_0";
    public static final String JOBDEF_ADD_PHASE_DATAVAL_ADDVAL_VALTEXT =  "CCvalidation_0";
    public static final String JOBDEF_ADD_PHASE_DATAVAL_ADDVAL_TIMESTAMP_CHEKSUM_CHKBOX =  "CCtimestamp_0";
    public static final String JOBDEF_ADD_PHASE_DATAVAL_ACTION_ERROR_CONTINUE =  "CCcontinue_0";
    public static final String JOBDEF_ADD_PHASE_DATAVAL_ACTION_ERROR_STOP =  "CCstop_0";
    public static final String JOBDEF_ADD_PHASE_DATAVAL_DELETE_SELECTED =  "CCDELETE_PROGRAM_EVENT";

    //Add Phase->Messaging Phase
    public static final String JOBDEF_ADD_PHASE_MESSAGING_ADD_SUBSCRIPTION =  "CCADD_PROGRAM_EVENT";
    public static final String JOBDEF_ADD_PHASE_MESSAGING_SUB_NAME =  "CCnt_name";
    public static final String JOBDEF_ADD_PHASE_MESSAGING_CHANNEL_TYPE =  "CCnt_type";
    public static final String JOBDEF_ADD_PHASE_MESSAGING_CHANNEL_NAME =  "CC899";
    public static final String JOBDEF_ADD_PHASE_MESSAGING_SUB_TO =  "CCNotificationsNewEmailAddressField";
    public static final String JOBDEF_ADD_PHASE_MESSAGING_SUB_SUBJECT =  "CCNotificationsNewEmailSubjectFiled";
    public static final String JOBDEF_ADD_PHASE_MESSAGING_SUB_MESSAGE =  "CCNotificationsNewEmailBodyField";
    public static final String JOBDEF_ADD_PHASE_MESSAGING_SUB_ADD =  "CC915";
    public static final String JOBDEF_ADD_PHASE_MESSAGING_SUB_FILE_NAME =  "CCFileExp";
    public static final String JOBDEF_ADD_PHASE_MESSAGING_SUB_ATTACHMENT_OK =  "CC975";
    public static final String JOBDEF_ADD_PHASE_MESSAGING_SUB_ATTACHMENT_CANCEL =  "CC976";
    public static final String JOBDEF_ADD_PHASE_MESSAGING_SUB_DELETE_EXP =  "CC916";
    
    //Add Phase->Triggering Phase
    //public static final String JOBDEF_ADD_PHASE_TRIGGERING_SAVE =  "CC1001";
    
    //Add Phase->First Composition Phase Window
    
    public static final String JOBDEF_ADD_PHASE_FC_PACKAGE_LIST_BTN = "CCCHOOSE_PACKAGE";
    public static final String JOBDEF_ADD_PHASE_FC_PACKAGE_LIST = "CCfc_list";
    public static final String JOBDEF_ADD_PHASE_FC_SELECT_FILES_LINK = "CCSELECT_FILES";
    public static final String JOBDEF_ADD_PHASE_FC_AVAILABLE_LEFT = "CCpkg_left";
    public static final String JOBDEF_ADD_PHASE_FC_SELECTED_RIGHT = "CCpkg_right";
    public static final String JOBDEF_ADD_PHASE_FC_AVAILABLE_FILES_TORIGHT = "CCpkg_toRight";
    public static final String JOBDEF_ADD_PHASE_FC_SELECTED_FILES_TOLEFT = "CCpkg_toLeft";
   
    public static final String JOBDEF_ADD_PHASE_FC_ARCHIVE_PKG_CHKBOX = "CCcp_archive";
    public static final String JOBDEF_ADD_PHASE_FC_OUTPUT_TYPE_FILE = "CCcp_outputtype";
    public static final String JOBDEF_ADD_PHASE_FC_ENGINE_ERROR_RETCODE = "CCcp_enginerrrors";
    public static final String JOBDEF_ADD_PHASE_FC_CUSTOM_SWITCH_EXP = "CCcp_switches";
    
    public static final String JOBDEF_ADD_PHASE_FC_PACKAGE_OK_BTN = "CC1131";
    public static final String JOBDEF_ADD_PHASE_FC_PACKAGE_CANCEL_BTN = "CC1139";
    
    
  //Add Phase->Second Composition Phase Window
    public static final String JOBDEF_ADD_PHASE_SC_PRE_SORT_COMP =  "//span [@id='CC1310']/input";
    public static final String JOBDEF_ADD_PHASE_SC_SORT_FILE_COMP =  "//span [@id='CC1311']/input";
    public static final String JOBDEF_ADD_PHASE_SC_PRE_SORT_COMP_LEFT =  "CCps_left";
    public static final String JOBDEF_ADD_PHASE_SC_PRE_SORT_COMP_RIGHT =  "CCps_right";
    public static final String JOBDEF_ADD_PHASE_SC_AVAILABLE_FILES_TORIGHT = "CCps_toRight";
    public static final String JOBDEF_ADD_PHASE_SC_SELECTED_FILES_TOLEFT = "CCps_toLeft";
    
    public static final String JOBDEF_ADD_PHASE_SC_PRE_SORT_COMP_RTNCODE =  "CCcp_enginerrrors";
    public static final String JOBDEF_ADD_PHASE_SC_CUSTOM_SWITCHES =  "CCcp_switches";
    public static final String JOBDEF_ADD_PHASE_SC_VARSET_CHKBOX =  "//span [@id='CC1341']/input";
    public static final String JOBDEF_ADD_PHASE_SC_FILEMAP_CHKBOX =  "//span [@id='CC1356']/input";
    public static final String JOBDEF_ADD_PHASE_SC_SAVE_BUTTON =  "CC1390";

  //Real Time Composition
    public static final String  REALTIMEPHASE_NAME= "CCph_name";
    public static final String  JAVASCRIPTCODE= "//*[@id='editor']";
    public static final String  IVAFILENAME= "CCfileName";
    //Sort file collection
    public static final String  PRESORTCOMPOSITIONLEFT= "CCcp_left";
    public static final String  PRESORTCOMPOSITIONRIGHT= "CCcp_right";
    public static final String  SELECT_CCCPTORIGHT= "CCcp_toRight";
    public static final String  SELECT_CCCPTOLEFT= "CCcp_toLeft";
    //External Program
    public static final String  EXTERNALPROGRAM_ADDOPERATION="CCADD_PROGRAM_EVENT";
    public static final String  EXTERNALPROGRAM_COMMANDEXP="CCepw_command_0";
    public static final String  EXTERNALPROGRAM_ARGUMENTS="CCepw_args_0";
    public static final String  EXTERNALPROGRAM_FILED= "CCepw_file_0";

    
    
    
    
	//Delivery-QUeues//////////
	//Common variables and Local Folder Variables 
	public static final String VARIABLE_DELIVERY_QUEUE_LIST = "//*[@id='CCMENU_DELIVERY_QUEUES_LIST']";
	public static final String VARIABLE_NEW_DELIVERY_QUEUE = "CCDeliveryQueuesNewButton";
	public static final String VARIABLE_NEW_DELIVERY_QUEUE_NAME = "CCDeliveryQueuesNewNameField";
	public static final String VARIABLE_NEW_DELIVERY_QUEUE_TYPE = "CCDeliveryQueuesNewTypeField";
	public static final String VARIABLE_RESETQUEUE ="//*[@id='CCJobsResetButton']";
	public static final String VARIABLE_QUEUES_DESCRIPTION = "CCDeliveryQueuesNewDescriptionField";
	public static final String VARIABLE_OVERWRITECHECKBOX = "CCDeliveryQueuesLocalOverwriteCheckBox";
	public static final String VARIABLE_SIGNALFILE = "CCDeliveryQueuesLocalFolderCheckBox";
	public static final String VARIABLE_PATH = "CCDeliveryQueuesLocalFolderField";
	public static final String VARIABLE_SIGNALFILEEXP = "CCDeliveryQueuesLocalFileField";
	public static final String VARIABLE_PREFIXFIELD = "CCDeliveryQueuesLocalPrefixField";
	
		
	//LPR Queue Variables
	public static final String LPR_QUEUEFIELD= "CCDeliveryQueuesLprQueueField";
	public static final String LPR_HOSTNAME = "CCDeliveryQueuesLprHostnameField";
	public static final String LPR_PORT = "CCDeliveryQueuesLprPortField";
	
	//FTP Queue Variables
	public static final String FTP_HOST = "CCDeliveryQueuesFtpHostnameField";
	public static final String FTP_PORT = "CCDeliveryQueuesFtpPortField";
	public static final String FTP_USER = "CCDeliveryQueuesFtpUsernameField";
	public static final String FTP_PASS = "CCDeliveryQueuesFtpPasswordField";
	
	// JMS Queue Variables
	public static final String JMS_CONNECTION_FACTORY = "CCDeliveryQueuesJmsQcfField"; 
	public static final String JMS_REAL_QUEUE = "CCDeliveryQueuesJmsQueueNameRadioButton";
	public static final String JMS_QUEUE_NAME = "CCDeliveryQueuesJmsDestinationField";
	public static final String JMS_USER = "CCDeliveryQueuesJmsUsernameField";
	public static final String JMS_PASS = "CCDeliveryQueuesJmsPasswordField";
	public static final String JMS_CORRELATIONFIELD = "CCDeliveryQueuesJmsCorrelationField";
	public static final String JMS_MESSAGEFIELD = "CCDeliveryQueuesJmsMessageField";
	public static final String JMS_MESSAGELIST = "CCDeliveryQueuesJmsMessageList";
		
	//Schedules Navadeep
	public static final String  CREATE_SCHEDULE= "CCMENU_SCHEDULES_LIST";
	public static final String  CREATE_NEWSCHEDULE= "CCSchedulesNewButton";
	public static final String  CREATE_SCHEDULENAME= "CCSchedulesNewNameField";
	public static final String  WINDOW_RESET= "CCJobsResetButton";
	public static final String  SCHEDULE_BUTTON= "CCSchedulesNewButton";
	public static final String  SELECT_CHECKBOX= "CCSchedulesNewActiveCheckBox";
	public static final String  ADD_REMOVE_JOBDEF_SCHEDULE= "CCADDREMJD";
	public static final String 	SELECT_CCJDTORIGHT= "CCjd_toRight";
	public static final String  SELECT_JOBDEF_WINDOW_SAVE= "CCSAVE";
	public static final String  ADD_REMOVE_JOBSTATES= "CCADDREMST";
	public static final String  SELECT_JDSTATETORIGHT= "CCj_toRight";
	public static final String  ACTIONTYPE_XMl= "//*[@id='CCSchedulesNewCustomActionField']";
	
	//public static final String  ACTIONXML_FORMAT= "";
	public static final String  SELECT_SCHEDULETYPE= "//*[@id='CCSchedulesNewTypeField']";
	public static final String  SCHEDULE_ONETIME= "CCSchedulesNewSimpleField";
	public static final String  SCHEDULE_ACTIONTYPE= "//*[@id='CCACTION_TYPE_CHANGED']";
	public static final String  SCHEDULE_JOBDEFLIST= "//*[@id='CCjd_left']";
	public static final String  SELECTED_JOBDEF= "//*[@id='CCjd_right']";
	public static final String  SELECTED_JOBDEFTOLEFT= "CCjd_toLeft";
	public static final String  SCHEDULE_JOBSTATE_LIST= "//*[@id='CCj_left']";
	public static final String  SELECTED_JOBSTATE= "//*[@id='CCj_right']";
	public static final String  SCHEUDLE_RECURRING_TIME= "0/7 * * * * ?";
	public static final String  SCHEDULE_JOBSTATETOLEFT= "CCj_toLeft";
	//public static final String  SCHEDULE_JOBSTATETORIGHT= "CCj_toRight";
		
		
		
}
