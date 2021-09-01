import java.io.*;
import java.util.*;

public class ProblemName {
  public static void solution(Kattio io) {
    // TODO: Put your solution here!!!
  }

  public static void main(String[] args) {
    // use try-resource to make it auto close the io
    // TODO: uncomment /* "ProblemName" */ if reading and writing to files instead of standard i/o
    try(final Kattio io = new Kattio(/* "ProblemName" */)) {
      solution(io);
    }
  }

  // io.next()       : read the next String
  // io.nextInt()    : read the next int (integers in 32 bits)
  // io.nextLong()   : read the next long (BIG integers in 64 bits)
  // io.nextDouble() : read the next double (real numbers (ex: 3.14) in 64 bits)
  // io.next(number) : read the next several string, int, long, or double and return an array
  //                   ex: int[] a = io.nextInt(2);
  // io.print(a);    : print a
  // io.println(a);  : print a and then new line
  // io.printAll(array); : print all in the array, separated by space
  static class Kattio extends PrintWriter {
    private BufferedReader r;
    private StringTokenizer st;
    // standard input
    public Kattio() {
      this(System.in,System.out);
    }
    public Kattio(InputStream i, OutputStream o) {
      super(o);
      r = new BufferedReader(new InputStreamReader(i));
    }
    // USACO-style file input
    public Kattio(String problemName) throws IOException {
      super(new FileWriter(problemName+".out"));
      r = new BufferedReader(new FileReader(problemName+".in"));
    }
    // returns null if no more input
    public String next() {
      try {
        while (st == null || !st.hasMoreTokens())
          st = new StringTokenizer(r.readLine());
        return st.nextToken();
      } catch (Exception e) {}
      return null;
    }
    public int nextInt() { return Integer.parseInt(next()); }
    public double nextDouble() { return Double.parseDouble(next()); }
    public long nextLong() { return Long.parseLong(next()); }
    // read the next several String and return an array
    public String[] next(int size) {
      String[] list = new String[size];
      for (int i=0; i < size; i++) {
        list[i] = next();
      }
      return list;
    }
    // read the next several int and return an array
    public int[] nextInt(int size) {
      int[] list = new int[size];
      for (int i=0; i < size; i++) {
        list[i] = nextInt();
      }
      return list;
    }
    // read the next several double and return an array
    public double[] nextDouble(int size) {
      double[] list = new double[size];
      for (int i=0; i < size; i++) {
        list[i] = nextDouble();
      }
      return list;
    }
    // read the next several long and return an array
    public long[] nextLong(int size) {
      long[] list = new long[size];
      for (int i=0; i < size; i++) {
        list[i] = nextLong();
      }
      return list;
    }

    public void printAll(int[] things) {
      for (int o : things) {
        print(o);
        print(" ");
      }
      println();
    }
    public void printAll(double[] things) {
      for (double o : things) {
        print(o);
        print(" ");
      }
      println();
    }
    public void printAll(long[] things) {
      for (long o : things) {
        print(o);
        print(" ");
      }
      println();
    }

    public <T> void printAll(Iterable<T> things) {
      for (T o : things) {
        print(o);
        print(" ");
      }
      println();
    }
  }
}

