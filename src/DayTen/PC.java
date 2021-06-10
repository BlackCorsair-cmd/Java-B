package DayTen;

public class PC {
	private int price;
	private String type;
	private boolean isDesktop;
	
	public PC(int price, String type, boolean isDesktop) {
		super();
		this.price = price;
		this.type = type;
		this.isDesktop = isDesktop;
	}

	@Override
	public String toString() {
		return "PC [price=" + price + ", type=" + type + ", isDesktop=" + isDesktop + "]";
	}
	
	 @Override
	  public int hashCode() {
	    final int prime = 31;
	    int result = 1;
	    result = prime * result + (isDesktop ? 1231 : 1237);
	    result = prime * result + price;
	    result = prime * result + ((type == null) ? 0 : type.hashCode());
	    return result;
	  }

	  @Override
	  public boolean equals(Object obj) {
	    if (this == obj)
	      return true;
	    if (obj == null)
	      return false;
	    if (getClass() != obj.getClass())
	      return false;
	    PC other = (PC) obj;
	    if (isDesktop != other.isDesktop)
	      return false;
	    if (price != other.price)
	      return false;
	    if (type == null) {
	      if (other.type != null)
	        return false;
	    } else if (!type.equals(other.type))
	      return false;
	    return true;
	  }

}
