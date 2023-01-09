package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class FontFamilyClass extends Struct {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "PangoFontFamilyClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("list_faces"),
            Interop.valueLayout.ADDRESS.withName("get_name"),
            Interop.valueLayout.ADDRESS.withName("is_monospace"),
            Interop.valueLayout.ADDRESS.withName("is_variable"),
            Interop.valueLayout.ADDRESS.withName("get_face"),
            Interop.valueLayout.ADDRESS.withName("_pango_reserved2")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link FontFamilyClass}
     * @return A new, uninitialized @{link FontFamilyClass}
     */
    public static FontFamilyClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        FontFamilyClass newInstance = new FontFamilyClass(segment.address());
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
     * Functional interface declaration of the {@code ListFacesCallback} callback.
     */
    @FunctionalInterface
    public interface ListFacesCallback {
    
        void run(org.pango.FontFamily family, @Nullable Out<org.pango.FontFace[]> faces, Out<Integer> nFaces);
        
        @ApiStatus.Internal default void upcall(MemoryAddress family, MemoryAddress faces, MemoryAddress nFaces) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                Out<Integer> nFacesOUT = new Out<>(nFaces.get(Interop.valueLayout.C_INT, 0));
                @Nullable Out<org.pango.FontFace[]> facesOUT = new Out<>(new PointerProxy<org.pango.FontFace>(faces, org.pango.FontFace.fromAddress).toArray((int) nFacesOUT.get(), org.pango.FontFace.class));
                run((org.pango.FontFamily) Interop.register(family, org.pango.FontFamily.fromAddress).marshal(family, null), facesOUT, nFacesOUT);
                nFaces.set(Interop.valueLayout.C_INT, 0, nFacesOUT.get());
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ListFacesCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code list_faces}
     * @param listFaces The new value of the field {@code list_faces}
     */
    public void setListFaces(ListFacesCallback listFaces) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("list_faces"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (listFaces == null ? MemoryAddress.NULL : listFaces.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetNameCallback} callback.
     */
    @FunctionalInterface
    public interface GetNameCallback {
    
        java.lang.String run(org.pango.FontFamily family);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress family) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.pango.FontFamily) Interop.register(family, org.pango.FontFamily.fromAddress).marshal(family, null));
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
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetNameCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_name}
     * @param getName The new value of the field {@code get_name}
     */
    public void setGetName(GetNameCallback getName) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getName == null ? MemoryAddress.NULL : getName.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code IsMonospaceCallback} callback.
     */
    @FunctionalInterface
    public interface IsMonospaceCallback {
    
        boolean run(org.pango.FontFamily family);
        
        @ApiStatus.Internal default int upcall(MemoryAddress family) {
            var RESULT = run((org.pango.FontFamily) Interop.register(family, org.pango.FontFamily.fromAddress).marshal(family, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), IsMonospaceCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code is_monospace}
     * @param isMonospace The new value of the field {@code is_monospace}
     */
    public void setIsMonospace(IsMonospaceCallback isMonospace) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_monospace"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (isMonospace == null ? MemoryAddress.NULL : isMonospace.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code IsVariableCallback} callback.
     */
    @FunctionalInterface
    public interface IsVariableCallback {
    
        boolean run(org.pango.FontFamily family);
        
        @ApiStatus.Internal default int upcall(MemoryAddress family) {
            var RESULT = run((org.pango.FontFamily) Interop.register(family, org.pango.FontFamily.fromAddress).marshal(family, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), IsVariableCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code is_variable}
     * @param isVariable The new value of the field {@code is_variable}
     */
    public void setIsVariable(IsVariableCallback isVariable) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_variable"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (isVariable == null ? MemoryAddress.NULL : isVariable.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetFaceCallback} callback.
     */
    @FunctionalInterface
    public interface GetFaceCallback {
    
        @Nullable org.pango.FontFace run(org.pango.FontFamily family, @Nullable java.lang.String name);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress family, MemoryAddress name) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.pango.FontFamily) Interop.register(family, org.pango.FontFamily.fromAddress).marshal(family, null), Marshal.addressToString.marshal(name, null));
                return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetFaceCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_face}
     * @param getFace The new value of the field {@code get_face}
     */
    public void setGetFace(GetFaceCallback getFace) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_face"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getFace == null ? MemoryAddress.NULL : getFace.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code PangoReserved2Callback} callback.
     */
    @FunctionalInterface
    public interface PangoReserved2Callback {
    
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
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PangoReserved2Callback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _pango_reserved2}
     * @param PangoReserved2 The new value of the field {@code _pango_reserved2}
     */
    public void setPangoReserved2(PangoReserved2Callback PangoReserved2) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_pango_reserved2"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (PangoReserved2 == null ? MemoryAddress.NULL : PangoReserved2.toCallback()));
        }
    }
    
    /**
     * Create a FontFamilyClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected FontFamilyClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, FontFamilyClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new FontFamilyClass(input);
    
    /**
     * A {@link FontFamilyClass.Builder} object constructs a {@link FontFamilyClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link FontFamilyClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final FontFamilyClass struct;
        
        private Builder() {
            struct = FontFamilyClass.allocate();
        }
        
        /**
         * Finish building the {@link FontFamilyClass} struct.
         * @return A new instance of {@code FontFamilyClass} with the fields 
         *         that were set in the Builder object.
         */
        public FontFamilyClass build() {
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
        
        public Builder setListFaces(ListFacesCallback listFaces) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("list_faces"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (listFaces == null ? MemoryAddress.NULL : listFaces.toCallback()));
                return this;
            }
        }
        
        public Builder setGetName(GetNameCallback getName) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_name"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getName == null ? MemoryAddress.NULL : getName.toCallback()));
                return this;
            }
        }
        
        public Builder setIsMonospace(IsMonospaceCallback isMonospace) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("is_monospace"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (isMonospace == null ? MemoryAddress.NULL : isMonospace.toCallback()));
                return this;
            }
        }
        
        public Builder setIsVariable(IsVariableCallback isVariable) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("is_variable"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (isVariable == null ? MemoryAddress.NULL : isVariable.toCallback()));
                return this;
            }
        }
        
        public Builder setGetFace(GetFaceCallback getFace) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_face"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getFace == null ? MemoryAddress.NULL : getFace.toCallback()));
                return this;
            }
        }
        
        public Builder setPangoReserved2(PangoReserved2Callback PangoReserved2) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_pango_reserved2"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (PangoReserved2 == null ? MemoryAddress.NULL : PangoReserved2.toCallback()));
                return this;
            }
        }
    }
}
