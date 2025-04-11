package common.Exception;

public class CustomException extends RuntimeException{

    public CustomException(ErrorEnum error,String message){
        super(error.getErrorMessage()+message);
    }
}
