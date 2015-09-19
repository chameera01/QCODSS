package com.qcodss.struts;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.qcodss.dao.StyleDAO;
import com.qcodss.model.Style;


/* this class save styleNo and plantID in session */
public class SessionAction implements SessionAware {
	
	private Map<String, Object> styleRecSession ;
	
	public String styleNo;
	public String stylePlantID;
	
	public int styleExist;
	
/* these style fields are sent as json object */	
	private String newRepeat;
	private int moduleNo;
	private int preSetting;
	private int preTraining;
	private int preBulk;
	private int predictability;
	private int feedingTime;
	private int QCOTime;
	private int rsr;
	/* 
	 * 1st day clocked hours, produced hours, 
	 * total inspected garments, Total first time passed garments
	 */
	private double clockedHrs_1;	
	private double producedHrs_1;	
	private double totalInspected_1;	
	private double totalFTT_1;
	/* 
	 * 2nd day clocked hours, produced hours, 
	 * total inspected garments, Total first time passed garments
	 */
	private double clockedHrs_2;	
	private double producedHrs_2;	
	private double totalInspected_2;	
	private double totalFTT_2;
	/* 
	 * 3rd day clocked hours, produced hours, 
	 * total inspected garments, Total first time passed garments
	 */
	private double clockedHrs_3;	
	private double producedHrs_3;	
	private double totalInspected_3;	
	private double totalFTT_3;
	/* 
	 * 4th day clocked hours, produced hours, 
	 * total inspected garments, Total first time passed garments
	 */
	private double clockedHrs_4;	
	private double producedHrs_4;	
	private double totalInspected_4;	
	private double totalFTT_4;
	/* 
	 * 5th day clocked hours, produced hours, 
	 * total inspected garments, Total first time passed garments
	 */
	private double clockedHrs_5;	
	private double producedHrs_5;	
	private double totalInspected_5;	
	private double totalFTT_5;
	/* 
	 * previous day clocked hours, produced hours, 
	 * total inspected garments, Total first time passed garments
	 */
	private double clockedHrs_1d;
	private double producedHrs_1d;
	private double totalInspected_1d;
	private double totalFTT_1d;
	/* 
	 * previous day clocked hours, produced hours, 
	 * total inspected garments, Total first time passed garments
	 */
	private double clockedHrs_2d;
	private double producedHrs_2d;
	private double totalInspected_2d;
	private double totalFTT_2d;
	/* 
	 * previous day clocked hours, produced hours, 
	 * total inspected garments, Total first time passed garments
	 */
	private double clockedHrs_3d;
	private double producedHrs_3d;
	private double totalInspected_3d;
	private double totalFTT_3d;
/* end of style fields */
	
	
	
	
	public String execute(){
		
		if(saveSession()){
			
			loadForm();
			
			return "success";
		} else{
			return "error";
		}
	}
	
	public boolean saveSession(){
		/* previous sessions are removed */
		styleRecSession.remove("styleNo");
		styleRecSession.remove("stylePlantID");
		
		/* new data added to the session */
		styleRecSession.put("styleNo",styleNo);
		styleRecSession.put("stylePlantID",stylePlantID);
		
		/* verify whether new session values are stored */
		if(styleRecSession.get("styleNo") != null || styleRecSession.get("stylePlantID") != null){
			System.out.println("styleNo : "+styleRecSession.get("styleNo"));
			System.out.println("stylePlantID : "+styleRecSession.get("stylePlantID"));

			
			return true;
		} else{
			return false;
		}
	}
	
