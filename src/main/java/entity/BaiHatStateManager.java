package entity;

public class BaiHatStateManager {

    public static BaiHatEntity selectedBaiHat;

    public BaiHatStateManager() {
    }

    public static BaiHatEntity getSelectedBaiHat() {
        return selectedBaiHat;
    }

    public static void setSelectedBaiHat(BaiHatEntity baiHat) {
        selectedBaiHat = baiHat;
    }
}
