package lab4;

/**
 * 3. Создать класс Mobile с внутренним классом,
 * с помощью объектов которого можно хранить информацию о моделях телефонов и их свойствах.
 */
public class Variant1 {

    public void work() {
        final Mobile mobile = new Mobile();
        mobile.getMobileInfos().forEach(mobileInfo ->
                                            mobileInfo.getMobiles()
                                                      .forEach(mobileModel -> mobileModel.getProperties()
                                                                                         .forEach(System.out::println)));
    }

}
