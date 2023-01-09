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
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        RendererClass newInstance = new RendererClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Functional interface declaration of the {@code DrawGlyphsCallback} callback.
     */
    @FunctionalInterface
    public interface DrawGlyphsCallback {
    
        void run(org.pango.Renderer renderer, org.pango.Font font, org.pango.GlyphString glyphs, int x, int y);
        
        @ApiStatus.Internal default void upcall(MemoryAddress renderer, MemoryAddress font, MemoryAddress glyphs, int x, int y) {
            run((org.pango.Renderer) Interop.register(renderer, org.pango.Renderer.fromAddress).marshal(renderer, null), (org.pango.Font) Interop.register(font, org.pango.Font.fromAddress).marshal(font, null), org.pango.GlyphString.fromAddress.marshal(glyphs, null), x, y);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DrawGlyphsCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code draw_glyphs}
     * @param drawGlyphs The new value of the field {@code draw_glyphs}
     */
    public void setDrawGlyphs(DrawGlyphsCallback drawGlyphs) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("draw_glyphs"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (drawGlyphs == null ? MemoryAddress.NULL : drawGlyphs.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code DrawRectangleCallback} callback.
     */
    @FunctionalInterface
    public interface DrawRectangleCallback {
    
        void run(org.pango.Renderer renderer, org.pango.RenderPart part, int x, int y, int width, int height);
        
        @ApiStatus.Internal default void upcall(MemoryAddress renderer, int part, int x, int y, int width, int height) {
            run((org.pango.Renderer) Interop.register(renderer, org.pango.Renderer.fromAddress).marshal(renderer, null), org.pango.RenderPart.of(part), x, y, width, height);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DrawRectangleCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code draw_rectangle}
     * @param drawRectangle The new value of the field {@code draw_rectangle}
     */
    public void setDrawRectangle(DrawRectangleCallback drawRectangle) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("draw_rectangle"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (drawRectangle == null ? MemoryAddress.NULL : drawRectangle.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code DrawErrorUnderlineCallback} callback.
     */
    @FunctionalInterface
    public interface DrawErrorUnderlineCallback {
    
        void run(org.pango.Renderer renderer, int x, int y, int width, int height);
        
        @ApiStatus.Internal default void upcall(MemoryAddress renderer, int x, int y, int width, int height) {
            run((org.pango.Renderer) Interop.register(renderer, org.pango.Renderer.fromAddress).marshal(renderer, null), x, y, width, height);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DrawErrorUnderlineCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code draw_error_underline}
     * @param drawErrorUnderline The new value of the field {@code draw_error_underline}
     */
    public void setDrawErrorUnderline(DrawErrorUnderlineCallback drawErrorUnderline) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("draw_error_underline"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (drawErrorUnderline == null ? MemoryAddress.NULL : drawErrorUnderline.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code DrawShapeCallback} callback.
     */
    @FunctionalInterface
    public interface DrawShapeCallback {
    
        void run(org.pango.Renderer renderer, org.pango.AttrShape attr, int x, int y);
        
        @ApiStatus.Internal default void upcall(MemoryAddress renderer, MemoryAddress attr, int x, int y) {
            run((org.pango.Renderer) Interop.register(renderer, org.pango.Renderer.fromAddress).marshal(renderer, null), org.pango.AttrShape.fromAddress.marshal(attr, null), x, y);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DrawShapeCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code draw_shape}
     * @param drawShape The new value of the field {@code draw_shape}
     */
    public void setDrawShape(DrawShapeCallback drawShape) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("draw_shape"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (drawShape == null ? MemoryAddress.NULL : drawShape.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code DrawTrapezoidCallback} callback.
     */
    @FunctionalInterface
    public interface DrawTrapezoidCallback {
    
        void run(org.pango.Renderer renderer, org.pango.RenderPart part, double y1, double x11, double x21, double y2, double x12, double x22);
        
        @ApiStatus.Internal default void upcall(MemoryAddress renderer, int part, double y1, double x11, double x21, double y2, double x12, double x22) {
            run((org.pango.Renderer) Interop.register(renderer, org.pango.Renderer.fromAddress).marshal(renderer, null), org.pango.RenderPart.of(part), y1, x11, x21, y2, x12, x22);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DrawTrapezoidCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code draw_trapezoid}
     * @param drawTrapezoid The new value of the field {@code draw_trapezoid}
     */
    public void setDrawTrapezoid(DrawTrapezoidCallback drawTrapezoid) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("draw_trapezoid"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (drawTrapezoid == null ? MemoryAddress.NULL : drawTrapezoid.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code DrawGlyphCallback} callback.
     */
    @FunctionalInterface
    public interface DrawGlyphCallback {
    
        void run(org.pango.Renderer renderer, org.pango.Font font, org.pango.Glyph glyph, double x, double y);
        
        @ApiStatus.Internal default void upcall(MemoryAddress renderer, MemoryAddress font, int glyph, double x, double y) {
            run((org.pango.Renderer) Interop.register(renderer, org.pango.Renderer.fromAddress).marshal(renderer, null), (org.pango.Font) Interop.register(font, org.pango.Font.fromAddress).marshal(font, null), new org.pango.Glyph(glyph), x, y);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DrawGlyphCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code draw_glyph}
     * @param drawGlyph The new value of the field {@code draw_glyph}
     */
    public void setDrawGlyph(DrawGlyphCallback drawGlyph) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("draw_glyph"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (drawGlyph == null ? MemoryAddress.NULL : drawGlyph.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code PartChangedCallback} callback.
     */
    @FunctionalInterface
    public interface PartChangedCallback {
    
        void run(org.pango.Renderer renderer, org.pango.RenderPart part);
        
        @ApiStatus.Internal default void upcall(MemoryAddress renderer, int part) {
            run((org.pango.Renderer) Interop.register(renderer, org.pango.Renderer.fromAddress).marshal(renderer, null), org.pango.RenderPart.of(part));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PartChangedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code part_changed}
     * @param partChanged The new value of the field {@code part_changed}
     */
    public void setPartChanged(PartChangedCallback partChanged) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("part_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (partChanged == null ? MemoryAddress.NULL : partChanged.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code BeginCallback} callback.
     */
    @FunctionalInterface
    public interface BeginCallback {
    
        void run(org.pango.Renderer renderer);
        
        @ApiStatus.Internal default void upcall(MemoryAddress renderer) {
            run((org.pango.Renderer) Interop.register(renderer, org.pango.Renderer.fromAddress).marshal(renderer, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), BeginCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code begin}
     * @param begin The new value of the field {@code begin}
     */
    public void setBegin(BeginCallback begin) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("begin"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (begin == null ? MemoryAddress.NULL : begin.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code EndCallback} callback.
     */
    @FunctionalInterface
    public interface EndCallback {
    
        void run(org.pango.Renderer renderer);
        
        @ApiStatus.Internal default void upcall(MemoryAddress renderer) {
            run((org.pango.Renderer) Interop.register(renderer, org.pango.Renderer.fromAddress).marshal(renderer, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), EndCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code end}
     * @param end The new value of the field {@code end}
     */
    public void setEnd(EndCallback end) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("end"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (end == null ? MemoryAddress.NULL : end.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code PrepareRunCallback} callback.
     */
    @FunctionalInterface
    public interface PrepareRunCallback {
    
        void run(org.pango.Renderer renderer, org.pango.LayoutRun run);
        
        @ApiStatus.Internal default void upcall(MemoryAddress renderer, MemoryAddress run) {
            run((org.pango.Renderer) Interop.register(renderer, org.pango.Renderer.fromAddress).marshal(renderer, null), (org.pango.LayoutRun) Interop.register(run, org.pango.LayoutRun.fromAddress).marshal(run, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PrepareRunCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code prepare_run}
     * @param prepareRun The new value of the field {@code prepare_run}
     */
    public void setPrepareRun(PrepareRunCallback prepareRun) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("prepare_run"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (prepareRun == null ? MemoryAddress.NULL : prepareRun.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code DrawGlyphItemCallback} callback.
     */
    @FunctionalInterface
    public interface DrawGlyphItemCallback {
    
        void run(org.pango.Renderer renderer, @Nullable java.lang.String text, org.pango.GlyphItem glyphItem, int x, int y);
        
        @ApiStatus.Internal default void upcall(MemoryAddress renderer, MemoryAddress text, MemoryAddress glyphItem, int x, int y) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run((org.pango.Renderer) Interop.register(renderer, org.pango.Renderer.fromAddress).marshal(renderer, null), Marshal.addressToString.marshal(text, null), org.pango.GlyphItem.fromAddress.marshal(glyphItem, null), x, y);
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DrawGlyphItemCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code draw_glyph_item}
     * @param drawGlyphItem The new value of the field {@code draw_glyph_item}
     */
    public void setDrawGlyphItem(DrawGlyphItemCallback drawGlyphItem) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("draw_glyph_item"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (drawGlyphItem == null ? MemoryAddress.NULL : drawGlyphItem.toCallback()));
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
     * Create a RendererClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected RendererClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, RendererClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new RendererClass(input);
    
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
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
                return this;
            }
        }
        
        public Builder setDrawGlyphs(DrawGlyphsCallback drawGlyphs) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("draw_glyphs"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (drawGlyphs == null ? MemoryAddress.NULL : drawGlyphs.toCallback()));
                return this;
            }
        }
        
        public Builder setDrawRectangle(DrawRectangleCallback drawRectangle) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("draw_rectangle"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (drawRectangle == null ? MemoryAddress.NULL : drawRectangle.toCallback()));
                return this;
            }
        }
        
        public Builder setDrawErrorUnderline(DrawErrorUnderlineCallback drawErrorUnderline) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("draw_error_underline"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (drawErrorUnderline == null ? MemoryAddress.NULL : drawErrorUnderline.toCallback()));
                return this;
            }
        }
        
        public Builder setDrawShape(DrawShapeCallback drawShape) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("draw_shape"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (drawShape == null ? MemoryAddress.NULL : drawShape.toCallback()));
                return this;
            }
        }
        
        public Builder setDrawTrapezoid(DrawTrapezoidCallback drawTrapezoid) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("draw_trapezoid"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (drawTrapezoid == null ? MemoryAddress.NULL : drawTrapezoid.toCallback()));
                return this;
            }
        }
        
        public Builder setDrawGlyph(DrawGlyphCallback drawGlyph) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("draw_glyph"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (drawGlyph == null ? MemoryAddress.NULL : drawGlyph.toCallback()));
                return this;
            }
        }
        
        public Builder setPartChanged(PartChangedCallback partChanged) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("part_changed"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (partChanged == null ? MemoryAddress.NULL : partChanged.toCallback()));
                return this;
            }
        }
        
        public Builder setBegin(BeginCallback begin) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("begin"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (begin == null ? MemoryAddress.NULL : begin.toCallback()));
                return this;
            }
        }
        
        public Builder setEnd(EndCallback end) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("end"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (end == null ? MemoryAddress.NULL : end.toCallback()));
                return this;
            }
        }
        
        public Builder setPrepareRun(PrepareRunCallback prepareRun) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("prepare_run"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (prepareRun == null ? MemoryAddress.NULL : prepareRun.toCallback()));
                return this;
            }
        }
        
        public Builder setDrawGlyphItem(DrawGlyphItemCallback drawGlyphItem) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("draw_glyph_item"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (drawGlyphItem == null ? MemoryAddress.NULL : drawGlyphItem.toCallback()));
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
