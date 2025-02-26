package ru.vaganovvadim.backendisalsobeautiful;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private final Counter requestCounter;

    public DemoController(MeterRegistry meterRegistry) {
        this.requestCounter = Counter.builder("demo.requests")
                                     .description("Total number of requests to the demo endpoint")
                                     .register(meterRegistry);
    }

    @GetMapping("/demo")
    public String demo() {
        // Increment the counter every time this endpoint is called
        requestCounter.increment();
        return "Hello! This is a demo endpoint. Metrics are being recorded.";
    }
}