	public void loadForm() {
		Style style = new Style();	
		style = StyleDAO.getStyle((String)styleRecSession.get("styleNo"));
		
		if(style==null){
			setStyleExist(0);
			return;
		}

		setStyleExist(1);
		setNewRepeat(style.getNewRepeat());
		setModuleNo(style.getModuleNo());
		setPreSetting(style.getPreSetting());
		setPreTraining(style.getPreTraining());
		setPreBulk(style.getPreBulk());
		setPredictability(style.getPredictability());
		setFeedingTime(style.getFeedingTime());
		setQCOTime(style.getQCOTime());
		setRsr(style.getRsr());
		
		/* day 01 */
		
		setClockedHrs_1(style.getClockedHrs_1());		
		setProducedHrs_1(style.getProducedHrs_1());
		setTotalInspected_1(style.getTotalInspected_1());
		setTotalFTT_1(style.getTotalFTT_1());
		
		/* day 02 */
		setClockedHrs_2(style.getClockedHrs_2());
		setProducedHrs_2(style.getProducedHrs_2());
		setTotalInspected_2(style.getTotalInspected_2());
		setTotalFTT_2(style.getTotalFTT_2());
		
		/* day 03 */
		setClockedHrs_3(style.getClockedHrs_3());
		setProducedHrs_3(style.getProducedHrs_3());
		setTotalInspected_3(style.getTotalInspected_3());
		setTotalFTT_3(style.getTotalFTT_3());
		
		/* day 04 */
		setClockedHrs_4(style.getClockedHrs_4());
		setProducedHrs_4(style.getProducedHrs_4());
		setTotalInspected_4(style.getTotalInspected_4());
		setTotalFTT_4(style.getTotalFTT_4());
		
		/* day 05 */
		setClockedHrs_5(style.getClockedHrs_5());
		setProducedHrs_5(style.getProducedHrs_5());
		setTotalInspected_5(style.getTotalInspected_5());
		setTotalFTT_5(style.getTotalFTT_5());
		
		/* day 1d */
		setClockedHrs_1d(style.getClockedHrs_1d());
		setProducedHrs_1d(style.getProducedHrs_1d());
		setTotalInspected_1d(style.getTotalInspected_1d());
		setTotalFTT_1d(style.getTotalFTT_1d());
		
		/* day 2d */
		setClockedHrs_2d(style.getClockedHrs_2d());
		setProducedHrs_2d(style.getProducedHrs_2d());
		setTotalInspected_2d(style.getTotalInspected_2d());
		setTotalFTT_2d(style.getTotalFTT_2d());
		
		/* day 3d */
		setClockedHrs_3d(style.getClockedHrs_3d());
		setProducedHrs_3d(style.getProducedHrs_3d());
		setTotalInspected_3d(style.getTotalInspected_3d());
		setTotalFTT_3d(style.getTotalFTT_3d());
	}
	
	/* getters and setters */
	
	public int getStyleExist() {
		return styleExist;
	}
	
	public String getNewRepeat() {
		return newRepeat;
	}

	public int getModuleNo() {
		return moduleNo;
	}

	public int getPreSetting() {
		return preSetting;
	}

	public int getPreTraining() {
		return preTraining;
	}

	public int getPreBulk() {
		return preBulk;
	}

	public int getPredictability() {
		return predictability;
	}

	public int getFeedingTime() {
		return feedingTime;
	}

	public int getQCOTime() {
		return QCOTime;
	}

	public int getRsr() {
		return rsr;
	}

	public double getClockedHrs_1() {
		return clockedHrs_1;
	}

	public double getProducedHrs_1() {
		return producedHrs_1;
	}

	public double getTotalInspected_1() {
		return totalInspected_1;
	}

	public double getTotalFTT_1() {
		return totalFTT_1;
	}

	public double getClockedHrs_2() {
		return clockedHrs_2;
	}

	public double getProducedHrs_2() {
		return producedHrs_2;
	}

	public double getTotalInspected_2() {
		return totalInspected_2;
	}

	public double getTotalFTT_2() {
		return totalFTT_2;
	}

	public double getClockedHrs_3() {
		return clockedHrs_3;
	}

	public double getProducedHrs_3() {
		return producedHrs_3;
	}

	public double getTotalInspected_3() {
		return totalInspected_3;
	}

	public double getTotalFTT_3() {
		return totalFTT_3;
	}

	public double getClockedHrs_4() {
		return clockedHrs_4;
	}

	public double getProducedHrs_4() {
		return producedHrs_4;
	}

	public double getTotalInspected_4() {
		return totalInspected_4;
	}

	public double getTotalFTT_4() {
		return totalFTT_4;
	}

	public double getClockedHrs_5() {
		return clockedHrs_5;
	}

	public double getProducedHrs_5() {
		return producedHrs_5;
	}

	public double getTotalInspected_5() {
		return totalInspected_5;
	}

	public double getTotalFTT_5() {
		return totalFTT_5;
	}

	public double getClockedHrs_1d() {
		return clockedHrs_1d;
	}

	public double getProducedHrs_1d() {
		return producedHrs_1d;
	}

	public double getTotalInspected_1d() {
		return totalInspected_1d;
	}

	public double getTotalFTT_1d() {
		return totalFTT_1d;
	}

	public double getClockedHrs_2d() {
		return clockedHrs_2d;
	}

	public double getProducedHrs_2d() {
		return producedHrs_2d;
	}

	public double getTotalInspected_2d() {
		return totalInspected_2d;
	}

	public double getTotalFTT_2d() {
		return totalFTT_2d;
	}

	public double getClockedHrs_3d() {
		return clockedHrs_3d;
	}

	public double getProducedHrs_3d() {
		return producedHrs_3d;
	}

	public double getTotalInspected_3d() {
		return totalInspected_3d;
	}

	public double getTotalFTT_3d() {
		return totalFTT_3d;
	}

	public void setStyleExist(int styleExist) {
		this.styleExist = styleExist;
	}

	public void setNewRepeat(String newRepeat) {
		this.newRepeat = newRepeat;
	}

