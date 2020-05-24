package lab4;

import java.util.Arrays;
import java.util.List;

public class Mobile {

    private final List<MobileInfo> mobileInfos;

    public Mobile(List<MobileInfo> mobileInfos) {
        this.mobileInfos = mobileInfos;
    }

    public Mobile() {
        this.mobileInfos = Arrays.asList(new MobileInfo(), new MobileInfo(), new MobileInfo());
    }

    public List<MobileInfo> getMobileInfos() {
        return mobileInfos;
    }

    public static class MobileInfo {
        private final List<MobileModel> mobiles;

        public MobileInfo(List<MobileModel> mobiles) {
            this.mobiles = mobiles;
        }

        public MobileInfo() {
            this.mobiles = Arrays.asList(new MobileModel(), new MobileModel(), new MobileModel());
        }

        public List<MobileModel> getMobiles() {
            return mobiles;
        }

        public static class MobileModel {
            private final List<String> properties;

            public MobileModel(List<String> properties) {
                this.properties = properties;
            }

            public MobileModel() {
                this.properties = Arrays.asList("property1", "property2", "property3");
            }

            public List<String> getProperties() {
                return properties;
            }

        }

    }

}
