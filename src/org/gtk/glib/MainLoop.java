package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The `GMainLoop` struct is an opaque data type
 * representing the main event loop of a GLib or GTK+ application.
 */
public class MainLoop extends io.github.jwharm.javagi.interop.ResourceBase {

    public MainLoop(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /**
     * Creates a new #GMainLoop structure.
     */
    public MainLoop(MainContext context, boolean isRunning) {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.g_main_loop_new(context.HANDLE(), isRunning ? 1 : 0), true));
    }
    
    /**
     * Returns the #GMainContext of @loop.
     */
    public MainContext getContext() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_main_loop_get_context(HANDLE());
        return new MainContext(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Checks to see if the main loop is currently being run via g_main_loop_run().
     */
    public boolean isRunning() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_main_loop_is_running(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Stops a #GMainLoop from running. Any calls to g_main_loop_run()
     * for the loop will return.
     * 
     * Note that sources that have already been dispatched when
     * g_main_loop_quit() is called will still be executed.
     */
    public void quit() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_main_loop_quit(HANDLE());
    }
    
    /**
     * Increases the reference count on a #GMainLoop object by one.
     */
    public MainLoop ref() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_main_loop_ref(HANDLE());
        return new MainLoop(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Runs a main loop until g_main_loop_quit() is called on the loop.
     * If this is called for the thread of the loop's #GMainContext,
     * it will process events from the loop, otherwise it will
     * simply wait.
     */
    public void run() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_main_loop_run(HANDLE());
    }
    
    /**
     * Decreases the reference count on a #GMainLoop object by one. If
     * the result is zero, free the loop and free all associated memory.
     */
    public void unref() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_main_loop_unref(HANDLE());
    }
    
}
