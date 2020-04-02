package cn.itcast.dao.Ipml;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import cn.itcast.dao.UserDao;
import cn.itcast.pojo.User;
/**
 * @version 1.1
 * **/
public class UserDaoIpml implements UserDao{
	private static File file= new File("user.txt");
	static{
		try {
			file.createNewFile();
		} catch (IOException e) {
			System.out.println("文件创建失败");
//			e.printStackTrace();
		}
	}
	@Override
	public void register(User user){
		//为了让数据有一定的规则，我们给它定义一个规则：
		//用户名=密码
		BufferedWriter bw = null;
		try {
			String strDate = user.getName()+"="+user.getPassword();
//			bw = new BufferedWriter(new FileWriter("user.txt"));
			//为了保证追加数据必须加true
			bw = new BufferedWriter(new FileWriter(file,true));
			bw.write(strDate);
			bw.newLine();
		} catch (IOException e) {
			System.out.println("用户注册失败");
//			e.printStackTrace();
		}finally {
			if(bw != null){
				try {
					bw.close();
				} catch (IOException e) {
					System.out.println("释放资源失败");
				}
			}
		}
		
	}

	@Override
	public boolean isLogin(String username, String password) {
		boolean flag = false;
		BufferedReader br =null;
		try {
			br = new BufferedReader(new FileReader(file));
			String userline = null;
			while((userline=br.readLine()) != null){
				String userStr = userline;
				String[] str = userStr.split("=");
				int l = str.length;
				if(str[0].equals(username)&&str[1].equals(password)){
					flag =true;
					break;
				}else{
					flag = false;
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("用户登录找不到登陆的信息");
		}catch(IOException e){
			System.out.println("登录失败");
			e.printStackTrace();
		}finally {
			if(br!=null){
				try {
					br.close();
				} catch (IOException e) {
					System.out.println("用户登录释放资源失败");
				}
			}
		}
		
		return flag;
	}
	
}
