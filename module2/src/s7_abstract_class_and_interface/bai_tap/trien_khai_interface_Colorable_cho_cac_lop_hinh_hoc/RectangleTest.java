package s7_abstract_class_and_interface.bai_tap.trien_khai_interface_Colorable_cho_cac_lop_hinh_hoc;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3 , 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle("orange",false, 2.5,3.8);
        System.out.println(rectangle);
    }
}
