package com.learnreactivespring.fluxandmonoplayground;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;

/**
 * Créé par dmitri le 2021-08-27.
 */
public class FluxAndMonoTest {

    @Test
    public void fluxTest() {

        Flux<String> stringFlux = Flux.just("Spring", "Spring Boot", "Reactive Spring")
//                .concatWith(Flux.error(new RuntimeException("Exception Occurred")))
                .concatWith(Flux.just("After Error"))
                .log();

        stringFlux
                .subscribe(
                        System.out::println,
                        (e) -> System.err.println("Exception is " + e),
                        () -> System.out.println("Completed"));
    }
}