	public void setModuleNo(int moduleNo) {
		this.moduleNo = moduleNo;
	}

	public void setPreSetting(int preSetting) {
		this.preSetting = preSetting;
	}

	public void setPreTraining(int preTraining) {
		this.preTraining = preTraining;
	}

	public void setPreBulk(int preBulk) {
		this.preBulk = preBulk;
	}

	public void setPredictability(int predictability) {
		this.predictability = predictability;
	}

	public void setFeedingTime(int feedingTime) {
		this.feedingTime = feedingTime;
	}

	public void setQCOTime(int qCOTime) {
		QCOTime = qCOTime;
	}

	public void setRsr(int rsr) {
		this.rsr = rsr;
	}

	public void setClockedHrs_1(double clockedHrs_1) {
		this.clockedHrs_1 = clockedHrs_1;
	}

	public void setProducedHrs_1(double producedHrs_1) {
		this.producedHrs_1 = producedHrs_1;
	}

	public void setTotalInspected_1(double totalInspected_1) {
		this.totalInspected_1 = totalInspected_1;
	}

	public void setTotalFTT_1(double totalFTT_1) {
		this.totalFTT_1 = totalFTT_1;
	}

	public void setClockedHrs_2(double clockedHrs_2) {
		this.clockedHrs_2 = clockedHrs_2;
	}

	public void setProducedHrs_2(double producedHrs_2) {
		this.producedHrs_2 = producedHrs_2;
	}

	public void setTotalInspected_2(double totalInspected_2) {
		this.totalInspected_2 = totalInspected_2;
	}

	public void setTotalFTT_2(double totalFTT_2) {
		this.totalFTT_2 = totalFTT_2;
	}

	public void setClockedHrs_3(double clockedHrs_3) {
		this.clockedHrs_3 = clockedHrs_3;
	}

	public void setProducedHrs_3(double producedHrs_3) {
		this.producedHrs_3 = producedHrs_3;
	}

	public void setTotalInspected_3(double totalInspected_3) {
		this.totalInspected_3 = totalInspected_3;
	}

	public void setTotalFTT_3(double totalFTT_3) {
		this.totalFTT_3 = totalFTT_3;
	}

	public void setClockedHrs_4(double clockedHrs_4) {
		this.clockedHrs_4 = clockedHrs_4;
	}

	public void setProducedHrs_4(double producedHrs_4) {
		this.producedHrs_4 = producedHrs_4;
	}

	public void setTotalInspected_4(double totalInspected_4) {
		this.totalInspected_4 = totalInspected_4;
	}

	public void setTotalFTT_4(double totalFTT_4) {
		this.totalFTT_4 = totalFTT_4;
	}

	public void setClockedHrs_5(double clockedHrs_5) {
		this.clockedHrs_5 = clockedHrs_5;
	}

	public void setProducedHrs_5(double producedHrs_5) {
		this.producedHrs_5 = producedHrs_5;
	}

	public void setTotalInspected_5(double totalInspected_5) {
		this.totalInspected_5 = totalInspected_5;
	}

	public void setTotalFTT_5(double totalFTT_5) {
		this.totalFTT_5 = totalFTT_5;
	}

	public void setClockedHrs_1d(double clockedHrs_1d) {
		this.clockedHrs_1d = clockedHrs_1d;
	}

	public void setProducedHrs_1d(double producedHrs_1d) {
		this.producedHrs_1d = producedHrs_1d;
	}

	public void setTotalInspected_1d(double totalInspected_1d) {
		this.totalInspected_1d = totalInspected_1d;
	}

	public void setTotalFTT_1d(double totalFTT_1d) {
		this.totalFTT_1d = totalFTT_1d;
	}

	public void setClockedHrs_2d(double clockedHrs_2d) {
		this.clockedHrs_2d = clockedHrs_2d;
	}

	public void setProducedHrs_2d(double producedHrs_2d) {
		this.producedHrs_2d = producedHrs_2d;
	}

	public void setTotalInspected_2d(double totalInspected_2d) {
		this.totalInspected_2d = totalInspected_2d;
	}

	public void setTotalFTT_2d(double totalFTT_2d) {
		this.totalFTT_2d = totalFTT_2d;
	}

	public void setClockedHrs_3d(double clockedHrs_3d) {
		this.clockedHrs_3d = clockedHrs_3d;
	}

	public void setProducedHrs_3d(double producedHrs_3d) {
		this.producedHrs_3d = producedHrs_3d;
	}

	public void setTotalInspected_3d(double totalInspected_3d) {
		this.totalInspected_3d = totalInspected_3d;
	}

	public void setTotalFTT_3d(double totalFTT_3d) {
		this.totalFTT_3d = totalFTT_3d;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		styleRecSession = session ;
		
	}

}