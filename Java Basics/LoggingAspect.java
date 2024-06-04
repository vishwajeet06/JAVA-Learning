@RestControler
public class LoggingAspect {

    @getmapping('/test')
    public string sayHello(){
        throw new RuntimeException("Exception occured");
    }

    @ExceptionHandler(Exception class)

    {

        public string handlerException() {
            return "Exception handled";
        }
    }
}