package vn.hkd.model;

public class NgonNgu {
	private long idNgonNgu;
	private String tenNgonNgu;
	public NgonNgu() {
		super();
	}
	public NgonNgu(long idNgonNgu, String tenNgonNgu) {
		super();
		this.idNgonNgu = idNgonNgu;
		this.tenNgonNgu = tenNgonNgu;
	}
	public long getIdNgonNgu() {
		return idNgonNgu;
	}
	public void setIdNgonNgu(long idNgonNgu) {
		this.idNgonNgu = idNgonNgu;
	}
	public String getTenNgonNgu() {
		return tenNgonNgu;
	}
	public void setTenNgonNgu(String tenNgonNgu) {
		this.tenNgonNgu = tenNgonNgu;
	}
	
}
