package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class FontChooserIface extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkFontChooserIface";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.TypeInterface.getMemoryLayout().withName("base_iface"),
            Interop.valueLayout.ADDRESS.withName("get_font_family"),
            Interop.valueLayout.ADDRESS.withName("get_font_face"),
            Interop.valueLayout.ADDRESS.withName("get_font_size"),
            Interop.valueLayout.ADDRESS.withName("set_filter_func"),
            Interop.valueLayout.ADDRESS.withName("font_activated"),
            Interop.valueLayout.ADDRESS.withName("set_font_map"),
            Interop.valueLayout.ADDRESS.withName("get_font_map"),
            MemoryLayout.sequenceLayout(10, Interop.valueLayout.ADDRESS).withName("padding")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link FontChooserIface}
     * @return A new, uninitialized @{link FontChooserIface}
     */
    public static FontChooserIface allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        FontChooserIface newInstance = new FontChooserIface(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code base_iface}
     * @return The value of the field {@code base_iface}
     */
    public org.gtk.gobject.TypeInterface getBaseIface() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("base_iface"));
        return org.gtk.gobject.TypeInterface.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code base_iface}
     * @param baseIface The new value of the field {@code base_iface}
     */
    public void setBaseIface(org.gtk.gobject.TypeInterface baseIface) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("base_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (baseIface == null ? MemoryAddress.NULL : baseIface.handle()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetFontFamilyCallback} callback.
     */
    @FunctionalInterface
    public interface GetFontFamilyCallback {
    
        @Nullable org.pango.FontFamily run(org.gtk.gtk.FontChooser fontchooser);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress fontchooser) {
            var RESULT = run((org.gtk.gtk.FontChooser) Interop.register(fontchooser, org.gtk.gtk.FontChooser.fromAddress).marshal(fontchooser, null));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetFontFamilyCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_font_family}
     * @param getFontFamily The new value of the field {@code get_font_family}
     */
    public void setGetFontFamily(GetFontFamilyCallback getFontFamily) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_font_family"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getFontFamily == null ? MemoryAddress.NULL : getFontFamily.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetFontFaceCallback} callback.
     */
    @FunctionalInterface
    public interface GetFontFaceCallback {
    
        @Nullable org.pango.FontFace run(org.gtk.gtk.FontChooser fontchooser);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress fontchooser) {
            var RESULT = run((org.gtk.gtk.FontChooser) Interop.register(fontchooser, org.gtk.gtk.FontChooser.fromAddress).marshal(fontchooser, null));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetFontFaceCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_font_face}
     * @param getFontFace The new value of the field {@code get_font_face}
     */
    public void setGetFontFace(GetFontFaceCallback getFontFace) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_font_face"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getFontFace == null ? MemoryAddress.NULL : getFontFace.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetFontSizeCallback} callback.
     */
    @FunctionalInterface
    public interface GetFontSizeCallback {
    
        int run(org.gtk.gtk.FontChooser fontchooser);
        
        @ApiStatus.Internal default int upcall(MemoryAddress fontchooser) {
            var RESULT = run((org.gtk.gtk.FontChooser) Interop.register(fontchooser, org.gtk.gtk.FontChooser.fromAddress).marshal(fontchooser, null));
            return RESULT;
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetFontSizeCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_font_size}
     * @param getFontSize The new value of the field {@code get_font_size}
     */
    public void setGetFontSize(GetFontSizeCallback getFontSize) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_font_size"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getFontSize == null ? MemoryAddress.NULL : getFontSize.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SetFilterFuncCallback} callback.
     */
    @FunctionalInterface
    public interface SetFilterFuncCallback {
    
        void run(org.gtk.gtk.FontChooser fontchooser, @Nullable org.gtk.gtk.FontFilterFunc filter, org.gtk.glib.DestroyNotify destroy);
        
        @ApiStatus.Internal default void upcall(MemoryAddress fontchooser, MemoryAddress filter, MemoryAddress userData, MemoryAddress destroy) {
            run((org.gtk.gtk.FontChooser) Interop.register(fontchooser, org.gtk.gtk.FontChooser.fromAddress).marshal(fontchooser, null), null /* Unsupported parameter type */, null /* Unsupported parameter type */);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SetFilterFuncCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_filter_func}
     * @param setFilterFunc The new value of the field {@code set_filter_func}
     */
    public void setSetFilterFunc(SetFilterFuncCallback setFilterFunc) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_filter_func"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setFilterFunc == null ? MemoryAddress.NULL : setFilterFunc.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code FontActivatedCallback} callback.
     */
    @FunctionalInterface
    public interface FontActivatedCallback {
    
        void run(org.gtk.gtk.FontChooser chooser, java.lang.String fontname);
        
        @ApiStatus.Internal default void upcall(MemoryAddress chooser, MemoryAddress fontname) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run((org.gtk.gtk.FontChooser) Interop.register(chooser, org.gtk.gtk.FontChooser.fromAddress).marshal(chooser, null), Marshal.addressToString.marshal(fontname, null));
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), FontActivatedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code font_activated}
     * @param fontActivated The new value of the field {@code font_activated}
     */
    public void setFontActivated(FontActivatedCallback fontActivated) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("font_activated"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (fontActivated == null ? MemoryAddress.NULL : fontActivated.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SetFontMapCallback} callback.
     */
    @FunctionalInterface
    public interface SetFontMapCallback {
    
        void run(org.gtk.gtk.FontChooser fontchooser, @Nullable org.pango.FontMap fontmap);
        
        @ApiStatus.Internal default void upcall(MemoryAddress fontchooser, MemoryAddress fontmap) {
            run((org.gtk.gtk.FontChooser) Interop.register(fontchooser, org.gtk.gtk.FontChooser.fromAddress).marshal(fontchooser, null), (org.pango.FontMap) Interop.register(fontmap, org.pango.FontMap.fromAddress).marshal(fontmap, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SetFontMapCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_font_map}
     * @param setFontMap The new value of the field {@code set_font_map}
     */
    public void setSetFontMap(SetFontMapCallback setFontMap) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_font_map"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setFontMap == null ? MemoryAddress.NULL : setFontMap.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetFontMapCallback} callback.
     */
    @FunctionalInterface
    public interface GetFontMapCallback {
    
        @Nullable org.pango.FontMap run(org.gtk.gtk.FontChooser fontchooser);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress fontchooser) {
            var RESULT = run((org.gtk.gtk.FontChooser) Interop.register(fontchooser, org.gtk.gtk.FontChooser.fromAddress).marshal(fontchooser, null));
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
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetFontMapCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_font_map}
     * @param getFontMap The new value of the field {@code get_font_map}
     */
    public void setGetFontMap(GetFontMapCallback getFontMap) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_font_map"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getFontMap == null ? MemoryAddress.NULL : getFontMap.toCallback()));
        }
    }
    
    /**
     * Create a FontChooserIface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected FontChooserIface(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, FontChooserIface> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new FontChooserIface(input);
    
    /**
     * A {@link FontChooserIface.Builder} object constructs a {@link FontChooserIface} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link FontChooserIface.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final FontChooserIface struct;
        
        private Builder() {
            struct = FontChooserIface.allocate();
        }
        
        /**
         * Finish building the {@link FontChooserIface} struct.
         * @return A new instance of {@code FontChooserIface} with the fields 
         *         that were set in the Builder object.
         */
        public FontChooserIface build() {
            return struct;
        }
        
        public Builder setBaseIface(org.gtk.gobject.TypeInterface baseIface) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("base_iface"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (baseIface == null ? MemoryAddress.NULL : baseIface.handle()));
                return this;
            }
        }
        
        public Builder setGetFontFamily(GetFontFamilyCallback getFontFamily) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_font_family"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getFontFamily == null ? MemoryAddress.NULL : getFontFamily.toCallback()));
                return this;
            }
        }
        
        public Builder setGetFontFace(GetFontFaceCallback getFontFace) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_font_face"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getFontFace == null ? MemoryAddress.NULL : getFontFace.toCallback()));
                return this;
            }
        }
        
        public Builder setGetFontSize(GetFontSizeCallback getFontSize) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_font_size"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getFontSize == null ? MemoryAddress.NULL : getFontSize.toCallback()));
                return this;
            }
        }
        
        public Builder setSetFilterFunc(SetFilterFuncCallback setFilterFunc) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("set_filter_func"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setFilterFunc == null ? MemoryAddress.NULL : setFilterFunc.toCallback()));
                return this;
            }
        }
        
        public Builder setFontActivated(FontActivatedCallback fontActivated) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("font_activated"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (fontActivated == null ? MemoryAddress.NULL : fontActivated.toCallback()));
                return this;
            }
        }
        
        public Builder setSetFontMap(SetFontMapCallback setFontMap) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("set_font_map"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setFontMap == null ? MemoryAddress.NULL : setFontMap.toCallback()));
                return this;
            }
        }
        
        public Builder setGetFontMap(GetFontMapCallback getFontMap) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_font_map"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getFontMap == null ? MemoryAddress.NULL : getFontMap.toCallback()));
                return this;
            }
        }
        
        public Builder setPadding(java.lang.foreign.MemoryAddress[] padding) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("padding"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(padding, false, SCOPE)));
                return this;
            }
        }
    }
}
