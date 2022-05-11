package login;

public class LoginException extends PasswordException extends User{
    private String username;
    private String password;

    public Login(String username,String password) throws PasswordException{
        super(username, password);
        throws boolean ok = true;
        this.username = username;

        if(password.isEmpty()){
            ok = false;
            throw new RuntimeException("Maaf, username minimal harus terdiri dari 6 karakter");
        } else if(password.length() < 6{
            ok = false;
            throw new PasswordException(getErrorMessage());
        } else if(password.equals(username)){
            ok = false;
            throw new PasswordException(getErrorMessage());
        } else {
            boolean flagKecil = false;
            boolean flagBesar = false;
            boolean flagAngka = false;
            for(int i=0;i<password.length();i++){
                char c = password.charAt(i);
                if((Character.isLetter(c) && Character.isLower){
                    flagKecil = true;}
                if((Character.isLetter(c) && Character.isUpper{
                    flagBesar = true;}
                if(Character.isDigit(c))
                flagAngka = true;
            }
        if(!(flagKecil && flagAngka && flagBesar)){
            ok = false;
            throw new PasswordException(getErrorMessage());
            }
        }
        if(ok) this.password = password;
        else this.password = "";
        }

        public void show() {
            System.out.println(this.username);
            System.out.println(this.password);
        }

        public static void main(String[] args) {
            try {
            }
            catch{

            }
            finally {
            System.out.println("Selamat datang, ".username);
            }
        }

    }



}
