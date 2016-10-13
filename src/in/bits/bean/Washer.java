package in.bits.bean;

public class Washer {
	private int minCapacity;
	private int maxCapacity;
	private int currentCapacity;
	private int totalCapacity;
	
	public Washer(int minCapacity, int maxCapacity, int currentCapacity,
			int totalCapacity) {
		super();
		this.minCapacity = minCapacity;
		this.maxCapacity = maxCapacity;
		this.currentCapacity = currentCapacity;
		this.totalCapacity = totalCapacity;
	}

	/**
	 * @return the minCapacity
	 */
	public int getMinCapacity() {
		return minCapacity;
	}

	/**
	 * @param minCapacity the minCapacity to set
	 */
	public void setMinCapacity(int minCapacity) {
		this.minCapacity = minCapacity;
	}

	/**
	 * @return the maxCapacity
	 */
	public int getMaxCapacity() {
		return maxCapacity;
	}

	/**
	 * @param maxCapacity the maxCapacity to set
	 */
	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}

	/**
	 * @return the currentCapacity
	 */
	public int getCurrentCapacity() {
		return currentCapacity;
	}

	/**
	 * @param currentCapacity the currentCapacity to set
	 */
	public void setCurrentCapacity(int currentCapacity) {
		this.currentCapacity = currentCapacity;
	}

	/**
	 * @return the totalCapacity
	 */
	public int getTotalCapacity() {
		return totalCapacity;
	}

	/**
	 * @param totalCapacity the totalCapacity to set
	 */
	public void setTotalCapacity(int totalCapacity) {
		this.totalCapacity = totalCapacity;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Washer [minCapacity=" + minCapacity + ", maxCapacity="
				+ maxCapacity + ", currentCapacity=" + currentCapacity
				+ ", totalCapacity=" + totalCapacity + "]";
	}
		
}
