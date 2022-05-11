package login;

public class PasswordException extends User {
    private int errCode;
    private String errMessage;

    public PasswordException(int errCode) {
        super();
        this.errCode = errCode;
        if(errCode==1){
            this.errMessage = "Password tidak boleh kosong!"}
        else if(errCode==2){
            this.errMessage = "Maaf, password minimal 7 karakter!"}
        else if(errCode==3){
            this.errMessage = "Maaf, password harus mengandung huruf besar, huruf kecil, simbol, dan angka!"}
        else if(errCode==4){
            this.errMessage = "Maaf, password tidak boleh sama dengan username!"}
        }

        public PasswordException(String errorMessage){
            super(errorMessage);
        }

        public int getErrorCode(){
            return this.errCode;
        }

        public String getErrorMessage(){
            return this.errMessage;
        }
}


