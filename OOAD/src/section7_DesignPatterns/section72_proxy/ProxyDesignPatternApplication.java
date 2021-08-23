package section7_DesignPatterns.section72_proxy;

interface Image{
	public void displayImage();
}

class ActualImage implements Image{

	@Override
	public void displayImage() {
		System.out.println("This is real image...");
	}
	
}

// Protection proxy
class ProxyImage implements Image{

	private ActualImage actualImage;
	
	@Override
	public void displayImage() {
		System.out.println("Checking the access...");
		System.out.println("Everything is good!");
		actualImage = new ActualImage();
		actualImage.displayImage();
	}
	
}

// Remote proxy
class ProxyImageCache implements Image{

	private ActualImage actualImage;
	
	@Override
	public void displayImage() {
		System.out.println("Object is not currently in cache");
		actualImage = new ActualImage();
		actualImage.displayImage();
	}
	
}

public class ProxyDesignPatternApplication {
	public static void main(String[] args) {
		
		ProxyImage proxyImage = new ProxyImage();
		proxyImage.displayImage();
		
		ProxyImageCache proxyImageCache = new ProxyImageCache();
		proxyImageCache.displayImage();
	}
}
