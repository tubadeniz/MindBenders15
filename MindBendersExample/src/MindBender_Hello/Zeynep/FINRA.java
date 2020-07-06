package MindBender_Hello.Zeynep;

import sun.jvmstat.perfdata.monitor.PerfStringVariableMonitor;

public class FINRA {


    public static void main(String[] args) {


        String result = " ";


        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result +="FINRA ";
            } else if (i % 3 == 0) {
                result +="FIN ";
            } else if (i % 5 == 0) {
                result +="RA ";
            } else {
                result += i + " ";
            }
        }
            System.out.println(result);


    }
}
