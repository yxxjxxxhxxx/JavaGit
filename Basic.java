package dev.syntax.step01variables;

public class Basic { // Ŭ���� �̸��� �׻� �빮�� (Uppercase) - Class Naming Convention

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. ������ ����, ����� �ʱ�ȭ�� ������
		
		// 1-1. ������ ����
		int a; // Integer�� ���� ǥ��, "������ ���� a ����"
		System.out.println(a);
		// The local variable a may not have been initialized 
		// ���� �ʱ�ȭ�� �ȵǾ� �ִ�.
		
		// 1-2. ������ �ʱ�ȭ (Initialization)
		a = 5; // 5 �Ҵ�
		
		// 2. ������ �̸� ����(Variable Naming Convention)
		// ���������� ����� ������, �Ϲ����� ��Ģ or ���ʻ� ������� �ʴ� ���̽��� ����
		
		// 2-1. ������ (��ҹ���), ������ ��ǻ� �ҹ��ڷ� ����(camelCase)
		int alphabet = 26; // The value of the local variable alphabet is not used ����� ���ҰŸ� ������.
		System.out.println(alphabet); // ��� �߱� ������ ������� �����
		
		int Upper = 5; // �ܼ��� ���������� ����� �ɻ�, �������� �빮�ڷ� �������� ���� (��� ����)
		
		// 2-2. Ư������($, _(underbar) ��ȣ�� �ش�, !#@ ���� �Ұ���), ���Ž� �ڵ� �� �ý��� ���� �ڵ忡�� �ַ� ���,
		int $isLogin = 0; //���������� ����
		int _isLogin = 0;
		
		// 2-3. ���ڷ� ������ �� ����
		int 5 = 5; // ? �������� ���ڷ� �����Ͽ� ���� 
		
		// 2-4. Keyword(�����) ���Ұ� (while, for , int, break, class ��)
		int int = 5; // ? �������� ������ ����Ͽ� ����
		
	}	
}
