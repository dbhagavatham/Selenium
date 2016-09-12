package com.hp.exstream.qa.bean;

public class AddPhasesBean {

	//Common
	private String Phasetype;
	private String[] AvailableFiles;
	private String[] SelectedFiles;
	private String phasename;
	private boolean SavetosharedPhase;
	private String Sharedphasename;
	private boolean ActionOnErrContn;
	private boolean ActionOnErrStop;
	
	public String getPhasetype() {
		return Phasetype;
	}
	public void setPhasetype(String Phasetype) {
		this.Phasetype = Phasetype;
	}
	
	public String getphaseName() {
		return phasename;
	}
	public void setphaseName(String phasename) {
		this.phasename = phasename;
	}
	
	public boolean isSavetosharedPhase() {
		return SavetosharedPhase;
	}
	public void setSavetosharedPhase(boolean SavetosharedPhase) {
		this.SavetosharedPhase = SavetosharedPhase;
	}	
	
	public String getSharedphasename() {
		return Sharedphasename;
	}
	public void setSharedphasename(String Sharedphasename) {
		this.Sharedphasename = Sharedphasename;
	}
	
	public String[] getAvailableFiles() {
		return AvailableFiles;
	}
	public void setAvailableFiles(String[] AvailableFiles) {
		this.AvailableFiles = AvailableFiles;
	}
	
	public String[] getSelectedFiles() {
		return SelectedFiles;
	}
	public void setSelectedFiles(String[] SelectedFiles) {
		this.SelectedFiles = SelectedFiles;
	}
	
	public boolean isActionOnErrContn() {
		return ActionOnErrContn;
	}
	public void setActionOnErrContn(boolean ActionOnErrContn) {
		this.ActionOnErrContn = ActionOnErrContn;
	}	
	
	public boolean isActionOnErrStop() {
		return ActionOnErrStop;
	}
	public void setActionOnErrStop(boolean ActionOnErrStop) {
		this.ActionOnErrStop = ActionOnErrStop;
	}	
//**************FirstComposition********************
	private String mainAppPackagelist;
	private String outputtypefile;
	private boolean ArchivePackageBtn;
	private String Retcode;
	private String CustomSwitchExp;
	
	public String getmainAppPackagelist() {
		return mainAppPackagelist;
	}
	public void setmainAppPackagelist(String mainAppPackagelist) {
		this.mainAppPackagelist = mainAppPackagelist;
	}
	public String getoutputtypefile() {
		return outputtypefile;
	}
	public void setoutputtypefile(String outputtypefile) {
		this.outputtypefile = outputtypefile;
	}
	
	public boolean isArchivePackageBtn() {
		return ArchivePackageBtn;
	}
	public void setArchivePackageBtn(boolean ArchivePackageBtn) {
		this.ArchivePackageBtn = ArchivePackageBtn;
	}	
	
	public String getRetcode() {
		return Retcode;
	}
	public void setRetcode(String Retcode) {
		this.Retcode = Retcode;
	}
	
	public String getCustomSwitchExp() {
		return CustomSwitchExp;
	}
	public void setCustomSwitchExp(String CustomSwitchExp) {
		this.CustomSwitchExp = CustomSwitchExp;
	}
	
//**************DataValidation********************
	private String DatafilepathExp;
	private String ValidationType;
	private String ValidationTextExp;

	
	
	public String getDatafilepathExp() {
		return DatafilepathExp;
	}
	public void setDatafilepathExp(String DatafilepathExp) {
		this.DatafilepathExp = DatafilepathExp;
	}
	
	public String getValidationType() {
		return ValidationType;
	}
	public void setValidationType(String ValidationType) {
		this.ValidationType = ValidationType;
	}
	
	public String getValidationTextExp() {
		return ValidationTextExp;
	}
	public void setValidationTextExp(String ValidationTextExp) {
		this.ValidationTextExp = ValidationTextExp;
	}
	

	
//**************FileManagement********************
//FileManagement->AddOperation	
	
	private String ActionOnFileOrFolder;
	private String FileOrFolderNameExp;
	private String Copyto;
	private String Moveto;
	private boolean MoveDelRenameReadOnly;
	private boolean skipfileOrFolder;
	private boolean StopOrReportError;
	
	
	public String getActionOnFileOrFolder() {
		return ActionOnFileOrFolder;
	}
	public void setActionOnFileOrFolder(String ActionOnFileOrFolder) {
		this.ActionOnFileOrFolder = ActionOnFileOrFolder;
	}
	
	public String getFileOrFolderNameExp() {
		return FileOrFolderNameExp;
	}
	public void setFileOrFolderNameExp(String FileOrFolderNameExp) {
		this.FileOrFolderNameExp = FileOrFolderNameExp;
	}
	
	public String getCopyto() {
		return Copyto;
	}
	public void setCopyto(String Copyto) {
		this.Copyto = Copyto;
	}
	
	public String getMoveto() {
		return Moveto;
	}
	public void setMoveto(String Moveto) {
		this.Moveto = Moveto;
	}
	
	public boolean isMoveDelRenameReadOnly() {
		return MoveDelRenameReadOnly;
	}
	public void setMoveDelRenameReadOnly(boolean MoveDelRenameReadOnly) {
		this.MoveDelRenameReadOnly = MoveDelRenameReadOnly;
	}	
	
	public boolean isskipfileOrFolder() {
		return skipfileOrFolder;
	}
	public void setskipfileOrFolder(boolean skipfileOrFolder) {
		this.skipfileOrFolder = skipfileOrFolder;
	}	
	
	public boolean isStopOrReportError() {
		return StopOrReportError;
	}
	public void setStopOrReportError(boolean StopOrReportError) {
		this.StopOrReportError = StopOrReportError;
	}	
	
	
}
