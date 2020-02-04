package test;

class OpenException extends  Exception{

}
class  CloseException extends  OpenException{

}
class NewException extends Exception{

}
public class ThrowException {
   public ThrowException() throws OpenException{

    }
    public  void fun() throws OpenException{

    }

    public static void main(String[] args) {

    }
}
class NewArray extends ThrowException {
  public   NewArray () throws OpenException,NewException{

    }
    public  void fun() throws OpenException {//这里必须为OpenException或者子类CloseException
        //不能为其他异常类，这是成员函数所必须遵循的。
    }
    public static void main(String[] args) {

        try{
            ThrowException p=new NewArray();
            p.fun();
        } catch (CloseException e) {
            e.printStackTrace();
            System.out.println("qin");
        } catch (OpenException e) {
            e.printStackTrace();
            System.out.println("yuan");
        } catch (NewException e) {
            e.printStackTrace();
            System.out.println("yuan");
        }
    }
}