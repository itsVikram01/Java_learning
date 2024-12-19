package exceptionHandling.exceptionHandlingInSpringboot.usingRestControllerAdvice;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
