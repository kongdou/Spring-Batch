package fun.deepsky.springbatch.flow;

public interface CreditService {

	/*
	 * 
	 * 解压
	 */
	void decompress(String inputFile,String outputDirectory);
	
	/*
	 * 验证
	 */
	String verify(String outputDirectory, String readFileName);
	
	/*
	 * 清理
	 */
	void clean(String outputDirectory);
	
	/*
	 * 校验文件是否存在
	 */
	boolean exists(String file);
}
