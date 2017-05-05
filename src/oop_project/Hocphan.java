
package oop_project;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Hocphan {

    @SerializedName("maHocPhan")
    @Expose
    private String maHocPhan;
    @SerializedName("tenHocPhan")
    @Expose
    private String tenHocPhan;
    @SerializedName("thoiLuong")
    @Expose
    private String thoiLuong;
    @SerializedName("soTinChi")
    @Expose
    private Integer soTinChi;
    @SerializedName("tinChiHocPhi")
    @Expose
    private Double tinChiHocPhi;
    @SerializedName("trongSo")
    @Expose
    private Double trongSo;

    public String getMaHocPhan() {
        return maHocPhan;
    }

    public void setMaHocPhan(String maHocPhan) {
        this.maHocPhan = maHocPhan;
    }

    public String getTenHocPhan() {
        return tenHocPhan;
    }

    public void setTenHocPhan(String tenHocPhan) {
        this.tenHocPhan = tenHocPhan;
    }

    public String getThoiLuong() {
        return thoiLuong;
    }

    public void setThoiLuong(String thoiLuong) {
        this.thoiLuong = thoiLuong;
    }

    public Integer getSoTinChi() {
        return soTinChi;
    }

    public void setSoTinChi(Integer soTinChi) {
        this.soTinChi = soTinChi;
    }

    public Double getTinChiHocPhi() {
        return tinChiHocPhi;
    }

    public void setTinChiHocPhi(Double tinChiHocPhi) {
        this.tinChiHocPhi = tinChiHocPhi;
    }

    public Double getTrongSo() {
        return trongSo;
    }

    public void setTrongSo(Double trongSo) {
        this.trongSo = trongSo;
    }
    public void display(){
        System.out.println("\"MaHocPhan\" :" +this.getMaHocPhan());
        System.out.println("\"TenHocPhan\" : " +this.getTenHocPhan());
        System.out.println("\"ThoiLuong\" : " +this.getThoiLuong());
        System.out.println("\"SoTinChi\" : " +this.getSoTinChi());
        System.out.println("\"TinChiHocPhi\" : " +this.getTinChiHocPhi());
        System.out.println("\"TrongSo\" : " +this.getTrongSo());
    }
}