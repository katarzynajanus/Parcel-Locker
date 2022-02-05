package MobileDevice;

public class MobileSystem {
        public static void main(String[] args) {
                MobilePhone mobilePhone = new MobilePhone(5.6f,
                        6,
                        "SnapDragon",
                        "Android",
                        "Smartfon",
                        true);


                Tablet tablet = new Tablet(10.9f,
                        8,
                        "IntelCore i5",
                        "Windows",
                        "Tablet graficzny",
                        true);

                mobilePhone.showMobileDeviceInfo();
                tablet.showMobileDeviceInfo();
        }


        }
