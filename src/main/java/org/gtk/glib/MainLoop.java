package org.gtk.glib;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@code GMainLoop} struct is an opaque data type
 * representing the main event loop of a GLib or GTK+ application.
 */
public class MainLoop extends io.github.jwharm.javagi.ResourceBase {

    public MainLoop(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static Refcounted constructNew(MainContext context, boolean isRunning) {
        Refcounted RESULT = Refcounted.get(gtk_h.g_main_loop_new(context.handle(), isRunning ? 1 : 0), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@link MainLoop} structure.
     */
    public MainLoop(MainContext context, boolean isRunning) {
        super(constructNew(context, isRunning));
    }
    
    /**
     * Returns the {@link MainContext} of {@code loop}.
     */
    public MainContext getContext() {
        var RESULT = gtk_h.g_main_loop_get_context(handle());
        return new MainContext(Refcounted.get(RESULT, false));
    }
    
    /**
     * Checks to see if the main loop is currently being run via g_main_loop_run().
     */
    public boolean isRunning() {
        var RESULT = gtk_h.g_main_loop_is_running(handle());
        return RESULT != 0;
    }
    
    /**
     * Stops a {@link MainLoop} from running. Any calls to g_main_loop_run()
     * for the loop will return.
     * <p>
     * Note that sources that have already been dispatched when
     * g_main_loop_quit() is called will still be executed.
     */
    public void quit() {
        gtk_h.g_main_loop_quit(handle());
    }
    
    /**
     * Increases the reference count on a {@link MainLoop} object by one.
     */
    public MainLoop ref() {
        var RESULT = gtk_h.g_main_loop_ref(handle());
        return new MainLoop(Refcounted.get(RESULT, true));
    }
    
    /**
     * Runs a main loop until g_main_loop_quit() is called on the loop.
     * If this is called for the thread of the loop's {@link MainContext},
     * it will process events from the loop, otherwise it will
     * simply wait.
     */
    public void run() {
        gtk_h.g_main_loop_run(handle());
    }
    
    /**
     * Decreases the reference count on a {@link MainLoop} object by one. If
     * the result is zero, free the loop and free all associated memory.
     */
    public void unref() {
        gtk_h.g_main_loop_unref(handle());
    }
    
}
