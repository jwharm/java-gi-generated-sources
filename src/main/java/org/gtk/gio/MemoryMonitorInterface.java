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
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        MemoryMonitorInterface newInstance = new MemoryMonitorInterface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @FunctionalInterface
    public interface LowMemoryWarningCallback {
        void run(org.gtk.gio.MemoryMonitor monitor, org.gtk.gio.MemoryMonitorWarningLevel level);

        @ApiStatus.Internal default void upcall(MemoryAddress monitor, int level) {
            run((org.gtk.gio.MemoryMonitor) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(monitor)), org.gtk.gio.MemoryMonitor.fromAddress).marshal(monitor, Ownership.NONE), org.gtk.gio.MemoryMonitorWarningLevel.of(level));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(LowMemoryWarningCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code low_memory_warning}
     * @param lowMemoryWarning The new value of the field {@code low_memory_warning}
     */
    public void setLowMemoryWarning(LowMemoryWarningCallback lowMemoryWarning) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("low_memory_warning"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lowMemoryWarning == null ? MemoryAddress.NULL : lowMemoryWarning.toCallback()));
    }
    
    /**
     * Create a MemoryMonitorInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected MemoryMonitorInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, MemoryMonitorInterface> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new MemoryMonitorInterface(input, ownership);
    
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
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
            return this;
        }
        
        public Builder setLowMemoryWarning(LowMemoryWarningCallback lowMemoryWarning) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("low_memory_warning"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lowMemoryWarning == null ? MemoryAddress.NULL : lowMemoryWarning.toCallback()));
            return this;
        }
    }
}
