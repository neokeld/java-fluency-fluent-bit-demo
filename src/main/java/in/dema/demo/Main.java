package in.dema.demo;

import org.komamitsu.fluency.Fluency;
import org.komamitsu.fluency.fluentd.FluencyBuilderForFluentd;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        FluencyBuilderForFluentd builder = new FluencyBuilderForFluentd();
        Fluency fluency = builder.build("fluentbit", 24224);

        String tag = "foo_db.bar_tbl";

        Map<String, Object> event = new HashMap<>();
        event.put("name", "neokeld");
        event.put("comment", "zzz");
        fluency.emit(tag, event);
		
        fluency.close();
    }
}
