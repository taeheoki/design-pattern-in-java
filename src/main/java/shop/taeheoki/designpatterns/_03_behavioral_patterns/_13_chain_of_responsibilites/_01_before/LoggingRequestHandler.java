package shop.taeheoki.designpatterns._03_behavioral_patterns._13_chain_of_responsibilites._01_before;

public class LoggingRequestHandler extends RequestHandler {
    @Override
    public void handler(Request request) {
        System.out.println("로깅");
        super.handler(request);
    }
}
