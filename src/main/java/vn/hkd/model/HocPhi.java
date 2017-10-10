package vn.hkd.model;

public class HocPhi {
	private long idHocPhi;
	private int hpPhaiNop;
	private int hpNop1;
	private String ngayNop1;
	private int hpNop2;
	private String ngayNop2;
	private int hpNop3;
	private String ngayNop3;	
	private int hpNop4;
	private String ngayNop4;
	public HocPhi() {
		super();
	}
	public HocPhi(long idHocPhi, int hpPhaiNop, int hpNop1, String ngayNop1, int hpNop2, String ngayNop2, int hpNop3,
			String ngayNop3, int hpNop4, String ngayNop4) {
		super();
		this.idHocPhi = idHocPhi;
		this.hpPhaiNop = hpPhaiNop;
		this.hpNop1 = hpNop1;
		this.ngayNop1 = ngayNop1;
		this.hpNop2 = hpNop2;
		this.ngayNop2 = ngayNop2;
		this.hpNop3 = hpNop3;
		this.ngayNop3 = ngayNop3;
		this.hpNop4 = hpNop4;
		this.ngayNop4 = ngayNop4;
	}
	public long getIdHocPhi() {
		return idHocPhi;
	}
	public void setIdHocPhi(long idHocPhi) {
		this.idHocPhi = idHocPhi;
	}
	public int getHpPhaiNop() {
		return hpPhaiNop;
	}
	public void setHpPhaiNop(int hpPhaiNop) {
		this.hpPhaiNop = hpPhaiNop;
	}
	public int getHpNop1() {
		return hpNop1;
	}
	public void setHpNop1(int hpNop1) {
		this.hpNop1 = hpNop1;
	}
	public String getNgayNop1() {
		return ngayNop1;
	}
	public void setNgayNop1(String ngayNop1) {
		this.ngayNop1 = ngayNop1;
	}
	public int getHpNop2() {
		return hpNop2;
	}
	public void setHpNop2(int hpNop2) {
		this.hpNop2 = hpNop2;
	}
	public String getNgayNop2() {
		return ngayNop2;
	}
	public void setNgayNop2(String ngayNop2) {
		this.ngayNop2 = ngayNop2;
	}
	public int getHpNop3() {
		return hpNop3;
	}
	public void setHpNop3(int hpNop3) {
		this.hpNop3 = hpNop3;
	}
	public String getNgayNop3() {
		return ngayNop3;
	}
	public void setNgayNop3(String ngayNop3) {
		this.ngayNop3 = ngayNop3;
	}
	public int getHpNop4() {
		return hpNop4;
	}
	public void setHpNop4(int hpNop4) {
		this.hpNop4 = hpNop4;
	}
	public String getNgayNop4() {
		return ngayNop4;
	}
	public void setNgayNop4(String ngayNop4) {
		this.ngayNop4 = ngayNop4;
	}
	
}
