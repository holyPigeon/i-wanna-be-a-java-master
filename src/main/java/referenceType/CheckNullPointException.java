package referenceType;

public class CheckNullPointException {
    public static void main(String[] args) {
        Data data = null;

        // null로 초기화한 data 인스턴스 조회
        System.out.println("data -> " + data);

        // null로 초기화한 data 인스턴스 안의 초기화되지 않은 content 조회 -> NullPointerException 발생
        System.out.println("data.content -> " + data.content);

    }

    public static class Data {
        private String content;
    }
}
