package baiscs;
class wt extends Thread{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println(i);

        }
    }

}
class Daemon  {
    public static void main(String[] args) {
        wt w=new wt();
        w.setDaemon(true);//if we write w.setDemon(true) after the w.start() statement or after the thread execution
                                  //the illegal thread state exceotion will rise(here the daemon thread will stop after
                                   // after completion of main thread
        w.start();
        for(int i=0;i<10;i++)
        {
            System.out.println((i));
        }

    }
}
