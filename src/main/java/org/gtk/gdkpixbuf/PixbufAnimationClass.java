package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Modules supporting animations must derive a type from
 * {@link PixbufAnimation}, providing suitable implementations of the
 * virtual functions.
 */
public class PixbufAnimationClass extends Struct {
    
    static {
        GdkPixbuf.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkPixbufAnimationClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("is_static_image"),
            Interop.valueLayout.ADDRESS.withName("get_static_image"),
            Interop.valueLayout.ADDRESS.withName("get_size"),
            Interop.valueLayout.ADDRESS.withName("get_iter")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link PixbufAnimationClass}
     * @return A new, uninitialized @{link PixbufAnimationClass}
     */
    public static PixbufAnimationClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        PixbufAnimationClass newInstance = new PixbufAnimationClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gobject.ObjectClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gtk.gobject.ObjectClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gtk.gobject.ObjectClass parentClass) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code IsStaticImageCallback} callback.
     */
    @FunctionalInterface
    public interface IsStaticImageCallback {
    
        boolean run(org.gtk.gdkpixbuf.PixbufAnimation animation);
        
        @ApiStatus.Internal default int upcall(MemoryAddress animation) {
            var RESULT = run((org.gtk.gdkpixbuf.PixbufAnimation) Interop.register(animation, org.gtk.gdkpixbuf.PixbufAnimation.fromAddress).marshal(animation, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), IsStaticImageCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code is_static_image}
     * @param isStaticImage The new value of the field {@code is_static_image}
     */
    public void setIsStaticImage(IsStaticImageCallback isStaticImage) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_static_image"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (isStaticImage == null ? MemoryAddress.NULL : isStaticImage.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetStaticImageCallback} callback.
     */
    @FunctionalInterface
    public interface GetStaticImageCallback {
    
        org.gtk.gdkpixbuf.Pixbuf run(org.gtk.gdkpixbuf.PixbufAnimation animation);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress animation) {
            var RESULT = run((org.gtk.gdkpixbuf.PixbufAnimation) Interop.register(animation, org.gtk.gdkpixbuf.PixbufAnimation.fromAddress).marshal(animation, null));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetStaticImageCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_static_image}
     * @param getStaticImage The new value of the field {@code get_static_image}
     */
    public void setGetStaticImage(GetStaticImageCallback getStaticImage) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_static_image"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getStaticImage == null ? MemoryAddress.NULL : getStaticImage.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetSizeCallback} callback.
     */
    @FunctionalInterface
    public interface GetSizeCallback {
    
        void run(org.gtk.gdkpixbuf.PixbufAnimation animation, PointerInteger width, PointerInteger height);
        
        @ApiStatus.Internal default void upcall(MemoryAddress animation, MemoryAddress width, MemoryAddress height) {
            run((org.gtk.gdkpixbuf.PixbufAnimation) Interop.register(animation, org.gtk.gdkpixbuf.PixbufAnimation.fromAddress).marshal(animation, null), new PointerInteger(width), new PointerInteger(height));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetSizeCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_size}
     * @param getSize The new value of the field {@code get_size}
     */
    public void setGetSize(GetSizeCallback getSize) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_size"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getSize == null ? MemoryAddress.NULL : getSize.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetIterCallback} callback.
     */
    @FunctionalInterface
    public interface GetIterCallback {
    
        org.gtk.gdkpixbuf.PixbufAnimationIter run(org.gtk.gdkpixbuf.PixbufAnimation animation, @Nullable org.gtk.glib.TimeVal startTime);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress animation, MemoryAddress startTime) {
            var RESULT = run((org.gtk.gdkpixbuf.PixbufAnimation) Interop.register(animation, org.gtk.gdkpixbuf.PixbufAnimation.fromAddress).marshal(animation, null), org.gtk.glib.TimeVal.fromAddress.marshal(startTime, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetIterCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_iter}
     * @param getIter The new value of the field {@code get_iter}
     */
    public void setGetIter(GetIterCallback getIter) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_iter"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getIter == null ? MemoryAddress.NULL : getIter.toCallback()));
        }
    }
    
    /**
     * Create a PixbufAnimationClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected PixbufAnimationClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, PixbufAnimationClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new PixbufAnimationClass(input);
    
    /**
     * A {@link PixbufAnimationClass.Builder} object constructs a {@link PixbufAnimationClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link PixbufAnimationClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final PixbufAnimationClass struct;
        
        private Builder() {
            struct = PixbufAnimationClass.allocate();
        }
        
        /**
         * Finish building the {@link PixbufAnimationClass} struct.
         * @return A new instance of {@code PixbufAnimationClass} with the fields 
         *         that were set in the Builder object.
         */
        public PixbufAnimationClass build() {
            return struct;
        }
        
        /**
         * the parent class
         * @param parentClass The value for the {@code parentClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParentClass(org.gtk.gobject.ObjectClass parentClass) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
                return this;
            }
        }
        
        public Builder setIsStaticImage(IsStaticImageCallback isStaticImage) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("is_static_image"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (isStaticImage == null ? MemoryAddress.NULL : isStaticImage.toCallback()));
                return this;
            }
        }
        
        public Builder setGetStaticImage(GetStaticImageCallback getStaticImage) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_static_image"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getStaticImage == null ? MemoryAddress.NULL : getStaticImage.toCallback()));
                return this;
            }
        }
        
        public Builder setGetSize(GetSizeCallback getSize) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_size"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getSize == null ? MemoryAddress.NULL : getSize.toCallback()));
                return this;
            }
        }
        
        public Builder setGetIter(GetIterCallback getIter) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_iter"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getIter == null ? MemoryAddress.NULL : getIter.toCallback()));
                return this;
            }
        }
    }
}
