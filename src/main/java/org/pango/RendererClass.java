package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Class structure for {@code PangoRenderer}.
 * <p>
 * The following vfuncs take user space coordinates in Pango units
 * and have default implementations:
 * <ul>
 * <li>draw_glyphs
 * <li>draw_rectangle
 * <li>draw_error_underline
 * <li>draw_shape
 * <li>draw_glyph_item
 * </ul>
 * <p>
 * The default draw_shape implementation draws nothing.
 * <p>
 * The following vfuncs take device space coordinates as doubles
 * and must be implemented:
 * <ul>
 * <li>draw_trapezoid
 * <li>draw_glyph
 * </ul>
 * @version 1.8
 */
public class RendererClass extends Struct {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "PangoRendererClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("draw_glyphs"),
            Interop.valueLayout.ADDRESS.withName("draw_rectangle"),
            Interop.valueLayout.ADDRESS.withName("draw_error_underline"),
            Interop.valueLayout.ADDRESS.withName("draw_shape"),
            Interop.valueLayout.ADDRESS.withName("draw_trapezoid"),
            Interop.valueLayout.ADDRESS.withName("draw_glyph"),
            Interop.valueLayout.ADDRESS.withName("part_changed"),
            Interop.valueLayout.ADDRESS.withName("begin"),
            Interop.valueLayout.ADDRESS.withName("end"),
            Interop.valueLayout.ADDRESS.withName("prepare_run"),
            Interop.valueLayout.ADDRESS.withName("draw_glyph_item"),
            Interop.valueLayout.ADDRESS.withName("_pango_reserved2"),
            Interop.valueLayout.ADDRESS.withName("_pango_reserved3"),
            Interop.valueLayout.ADDRESS.withName("_pango_reserved4")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link RendererClass}
     * @return A new, uninitialized @{link RendererClass}
     */
    public static RendererClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        RendererClass newInstance = new RendererClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @FunctionalInterface
    public interface DrawGlyphsCallback {
        void run(org.pango.Renderer renderer, org.pango.Font font, org.pango.GlyphString glyphs, int x, int y);

        @ApiStatus.Internal default void upcall(MemoryAddress renderer, MemoryAddress font, MemoryAddress glyphs, int x, int y) {
            run((org.pango.Renderer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(renderer)), org.pango.Renderer.fromAddress).marshal(renderer, Ownership.NONE), (org.pango.Font) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(font)), org.pango.Font.fromAddress).marshal(font, Ownership.NONE), org.pango.GlyphString.fromAddress.marshal(glyphs, Ownership.NONE), x, y);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DrawGlyphsCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code draw_glyphs}
     * @param drawGlyphs The new value of the field {@code draw_glyphs}
     */
    public void setDrawGlyphs(DrawGlyphsCallback drawGlyphs) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("draw_glyphs"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (drawGlyphs == null ? MemoryAddress.NULL : drawGlyphs.toCallback()));
    }
    
    @FunctionalInterface
    public interface DrawRectangleCallback {
        void run(org.pango.Renderer renderer, org.pango.RenderPart part, int x, int y, int width, int height);

        @ApiStatus.Internal default void upcall(MemoryAddress renderer, int part, int x, int y, int width, int height) {
            run((org.pango.Renderer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(renderer)), org.pango.Renderer.fromAddress).marshal(renderer, Ownership.NONE), org.pango.RenderPart.of(part), x, y, width, height);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DrawRectangleCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code draw_rectangle}
     * @param drawRectangle The new value of the field {@code draw_rectangle}
     */
    public void setDrawRectangle(DrawRectangleCallback drawRectangle) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("draw_rectangle"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (drawRectangle == null ? MemoryAddress.NULL : drawRectangle.toCallback()));
    }
    
    @FunctionalInterface
    public interface DrawErrorUnderlineCallback {
        void run(org.pango.Renderer renderer, int x, int y, int width, int height);

        @ApiStatus.Internal default void upcall(MemoryAddress renderer, int x, int y, int width, int height) {
            run((org.pango.Renderer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(renderer)), org.pango.Renderer.fromAddress).marshal(renderer, Ownership.NONE), x, y, width, height);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DrawErrorUnderlineCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code draw_error_underline}
     * @param drawErrorUnderline The new value of the field {@code draw_error_underline}
     */
    public void setDrawErrorUnderline(DrawErrorUnderlineCallback drawErrorUnderline) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("draw_error_underline"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (drawErrorUnderline == null ? MemoryAddress.NULL : drawErrorUnderline.toCallback()));
    }
    
    @FunctionalInterface
    public interface DrawShapeCallback {
        void run(org.pango.Renderer renderer, org.pango.AttrShape attr, int x, int y);

        @ApiStatus.Internal default void upcall(MemoryAddress renderer, MemoryAddress attr, int x, int y) {
            run((org.pango.Renderer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(renderer)), org.pango.Renderer.fromAddress).marshal(renderer, Ownership.NONE), org.pango.AttrShape.fromAddress.marshal(attr, Ownership.NONE), x, y);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DrawShapeCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code draw_shape}
     * @param drawShape The new value of the field {@code draw_shape}
     */
    public void setDrawShape(DrawShapeCallback drawShape) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("draw_shape"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (drawShape == null ? MemoryAddress.NULL : drawShape.toCallback()));
    }
    
    @FunctionalInterface
    public interface DrawTrapezoidCallback {
        void run(org.pango.Renderer renderer, org.pango.RenderPart part, double y1, double x11, double x21, double y2, double x12, double x22);

        @ApiStatus.Internal default void upcall(MemoryAddress renderer, int part, double y1, double x11, double x21, double y2, double x12, double x22) {
            run((org.pango.Renderer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(renderer)), org.pango.Renderer.fromAddress).marshal(renderer, Ownership.NONE), org.pango.RenderPart.of(part), y1, x11, x21, y2, x12, x22);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DrawTrapezoidCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code draw_trapezoid}
     * @param drawTrapezoid The new value of the field {@code draw_trapezoid}
     */
    public void setDrawTrapezoid(DrawTrapezoidCallback drawTrapezoid) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("draw_trapezoid"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (drawTrapezoid == null ? MemoryAddress.NULL : drawTrapezoid.toCallback()));
    }
    
    @FunctionalInterface
    public interface DrawGlyphCallback {
        void run(org.pango.Renderer renderer, org.pango.Font font, org.pango.Glyph glyph, double x, double y);

        @ApiStatus.Internal default void upcall(MemoryAddress renderer, MemoryAddress font, int glyph, double x, double y) {
            run((org.pango.Renderer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(renderer)), org.pango.Renderer.fromAddress).marshal(renderer, Ownership.NONE), (org.pango.Font) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(font)), org.pango.Font.fromAddress).marshal(font, Ownership.NONE), new org.pango.Glyph(glyph), x, y);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DrawGlyphCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code draw_glyph}
     * @param drawGlyph The new value of the field {@code draw_glyph}
     */
    public void setDrawGlyph(DrawGlyphCallback drawGlyph) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("draw_glyph"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (drawGlyph == null ? MemoryAddress.NULL : drawGlyph.toCallback()));
    }
    
    @FunctionalInterface
    public interface PartChangedCallback {
        void run(org.pango.Renderer renderer, org.pango.RenderPart part);

        @ApiStatus.Internal default void upcall(MemoryAddress renderer, int part) {
            run((org.pango.Renderer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(renderer)), org.pango.Renderer.fromAddress).marshal(renderer, Ownership.NONE), org.pango.RenderPart.of(part));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PartChangedCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code part_changed}
     * @param partChanged The new value of the field {@code part_changed}
     */
    public void setPartChanged(PartChangedCallback partChanged) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("part_changed"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (partChanged == null ? MemoryAddress.NULL : partChanged.toCallback()));
    }
    
    @FunctionalInterface
    public interface BeginCallback {
        void run(org.pango.Renderer renderer);

        @ApiStatus.Internal default void upcall(MemoryAddress renderer) {
            run((org.pango.Renderer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(renderer)), org.pango.Renderer.fromAddress).marshal(renderer, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(BeginCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code begin}
     * @param begin The new value of the field {@code begin}
     */
    public void setBegin(BeginCallback begin) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("begin"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (begin == null ? MemoryAddress.NULL : begin.toCallback()));
    }
    
    @FunctionalInterface
    public interface EndCallback {
        void run(org.pango.Renderer renderer);

        @ApiStatus.Internal default void upcall(MemoryAddress renderer) {
            run((org.pango.Renderer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(renderer)), org.pango.Renderer.fromAddress).marshal(renderer, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(EndCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code end}
     * @param end The new value of the field {@code end}
     */
    public void setEnd(EndCallback end) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("end"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (end == null ? MemoryAddress.NULL : end.toCallback()));
    }
    
    @FunctionalInterface
    public interface PrepareRunCallback {
        void run(org.pango.Renderer renderer, org.pango.LayoutRun run);

        @ApiStatus.Internal default void upcall(MemoryAddress renderer, MemoryAddress run) {
            run((org.pango.Renderer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(renderer)), org.pango.Renderer.fromAddress).marshal(renderer, Ownership.NONE), (org.pango.LayoutRun) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(run)), org.pango.LayoutRun.fromAddress).marshal(run, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PrepareRunCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code prepare_run}
     * @param prepareRun The new value of the field {@code prepare_run}
     */
    public void setPrepareRun(PrepareRunCallback prepareRun) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("prepare_run"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (prepareRun == null ? MemoryAddress.NULL : prepareRun.toCallback()));
    }
    
    @FunctionalInterface
    public interface DrawGlyphItemCallback {
        void run(org.pango.Renderer renderer, @Nullable java.lang.String text, org.pango.GlyphItem glyphItem, int x, int y);

        @ApiStatus.Internal default void upcall(MemoryAddress renderer, MemoryAddress text, MemoryAddress glyphItem, int x, int y) {
            run((org.pango.Renderer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(renderer)), org.pango.Renderer.fromAddress).marshal(renderer, Ownership.NONE), Marshal.addressToString.marshal(text, null), org.pango.GlyphItem.fromAddress.marshal(glyphItem, Ownership.NONE), x, y);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DrawGlyphItemCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code draw_glyph_item}
     * @param drawGlyphItem The new value of the field {@code draw_glyph_item}
     */
    public void setDrawGlyphItem(DrawGlyphItemCallback drawGlyphItem) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("draw_glyph_item"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (drawGlyphItem == null ? MemoryAddress.NULL : drawGlyphItem.toCallback()));
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
     * Create a RendererClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected RendererClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, RendererClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new RendererClass(input, ownership);
    
    /**
     * A {@link RendererClass.Builder} object constructs a {@link RendererClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link RendererClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final RendererClass struct;
        
        private Builder() {
            struct = RendererClass.allocate();
        }
        
         /**
         * Finish building the {@link RendererClass} struct.
         * @return A new instance of {@code RendererClass} with the fields 
         *         that were set in the Builder object.
         */
        public RendererClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gtk.gobject.ObjectClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setDrawGlyphs(DrawGlyphsCallback drawGlyphs) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("draw_glyphs"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (drawGlyphs == null ? MemoryAddress.NULL : drawGlyphs.toCallback()));
            return this;
        }
        
        public Builder setDrawRectangle(DrawRectangleCallback drawRectangle) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("draw_rectangle"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (drawRectangle == null ? MemoryAddress.NULL : drawRectangle.toCallback()));
            return this;
        }
        
        public Builder setDrawErrorUnderline(DrawErrorUnderlineCallback drawErrorUnderline) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("draw_error_underline"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (drawErrorUnderline == null ? MemoryAddress.NULL : drawErrorUnderline.toCallback()));
            return this;
        }
        
        public Builder setDrawShape(DrawShapeCallback drawShape) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("draw_shape"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (drawShape == null ? MemoryAddress.NULL : drawShape.toCallback()));
            return this;
        }
        
        public Builder setDrawTrapezoid(DrawTrapezoidCallback drawTrapezoid) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("draw_trapezoid"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (drawTrapezoid == null ? MemoryAddress.NULL : drawTrapezoid.toCallback()));
            return this;
        }
        
        public Builder setDrawGlyph(DrawGlyphCallback drawGlyph) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("draw_glyph"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (drawGlyph == null ? MemoryAddress.NULL : drawGlyph.toCallback()));
            return this;
        }
        
        public Builder setPartChanged(PartChangedCallback partChanged) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("part_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (partChanged == null ? MemoryAddress.NULL : partChanged.toCallback()));
            return this;
        }
        
        public Builder setBegin(BeginCallback begin) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("begin"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (begin == null ? MemoryAddress.NULL : begin.toCallback()));
            return this;
        }
        
        public Builder setEnd(EndCallback end) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("end"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (end == null ? MemoryAddress.NULL : end.toCallback()));
            return this;
        }
        
        public Builder setPrepareRun(PrepareRunCallback prepareRun) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("prepare_run"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (prepareRun == null ? MemoryAddress.NULL : prepareRun.toCallback()));
            return this;
        }
        
        public Builder setDrawGlyphItem(DrawGlyphItemCallback drawGlyphItem) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("draw_glyph_item"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (drawGlyphItem == null ? MemoryAddress.NULL : drawGlyphItem.toCallback()));
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
