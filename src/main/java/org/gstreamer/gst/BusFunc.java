package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the type of function passed to gst_bus_add_watch() or
 * gst_bus_add_watch_full(), which is called from the mainloop when a message
 * is available on the bus.
 * <p>
 * The message passed to the function will be unreffed after execution of this
 * function so it should not be freed in the function.
 * <p>
 * Note that this function is used as a {@link org.gtk.glib.SourceFunc} which means that returning
 * {@code false} will remove the {@link org.gtk.glib.Source} from the mainloop.
 */
/**
 * Functional interface declaration of the {@code BusFunc} callback.
 */
@FunctionalInterface
public interface BusFunc {

    /**
     * Specifies the type of function passed to gst_bus_add_watch() or
     * gst_bus_add_watch_full(), which is called from the mainloop when a message
     * is available on the bus.
     * <p>
     * The message passed to the function will be unreffed after execution of this
     * function so it should not be freed in the function.
     * <p>
     * Note that this function is used as a {@link org.gtk.glib.SourceFunc} which means that returning
     * {@code false} will remove the {@link org.gtk.glib.Source} from the mainloop.
     */
    boolean run(org.gstreamer.gst.Bus bus, org.gstreamer.gst.Message message);
    
    @ApiStatus.Internal default int upcall(MemoryAddress bus, MemoryAddress message, MemoryAddress userData) {
        var RESULT = run((org.gstreamer.gst.Bus) Interop.register(bus, org.gstreamer.gst.Bus.fromAddress).marshal(bus, null), org.gstreamer.gst.Message.fromAddress.marshal(message, null));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), BusFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
