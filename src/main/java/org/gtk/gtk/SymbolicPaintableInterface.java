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
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        SymbolicPaintableInterface newInstance = new SymbolicPaintableInterface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @FunctionalInterface
    public interface SnapshotSymbolicCallback {
        void run(org.gtk.gtk.SymbolicPaintable paintable, org.gtk.gdk.Snapshot snapshot, double width, double height, org.gtk.gdk.RGBA[] colors, long nColors);

        @ApiStatus.Internal default void upcall(MemoryAddress paintable, MemoryAddress snapshot, double width, double height, MemoryAddress colors, long nColors) {
            run((org.gtk.gtk.SymbolicPaintable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(paintable)), org.gtk.gtk.SymbolicPaintable.fromAddress).marshal(paintable, Ownership.NONE), (org.gtk.gdk.Snapshot) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(snapshot)), org.gtk.gdk.Snapshot.fromAddress).marshal(snapshot, Ownership.NONE), width, height, new PointerProxy<org.gtk.gdk.RGBA>(colors, org.gtk.gdk.RGBA.fromAddress).toArray((int) nColors, org.gtk.gdk.RGBA.class), nColors);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SnapshotSymbolicCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code snapshot_symbolic}
     * @param snapshotSymbolic The new value of the field {@code snapshot_symbolic}
     */
    public void setSnapshotSymbolic(SnapshotSymbolicCallback snapshotSymbolic) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("snapshot_symbolic"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (snapshotSymbolic == null ? MemoryAddress.NULL : snapshotSymbolic.toCallback()));
    }
    
    /**
     * Create a SymbolicPaintableInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected SymbolicPaintableInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, SymbolicPaintableInterface> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new SymbolicPaintableInterface(input, ownership);
    
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
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
            return this;
        }
        
        public Builder setSnapshotSymbolic(SnapshotSymbolicCallback snapshotSymbolic) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("snapshot_symbolic"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (snapshotSymbolic == null ? MemoryAddress.NULL : snapshotSymbolic.toCallback()));
            return this;
        }
    }
}
