package entity;

public class BaiHatEntity {

    private String maBh;
    private String tenBh;
    private String caSi;
    private String nhacSi;
    private String amThanh;
    private String anh;
    private String loiBh;
    private String thoiGian;
    private Integer soLuotThich;
    private Integer soluotNghe;
    private String maTheLoai;

    public BaiHatEntity() {
    }

    public BaiHatEntity(String maBh, String tenBh, String caSi, String nhacSi, String amThanh, String anh, String loiBh, String thoiGian, Integer soLuotThich, Integer soluotNghe, String maTheLoai) {
        this.maBh = maBh;
        this.tenBh = tenBh;
        this.caSi = caSi;
        this.nhacSi = nhacSi;
        this.amThanh = amThanh;
        this.anh = anh;
        this.loiBh = loiBh;
        this.thoiGian = thoiGian;
        this.soLuotThich = soLuotThich;
        this.soluotNghe = soluotNghe;
        this.maTheLoai = maTheLoai;
    }

    public String getMaBh() {
        return maBh;
    }

    public void setMaBh(String maBh) {
        this.maBh = maBh;
    }

    public String getTenBh() {
        return tenBh;
    }

    public void setTenBh(String tenBh) {
        this.tenBh = tenBh;
    }

    public String getCaSi() {
        return caSi;
    }

    public void setCaSi(String caSi) {
        this.caSi = caSi;
    }

    public String getNhacSi() {
        return nhacSi;
    }

    public void setNhacSi(String nhacSi) {
        this.nhacSi = nhacSi;
    }

    public String getAmThanh() {
        return amThanh;
    }

    public void setAmThanh(String amThanh) {
        this.amThanh = amThanh;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    public String getLoiBh() {
        return loiBh;
    }

    public void setLoiBh(String loiBh) {
        this.loiBh = loiBh;
    }

    public String getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(String thoiGian) {
        this.thoiGian = thoiGian;
    }

    public Integer getSoLuotThich() {
        return soLuotThich;
    }

    public void setSoLuotThich(Integer soLuotThich) {
        this.soLuotThich = soLuotThich;
    }

    public Integer getSoluotNghe() {
        return soluotNghe;
    }

    public void setSoluotNghe(Integer soluotNghe) {
        this.soluotNghe = soluotNghe;
    }

    public String getMaTheLoai() {
        return maTheLoai;
    }

    public void setMaTheLoai(String maTheLoai) {
        this.maTheLoai = maTheLoai;
    }

}
