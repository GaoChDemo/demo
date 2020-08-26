package top.gaoch.zookeeper;

import com.google.errorprone.annotations.Var;
import lombok.SneakyThrows;
import org.apache.zookeeper.*;
import org.apache.zookeeper.data.Stat;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

public class DemoZookeeper {
  public static void main(String[] args) throws IOException, InterruptedException, KeeperException {

    CountDownLatch countDownLatch = new CountDownLatch(1);

    ZooKeeper zooKeeper = new ZooKeeper("47.93.237.49:2181", 3000, new Watcher() {
      @Override
      public void process(WatchedEvent watchedEvent) {
        Event.KeeperState state = watchedEvent.getState();
        Event.EventType type = watchedEvent.getType();
        String path = watchedEvent.getPath();
        System.out.println("new zk " + watchedEvent.toString());

        switch (state) {
          case Unknown:
            System.out.println("new zk Unknown");
            break;
          case Disconnected:
            System.out.println("new zk Disconnected");
            break;
          case NoSyncConnected:
            System.out.println("new zk NoSyncConnected");
            break;
          case SyncConnected:
            System.out.println("new zk SyncConnected");
            countDownLatch.countDown();
            break;
          case AuthFailed:
            System.out.println("new zk AuthFailed");
            break;
          case ConnectedReadOnly:
            System.out.println("new zk ConnectedReadOnly");
            break;
          case SaslAuthenticated:
            System.out.println("new zk SaslAuthenticated");
            break;
          case Expired:
            System.out.println("new zk Expired");
            break;
          case Closed:
            System.out.println("new zk Closed");
            break;
        }

        switch (type) {
          case None:
            System.out.println("new zk None");
            break;
          case NodeCreated:
            System.out.println("new zk NodeCreated");
            break;
          case NodeDeleted:
            System.out.println("new zk NodeDeleted");
            break;
          case NodeDataChanged:
            System.out.println("new zk NodeDataChanged");
            break;
          case NodeChildrenChanged:
            System.out.println("new zk NodeChildrenChanged");
            break;
        }
      }
    });

    // 等待zookeeper链接成功
    countDownLatch.await();
    // 查看状态
    ZooKeeper.States state = zooKeeper.getState();
    System.out.println("state : " + state.toString());

    // 创建临时节点
    String pathName = zooKeeper.create("/demo/ooxx", "olddata".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL);

    Stat stat = new Stat();
    byte[] oldData = zooKeeper.getData(pathName, new Watcher() {
      @SneakyThrows
      @Override
      public void process(WatchedEvent event) {
        System.out.println("zooKeeper.getData event : " + event.toString());
        Stat statProcess = new Stat();
        zooKeeper.getData(event.getPath(),true, statProcess);

        System.out.println("zooKeeper.getData statProcess : " + statProcess.toString() + " statProcess.getVersion(): " + statProcess.getVersion());
      }
    }, stat);

    System.out.println("oldData : " + new String(oldData));

    Stat stat1 = zooKeeper.setData(pathName, "newData".getBytes(), stat.getVersion());

    Stat stat2 = zooKeeper.setData(pathName, "newData1".getBytes(), stat1.getVersion());


    zooKeeper.getData(pathName, false, new AsyncCallback.DataCallback() {
      @Override
      public void processResult(int rc, String path, Object ctx, byte[] data, Stat stat) {
        System.out.println("rc : " + rc + "  path : " + path + " ctx : " + ctx + " data : " + new String(data) + " stat : " + stat);
      }
    }, "gaoc");

    //
//    System.out.println("path : " + path);
//
//    Stat stat = new Stat();
//    byte[] data = zooKeeper.getData("/ooxx", false, stat);
//
//    System.out.println("data : " + new String(data));


    System.in.read();
  }
}
