package cn.itcast02;
/*
 * ������5�Ľ׳�
 * 	A:forѭ��
 * 	B:�ݹ�ʵ��
 * 		a:���ݹ�Ҫдһ������
 * 		b:Ҫ��һ������
 * 		c:����
 * */
public class DiGuiDemo {
	public static void main(String[] args) {
		int jx = 1;
		for(int j=2;j<=5;j++){
			jx *=j;
		}
		System.out.println("5�Ľ׳�Ϊ"+jx);
		
		System.out.println("5�Ľ׳��ǣ�"+jiecheng(5));
	}
	/*
	 * ���ݹ�Ҫдһ������
	 * 	1.����ֵ���ͣ�int
	 * 	2.�����б�int n
	 * 
	 * ����������
	 * 	1.n==1;if(n==1) return n=1;
	 * 
	 * ���ɣ�
	 * 	if(n!=1){return n*������(n-1)}
	 * */
	
	public static int jiecheng(int n){
		if(n==1){
			return n=1;
		}else{
			return n*jiecheng(n-1);
		}
	}
}
