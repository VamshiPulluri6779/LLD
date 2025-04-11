package common.Exception;

public enum ErrorEnum {

    VIOLATES_LISKOV_PRINCIPLE(1,"Violates liskov principle"),

    SEAT_ALREADY_BOOKED(2, "Seat already Booked by other user");

    public int code;

    public String message;

    ErrorEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    String getErrorMessage() {
        return message;
    }

}
