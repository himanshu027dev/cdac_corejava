package q4;

public class Authenticator {

    private String password;

    void Authenticator(String password) throws InvalidLengthException{
            this.password = password;
            int l = password.length();
        if (l < 5 || l>9) {
            throw new InvalidLengthException("Password length must more than 5 or less than 9");
        }else{
            done();}
}
    void done(){
        System.out.println("successful authentication");
    }
    public static void main(String[] args) {
        try {
            Authenticator authen = new Authenticator();
            authen.Authenticator("167890"); //
            
        } catch (InvalidLengthException e) {
            // TODO Auto-generated catch block
            System.out.println(e.getMessage());
        }
    }
}