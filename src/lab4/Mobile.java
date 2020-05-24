package lab4;

import com.sun.tools.internal.ws.wsdl.document.Output;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mobile {

    private final List<MobileInfo> mobileInfos;

    public Mobile(InputStream inputStream) throws IOException {
        this.mobileInfos = Arrays.asList(
            new MobileInfo(inputStream),
            new MobileInfo(inputStream),
            new MobileInfo(inputStream)
        );
    }

    public Mobile(List<MobileInfo> mobileInfos) {
        this.mobileInfos = mobileInfos;
    }

    public Mobile() {
        this.mobileInfos = Arrays.asList(
            new MobileInfo(),
            new MobileInfo(),
            new MobileInfo()
        );
    }

    public List<MobileInfo> getMobileInfos() {
        return mobileInfos;
    }

    public static class MobileInfo {
        private final List<MobileModel> mobiles;

        public MobileInfo(InputStream inputStream) throws IOException {
            this.mobiles = Arrays.asList(
                new MobileModel(inputStream),
                new MobileModel(inputStream),
                new MobileModel(inputStream)
            );
        }

        public MobileInfo(List<MobileModel> mobiles) {
            this.mobiles = mobiles;
        }

        public MobileInfo() {
            this.mobiles = Arrays.asList(
                new MobileModel(),
                new MobileModel(),
                new MobileModel()
            );
        }

        public List<MobileModel> getMobiles() {
            return mobiles;
        }

        public static class MobileModel {
            private final List<String> properties;

            public MobileModel(InputStream inputStream) throws IOException {
                this.properties = readFromInputStream(inputStream);
            }

            public MobileModel(List<String> properties) {
                this.properties = properties;
            }

            public MobileModel() {
                this.properties = Arrays.asList("property1", "property2", "property3");
            }

            public List<String> getProperties() {
                return properties;
            }

            private List<String> readFromInputStream(final InputStream inputStream) throws IOException {
                final List<String> result = new ArrayList<>();
                final BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
                String line = br.readLine();
                while (!line.equals("END")) {
                    result.add(line);
                    line = br.readLine();
                }
                return result;
            }

            public void writeToOutputStream(final OutputStream outputStream) throws IOException {
                try (final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(outputStream))) {
                    for (final String property : properties) {
                        bw.write(property);
                        bw.newLine();
                    }
                }
            }

        }

    }

}
