public enum EnumMatri{
	CELIBATAIRE(0),MARIESANSENF(10),MARIEAVECENF(20);
	private int reduc;
	EnumMatri(int vmatri){
		this.reduc=reduc;
	}

	public int getReduction(){
		return this.reduc;
	}
	public void setReduction(int vreduc){
		this.reduc=vreduc;
	}
}