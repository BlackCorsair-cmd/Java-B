package DayEight;

public class TestSubstring {

	public static void main(String[] args) {
		String s1 = "123456789";
		
		String s2 = s1.substring(0, 5);
		
		String s3 = s1.substring(2, 5);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		String s4 = s1 + "0";
		System.out.println(s1);
        System.out.println(s4);
        
        String filename = "sometestclass.java";
        String extension = filename.substring(filename.length()  -4, filename.length());
        System.out.println(extension);
        
        String filename2 = "someapp.exe";
        
        String fileExtension = filename.substring(filename.lastIndexOf("and") + 1, filename.length());
        System.out.println(fileExtension);
        
	}

}
