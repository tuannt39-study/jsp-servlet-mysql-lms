package vn.hkd.model;

public class LichHoc {
	private long idLichHoc;
	private String thu;
	private String bdLichHoc;
	private String ktLichHoc;
	private String diaDiemLichHoc;
	public LichHoc() {
		super();
	}
	public LichHoc(long idLichHoc, String thu, String bdLichHoc, String ktLichHoc, String diaDiemLichHoc) {
		super();
		this.idLichHoc = idLichHoc;
		this.thu = thu;
		this.bdLichHoc = bdLichHoc;
		this.ktLichHoc = ktLichHoc;
		this.diaDiemLichHoc = diaDiemLichHoc;
	}
	public long getIdLichHoc() {
		return idLichHoc;
	}
	public void setIdLichHoc(long idLichHoc) {
		this.idLichHoc = idLichHoc;
	}
	public String getThu() {
		return thu;
	}
	public void setThu(String thu) {
		this.thu = thu;
	}
	public String getBdLichHoc() {
		return bdLichHoc;
	}
	public void setBdLichHoc(String bdLichHoc) {
		this.bdLichHoc = bdLichHoc;
	}
	public String getKtLichHoc() {
		return ktLichHoc;
	}
	public void setKtLichHoc(String ktLichHoc) {
		this.ktLichHoc = ktLichHoc;
	}
	public String getDiaDiemLichHoc() {
		return diaDiemLichHoc;
	}
	public void setDiaDiemLichHoc(String diaDiemLichHoc) {
		this.diaDiemLichHoc = diaDiemLichHoc;
	}

}
