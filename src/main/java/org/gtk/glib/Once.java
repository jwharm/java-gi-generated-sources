package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link Once} struct controls a one-time initialization function. Any
 * one-time initialization function must have its own unique {@link Once}
 * struct.
 * @version 2.4
 */
public class Once extends Struct {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GOnce";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_INT.withName("status"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("retval")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link Once}
     * @return A new, uninitialized @{link Once}
     */
    public static Once allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Once newInstance = new Once(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code status}
     * @return The value of the field {@code status}
     */
    public org.gtk.glib.OnceStatus status$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("status"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.glib.OnceStatus(RESULT);
    }
    
    /**
     * Change the value of the field {@code status}
     * @param status The new value of the field {@code status}
     */
    public void status$set(org.gtk.glib.OnceStatus status) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("status"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), status.getValue());
    }
    
    /**
     * Get the value of the field {@code retval}
     * @return The value of the field {@code retval}
     */
    public java.lang.foreign.MemoryAddress retval$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("retval"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code retval}
     * @param retval The new value of the field {@code retval}
     */
    public void retval$set(java.lang.foreign.MemoryAddress retval) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("retval"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) retval);
    }
    
    /**
     * Create a Once proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Once(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    public @Nullable java.lang.foreign.MemoryAddress impl(@NotNull org.gtk.glib.ThreadFunc func, @Nullable java.lang.foreign.MemoryAddress arg) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Function to be called when starting a critical initialization
     * section. The argument {@code location} must point to a static
     * 0-initialized variable that will be set to a value other than 0 at
     * the end of the initialization section. In combination with
     * g_once_init_leave() and the unique address {@code value_location}, it can
     * be ensured that an initialization section will be executed only once
     * during a program's life time, and that concurrent threads are
     * blocked until initialization completed. To be used in constructs
     * like this:
     * <pre>{@code <!-- language="C" -->
     *   static gsize initialization_value = 0;
     * 
     *   if (g_once_init_enter (&initialization_value))
     *     {
     *       gsize setup_value = 42; // initialization code here
     * 
     *       g_once_init_leave (&initialization_value, setup_value);
     *     }
     * 
     *   // use initialization_value here
     * }</pre>
     * <p>
     * While {@code location} has a {@code volatile} qualifier, this is a historical artifact and
     * the pointer passed to it should not be {@code volatile}.
     * @param location location of a static initializable variable
     *    containing 0
     * @return {@code true} if the initialization section should be entered,
     *     {@code false} and blocks otherwise
     */
    public static boolean initEnter(@NotNull java.lang.foreign.MemoryAddress location) {
        java.util.Objects.requireNonNull(location, "Parameter 'location' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_once_init_enter.invokeExact(
                    (Addressable) location);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Counterpart to g_once_init_enter(). Expects a location of a static
     * 0-initialized initialization variable, and an initialization value
     * other than 0. Sets the variable to the initialization value, and
     * releases concurrent threads blocking in g_once_init_enter() on this
     * initialization variable.
     * <p>
     * While {@code location} has a {@code volatile} qualifier, this is a historical artifact and
     * the pointer passed to it should not be {@code volatile}.
     * @param location location of a static initializable variable
     *    containing 0
     * @param result new non-0 value for *{@code value_location}
     */
    public static void initLeave(@NotNull java.lang.foreign.MemoryAddress location, long result) {
        java.util.Objects.requireNonNull(location, "Parameter 'location' must not be null");
        try {
            DowncallHandles.g_once_init_leave.invokeExact(
                    (Addressable) location,
                    result);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_once_impl = Interop.downcallHandle(
            "g_once_impl",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_once_init_enter = Interop.downcallHandle(
            "g_once_init_enter",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_once_init_leave = Interop.downcallHandle(
            "g_once_init_leave",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private Once struct;
        
         /**
         * A {@link Once.Build} object constructs a {@link Once} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = Once.allocate();
        }
        
         /**
         * Finish building the {@link Once} struct.
         * @return A new instance of {@code Once} with the fields 
         *         that were set in the Build object.
         */
        public Once construct() {
            return struct;
        }
        
        /**
         * the status of the {@link Once}
         * @param status The value for the {@code status} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setStatus(org.gtk.glib.OnceStatus status) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("status"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (status == null ? MemoryAddress.NULL : status.getValue()));
            return this;
        }
        
        /**
         * the value returned by the call to the function, if {@code status}
         *          is {@link OnceStatus#READY}
         * @param retval The value for the {@code retval} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setRetval(java.lang.foreign.MemoryAddress retval) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("retval"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (retval == null ? MemoryAddress.NULL : (Addressable) retval));
            return this;
        }
    }
}
