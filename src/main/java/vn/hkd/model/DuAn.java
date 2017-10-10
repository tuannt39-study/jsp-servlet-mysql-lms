package vn.hkd.model;

public class DuAn {
	private long idDuAn;
	private String tenDuAn;
	private String tenKhachHang;
	private String bdDuAn;
	private String ktDuAn;
	public DuAn() {
		super();
	}
	public DuAn(long idDuAn, String tenDuAn, String tenKhachHang, String bdDuAn, String ktDuAn) {
		super();
		this.idDuAn = idDuAn;
		this.tenDuAn = tenDuAn;
		this.tenKhachHang = tenKhachHang;
		this.bdDuAn = bdDuAn;
		this.ktDuAn = ktDuAn;
	}
	public long getIdDuAn() {
		return idDuAn;
	}
	public void setIdDuAn(long idDuAn) {
		this.idDuAn = idDuAn;
	}
	public String getTenDuAn() {
		return tenDuAn;
	}
	public void setTenDuAn(String tenDuAn) {
		this.tenDuAn = tenDuAn;
	}
	public String getTenKhachHang() {
		return tenKhachHang;
	}
	public void setTenKhachHang(String tenKhachHang) {
		this.tenKhachHang = tenKhachHang;
	}
	public String getBdDuAn() {
		return bdDuAn;
	}
	public void setBdDuAn(String bdDuAn) {
		this.bdDuAn = bdDuAn;
	}
	public String getKtDuAn() {
		return ktDuAn;
	}
	public void setKtDuAn(String ktDuAn) {
		this.ktDuAn = ktDuAn;
	}
	
}
