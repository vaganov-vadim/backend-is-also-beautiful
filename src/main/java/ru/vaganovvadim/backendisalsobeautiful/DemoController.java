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
        this.requestCounter = Counter.builder("demo.requests")
                                     .description("Количество запросов - трафик")
                                     .register(meterRegistry);

        this.errorCounter = Counter.builder("demo.errors")
                                   .description("Количество ошибок")
                                   .register(meterRegistry);
    }

    @GetMapping("/demo")
    public String demo() {
        requestCounter.increment();

        // Случайно возвращаем ошибку
        if (Math.random() < 0.2) {
            errorCounter.increment();
            throw new RuntimeException("Произошла серьёзная ошибка, поэтому ты инкрементировал метрику ошибок");
        }

        return "Привет! Это демонстрационный эндпоинт, ты инкрементировал метрику запросов";
    }
}
