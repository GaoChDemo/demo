package top.gaoch.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelCopy {
  private static final int BSIZE = 1024;

  public static void main(String[] args) throws IOException {
    FileChannel in = new FileInputStream("src/main/java/nio/data.txt").getChannel();
    FileChannel out = new FileOutputStream("src/main/java/nio/out.txt").getChannel();

    ByteBuffer buffer = ByteBuffer.allocateDirect(BSIZE);
    while (in.read(buffer) != -1){
      buffer.flip();
      out.write(buffer);
      buffer.clear();
    }
  }
}
