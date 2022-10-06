package DesignPatterns.strategy2;

public abstract class PhoneCameraApp {
    ShareStrategy shareStrategy;

    public void setShareStrategy(ShareStrategy shareStrategy) {
        this.shareStrategy = shareStrategy;
    }

    void share() {
        shareStrategy.share();
    }

    public void take() {

    }
    public void save() {

    }

    abstract void edit();
}
