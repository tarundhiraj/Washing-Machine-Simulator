package in.bits.bean;

public enum Mode {
	LOW("LOW"), MEDIUM("MEDIUM"), HIGH("HIGH");
	
	private String mode;
	private Mode(String mode){
		this.mode = mode;
	}
}
