package vn.hkd.model;

public class TuyenDung {
	private long idTuyenDung;
	private String tinTuyenDung;
	private String bdTuyenDung;
	private String ktTuyenDung;
	public TuyenDung() {
		super();
	}
	public TuyenDung(long idTuyenDung, String tinTuyenDung, String bdTuyenDung, String ktTuyenDung) {
		super();
		this.idTuyenDung = idTuyenDung;
		this.tinTuyenDung = tinTuyenDung;
		this.bdTuyenDung = bdTuyenDung;
		this.ktTuyenDung = ktTuyenDung;
	}
	public long getIdTuyenDung() {
		return idTuyenDung;
	}
	public void setIdTuyenDung(long idTuyenDung) {
		this.idTuyenDung = idTuyenDung;
	}
	public String getTinTuyenDung() {
		return tinTuyenDung;
	}
	public void setTinTuyenDung(String tinTuyenDung) {
		this.tinTuyenDung = tinTuyenDung;
	}
	public String getBdTuyenDung() {
		return bdTuyenDung;
	}
	public void setBdTuyenDung(String bdTuyenDung) {
		this.bdTuyenDung = bdTuyenDung;
	}
	public String getKtTuyenDung() {
		return ktTuyenDung;
	}
	public void setKtTuyenDung(String ktTuyenDung) {
		this.ktTuyenDung = ktTuyenDung;
	}

}
