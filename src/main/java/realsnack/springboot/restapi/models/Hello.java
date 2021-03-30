package realsnack.springboot.restapi.models;

public class Hello {
    private String message;

    public Hello(String helloString) {
        this.message = helloString;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
