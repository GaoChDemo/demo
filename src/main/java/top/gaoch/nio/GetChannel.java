package top.gaoch.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class GetChannel {
  private static final int BSIZE = 1024;

  public static void main(String[] args) throws IOException {
    // Write a file:
    FileChannel fc = new FileOutputStream("src/main/java/nio/data.txt").getChannel();
    fc.write(ByteBuffer.wrap("Some text ".getBytes()));
    fc.close();

    // Add to the end of the file:
    fc = new RandomAccessFile("src/main/java/nio/data.txt", "rw").getChannel();
    fc.position(fc.size()); // Move to the end
    fc.write(ByteBuffer.wrap("Some more".getBytes()));
    fc.close();

    // Read the file:
    fc = new FileInputStream("src/main/java/nio/data.txt").getChannel();
    ByteBuffer buff = ByteBuffer.allocateDirect(BSIZE);
    fc.read(buff);
    buff.flip();
    while (buff.hasRemaining()) {
      System.out.print((char) buff.get());
    }
    fc.close();
  }
}
