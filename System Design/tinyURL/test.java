class test
{
	public static void main(String args[])
	{
		String url = "http://www.youtube.com";
		
		tinyurl obj1 = new tinyurl();
		
		String tinyurl = obj1.urlconverttotinurl(url);
		String url_regenerate = obj1.tinyurlconverttourl(tinyurl);
		
		System.out.println("URL : "+url);
		System.out.println("tinyURL : "+tinyurl);
		System.out.println("new URL : "+url_regenerate);
		
		System.out.println(obj1.hash);
		
		System.out.println();
		System.out.println();
		
		url = "https://www.youtube.com/watch?v=igrx08gaBMA&t=215s";
		
		tinyurl obj2 = new tinyurl();
		
		tinyurl = obj2.urlconverttotinurl(url);
		url_regenerate = obj2.tinyurlconverttourl(tinyurl);
		
		System.out.println("URL : "+url);
		System.out.println("tinyURL : "+tinyurl);
		System.out.println("new URL : "+url_regenerate);
		
		System.out.println(obj2.hash);
	}
}