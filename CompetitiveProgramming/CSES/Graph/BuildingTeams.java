package CompetitiveProgramming.CSES.Graph;
 
import java.io.*;
import java.util.*;
 
public class BuildingTeams {
	static class FastScanner {
        BufferedReader reader;
        StringTokenizer tokenizer;
 
        public FastScanner() {
            reader = new BufferedReader(new InputStreamReader(System.in));
            tokenizer = new StringTokenizer("");
        }
 
        String next() {
            while (!tokenizer.hasMoreTokens()) {
                try{
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return tokenizer.nextToken();
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }
        String nextLine() {
            String string = "";
            try {
                string = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return string;
        }
    }
 
    static class FasterScanner extends FastScanner {
        final private int BUFFER_SIZE = 1 << 12; 
        private DataInputStream inputStream; 
        private byte[] buffer; 
        private int bufferPointer, bytesRead; 
  
        public FasterScanner() { 
            inputStream = new DataInputStream(System.in); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        } 
  
        public FasterScanner(String fileName) { 
            try{
                inputStream = new DataInputStream(new FileInputStream(fileName));     
                buffer = new byte[BUFFER_SIZE]; 
                bufferPointer = bytesRead = 0; 
            } catch (Exception e) {
                e.printStackTrace();
            }
        } 
  
        String readLine() { 
            byte[] buf = new byte[64]; // line length 
            int cnt = 0, c; 
            while ((c = read()) != -1) { 
                if (c == '\n') break; 
                buf[cnt++] = (byte) c; 
            } 
            return new String(buf, 0, cnt); 
        } 
 
        String next() {
            StringBuilder ret = new StringBuilder();
            byte c = read();
            while(c <= ' ') c = read();
            do{
                ret.append((char) c);
            } while((c = read()) > ' ');
            return new String(ret);
        }
  
        int nextInt() { 
            int ret = 0; 
            byte c = read(); 
            while (c <= ' ') c = read(); 
            boolean neg = (c == '-'); 
            if (neg) c = read(); 
            do { 
                ret = ret * 10 + c - '0'; 
            }  while ((c = read()) >= '0' && c <= '9'); 
  
            if (neg) return -ret; 
            return ret; 
        } 
  
        long nextLong() { 
            long ret = 0; 
            byte c = read();
            while (c <= ' ') c = read(); 
            boolean neg = (c == '-'); 
            if (neg) c = read(); 
            do { 
                ret = ret * 10 + c - '0'; 
            } while ((c = read()) >= '0' && c <= '9'); 
  
            if (neg) return -ret; 
            return ret; 
        }
  
        double nextDouble() { 
            double ret = 0, div = 1; 
            byte c = read(); 
            while (c <= ' ') c = read(); 
            boolean neg = (c == '-'); 
            if (neg) c = read(); 
            do { 
                ret = ret * 10 + c - '0'; 
            } while ((c = read()) >= '0' && c <= '9'); 
            if (c == '.') { 
                while ((c = read()) >= '0' && c <= '9') { 
                    ret += (c - '0') / (div *= 10); 
                } 
            } 
            if (neg) return -ret; 
            return ret; 
        } 
  
        private void fillBuffer() { 
            try{
                bytesRead = inputStream.read(buffer, bufferPointer = 0, BUFFER_SIZE); 
                if (bytesRead == -1) buffer[0] = -1; 
            } catch (Exception e) {
                e.printStackTrace();
            }
        } 
  
        private byte read() { 
            if (bufferPointer == bytesRead) fillBuffer(); 
            return buffer[bufferPointer++]; 
        } 
  
        public void close() { 
            if (inputStream == null)  return; 
            try{
                inputStream.close(); 
            } catch (Exception e){
                e.printStackTrace();
            }
        } 
    } 
 
 
	public static void main(String[] args) throws IOException {
		FastScanner sc = new FastScanner();
		BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			adj.add(new ArrayList<>());
		}
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			a--;
			b--;
			adj.get(a).add(b);
			adj.get(b).add(a);
		}
		int[] color = new int[n];
		int k = 0;
		for (int i = 0; i < n; i++) {
			if (color[i] == 0) {
				Queue<Integer> q = new LinkedList<>();
				q.add(i);
				while (!q.isEmpty()) {
					int v = q.poll();
					if (color[v] == 0)
						color[v] = 1;
					for (int u : adj.get(v)) {
						if (color[u] == 0) {
							if (color[v] == 1)
								color[u] = 2;
							else
								color[u] = 1;
							q.add(u);
						} else if (color[u] == color[v]) {
							k = 1;
							q.clear();
							break;
						}
					}
				}
			}
		}
		if (k == 1) {
			output.write("IMPOSSIBLE");
		} else {
			for (int i = 0; i < n; i++)
				output.write(color[i] + " ");
		}
		output.flush();
		output.close();
	}
}