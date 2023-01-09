package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class FontFaceClass extends Struct {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "PangoFontFaceClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("get_face_name"),
            Interop.valueLayout.ADDRESS.withName("describe"),
            Interop.valueLayout.ADDRESS.withName("list_sizes"),
            Interop.valueLayout.ADDRESS.withName("is_synthesized"),
            Interop.valueLayout.ADDRESS.withName("get_family"),
            Interop.valueLayout.ADDRESS.withName("_pango_reserved3"),
            Interop.valueLayout.ADDRESS.withName("_pango_reserved4")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link FontFaceClass}
     * @return A new, uninitialized @{link FontFaceClass}
     */
    public static FontFaceClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        FontFaceClass newInstance = new FontFaceClass(segment.address());
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
     * Functional interface declaration of the {@code GetFaceNameCallback} callback.
     */
    @FunctionalInterface
    public interface GetFaceNameCallback {
    
        java.lang.String run(org.pango.FontFace face);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress face) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.pango.FontFace) Interop.register(face, org.pango.FontFace.fromAddress).marshal(face, null));
                return RESULT == null ? MemoryAddress.NULL.address() : (Marshal.stringToAddress.marshal(RESULT, SCOPE)).address();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetFaceNameCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_face_name}
     * @param getFaceName The new value of the field {@code get_face_name}
     */
    public void setGetFaceName(GetFaceNameCallback getFaceName) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_face_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getFaceName == null ? MemoryAddress.NULL : getFaceName.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code DescribeCallback} callback.
     */
    @FunctionalInterface
    public interface DescribeCallback {
    
        org.pango.FontDescription run(org.pango.FontFace face);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress face) {
            var RESULT = run((org.pango.FontFace) Interop.register(face, org.pango.FontFace.fromAddress).marshal(face, null));
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
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DescribeCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code describe}
     * @param describe The new value of the field {@code describe}
     */
    public void setDescribe(DescribeCallback describe) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("describe"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (describe == null ? MemoryAddress.NULL : describe.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ListSizesCallback} callback.
     */
    @FunctionalInterface
    public interface ListSizesCallback {
    
        void run(org.pango.FontFace face, Out<int[]> sizes, Out<Integer> nSizes);
        
        @ApiStatus.Internal default void upcall(MemoryAddress face, MemoryAddress sizes, MemoryAddress nSizes) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                Out<Integer> nSizesOUT = new Out<>(nSizes.get(Interop.valueLayout.C_INT, 0));
                Out<int[]> sizesOUT = new Out<>(MemorySegment.ofAddress(sizes, nSizesOUT.get(), SCOPE).toArray(Interop.valueLayout.C_INT));
                run((org.pango.FontFace) Interop.register(face, org.pango.FontFace.fromAddress).marshal(face, null), sizesOUT, nSizesOUT);
                nSizes.set(Interop.valueLayout.C_INT, 0, nSizesOUT.get());
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ListSizesCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code list_sizes}
     * @param listSizes The new value of the field {@code list_sizes}
     */
    public void setListSizes(ListSizesCallback listSizes) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("list_sizes"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (listSizes == null ? MemoryAddress.NULL : listSizes.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code IsSynthesizedCallback} callback.
     */
    @FunctionalInterface
    public interface IsSynthesizedCallback {
    
        boolean run(org.pango.FontFace face);
        
        @ApiStatus.Internal default int upcall(MemoryAddress face) {
            var RESULT = run((org.pango.FontFace) Interop.register(face, org.pango.FontFace.fromAddress).marshal(face, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), IsSynthesizedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code is_synthesized}
     * @param isSynthesized The new value of the field {@code is_synthesized}
     */
    public void setIsSynthesized(IsSynthesizedCallback isSynthesized) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_synthesized"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (isSynthesized == null ? MemoryAddress.NULL : isSynthesized.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetFamilyCallback} callback.
     */
    @FunctionalInterface
    public interface GetFamilyCallback {
    
        org.pango.FontFamily run(org.pango.FontFace face);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress face) {
            var RESULT = run((org.pango.FontFace) Interop.register(face, org.pango.FontFace.fromAddress).marshal(face, null));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetFamilyCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_family}
     * @param getFamily The new value of the field {@code get_family}
     */
    public void setGetFamily(GetFamilyCallback getFamily) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_family"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getFamily == null ? MemoryAddress.NULL : getFamily.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code PangoReserved3Callback} callback.
     */
    @FunctionalInterface
    public interface PangoReserved3Callback {
    
        void run();
        
        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PangoReserved3Callback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _pango_reserved3}
     * @param PangoReserved3 The new value of the field {@code _pango_reserved3}
     */
    public void setPangoReserved3(PangoReserved3Callback PangoReserved3) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_pango_reserved3"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (PangoReserved3 == null ? MemoryAddress.NULL : PangoReserved3.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code PangoReserved4Callback} callback.
     */
    @FunctionalInterface
    public interface PangoReserved4Callback {
    
        void run();
        
        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PangoReserved4Callback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _pango_reserved4}
     * @param PangoReserved4 The new value of the field {@code _pango_reserved4}
     */
    public void setPangoReserved4(PangoReserved4Callback PangoReserved4) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_pango_reserved4"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (PangoReserved4 == null ? MemoryAddress.NULL : PangoReserved4.toCallback()));
        }
    }
    
    /**
     * Create a FontFaceClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected FontFaceClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, FontFaceClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new FontFaceClass(input);
    
    /**
     * A {@link FontFaceClass.Builder} object constructs a {@link FontFaceClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link FontFaceClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final FontFaceClass struct;
        
        private Builder() {
            struct = FontFaceClass.allocate();
        }
        
        /**
         * Finish building the {@link FontFaceClass} struct.
         * @return A new instance of {@code FontFaceClass} with the fields 
         *         that were set in the Builder object.
         */
        public FontFaceClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gtk.gobject.ObjectClass parentClass) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
                return this;
            }
        }
        
        public Builder setGetFaceName(GetFaceNameCallback getFaceName) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_face_name"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getFaceName == null ? MemoryAddress.NULL : getFaceName.toCallback()));
                return this;
            }
        }
        
        public Builder setDescribe(DescribeCallback describe) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("describe"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (describe == null ? MemoryAddress.NULL : describe.toCallback()));
                return this;
            }
        }
        
        public Builder setListSizes(ListSizesCallback listSizes) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("list_sizes"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (listSizes == null ? MemoryAddress.NULL : listSizes.toCallback()));
                return this;
            }
        }
        
        public Builder setIsSynthesized(IsSynthesizedCallback isSynthesized) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("is_synthesized"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (isSynthesized == null ? MemoryAddress.NULL : isSynthesized.toCallback()));
                return this;
            }
        }
        
        public Builder setGetFamily(GetFamilyCallback getFamily) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_family"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getFamily == null ? MemoryAddress.NULL : getFamily.toCallback()));
                return this;
            }
        }
        
        public Builder setPangoReserved3(PangoReserved3Callback PangoReserved3) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_pango_reserved3"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (PangoReserved3 == null ? MemoryAddress.NULL : PangoReserved3.toCallback()));
                return this;
            }
        }
        
        public Builder setPangoReserved4(PangoReserved4Callback PangoReserved4) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_pango_reserved4"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (PangoReserved4 == null ? MemoryAddress.NULL : PangoReserved4.toCallback()));
                return this;
            }
        }
    }
}
