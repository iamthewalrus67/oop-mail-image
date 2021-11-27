package proxy_image;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        ProxyImage proxyImage = new ProxyImage("cat.png");
        proxyImage.display();
    }
}
