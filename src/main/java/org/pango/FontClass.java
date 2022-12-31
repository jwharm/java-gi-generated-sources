package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class FontClass extends Struct {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "PangoFontClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("describe"),
            Interop.valueLayout.ADDRESS.withName("get_coverage"),
            Interop.valueLayout.ADDRESS.withName("get_glyph_extents"),
            Interop.valueLayout.ADDRESS.withName("get_metrics"),
            Interop.valueLayout.ADDRESS.withName("get_font_map"),
            Interop.valueLayout.ADDRESS.withName("describe_absolute"),
            Interop.valueLayout.ADDRESS.withName("get_features"),
            Interop.valueLayout.ADDRESS.withName("create_hb_font")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link FontClass}
     * @return A new, uninitialized @{link FontClass}
     */
    public static FontClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        FontClass newInstance = new FontClass(segment.address(), Ownership.NONE);
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
    public interface DescribeCallback {
        org.pango.FontDescription run(org.pango.Font font);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress font) {
            var RESULT = run((org.pango.Font) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(font)), org.pango.Font.fromAddress).marshal(font, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DescribeCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code describe}
     * @param describe The new value of the field {@code describe}
     */
    public void setDescribe(DescribeCallback describe) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("describe"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (describe == null ? MemoryAddress.NULL : describe.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetCoverageCallback {
        org.pango.Coverage run(org.pango.Font font, org.pango.Language language);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress font, MemoryAddress language) {
            var RESULT = run((org.pango.Font) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(font)), org.pango.Font.fromAddress).marshal(font, Ownership.NONE), org.pango.Language.fromAddress.marshal(language, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetCoverageCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_coverage}
     * @param getCoverage The new value of the field {@code get_coverage}
     */
    public void setGetCoverage(GetCoverageCallback getCoverage) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_coverage"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getCoverage == null ? MemoryAddress.NULL : getCoverage.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetGlyphExtentsCallback {
        void run(@Nullable org.pango.Font font, org.pango.Glyph glyph, @Nullable org.pango.Rectangle inkRect, @Nullable org.pango.Rectangle logicalRect);

        @ApiStatus.Internal default void upcall(MemoryAddress font, int glyph, MemoryAddress inkRect, MemoryAddress logicalRect) {
            run((org.pango.Font) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(font)), org.pango.Font.fromAddress).marshal(font, Ownership.NONE), new org.pango.Glyph(glyph), org.pango.Rectangle.fromAddress.marshal(inkRect, Ownership.NONE), org.pango.Rectangle.fromAddress.marshal(logicalRect, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetGlyphExtentsCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_glyph_extents}
     * @param getGlyphExtents The new value of the field {@code get_glyph_extents}
     */
    public void setGetGlyphExtents(GetGlyphExtentsCallback getGlyphExtents) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_glyph_extents"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getGlyphExtents == null ? MemoryAddress.NULL : getGlyphExtents.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetMetricsCallback {
        org.pango.FontMetrics run(@Nullable org.pango.Font font, @Nullable org.pango.Language language);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress font, MemoryAddress language) {
            var RESULT = run((org.pango.Font) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(font)), org.pango.Font.fromAddress).marshal(font, Ownership.NONE), org.pango.Language.fromAddress.marshal(language, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
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
    public interface GetFontMapCallback {
        @Nullable org.pango.FontMap run(@Nullable org.pango.Font font);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress font) {
            var RESULT = run((org.pango.Font) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(font)), org.pango.Font.fromAddress).marshal(font, Ownership.NONE));
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
    
    @FunctionalInterface
    public interface DescribeAbsoluteCallback {
        org.pango.FontDescription run(org.pango.Font font);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress font) {
            var RESULT = run((org.pango.Font) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(font)), org.pango.Font.fromAddress).marshal(font, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DescribeAbsoluteCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code describe_absolute}
     * @param describeAbsolute The new value of the field {@code describe_absolute}
     */
    public void setDescribeAbsolute(DescribeAbsoluteCallback describeAbsolute) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("describe_absolute"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (describeAbsolute == null ? MemoryAddress.NULL : describeAbsolute.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetFeaturesCallback {
        void run(org.pango.Font font, Out<org.harfbuzz.FeatureT[]> features, int len, Out<Integer> numFeatures);

        @ApiStatus.Internal default void upcall(MemoryAddress font, MemoryAddress features, int len, MemoryAddress numFeatures) {
            Out<Integer> numFeaturesOUT = new Out<>(numFeatures.get(Interop.valueLayout.C_INT, 0));
            Out<org.harfbuzz.FeatureT[]> featuresOUT = new Out<>(new PointerProxy<org.harfbuzz.FeatureT>(features, org.harfbuzz.FeatureT.fromAddress).toArray((int) len, org.harfbuzz.FeatureT.class));
            run((org.pango.Font) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(font)), org.pango.Font.fromAddress).marshal(font, Ownership.NONE), featuresOUT, len, numFeaturesOUT);
            numFeatures.set(Interop.valueLayout.C_INT, 0, numFeaturesOUT.get());
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetFeaturesCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_features}
     * @param getFeatures The new value of the field {@code get_features}
     */
    public void setGetFeatures(GetFeaturesCallback getFeatures) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_features"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getFeatures == null ? MemoryAddress.NULL : getFeatures.toCallback()));
    }
    
    @FunctionalInterface
    public interface CreateHbFontCallback {
        org.harfbuzz.FontT run(org.pango.Font font);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress font) {
            var RESULT = run((org.pango.Font) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(font)), org.pango.Font.fromAddress).marshal(font, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CreateHbFontCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code create_hb_font}
     * @param createHbFont The new value of the field {@code create_hb_font}
     */
    public void setCreateHbFont(CreateHbFontCallback createHbFont) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("create_hb_font"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (createHbFont == null ? MemoryAddress.NULL : createHbFont.toCallback()));
    }
    
    /**
     * Create a FontClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected FontClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, FontClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new FontClass(input, ownership);
    
    /**
     * A {@link FontClass.Builder} object constructs a {@link FontClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link FontClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final FontClass struct;
        
        private Builder() {
            struct = FontClass.allocate();
        }
        
         /**
         * Finish building the {@link FontClass} struct.
         * @return A new instance of {@code FontClass} with the fields 
         *         that were set in the Builder object.
         */
        public FontClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gtk.gobject.ObjectClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setDescribe(DescribeCallback describe) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("describe"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (describe == null ? MemoryAddress.NULL : describe.toCallback()));
            return this;
        }
        
        public Builder setGetCoverage(GetCoverageCallback getCoverage) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_coverage"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getCoverage == null ? MemoryAddress.NULL : getCoverage.toCallback()));
            return this;
        }
        
        public Builder setGetGlyphExtents(GetGlyphExtentsCallback getGlyphExtents) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_glyph_extents"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getGlyphExtents == null ? MemoryAddress.NULL : getGlyphExtents.toCallback()));
            return this;
        }
        
        public Builder setGetMetrics(GetMetricsCallback getMetrics) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_metrics"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getMetrics == null ? MemoryAddress.NULL : getMetrics.toCallback()));
            return this;
        }
        
        public Builder setGetFontMap(GetFontMapCallback getFontMap) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_font_map"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getFontMap == null ? MemoryAddress.NULL : getFontMap.toCallback()));
            return this;
        }
        
        public Builder setDescribeAbsolute(DescribeAbsoluteCallback describeAbsolute) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("describe_absolute"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (describeAbsolute == null ? MemoryAddress.NULL : describeAbsolute.toCallback()));
            return this;
        }
        
        public Builder setGetFeatures(GetFeaturesCallback getFeatures) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_features"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getFeatures == null ? MemoryAddress.NULL : getFeatures.toCallback()));
            return this;
        }
        
        public Builder setCreateHbFont(CreateHbFontCallback createHbFont) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_hb_font"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (createHbFont == null ? MemoryAddress.NULL : createHbFont.toCallback()));
            return this;
        }
    }
}
