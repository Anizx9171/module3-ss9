package ra.modal;

public interface IUser {
    String name = "Anizx";
    String password = "Anizx9171?!";
    default void login(String name, String password){
        if (this.name.equals(name) && this.password.equals(password)) {
            System.out.println("Đăng nhập thành công!");
            display();
            return;
        }
        System.out.println("Đăng nhập thất bại!");
    }
    void display();
    static void noti(){
        System.out.println("thong bao cho tat ca nguoi dung");
    }
}
