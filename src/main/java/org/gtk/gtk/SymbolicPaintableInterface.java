package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The list of virtual functions for the {@code GtkSymbolicPaintable} interface.
 * No function must be implemented, default implementations exist for each one.
 */
public class SymbolicPaintableInterface extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkSymbolicPaintableInterface";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
            Interop.valueLayout.ADDRESS.withName("snapshot_symbolic")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link SymbolicPaintableInterface}
     * @return A new, uninitialized @{link SymbolicPaintableInterface}
     */
    public static SymbolicPaintableInterface allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        SymbolicPaintableInterface newInstance = new SymbolicPaintableInterface(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Functional interface declaration of the {@code SnapshotSymbolicCallback} callback.
     */
    @FunctionalInterface
    public interface SnapshotSymbolicCallback {
    
        void run(org.gtk.gtk.SymbolicPaintable paintable, org.gtk.gdk.Snapshot snapshot, double width, double height, org.gtk.gdk.RGBA[] colors, long nColors);
        
        @ApiStatus.Internal default void upcall(MemoryAddress paintable, MemoryAddress snapshot, double width, double height, MemoryAddress colors, long nColors) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run((org.gtk.gtk.SymbolicPaintable) Interop.register(paintable, org.gtk.gtk.SymbolicPaintable.fromAddress).marshal(paintable, null), (org.gtk.gdk.Snapshot) Interop.register(snapshot, org.gtk.gdk.Snapshot.fromAddress).marshal(snapshot, null), width, height, new PointerProxy<org.gtk.gdk.RGBA>(colors, org.gtk.gdk.RGBA.fromAddress).toArray((int) nColors, org.gtk.gdk.RGBA.class), nColors);
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SnapshotSymbolicCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code snapshot_symbolic}
     * @param snapshotSymbolic The new value of the field {@code snapshot_symbolic}
     */
    public void setSnapshotSymbolic(SnapshotSymbolicCallback snapshotSymbolic) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("snapshot_symbolic"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (snapshotSymbolic == null ? MemoryAddress.NULL : snapshotSymbolic.toCallback()));
        }
    }
    
    /**
     * Create a SymbolicPaintableInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected SymbolicPaintableInterface(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, SymbolicPaintableInterface> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new SymbolicPaintableInterface(input);
    
    /**
     * A {@link SymbolicPaintableInterface.Builder} object constructs a {@link SymbolicPaintableInterface} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link SymbolicPaintableInterface.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final SymbolicPaintableInterface struct;
        
        private Builder() {
            struct = SymbolicPaintableInterface.allocate();
        }
        
        /**
         * Finish building the {@link SymbolicPaintableInterface} struct.
         * @return A new instance of {@code SymbolicPaintableInterface} with the fields 
         *         that were set in the Builder object.
         */
        public SymbolicPaintableInterface build() {
            return struct;
        }
        
        public Builder setGIface(org.gtk.gobject.TypeInterface gIface) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
                return this;
            }
        }
        
        public Builder setSnapshotSymbolic(SnapshotSymbolicCallback snapshotSymbolic) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("snapshot_symbolic"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (snapshotSymbolic == null ? MemoryAddress.NULL : snapshotSymbolic.toCallback()));
                return this;
            }
        }
    }
}
