package day16;

public class ThreadEx17 {
    public static void main(String[] args) {
        WorkObject sharedObject = new WorkObject();
        
        ThreadA threadA = new ThreadA(sharedObject);
        ThreadB threadB = new ThreadB(sharedObject);
        
        threadA.start();
        threadB.start();
    }
}

class WorkObject {
    public synchronized void methodA() {
        System.out.println("ThreadA�� methodA() �۾� ����");
        notify(); // �Ͻ����� ���¿� �ִ� ThreadB�� ���� �����·� ���� 
        try {
            wait(); // ThreadA�� �Ͻ� ���� ���·� ���� 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    public synchronized void methodB() {
        System.out.println("ThreadB�� methodB() �۾� ����");
        notify(); // �Ͻ����� ���¿� �ִ� ThreadA�� ���� �����·� ����
        try {
            wait(); // ThreadB�� �Ͻ� ���� ���·� ����
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ThreadA extends Thread{
    private WorkObject workObject;

    ThreadA(WorkObject workObject) {
        this.workObject = workObject;
    }
    
    public void run() {
        for(int i=0; i<10; i++) {
            workObject.methodA(); // ������ü�� methodA�� �ݺ������� ȣ�� 
        }
    }
}

class ThreadB extends Thread{
    private WorkObject workObject;

    ThreadB(WorkObject workObject) {
        this.workObject = workObject;
    }
    
    public void run() {
        for(int i=0; i<10; i++) {
            workObject.methodB(); // ������ü�� methodA�� �ݺ������� ȣ�� 
        }
    }
}
