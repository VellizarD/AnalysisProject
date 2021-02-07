package analysisProject.models;

import analysisProject.services.StartSequenceService;

public class StartMatingSequenceFormModel {

	private String fID;
	private String mID;
	private String message;

	public void navigateToMatingSequnceForm() {
		System.out.println("Навигирано е до формата за стартиране на процес по чифтосване!");

	}

	public void setFemaleCowId(String fID) {
		this.fID = fID;

	}

	public void setMaleCowId(String mID) {
		this.mID = mID;

	}

	public void clickStartButton() {
		message = StartSequenceService.start(fID, mID);

	}

	public String getStartMessage() {
		return message;
	}

}
