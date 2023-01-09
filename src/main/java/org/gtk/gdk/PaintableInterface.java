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
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        PaintableInterface newInstance = new PaintableInterface(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Functional interface declaration of the {@code SnapshotCallback} callback.
     */
    @FunctionalInterface
    public interface SnapshotCallback {
    
        void run(org.gtk.gdk.Paintable paintable, org.gtk.gdk.Snapshot snapshot, double width, double height);
        
        @ApiStatus.Internal default void upcall(MemoryAddress paintable, MemoryAddress snapshot, double width, double height) {
            run((org.gtk.gdk.Paintable) Interop.register(paintable, org.gtk.gdk.Paintable.fromAddress).marshal(paintable, null), (org.gtk.gdk.Snapshot) Interop.register(snapshot, org.gtk.gdk.Snapshot.fromAddress).marshal(snapshot, null), width, height);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SnapshotCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code snapshot}
     * @param snapshot The new value of the field {@code snapshot}
     */
    public void setSnapshot(SnapshotCallback snapshot) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("snapshot"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (snapshot == null ? MemoryAddress.NULL : snapshot.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetCurrentImageCallback} callback.
     */
    @FunctionalInterface
    public interface GetCurrentImageCallback {
    
        org.gtk.gdk.Paintable run(org.gtk.gdk.Paintable paintable);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress paintable) {
            var RESULT = run((org.gtk.gdk.Paintable) Interop.register(paintable, org.gtk.gdk.Paintable.fromAddress).marshal(paintable, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetCurrentImageCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_current_image}
     * @param getCurrentImage The new value of the field {@code get_current_image}
     */
    public void setGetCurrentImage(GetCurrentImageCallback getCurrentImage) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_current_image"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getCurrentImage == null ? MemoryAddress.NULL : getCurrentImage.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetFlagsCallback} callback.
     */
    @FunctionalInterface
    public interface GetFlagsCallback {
    
        org.gtk.gdk.PaintableFlags run(org.gtk.gdk.Paintable paintable);
        
        @ApiStatus.Internal default int upcall(MemoryAddress paintable) {
            var RESULT = run((org.gtk.gdk.Paintable) Interop.register(paintable, org.gtk.gdk.Paintable.fromAddress).marshal(paintable, null));
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetFlagsCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_flags}
     * @param getFlags The new value of the field {@code get_flags}
     */
    public void setGetFlags(GetFlagsCallback getFlags) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getFlags == null ? MemoryAddress.NULL : getFlags.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetIntrinsicWidthCallback} callback.
     */
    @FunctionalInterface
    public interface GetIntrinsicWidthCallback {
    
        int run(org.gtk.gdk.Paintable paintable);
        
        @ApiStatus.Internal default int upcall(MemoryAddress paintable) {
            var RESULT = run((org.gtk.gdk.Paintable) Interop.register(paintable, org.gtk.gdk.Paintable.fromAddress).marshal(paintable, null));
            return RESULT;
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetIntrinsicWidthCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_intrinsic_width}
     * @param getIntrinsicWidth The new value of the field {@code get_intrinsic_width}
     */
    public void setGetIntrinsicWidth(GetIntrinsicWidthCallback getIntrinsicWidth) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_intrinsic_width"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getIntrinsicWidth == null ? MemoryAddress.NULL : getIntrinsicWidth.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetIntrinsicHeightCallback} callback.
     */
    @FunctionalInterface
    public interface GetIntrinsicHeightCallback {
    
        int run(org.gtk.gdk.Paintable paintable);
        
        @ApiStatus.Internal default int upcall(MemoryAddress paintable) {
            var RESULT = run((org.gtk.gdk.Paintable) Interop.register(paintable, org.gtk.gdk.Paintable.fromAddress).marshal(paintable, null));
            return RESULT;
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetIntrinsicHeightCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_intrinsic_height}
     * @param getIntrinsicHeight The new value of the field {@code get_intrinsic_height}
     */
    public void setGetIntrinsicHeight(GetIntrinsicHeightCallback getIntrinsicHeight) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_intrinsic_height"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getIntrinsicHeight == null ? MemoryAddress.NULL : getIntrinsicHeight.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetIntrinsicAspectRatioCallback} callback.
     */
    @FunctionalInterface
    public interface GetIntrinsicAspectRatioCallback {
    
        double run(org.gtk.gdk.Paintable paintable);
        
        @ApiStatus.Internal default double upcall(MemoryAddress paintable) {
            var RESULT = run((org.gtk.gdk.Paintable) Interop.register(paintable, org.gtk.gdk.Paintable.fromAddress).marshal(paintable, null));
            return RESULT;
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetIntrinsicAspectRatioCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_intrinsic_aspect_ratio}
     * @param getIntrinsicAspectRatio The new value of the field {@code get_intrinsic_aspect_ratio}
     */
    public void setGetIntrinsicAspectRatio(GetIntrinsicAspectRatioCallback getIntrinsicAspectRatio) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_intrinsic_aspect_ratio"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getIntrinsicAspectRatio == null ? MemoryAddress.NULL : getIntrinsicAspectRatio.toCallback()));
        }
    }
    
    /**
     * Create a PaintableInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected PaintableInterface(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, PaintableInterface> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new PaintableInterface(input);
    
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
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
                return this;
            }
        }
        
        public Builder setSnapshot(SnapshotCallback snapshot) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("snapshot"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (snapshot == null ? MemoryAddress.NULL : snapshot.toCallback()));
                return this;
            }
        }
        
        public Builder setGetCurrentImage(GetCurrentImageCallback getCurrentImage) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_current_image"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getCurrentImage == null ? MemoryAddress.NULL : getCurrentImage.toCallback()));
                return this;
            }
        }
        
        public Builder setGetFlags(GetFlagsCallback getFlags) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_flags"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getFlags == null ? MemoryAddress.NULL : getFlags.toCallback()));
                return this;
            }
        }
        
        public Builder setGetIntrinsicWidth(GetIntrinsicWidthCallback getIntrinsicWidth) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_intrinsic_width"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getIntrinsicWidth == null ? MemoryAddress.NULL : getIntrinsicWidth.toCallback()));
                return this;
            }
        }
        
        public Builder setGetIntrinsicHeight(GetIntrinsicHeightCallback getIntrinsicHeight) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_intrinsic_height"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getIntrinsicHeight == null ? MemoryAddress.NULL : getIntrinsicHeight.toCallback()));
                return this;
            }
        }
        
        public Builder setGetIntrinsicAspectRatio(GetIntrinsicAspectRatioCallback getIntrinsicAspectRatio) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_intrinsic_aspect_ratio"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getIntrinsicAspectRatio == null ? MemoryAddress.NULL : getIntrinsicAspectRatio.toCallback()));
                return this;
            }
        }
    }
}
