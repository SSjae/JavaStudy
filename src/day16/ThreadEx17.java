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
        System.out.println("ThreadA의 methodA() 작업 실행");
        notify(); // 일시정지 상태에 있는 ThreadB를 실행 대기상태로 만듬 
        try {
            wait(); // ThreadA를 일시 정지 상태로 만듬 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    public synchronized void methodB() {
        System.out.println("ThreadB의 methodB() 작업 실행");
        notify(); // 일시정지 상태에 있는 ThreadA를 실행 대기상태로 만듬
        try {
            wait(); // ThreadB를 일시 정지 상태로 만듬
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
            workObject.methodA(); // 공유객체의 methodA를 반복적으로 호출 
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
            workObject.methodB(); // 공유객체의 methodA를 반복적으로 호출 
        }
    }
}
