import com.profesorfalken.jsensors.JSensors;
import com.profesorfalken.jsensors.model.components.Components;
import com.profesorfalken.jsensors.model.components.Cpu;
import com.profesorfalken.jsensors.model.sensors.Temperature;
import org.json.JSONObject;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Logger {
    public Logger(){
        int i = 0;
        while(i++ < 10){
        System.out.println("Information: " + i);
        //String time = "";
        //String temp = "";
        //Components components = JSensors.get.components();
        //List<Cpu> cpus = components.cpus;
        //if (cpus != null) {
        //    for (final Cpu cpu : cpus) {
        //        if (cpu.sensors != null) {
        //                time += LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        //                List<Temperature> temps = cpu.sensors.temperatures;
        //                //temp += temps.get(temps.size() -1).name + ": ";
        //                temp += temps.get(temps.size() -1).value.toString() + " C";
        //            }
        //        }
        //    }
        //    JSONObject json = new JSONObject();
        //    json.put("time",time);
        //    json.put("temp",temp);
        //    System.out.println(json);
        }
    }
}
