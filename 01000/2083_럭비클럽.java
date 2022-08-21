import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        while (!str.equals("# 0 0")){
            StringTokenizer st = new StringTokenizer(str, " ");

            String name = st.nextToken();
            int age = Integer.valueOf(st.nextToken());
            int weight = Integer.valueOf(st.nextToken());

            if(age > 17 || weight >= 80)
                bw.write(name+" Senior");
            else
                bw.write(name+" Junior");

            bw.newLine();
            str = br.readLine();
        }
        bw.flush();
        bw.close();
    }
}
