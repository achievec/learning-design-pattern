package test;

import java.io.File;
import java.net.URL;

/**
 * @author aloha_world_
 * @date 2016年9月15日 下午12:30:15
 * @version v1.00
 * @description
 */
public class CreateFolder {
	public static void main(String[] args) throws Exception {
		creatFolder();
		
	}

	public static void creatFolder() {
		File file = new File("C:/Users/aloha/Desktop/BigTalkDesignPattenSourceCode");
		String targetFolder=System.getProperty("user.dir")+File.separator+"src";
		File[] files = file.listFiles();
		for (File f : files) {
			String fileName = f.getName();
			System.out.println(targetFolder+File.separator+fileName);
			File newFile=new File(targetFolder+File.separator+fileName);
			newFile.mkdir();
		}
	}

	public static void testGetPath() throws Exception {
		// 第一种：获取类加载的根路径 D:\git\daotie\daotie\target\classes
		File f = new File(CreateFolder.class.getResource("/").getPath());
		System.out.println(f);

		// 获取当前类的所在工程路径; 如果不加“/” 获取当前类的加载目录
		// D:\git\daotie\daotie\target\classes\my
		File f2 = new File(CreateFolder.class.getResource("").getPath());
		System.out.println(f2);

		// 第二种：获取项目路径 D:\git\daotie\daotie
		File directory = new File("");// 参数为空
		String courseFile = directory.getCanonicalPath();
		System.out.println(courseFile);

		// 第三种： file:/D:/git/daotie/daotie/target/classes/
		URL xmlpath = CreateFolder.class.getClassLoader().getResource("");
		System.out.println(xmlpath);

		// 第四种： D:\git\daotie\daotie
		System.out.println(System.getProperty("user.dir"));
		/*
		 * 结果： C:\Documents and Settings\Administrator\workspace\projectName
		 * 获取当前工程路径
		 */

		// 第五种： 获取所有的类路径 包括jar包的路径
		System.out.println(System.getProperty("java.class.path"));

	}
}
