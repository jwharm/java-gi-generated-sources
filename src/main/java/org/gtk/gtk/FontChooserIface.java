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
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        FontChooserIface newInstance = new FontChooserIface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code base_iface}
     * @return The value of the field {@code base_iface}
     */
    public org.gtk.gobject.TypeInterface getBaseIface() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("base_iface"));
        return org.gtk.gobject.TypeInterface.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code base_iface}
     * @param baseIface The new value of the field {@code base_iface}
     */
    public void setBaseIface(org.gtk.gobject.TypeInterface baseIface) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("base_iface"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (baseIface == null ? MemoryAddress.NULL : baseIface.handle()));
    }
    
    @FunctionalInterface
    public interface GetFontFamilyCallback {
        @Nullable org.pango.FontFamily run(org.gtk.gtk.FontChooser fontchooser);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress fontchooser) {
            var RESULT = run((org.gtk.gtk.FontChooser) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(fontchooser)), org.gtk.gtk.FontChooser.fromAddress).marshal(fontchooser, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetFontFamilyCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_font_family}
     * @param getFontFamily The new value of the field {@code get_font_family}
     */
    public void setGetFontFamily(GetFontFamilyCallback getFontFamily) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_font_family"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getFontFamily == null ? MemoryAddress.NULL : getFontFamily.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetFontFaceCallback {
        @Nullable org.pango.FontFace run(org.gtk.gtk.FontChooser fontchooser);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress fontchooser) {
            var RESULT = run((org.gtk.gtk.FontChooser) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(fontchooser)), org.gtk.gtk.FontChooser.fromAddress).marshal(fontchooser, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetFontFaceCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_font_face}
     * @param getFontFace The new value of the field {@code get_font_face}
     */
    public void setGetFontFace(GetFontFaceCallback getFontFace) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_font_face"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getFontFace == null ? MemoryAddress.NULL : getFontFace.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetFontSizeCallback {
        int run(org.gtk.gtk.FontChooser fontchooser);

        @ApiStatus.Internal default int upcall(MemoryAddress fontchooser) {
            var RESULT = run((org.gtk.gtk.FontChooser) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(fontchooser)), org.gtk.gtk.FontChooser.fromAddress).marshal(fontchooser, Ownership.NONE));
            return RESULT;
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetFontSizeCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_font_size}
     * @param getFontSize The new value of the field {@code get_font_size}
     */
    public void setGetFontSize(GetFontSizeCallback getFontSize) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_font_size"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getFontSize == null ? MemoryAddress.NULL : getFontSize.toCallback()));
    }
    
    @FunctionalInterface
    public interface SetFilterFuncCallback {
        void run(org.gtk.gtk.FontChooser fontchooser, @Nullable org.gtk.gtk.FontFilterFunc filter, org.gtk.glib.DestroyNotify destroy);

        @ApiStatus.Internal default void upcall(MemoryAddress fontchooser, MemoryAddress filter, MemoryAddress userData, MemoryAddress destroy) {
            run((org.gtk.gtk.FontChooser) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(fontchooser)), org.gtk.gtk.FontChooser.fromAddress).marshal(fontchooser, Ownership.NONE), null /* Unsupported parameter type */, null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SetFilterFuncCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_filter_func}
     * @param setFilterFunc The new value of the field {@code set_filter_func}
     */
    public void setSetFilterFunc(SetFilterFuncCallback setFilterFunc) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("set_filter_func"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setFilterFunc == null ? MemoryAddress.NULL : setFilterFunc.toCallback()));
    }
    
    @FunctionalInterface
    public interface FontActivatedCallback {
        void run(org.gtk.gtk.FontChooser chooser, java.lang.String fontname);

        @ApiStatus.Internal default void upcall(MemoryAddress chooser, MemoryAddress fontname) {
            run((org.gtk.gtk.FontChooser) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(chooser)), org.gtk.gtk.FontChooser.fromAddress).marshal(chooser, Ownership.NONE), Marshal.addressToString.marshal(fontname, null));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(FontActivatedCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code font_activated}
     * @param fontActivated The new value of the field {@code font_activated}
     */
    public void setFontActivated(FontActivatedCallback fontActivated) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("font_activated"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (fontActivated == null ? MemoryAddress.NULL : fontActivated.toCallback()));
    }
    
    @FunctionalInterface
    public interface SetFontMapCallback {
        void run(org.gtk.gtk.FontChooser fontchooser, @Nullable org.pango.FontMap fontmap);

        @ApiStatus.Internal default void upcall(MemoryAddress fontchooser, MemoryAddress fontmap) {
            run((org.gtk.gtk.FontChooser) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(fontchooser)), org.gtk.gtk.FontChooser.fromAddress).marshal(fontchooser, Ownership.NONE), (org.pango.FontMap) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(fontmap)), org.pango.FontMap.fromAddress).marshal(fontmap, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SetFontMapCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_font_map}
     * @param setFontMap The new value of the field {@code set_font_map}
     */
    public void setSetFontMap(SetFontMapCallback setFontMap) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("set_font_map"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setFontMap == null ? MemoryAddress.NULL : setFontMap.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetFontMapCallback {
        @Nullable org.pango.FontMap run(org.gtk.gtk.FontChooser fontchooser);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress fontchooser) {
            var RESULT = run((org.gtk.gtk.FontChooser) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(fontchooser)), org.gtk.gtk.FontChooser.fromAddress).marshal(fontchooser, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetFontMapCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_font_map}
     * @param getFontMap The new value of the field {@code get_font_map}
     */
    public void setGetFontMap(GetFontMapCallback getFontMap) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_font_map"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getFontMap == null ? MemoryAddress.NULL : getFontMap.toCallback()));
    }
    
    /**
     * Create a FontChooserIface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected FontChooserIface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, FontChooserIface> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new FontChooserIface(input, ownership);
    
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
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("base_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (baseIface == null ? MemoryAddress.NULL : baseIface.handle()));
            return this;
        }
        
        public Builder setGetFontFamily(GetFontFamilyCallback getFontFamily) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_font_family"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getFontFamily == null ? MemoryAddress.NULL : getFontFamily.toCallback()));
            return this;
        }
        
        public Builder setGetFontFace(GetFontFaceCallback getFontFace) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_font_face"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getFontFace == null ? MemoryAddress.NULL : getFontFace.toCallback()));
            return this;
        }
        
        public Builder setGetFontSize(GetFontSizeCallback getFontSize) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_font_size"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getFontSize == null ? MemoryAddress.NULL : getFontSize.toCallback()));
            return this;
        }
        
        public Builder setSetFilterFunc(SetFilterFuncCallback setFilterFunc) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_filter_func"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setFilterFunc == null ? MemoryAddress.NULL : setFilterFunc.toCallback()));
            return this;
        }
        
        public Builder setFontActivated(FontActivatedCallback fontActivated) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("font_activated"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (fontActivated == null ? MemoryAddress.NULL : fontActivated.toCallback()));
            return this;
        }
        
        public Builder setSetFontMap(SetFontMapCallback setFontMap) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_font_map"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setFontMap == null ? MemoryAddress.NULL : setFontMap.toCallback()));
            return this;
        }
        
        public Builder setGetFontMap(GetFontMapCallback getFontMap) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_font_map"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getFontMap == null ? MemoryAddress.NULL : getFontMap.toCallback()));
            return this;
        }
        
        public Builder setPadding(java.lang.foreign.MemoryAddress[] padding) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("padding"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(padding, false)));
            return this;
        }
    }
}
