package ru.vaganovvadim.backendisalsobeautiful;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private final Counter requestCounter;
    private final Counter errorCounter;

    public DemoController(MeterRegistry meterRegistry) {
        // Counter for total requests
        this.requestCounter = Counter.builder("demo.requests")
                                     .description("Total number of requests to the demo endpoint")
                                     .register(meterRegistry);

        // Counter for errors
        this.errorCounter = Counter.builder("demo.errors")
                                   .description("Total number of errors in the demo endpoint")
                                   .register(meterRegistry);
    }

    @GetMapping("/demo")
    public String demo() {
        requestCounter.increment(); // Increment request counter

        // Randomly return an error (e.g., 20% chance of error)
        if (Math.random() < 0.2) {
            errorCounter.increment(); // Increment error counter
            throw new RuntimeException("Random error occurred!");
        }

        return "Hello! This is a demo endpoint. Metrics are being recorded.";
    }
}
