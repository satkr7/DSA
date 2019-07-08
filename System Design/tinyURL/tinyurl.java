import java.util.*;

class tinyurl
{
	public static String code = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	public static final int base = code.length();
	
	public static HashMap<Long,String> hash=new HashMap<>();
	
	public String urlconverttotinurl(String url)
	{
		long random_num = generate_random_num();
		StringBuffer tinyurl = new StringBuffer();
		
		long num = random_num;
		while(num>0)
		{
			int rem = (int)(num%base);
			tinyurl.append(code.charAt(rem));
			num=num/base;
		}
		hash.put(random_num,url);
		return tinyurl.toString();
	}
	
	public long generate_random_num()
	{
		long rand = System.currentTimeMillis();
		return rand;
	}
	
	public String tinyurlconverttourl(String tinyurl)
	{
		long num = 0;
		
		char ar[] = tinyurl.toCharArray();
		for(int i=ar.length-1;i>=0;i--)
		{
			int ind = code.indexOf(ar[i]);
			num+=((long)ind*((long)Math.pow(base,i)));
		}
		String url = hash.get(num);
		return url;
	}
	
}