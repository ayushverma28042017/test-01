//package threads;
//
////public class ThreadSafeSingleton {
//    public class ThreadSafeSingleton{
//        private static final ThreadSafeSingleton INSTANCE = new ThreadSafeSingleton();
//        private ThreadSafeSingleton(){ }
//        public static ThreadSafeSingleton getInstance(){
//            return INSTANCE;
//        }
//        public void display(){
//            System.out.println("Thread-safe Singleon");
//        }
//    }
////ThreadSafeSingleton.getInstance().display();
//
//
//enum ThreadSafeEnum{
//    SINGLETON_INSTANCE;
//    public void display(){
//        System.out.println("Thread-safe singleton Display");
//    }
//}
//// The Singleton class methods can be invoked as below
////ThreadSafeEnum.SINGLETON_INSTANCE.show();
//
//    // Creating private instance to make it accessible only by getInstance() method
//    private static ThreadSafeSingleton instance;
//    private ThreadSafeSingleton()
//    {
//        // Making constructor private so that objects cant be initialized outside the class
//    }
//    //synchronized getInstance method
//    synchronized public static ThreadSafeSingleton getInstance(){
//        if (this.instance == null)
//        {
//            // if instance is null, initialize
//            this.instance = new ThreadSafeSingleton();
//        }
//        return this.instance;
//    }
//}