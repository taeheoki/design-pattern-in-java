package shop.taeheoki.designpatterns._03_behavioral_patterns._13_chain_of_responsibilites._01_before;

public class Client {

    public static void main(String[] args) {
        Request request = new Request("무궁화 꽃이 피었습니다.");
        RequestHandler requestHandler = new AuthRequestHandler();
        requestHandler.handler(request);
    }
}
