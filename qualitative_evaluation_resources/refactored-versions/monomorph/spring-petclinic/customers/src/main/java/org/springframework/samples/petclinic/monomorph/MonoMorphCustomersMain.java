package org.springframework.samples.petclinic.monomorph;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.springframework.samples.petclinic.PetClinicApplication;

import org.springframework.samples.petclinic.monomorph.id.MonoMorphCustomersServerGRPC;


/**
 * Generated Main class to concurrently run the main methods of
 * PetClinicApplication and MonoMorphCustomersServerGRPC within the same JVM.
 *
 * Compatible with Java 7 (uses Anonymous Inner Classes).
 *
 * NOTE: Graceful shutdown relies on the individual main methods handling
 * Thread interruption correctly (e.g., catching InterruptedException,
 * checking Thread.currentThread().isInterrupted()) to perform their own cleanup.
 */
public class MonoMorphCustomersMain {

    private ExecutorService executorService;

    public static void main(String[] args) {
        MonoMorphCustomersMain combinedMain = new MonoMorphCustomersMain();
        combinedMain.start(args);
    }

    /**
     * Starts the execution of both main methods concurrently.
     * @param args Command line arguments passed to this MonoMorphCustomersMain.
     *             These are currently *not* passed down to the individual mains,
     *             but could be split and passed if necessary.
     */
    public void start(String[] args) {

        // Use a fixed thread pool with 2 threads.
        executorService = Executors.newFixedThreadPool(2);

        // Register a shutdown hook
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                // Call the stop method of the enclosing instance
                stop();
            }
        }, "MonoMorphCustomersMain-ShutdownHook")); 


        // --- Arguments for the target mains ---
        final String[] oldMainArgs = args;
        final String[] grpcServerArgs = args;
        
        // Submit OldMain using an Anonymous Inner Class
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                try {
                    PetClinicApplication.main(oldMainArgs);
                } catch (Throwable t) { 
                    // Consider adding logic here to potentially stop the other task or the whole application
                    // stop(); 
                }
            }
        });

         // Submit NewGrpcServer using an Anonymous Inner Class
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                try {
                    MonoMorphCustomersServerGRPC.main(grpcServerArgs);
                } catch (Throwable t) { // Catch Throwable to capture Errors as well
                     // Consider adding logic here to potentially stop the other task or the whole application
                     // stop(); // Uncomment to shutdown everything if one part fails critically
                }
            }
        });

        // The main thread of MonoMorphCustomersMain can exit now.
        // The application stays alive due to the non-daemon threads in the ExecutorService.
    }

    /**
     * Initiates the shutdown sequence for the executor service.
     * This will attempt to interrupt the threads running the main methods.
     */
    public void stop() {
        // Use a temporary variable for thread-safety check
        ExecutorService exec = executorService;
        if (exec != null && !exec.isShutdown()) {

            // Use shutdownNow() to interrupt the threads running the main methods.
            exec.shutdownNow();

            try {
                // Wait a bit for tasks to terminate after interruption.
                !exec.awaitTermination(5, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                // Force shutdown again if interrupted during waiting
                exec.shutdownNow();
                // Preserve interrupt status
                Thread.currentThread().interrupt();
            }
        }
    }
}