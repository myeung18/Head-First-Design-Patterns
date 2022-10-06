package DesignPatterns.strategy2;

public class PhotoWithPhone {
    public static void main(String[] args) {
        PhoneCameraApp app = new CameraPlusApp();
        String share = "a";
        switch(share) {
            case "t": app.setShareStrategy(new Txt()); break;
            case "e":app.setShareStrategy(new Email()); break;
            default: app.setShareStrategy(new Txt()); break;
        }

        app.take();
    }
}
