package main.java.com.practicalunittesting;

public class YoungBrother {
	
	public String[] restoreWords(String[] lines, int n, int k){
		String[] res = new String[n];
		
		String tmp = "";
		for(String line : lines){
			tmp += line;
		}
		
		if(tmp.isEmpty()){
			res[0] = tmp;
			return res;
		}
			
		for(int i = 0, j = 0; i < n; i++, j = j+k){
			String str = tmp.substring(j, k*(i+1));
			res[i] = str;
		}
		return res;
    }
	
	public static void main(String[] a){
		YoungBrother test = new YoungBrother();
		//String[] lines = {"jhgu", "", "a", "kjl"};
		String[] lines = {"tkwyslbgxegjvdaafcnxhetx","xwuqmvepmkxl"};
		String[] res = test.restoreWords(lines, 6, 6);
		
		for(String line : res){
			System.out.println(line);
		}
	}
}

/*
{"jhgu", "", "a", "kjl"}
2
4
Returns: {"jhgu", "akjl" }
John's brother added one line break at the end of the first line, and another line break after the first character of the second line.
1)
{"","",""}
1
0
Returns: {"" }
The original text might have contained words of length 0.
2)
{"","","","","vhtoqhthisojnovivdavhafa","wjbjtwwxuglxceeypnnvkuxwolaycvrwtdaugej","",""}
3
21
Returns: {"vhtoqhthisojnovivdavh", "afawjbjtwwxuglxceeypn", "nvkuxwolaycvrwtdaugej" }
3)
{"tkwyslbgxegjvdaafcnxhetx","xwuqmvepmkxl"}
6
6
*/
