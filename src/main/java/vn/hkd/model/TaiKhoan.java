package vn.hkd.model;

public class TaiKhoan {
	private String emailTaiKhoan;
	private String loaiTaiKhoan;
	private String tenDayDu;
	private String matKhauTaiKhoan;
	private String moTaiKhoan;
	private String khoaTaiKhoan;
	public TaiKhoan() {
		super();
	}
	public TaiKhoan(String emailTaiKhoan, String loaiTaiKhoan, String tenDayDu, String matKhauTaiKhoan, String moTaiKhoan,
			String khoaTaiKhoan) {
		super();
		this.emailTaiKhoan = emailTaiKhoan;
		this.loaiTaiKhoan = loaiTaiKhoan;
		this.tenDayDu = tenDayDu;
		this.matKhauTaiKhoan = matKhauTaiKhoan;
		this.moTaiKhoan = moTaiKhoan;
		this.khoaTaiKhoan = khoaTaiKhoan;
	}
	public TaiKhoan(String emailTaiKhoan, String loaiTaiKhoan, String tenDayDu, String matKhauTaiKhoan) {
		super();
		this.emailTaiKhoan = emailTaiKhoan;
		this.loaiTaiKhoan = loaiTaiKhoan;
		this.tenDayDu = tenDayDu;
		this.matKhauTaiKhoan = matKhauTaiKhoan;
	}
	public String getEmailTaiKhoan() {
		return emailTaiKhoan;
	}
	public void setEmailTaiKhoan(String emailTaiKhoan) {
		this.emailTaiKhoan = emailTaiKhoan;
	}
	public String getLoaiTaiKhoan() {
		return loaiTaiKhoan;
	}
	public void setLoaiTaiKhoan(String loaiTaiKhoan) {
		this.loaiTaiKhoan = loaiTaiKhoan;
	}
	public String getTenDayDu() {
		return tenDayDu;
	}
	public void setTenDayDu(String tenDayDu) {
		this.tenDayDu = tenDayDu;
	}
	public String getMatKhauTaiKhoan() {
		return matKhauTaiKhoan;
	}
	public void setmatKhauTaiKhoan(String matKhauTaiKhoan) {
		this.matKhauTaiKhoan = matKhauTaiKhoan;
	}
	public String getMoTaiKhoan() {
		return moTaiKhoan;
	}
	public void setMoTaiKhoan(String moTaiKhoan) {
		this.moTaiKhoan = moTaiKhoan;
	}
	public String getKhoaTaiKhoan() {
		return khoaTaiKhoan;
	}
	public void setKhoaTaiKhoan(String khoaTaiKhoan) {
		this.khoaTaiKhoan = khoaTaiKhoan;
	}

}
