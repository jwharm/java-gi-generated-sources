package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The virtual function table for {@link MemoryMonitor}.
 * @version 2.64
 */
public class MemoryMonitorInterface extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GMemoryMonitorInterface";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
            Interop.valueLayout.ADDRESS.withName("low_memory_warning")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link MemoryMonitorInterface}
     * @return A new, uninitialized @{link MemoryMonitorInterface}
     */
    public static MemoryMonitorInterface allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        MemoryMonitorInterface newInstance = new MemoryMonitorInterface(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Functional interface declaration of the {@code LowMemoryWarningCallback} callback.
     */
    @FunctionalInterface
    public interface LowMemoryWarningCallback {
    
        void run(org.gtk.gio.MemoryMonitor monitor, org.gtk.gio.MemoryMonitorWarningLevel level);
        
        @ApiStatus.Internal default void upcall(MemoryAddress monitor, int level) {
            run((org.gtk.gio.MemoryMonitor) Interop.register(monitor, org.gtk.gio.MemoryMonitor.fromAddress).marshal(monitor, null), org.gtk.gio.MemoryMonitorWarningLevel.of(level));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), LowMemoryWarningCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code low_memory_warning}
     * @param lowMemoryWarning The new value of the field {@code low_memory_warning}
     */
    public void setLowMemoryWarning(LowMemoryWarningCallback lowMemoryWarning) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("low_memory_warning"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (lowMemoryWarning == null ? MemoryAddress.NULL : lowMemoryWarning.toCallback()));
        }
    }
    
    /**
     * Create a MemoryMonitorInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected MemoryMonitorInterface(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, MemoryMonitorInterface> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new MemoryMonitorInterface(input);
    
    /**
     * A {@link MemoryMonitorInterface.Builder} object constructs a {@link MemoryMonitorInterface} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link MemoryMonitorInterface.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final MemoryMonitorInterface struct;
        
        private Builder() {
            struct = MemoryMonitorInterface.allocate();
        }
        
        /**
         * Finish building the {@link MemoryMonitorInterface} struct.
         * @return A new instance of {@code MemoryMonitorInterface} with the fields 
         *         that were set in the Builder object.
         */
        public MemoryMonitorInterface build() {
            return struct;
        }
        
        /**
         * The parent interface.
         * @param gIface The value for the {@code gIface} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setGIface(org.gtk.gobject.TypeInterface gIface) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
                return this;
            }
        }
        
        public Builder setLowMemoryWarning(LowMemoryWarningCallback lowMemoryWarning) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("low_memory_warning"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (lowMemoryWarning == null ? MemoryAddress.NULL : lowMemoryWarning.toCallback()));
                return this;
            }
        }
    }
}
