package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code PangoFontMapClass} structure holds the virtual functions for
 * a particular {@code PangoFontMap} implementation.
 */
public class FontMapClass extends Struct {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "PangoFontMapClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("load_font"),
            Interop.valueLayout.ADDRESS.withName("list_families"),
            Interop.valueLayout.ADDRESS.withName("load_fontset"),
            Interop.valueLayout.ADDRESS.withName("shape_engine_type"),
            Interop.valueLayout.ADDRESS.withName("get_serial"),
            Interop.valueLayout.ADDRESS.withName("changed"),
            Interop.valueLayout.ADDRESS.withName("get_family"),
            Interop.valueLayout.ADDRESS.withName("get_face")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link FontMapClass}
     * @return A new, uninitialized @{link FontMapClass}
     */
    public static FontMapClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        FontMapClass newInstance = new FontMapClass(segment.address());
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
     * Functional interface declaration of the {@code LoadFontCallback} callback.
     */
    @FunctionalInterface
    public interface LoadFontCallback {
    
        @Nullable org.pango.Font run(org.pango.FontMap fontmap, org.pango.Context context, org.pango.FontDescription desc);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress fontmap, MemoryAddress context, MemoryAddress desc) {
            var RESULT = run((org.pango.FontMap) Interop.register(fontmap, org.pango.FontMap.fromAddress).marshal(fontmap, null), (org.pango.Context) Interop.register(context, org.pango.Context.fromAddress).marshal(context, null), org.pango.FontDescription.fromAddress.marshal(desc, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), LoadFontCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code load_font}
     * @param loadFont The new value of the field {@code load_font}
     */
    public void setLoadFont(LoadFontCallback loadFont) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("load_font"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (loadFont == null ? MemoryAddress.NULL : loadFont.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ListFamiliesCallback} callback.
     */
    @FunctionalInterface
    public interface ListFamiliesCallback {
    
        void run(org.pango.FontMap fontmap, Out<org.pango.FontFamily[]> families, Out<Integer> nFamilies);
        
        @ApiStatus.Internal default void upcall(MemoryAddress fontmap, MemoryAddress families, MemoryAddress nFamilies) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                Out<Integer> nFamiliesOUT = new Out<>(nFamilies.get(Interop.valueLayout.C_INT, 0));
                Out<org.pango.FontFamily[]> familiesOUT = new Out<>(new PointerProxy<org.pango.FontFamily>(families, org.pango.FontFamily.fromAddress).toArray((int) nFamiliesOUT.get(), org.pango.FontFamily.class));
                run((org.pango.FontMap) Interop.register(fontmap, org.pango.FontMap.fromAddress).marshal(fontmap, null), familiesOUT, nFamiliesOUT);
                nFamilies.set(Interop.valueLayout.C_INT, 0, nFamiliesOUT.get());
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ListFamiliesCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code list_families}
     * @param listFamilies The new value of the field {@code list_families}
     */
    public void setListFamilies(ListFamiliesCallback listFamilies) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("list_families"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (listFamilies == null ? MemoryAddress.NULL : listFamilies.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code LoadFontsetCallback} callback.
     */
    @FunctionalInterface
    public interface LoadFontsetCallback {
    
        @Nullable org.pango.Fontset run(org.pango.FontMap fontmap, org.pango.Context context, org.pango.FontDescription desc, org.pango.Language language);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress fontmap, MemoryAddress context, MemoryAddress desc, MemoryAddress language) {
            var RESULT = run((org.pango.FontMap) Interop.register(fontmap, org.pango.FontMap.fromAddress).marshal(fontmap, null), (org.pango.Context) Interop.register(context, org.pango.Context.fromAddress).marshal(context, null), org.pango.FontDescription.fromAddress.marshal(desc, null), org.pango.Language.fromAddress.marshal(language, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), LoadFontsetCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code load_fontset}
     * @param loadFontset The new value of the field {@code load_fontset}
     */
    public void setLoadFontset(LoadFontsetCallback loadFontset) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("load_fontset"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (loadFontset == null ? MemoryAddress.NULL : loadFontset.toCallback()));
        }
    }
    
    /**
     * Get the value of the field {@code shape_engine_type}
     * @return The value of the field {@code shape_engine_type}
     */
    public java.lang.String getShapeEngineType() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("shape_engine_type"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code shape_engine_type}
     * @param shapeEngineType The new value of the field {@code shape_engine_type}
     */
    public void setShapeEngineType(java.lang.String shapeEngineType) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("shape_engine_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (shapeEngineType == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(shapeEngineType, SCOPE)));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetSerialCallback} callback.
     */
    @FunctionalInterface
    public interface GetSerialCallback {
    
        int run(org.pango.FontMap fontmap);
        
        @ApiStatus.Internal default int upcall(MemoryAddress fontmap) {
            var RESULT = run((org.pango.FontMap) Interop.register(fontmap, org.pango.FontMap.fromAddress).marshal(fontmap, null));
            return RESULT;
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetSerialCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_serial}
     * @param getSerial The new value of the field {@code get_serial}
     */
    public void setGetSerial(GetSerialCallback getSerial) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_serial"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getSerial == null ? MemoryAddress.NULL : getSerial.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ChangedCallback} callback.
     */
    @FunctionalInterface
    public interface ChangedCallback {
    
        void run(org.pango.FontMap fontmap);
        
        @ApiStatus.Internal default void upcall(MemoryAddress fontmap) {
            run((org.pango.FontMap) Interop.register(fontmap, org.pango.FontMap.fromAddress).marshal(fontmap, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ChangedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code changed}
     * @param changed The new value of the field {@code changed}
     */
    public void setChanged(ChangedCallback changed) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (changed == null ? MemoryAddress.NULL : changed.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetFamilyCallback} callback.
     */
    @FunctionalInterface
    public interface GetFamilyCallback {
    
        org.pango.FontFamily run(org.pango.FontMap fontmap, java.lang.String name);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress fontmap, MemoryAddress name) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.pango.FontMap) Interop.register(fontmap, org.pango.FontMap.fromAddress).marshal(fontmap, null), Marshal.addressToString.marshal(name, null));
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
     * Functional interface declaration of the {@code GetFaceCallback} callback.
     */
    @FunctionalInterface
    public interface GetFaceCallback {
    
        org.pango.FontFace run(org.pango.FontMap fontmap, org.pango.Font font);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress fontmap, MemoryAddress font) {
            var RESULT = run((org.pango.FontMap) Interop.register(fontmap, org.pango.FontMap.fromAddress).marshal(fontmap, null), (org.pango.Font) Interop.register(font, org.pango.Font.fromAddress).marshal(font, null));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
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
     * Create a FontMapClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected FontMapClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, FontMapClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new FontMapClass(input);
    
    /**
     * A {@link FontMapClass.Builder} object constructs a {@link FontMapClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link FontMapClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final FontMapClass struct;
        
        private Builder() {
            struct = FontMapClass.allocate();
        }
        
        /**
         * Finish building the {@link FontMapClass} struct.
         * @return A new instance of {@code FontMapClass} with the fields 
         *         that were set in the Builder object.
         */
        public FontMapClass build() {
            return struct;
        }
        
        /**
         * parent {@code GObjectClass}
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
        
        public Builder setLoadFont(LoadFontCallback loadFont) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("load_font"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (loadFont == null ? MemoryAddress.NULL : loadFont.toCallback()));
                return this;
            }
        }
        
        public Builder setListFamilies(ListFamiliesCallback listFamilies) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("list_families"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (listFamilies == null ? MemoryAddress.NULL : listFamilies.toCallback()));
                return this;
            }
        }
        
        public Builder setLoadFontset(LoadFontsetCallback loadFontset) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("load_fontset"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (loadFontset == null ? MemoryAddress.NULL : loadFontset.toCallback()));
                return this;
            }
        }
        
        /**
         * the type of rendering-system-dependent engines that
         * can handle fonts of this fonts loaded with this fontmap.
         * @param shapeEngineType The value for the {@code shapeEngineType} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setShapeEngineType(java.lang.String shapeEngineType) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("shape_engine_type"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (shapeEngineType == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(shapeEngineType, SCOPE)));
                return this;
            }
        }
        
        public Builder setGetSerial(GetSerialCallback getSerial) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_serial"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getSerial == null ? MemoryAddress.NULL : getSerial.toCallback()));
                return this;
            }
        }
        
        public Builder setChanged(ChangedCallback changed) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("changed"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (changed == null ? MemoryAddress.NULL : changed.toCallback()));
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
        
        public Builder setGetFace(GetFaceCallback getFace) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_face"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getFace == null ? MemoryAddress.NULL : getFace.toCallback()));
                return this;
            }
        }
    }
}
