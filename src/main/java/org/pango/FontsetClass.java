package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code PangoFontsetClass} structure holds the virtual functions for
 * a particular {@code PangoFontset} implementation.
 */
public class FontsetClass extends Struct {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "PangoFontsetClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("get_font"),
            Interop.valueLayout.ADDRESS.withName("get_metrics"),
            Interop.valueLayout.ADDRESS.withName("get_language"),
            Interop.valueLayout.ADDRESS.withName("foreach"),
            Interop.valueLayout.ADDRESS.withName("_pango_reserved1"),
            Interop.valueLayout.ADDRESS.withName("_pango_reserved2"),
            Interop.valueLayout.ADDRESS.withName("_pango_reserved3"),
            Interop.valueLayout.ADDRESS.withName("_pango_reserved4")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link FontsetClass}
     * @return A new, uninitialized @{link FontsetClass}
     */
    public static FontsetClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        FontsetClass newInstance = new FontsetClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gobject.ObjectClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gtk.gobject.ObjectClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gtk.gobject.ObjectClass parentClass) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
    }
    
    @FunctionalInterface
    public interface GetFontCallback {
        org.pango.Font run(org.pango.Fontset fontset, int wc);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress fontset, int wc) {
            var RESULT = run((org.pango.Fontset) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(fontset)), org.pango.Fontset.fromAddress).marshal(fontset, Ownership.NONE), wc);
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetFontCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_font}
     * @param getFont The new value of the field {@code get_font}
     */
    public void setGetFont(GetFontCallback getFont) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_font"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getFont == null ? MemoryAddress.NULL : getFont.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetMetricsCallback {
        org.pango.FontMetrics run(org.pango.Fontset fontset);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress fontset) {
            var RESULT = run((org.pango.Fontset) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(fontset)), org.pango.Fontset.fromAddress).marshal(fontset, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetMetricsCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_metrics}
     * @param getMetrics The new value of the field {@code get_metrics}
     */
    public void setGetMetrics(GetMetricsCallback getMetrics) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_metrics"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getMetrics == null ? MemoryAddress.NULL : getMetrics.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetLanguageCallback {
        org.pango.Language run(org.pango.Fontset fontset);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress fontset) {
            var RESULT = run((org.pango.Fontset) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(fontset)), org.pango.Fontset.fromAddress).marshal(fontset, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetLanguageCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_language}
     * @param getLanguage The new value of the field {@code get_language}
     */
    public void setGetLanguage(GetLanguageCallback getLanguage) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_language"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getLanguage == null ? MemoryAddress.NULL : getLanguage.toCallback()));
    }
    
    @FunctionalInterface
    public interface ForeachCallback {
        void run(org.pango.Fontset fontset, org.pango.FontsetForeachFunc func);

        @ApiStatus.Internal default void upcall(MemoryAddress fontset, MemoryAddress func, MemoryAddress data) {
            run((org.pango.Fontset) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(fontset)), org.pango.Fontset.fromAddress).marshal(fontset, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ForeachCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code foreach}
     * @param foreach The new value of the field {@code foreach}
     */
    public void setForeach(ForeachCallback foreach) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("foreach"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (foreach == null ? MemoryAddress.NULL : foreach.toCallback()));
    }
    
    @FunctionalInterface
    public interface PangoReserved1Callback {
        void run();

        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PangoReserved1Callback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _pango_reserved1}
     * @param PangoReserved1 The new value of the field {@code _pango_reserved1}
     */
    public void setPangoReserved1(PangoReserved1Callback PangoReserved1) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("_pango_reserved1"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (PangoReserved1 == null ? MemoryAddress.NULL : PangoReserved1.toCallback()));
    }
    
    @FunctionalInterface
    public interface PangoReserved2Callback {
        void run();

        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PangoReserved2Callback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _pango_reserved2}
     * @param PangoReserved2 The new value of the field {@code _pango_reserved2}
     */
    public void setPangoReserved2(PangoReserved2Callback PangoReserved2) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("_pango_reserved2"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (PangoReserved2 == null ? MemoryAddress.NULL : PangoReserved2.toCallback()));
    }
    
    @FunctionalInterface
    public interface PangoReserved3Callback {
        void run();

        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PangoReserved3Callback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _pango_reserved3}
     * @param PangoReserved3 The new value of the field {@code _pango_reserved3}
     */
    public void setPangoReserved3(PangoReserved3Callback PangoReserved3) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("_pango_reserved3"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (PangoReserved3 == null ? MemoryAddress.NULL : PangoReserved3.toCallback()));
    }
    
    @FunctionalInterface
    public interface PangoReserved4Callback {
        void run();

        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PangoReserved4Callback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _pango_reserved4}
     * @param PangoReserved4 The new value of the field {@code _pango_reserved4}
     */
    public void setPangoReserved4(PangoReserved4Callback PangoReserved4) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("_pango_reserved4"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (PangoReserved4 == null ? MemoryAddress.NULL : PangoReserved4.toCallback()));
    }
    
    /**
     * Create a FontsetClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected FontsetClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, FontsetClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new FontsetClass(input, ownership);
    
    /**
     * A {@link FontsetClass.Builder} object constructs a {@link FontsetClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link FontsetClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final FontsetClass struct;
        
        private Builder() {
            struct = FontsetClass.allocate();
        }
        
         /**
         * Finish building the {@link FontsetClass} struct.
         * @return A new instance of {@code FontsetClass} with the fields 
         *         that were set in the Builder object.
         */
        public FontsetClass build() {
            return struct;
        }
        
        /**
         * parent {@code GObjectClass}
         * @param parentClass The value for the {@code parentClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParentClass(org.gtk.gobject.ObjectClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setGetFont(GetFontCallback getFont) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_font"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getFont == null ? MemoryAddress.NULL : getFont.toCallback()));
            return this;
        }
        
        public Builder setGetMetrics(GetMetricsCallback getMetrics) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_metrics"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getMetrics == null ? MemoryAddress.NULL : getMetrics.toCallback()));
            return this;
        }
        
        public Builder setGetLanguage(GetLanguageCallback getLanguage) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_language"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getLanguage == null ? MemoryAddress.NULL : getLanguage.toCallback()));
            return this;
        }
        
        public Builder setForeach(ForeachCallback foreach) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("foreach"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (foreach == null ? MemoryAddress.NULL : foreach.toCallback()));
            return this;
        }
        
        public Builder setPangoReserved1(PangoReserved1Callback PangoReserved1) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_pango_reserved1"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (PangoReserved1 == null ? MemoryAddress.NULL : PangoReserved1.toCallback()));
            return this;
        }
        
        public Builder setPangoReserved2(PangoReserved2Callback PangoReserved2) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_pango_reserved2"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (PangoReserved2 == null ? MemoryAddress.NULL : PangoReserved2.toCallback()));
            return this;
        }
        
        public Builder setPangoReserved3(PangoReserved3Callback PangoReserved3) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_pango_reserved3"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (PangoReserved3 == null ? MemoryAddress.NULL : PangoReserved3.toCallback()));
            return this;
        }
        
        public Builder setPangoReserved4(PangoReserved4Callback PangoReserved4) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_pango_reserved4"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (PangoReserved4 == null ? MemoryAddress.NULL : PangoReserved4.toCallback()));
            return this;
        }
    }
}
