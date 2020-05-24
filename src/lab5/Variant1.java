package lab5;

import lab4.Mobile;

import java.io.IOException;
import java.io.InputStream;

public class Variant1 {

    public void work() {
        Mobile mobile;
        try {
            InputStream inputStream = System.in;
            mobile = new Mobile(inputStream);
            inputStream.close();
        } catch (IOException e) {
            System.out.println("Error by reading");
            e.printStackTrace();
            mobile = new Mobile();
        } catch (NullPointerException e) {
            System.out.println("Can't find such input stream");
            e.printStackTrace();
            mobile = new Mobile();
        } catch (OutOfMemoryError e) {
            System.out.println("Not enough memory for object creating");
            e.printStackTrace();
            return;
        }
        mobile.getMobileInfos().forEach(mobileInfo ->
                                            mobileInfo.getMobiles()
                                                      .forEach(mobileModel -> {
                                                          try {
                                                              mobileModel.writeToOutputStream(System.out);
                                                          } catch (IOException e) {
                                                              System.out.println("Error by printing");
                                                              e.printStackTrace();
                                                          }
                                                      }));
    }

}
