package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The list of functions that can be implemented for the {@code GdkPaintable}
 * interface.
 * <p>
 * Note that apart from the {@link Paintable#snapshot} function,
 * no virtual function of this interface is mandatory to implement, though it
 * is a good idea to implement {@link Paintable#getCurrentImage}
 * for non-static paintables and {@link Paintable#getFlags} if the
 * image is not dynamic as the default implementation returns no flags and
 * that will make the implementation likely quite slow.
 */
public class PaintableInterface extends Struct {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkPaintableInterface";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
            Interop.valueLayout.ADDRESS.withName("snapshot"),
            Interop.valueLayout.ADDRESS.withName("get_current_image"),
            Interop.valueLayout.ADDRESS.withName("get_flags"),
            Interop.valueLayout.ADDRESS.withName("get_intrinsic_width"),
            Interop.valueLayout.ADDRESS.withName("get_intrinsic_height"),
            Interop.valueLayout.ADDRESS.withName("get_intrinsic_aspect_ratio")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link PaintableInterface}
     * @return A new, uninitialized @{link PaintableInterface}
     */
    public static PaintableInterface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PaintableInterface newInstance = new PaintableInterface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @FunctionalInterface
    public interface SnapshotCallback {
        void run(org.gtk.gdk.Paintable paintable, org.gtk.gdk.Snapshot snapshot, double width, double height);

        @ApiStatus.Internal default void upcall(MemoryAddress paintable, MemoryAddress snapshot, double width, double height) {
            run((org.gtk.gdk.Paintable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(paintable)), org.gtk.gdk.Paintable.fromAddress).marshal(paintable, Ownership.NONE), (org.gtk.gdk.Snapshot) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(snapshot)), org.gtk.gdk.Snapshot.fromAddress).marshal(snapshot, Ownership.NONE), width, height);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SnapshotCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code snapshot}
     * @param snapshot The new value of the field {@code snapshot}
     */
    public void setSnapshot(SnapshotCallback snapshot) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("snapshot"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (snapshot == null ? MemoryAddress.NULL : snapshot.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetCurrentImageCallback {
        org.gtk.gdk.Paintable run(org.gtk.gdk.Paintable paintable);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress paintable) {
            var RESULT = run((org.gtk.gdk.Paintable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(paintable)), org.gtk.gdk.Paintable.fromAddress).marshal(paintable, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetCurrentImageCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_current_image}
     * @param getCurrentImage The new value of the field {@code get_current_image}
     */
    public void setGetCurrentImage(GetCurrentImageCallback getCurrentImage) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_current_image"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getCurrentImage == null ? MemoryAddress.NULL : getCurrentImage.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetFlagsCallback {
        org.gtk.gdk.PaintableFlags run(org.gtk.gdk.Paintable paintable);

        @ApiStatus.Internal default int upcall(MemoryAddress paintable) {
            var RESULT = run((org.gtk.gdk.Paintable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(paintable)), org.gtk.gdk.Paintable.fromAddress).marshal(paintable, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetFlagsCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_flags}
     * @param getFlags The new value of the field {@code get_flags}
     */
    public void setGetFlags(GetFlagsCallback getFlags) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_flags"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getFlags == null ? MemoryAddress.NULL : getFlags.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetIntrinsicWidthCallback {
        int run(org.gtk.gdk.Paintable paintable);

        @ApiStatus.Internal default int upcall(MemoryAddress paintable) {
            var RESULT = run((org.gtk.gdk.Paintable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(paintable)), org.gtk.gdk.Paintable.fromAddress).marshal(paintable, Ownership.NONE));
            return RESULT;
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetIntrinsicWidthCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_intrinsic_width}
     * @param getIntrinsicWidth The new value of the field {@code get_intrinsic_width}
     */
    public void setGetIntrinsicWidth(GetIntrinsicWidthCallback getIntrinsicWidth) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_intrinsic_width"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getIntrinsicWidth == null ? MemoryAddress.NULL : getIntrinsicWidth.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetIntrinsicHeightCallback {
        int run(org.gtk.gdk.Paintable paintable);

        @ApiStatus.Internal default int upcall(MemoryAddress paintable) {
            var RESULT = run((org.gtk.gdk.Paintable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(paintable)), org.gtk.gdk.Paintable.fromAddress).marshal(paintable, Ownership.NONE));
            return RESULT;
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetIntrinsicHeightCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_intrinsic_height}
     * @param getIntrinsicHeight The new value of the field {@code get_intrinsic_height}
     */
    public void setGetIntrinsicHeight(GetIntrinsicHeightCallback getIntrinsicHeight) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_intrinsic_height"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getIntrinsicHeight == null ? MemoryAddress.NULL : getIntrinsicHeight.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetIntrinsicAspectRatioCallback {
        double run(org.gtk.gdk.Paintable paintable);

        @ApiStatus.Internal default double upcall(MemoryAddress paintable) {
            var RESULT = run((org.gtk.gdk.Paintable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(paintable)), org.gtk.gdk.Paintable.fromAddress).marshal(paintable, Ownership.NONE));
            return RESULT;
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetIntrinsicAspectRatioCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_intrinsic_aspect_ratio}
     * @param getIntrinsicAspectRatio The new value of the field {@code get_intrinsic_aspect_ratio}
     */
    public void setGetIntrinsicAspectRatio(GetIntrinsicAspectRatioCallback getIntrinsicAspectRatio) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_intrinsic_aspect_ratio"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getIntrinsicAspectRatio == null ? MemoryAddress.NULL : getIntrinsicAspectRatio.toCallback()));
    }
    
    /**
     * Create a PaintableInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected PaintableInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, PaintableInterface> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new PaintableInterface(input, ownership);
    
    /**
     * A {@link PaintableInterface.Builder} object constructs a {@link PaintableInterface} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link PaintableInterface.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final PaintableInterface struct;
        
        private Builder() {
            struct = PaintableInterface.allocate();
        }
        
         /**
         * Finish building the {@link PaintableInterface} struct.
         * @return A new instance of {@code PaintableInterface} with the fields 
         *         that were set in the Builder object.
         */
        public PaintableInterface build() {
            return struct;
        }
        
        public Builder setGIface(org.gtk.gobject.TypeInterface gIface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
            return this;
        }
        
        public Builder setSnapshot(SnapshotCallback snapshot) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("snapshot"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (snapshot == null ? MemoryAddress.NULL : snapshot.toCallback()));
            return this;
        }
        
        public Builder setGetCurrentImage(GetCurrentImageCallback getCurrentImage) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_current_image"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getCurrentImage == null ? MemoryAddress.NULL : getCurrentImage.toCallback()));
            return this;
        }
        
        public Builder setGetFlags(GetFlagsCallback getFlags) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getFlags == null ? MemoryAddress.NULL : getFlags.toCallback()));
            return this;
        }
        
        public Builder setGetIntrinsicWidth(GetIntrinsicWidthCallback getIntrinsicWidth) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_intrinsic_width"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getIntrinsicWidth == null ? MemoryAddress.NULL : getIntrinsicWidth.toCallback()));
            return this;
        }
        
        public Builder setGetIntrinsicHeight(GetIntrinsicHeightCallback getIntrinsicHeight) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_intrinsic_height"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getIntrinsicHeight == null ? MemoryAddress.NULL : getIntrinsicHeight.toCallback()));
            return this;
        }
        
        public Builder setGetIntrinsicAspectRatio(GetIntrinsicAspectRatioCallback getIntrinsicAspectRatio) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_intrinsic_aspect_ratio"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getIntrinsicAspectRatio == null ? MemoryAddress.NULL : getIntrinsicAspectRatio.toCallback()));
            return this;
        }
    }
}
