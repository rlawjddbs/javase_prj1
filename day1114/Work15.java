package day1114;
// 1. �Ʒ��� ���� ������ ������ ����� ����� ������.
//
//    �̴ϼ� : 'K', ���� : �ڽ��ǳ���, �޴��÷� : 1.5, ������ �÷� : 0.8
//
//    ��� : ���� �̴ϼ��� 'K'�̰�, xx���Դϴ�. �÷��� �޴� xx, ������ xx�Դϴ�.
//
// 2. �⺻�� ���������� �����Ǵ� Ŭ������ Wrapper Class��� �Ѵ�. 
//    Java Document���� WrapperŬ������ ����� �����ϴ��� ã�ƺ��� 
//    �׿� ���� �ּҰ��� �ִ밪�� ��� �Ѵ�. 
// 
//    ��� :  byte�� �ּҰ� :  -128  �ִ밪 : 127 

class Work15{
	public static void main(String[] args) {
		// 1������ ���� �ʱ�ȭ
		char initial = 'K';
		byte age = 30;
		float leftEye = 1.5F,	rightEye = 0.8F;
		System.out.println("���� �̴ϼ��� '"+initial+"'�̰�, "+age+"���Դϴ�. �÷��� �޴� "+leftEye+", ������ "+rightEye+"�Դϴ�.");		

		// 2������
		System.out.println("Byte�� �ּҰ� :"+Byte.MIN_VALUE+" �ִ밪 : "+Byte.MAX_VALUE);
		System.out.println("Short�� �ּҰ� :"+Short.MIN_VALUE+" �ִ밪 : "+Short.MAX_VALUE);
		System.out.println("Character�� �ּҰ� :"+(int)Character.MIN_VALUE+" �ִ밪 : "+(int)Character.MAX_VALUE);
		System.out.println("Integer�� �ּҰ� :"+Integer.MIN_VALUE+" �ִ밪 : "+Integer.MAX_VALUE);
		System.out.println("Float�� �ּҰ� :"+Float.MIN_VALUE+" �ִ밪 : "+Float.MAX_VALUE);
		System.out.println("Double�� �ּҰ� :"+Double.MIN_VALUE+" �ִ밪 : "+Double.MAX_VALUE);
		System.out.println("Long�� �ּҰ� :"+Long.MIN_VALUE+" �ִ밪 : "+Long.MAX_VALUE);

	}//main
}//class