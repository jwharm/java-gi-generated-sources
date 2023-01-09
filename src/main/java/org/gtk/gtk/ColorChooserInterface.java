package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class ColorChooserInterface extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkColorChooserInterface";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.TypeInterface.getMemoryLayout().withName("base_interface"),
            Interop.valueLayout.ADDRESS.withName("get_rgba"),
            Interop.valueLayout.ADDRESS.withName("set_rgba"),
            Interop.valueLayout.ADDRESS.withName("add_palette"),
            Interop.valueLayout.ADDRESS.withName("color_activated"),
            MemoryLayout.sequenceLayout(12, Interop.valueLayout.ADDRESS).withName("padding")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link ColorChooserInterface}
     * @return A new, uninitialized @{link ColorChooserInterface}
     */
    public static ColorChooserInterface allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        ColorChooserInterface newInstance = new ColorChooserInterface(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code base_interface}
     * @return The value of the field {@code base_interface}
     */
    public org.gtk.gobject.TypeInterface getBaseInterface() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("base_interface"));
        return org.gtk.gobject.TypeInterface.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code base_interface}
     * @param baseInterface The new value of the field {@code base_interface}
     */
    public void setBaseInterface(org.gtk.gobject.TypeInterface baseInterface) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("base_interface"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (baseInterface == null ? MemoryAddress.NULL : baseInterface.handle()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetRgbaCallback} callback.
     */
    @FunctionalInterface
    public interface GetRgbaCallback {
    
        void run(org.gtk.gtk.ColorChooser chooser, org.gtk.gdk.RGBA color);
        
        @ApiStatus.Internal default void upcall(MemoryAddress chooser, MemoryAddress color) {
            run((org.gtk.gtk.ColorChooser) Interop.register(chooser, org.gtk.gtk.ColorChooser.fromAddress).marshal(chooser, null), org.gtk.gdk.RGBA.fromAddress.marshal(color, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetRgbaCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_rgba}
     * @param getRgba The new value of the field {@code get_rgba}
     */
    public void setGetRgba(GetRgbaCallback getRgba) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_rgba"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getRgba == null ? MemoryAddress.NULL : getRgba.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SetRgbaCallback} callback.
     */
    @FunctionalInterface
    public interface SetRgbaCallback {
    
        void run(org.gtk.gtk.ColorChooser chooser, org.gtk.gdk.RGBA color);
        
        @ApiStatus.Internal default void upcall(MemoryAddress chooser, MemoryAddress color) {
            run((org.gtk.gtk.ColorChooser) Interop.register(chooser, org.gtk.gtk.ColorChooser.fromAddress).marshal(chooser, null), org.gtk.gdk.RGBA.fromAddress.marshal(color, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SetRgbaCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_rgba}
     * @param setRgba The new value of the field {@code set_rgba}
     */
    public void setSetRgba(SetRgbaCallback setRgba) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_rgba"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setRgba == null ? MemoryAddress.NULL : setRgba.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code AddPaletteCallback} callback.
     */
    @FunctionalInterface
    public interface AddPaletteCallback {
    
        void run(org.gtk.gtk.ColorChooser chooser, org.gtk.gtk.Orientation orientation, int colorsPerLine, int nColors, @Nullable org.gtk.gdk.RGBA[] colors);
        
        @ApiStatus.Internal default void upcall(MemoryAddress chooser, int orientation, int colorsPerLine, int nColors, MemoryAddress colors) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run((org.gtk.gtk.ColorChooser) Interop.register(chooser, org.gtk.gtk.ColorChooser.fromAddress).marshal(chooser, null), org.gtk.gtk.Orientation.of(orientation), colorsPerLine, nColors, new PointerProxy<org.gtk.gdk.RGBA>(colors, org.gtk.gdk.RGBA.fromAddress).toArray((int) nColors, org.gtk.gdk.RGBA.class));
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), AddPaletteCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code add_palette}
     * @param addPalette The new value of the field {@code add_palette}
     */
    public void setAddPalette(AddPaletteCallback addPalette) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("add_palette"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (addPalette == null ? MemoryAddress.NULL : addPalette.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ColorActivatedCallback} callback.
     */
    @FunctionalInterface
    public interface ColorActivatedCallback {
    
        void run(org.gtk.gtk.ColorChooser chooser, org.gtk.gdk.RGBA color);
        
        @ApiStatus.Internal default void upcall(MemoryAddress chooser, MemoryAddress color) {
            run((org.gtk.gtk.ColorChooser) Interop.register(chooser, org.gtk.gtk.ColorChooser.fromAddress).marshal(chooser, null), org.gtk.gdk.RGBA.fromAddress.marshal(color, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ColorActivatedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code color_activated}
     * @param colorActivated The new value of the field {@code color_activated}
     */
    public void setColorActivated(ColorActivatedCallback colorActivated) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("color_activated"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (colorActivated == null ? MemoryAddress.NULL : colorActivated.toCallback()));
        }
    }
    
    /**
     * Create a ColorChooserInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ColorChooserInterface(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ColorChooserInterface> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ColorChooserInterface(input);
    
    /**
     * A {@link ColorChooserInterface.Builder} object constructs a {@link ColorChooserInterface} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link ColorChooserInterface.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final ColorChooserInterface struct;
        
        private Builder() {
            struct = ColorChooserInterface.allocate();
        }
        
        /**
         * Finish building the {@link ColorChooserInterface} struct.
         * @return A new instance of {@code ColorChooserInterface} with the fields 
         *         that were set in the Builder object.
         */
        public ColorChooserInterface build() {
            return struct;
        }
        
        public Builder setBaseInterface(org.gtk.gobject.TypeInterface baseInterface) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("base_interface"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (baseInterface == null ? MemoryAddress.NULL : baseInterface.handle()));
                return this;
            }
        }
        
        public Builder setGetRgba(GetRgbaCallback getRgba) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_rgba"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getRgba == null ? MemoryAddress.NULL : getRgba.toCallback()));
                return this;
            }
        }
        
        public Builder setSetRgba(SetRgbaCallback setRgba) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("set_rgba"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setRgba == null ? MemoryAddress.NULL : setRgba.toCallback()));
                return this;
            }
        }
        
        public Builder setAddPalette(AddPaletteCallback addPalette) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("add_palette"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (addPalette == null ? MemoryAddress.NULL : addPalette.toCallback()));
                return this;
            }
        }
        
        public Builder setColorActivated(ColorActivatedCallback colorActivated) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("color_activated"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (colorActivated == null ? MemoryAddress.NULL : colorActivated.toCallback()));
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
