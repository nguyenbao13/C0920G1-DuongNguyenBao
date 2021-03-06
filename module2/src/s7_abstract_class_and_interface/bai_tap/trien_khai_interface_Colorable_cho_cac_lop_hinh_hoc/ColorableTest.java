package s7_abstract_class_and_interface.bai_tap.trien_khai_interface_Colorable_cho_cac_lop_hinh_hoc;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Rectangle(1, 3);
        shapes[1] = new Square(4);

        for (Shape shape : shapes) {
            if (shape instanceof Square) {
                System.out.print(shape.toString());
                shape.howToColor();
            } else {
                System.out.println(shape.toString());
            }
        }
    }
}
