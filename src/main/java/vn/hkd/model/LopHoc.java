package vn.hkd.model;

public class LopHoc {
	private long idLopHoc;
	private String tenLopHoc;
	private String dbLopHoc;
	private String ktLopHoc;
	public LopHoc() {
		super();
	}
	public LopHoc(long idLopHoc, String tenLopHoc, String dbLopHoc, String ktLopHoc) {
		super();
		this.idLopHoc = idLopHoc;
		this.tenLopHoc = tenLopHoc;
		this.dbLopHoc = dbLopHoc;
		this.ktLopHoc = ktLopHoc;
	}
	public long getIdLopHoc() {
		return idLopHoc;
	}
	public void setIdLopHoc(long idLopHoc) {
		this.idLopHoc = idLopHoc;
	}
	public String getTenLopHoc() {
		return tenLopHoc;
	}
	public void setTenLopHoc(String tenLopHoc) {
		this.tenLopHoc = tenLopHoc;
	}
	public String getDbLopHoc() {
		return dbLopHoc;
	}
	public void setDbLopHoc(String dbLopHoc) {
		this.dbLopHoc = dbLopHoc;
	}
	public String getKtLopHoc() {
		return ktLopHoc;
	}
	public void setKtLopHoc(String ktLopHoc) {
		this.ktLopHoc = ktLopHoc;
	}

}
