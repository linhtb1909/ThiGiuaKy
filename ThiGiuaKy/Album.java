package ThiGiuaKy;

public class Album {
    private int maCD;
    private String tuaCD;
    private String caSy;
    private int soBH;
    private float giaThanh;

    public Album(int maCD, String tuaCD, String caSy, int soBH, float giaThanh) {
        this.maCD = maCD;
        this.tuaCD = tuaCD;
        this.caSy = caSy;
        this.soBH = soBH;
        this.giaThanh = giaThanh;
    }

    public Album() {
    }

    public int getMaCD() {
        return maCD;
    }

    public void setMaCD(int maCD) {
        this.maCD = maCD;
    }

    public String getTuaCD() {
        return tuaCD;
    }

    public void setTuaCD(String tuaCD) {
        this.tuaCD = tuaCD;
    }

    public String getCaSy() {
        return caSy;
    }

    public void setCaSy(String caSy) {
        this.caSy = caSy;
    }

    public int getSoBH() {
        return soBH;
    }

    public void setSoBH(int soBH) {
        this.soBH = soBH;
    }

    public float getGiaThanh() {
        return giaThanh;
    }

    public void setGiaThanh(float giaThanh) {
        this.giaThanh = giaThanh;
    }

    public String toString(){
        String str = "Mã CD: " + this.maCD;
        str += "Tựa CD: " + this.tuaCD;
        str += "Ca Sỹ: " + this.caSy;
        str += "Số Bài Hát: " + this.soBH;
        str += "Giá Thành: " + this.giaThanh;        

        return str;
    }
    public void hienthiCD(){
        System.out.printf("%-10d %-20s %-20s %-10d %-20.1f \n",maCD,tuaCD,caSy,soBH,giaThanh);
    }
}
