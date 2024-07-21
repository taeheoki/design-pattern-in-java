package shop.taeheoki.designpatterns._02_structural_patterns._09_decorator._01_before;

public class Client {

    private CommentService commentService;

    public Client(CommentService commentService) {
        this.commentService = commentService;
    }

    private void writeComment(String comment) {
        commentService.addComment(comment);
    }

    public static void main(String[] args) {
        Client client = new Client(new TrimmingCommentService());
        client.writeComment("오징어게임");
        client.writeComment("보는게 하는 거 보다 재밌을 수가 없지...");
        client.writeComment("http://taeheoki.shop");
    }
}
