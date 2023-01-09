package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GdkPixbufModule} contains the necessary functions to load and save
 * images in a certain file format.
 * <p>
 * If {@code GdkPixbuf} has been compiled with {@code GModule} support, it can be extended
 * by modules which can load (and perhaps also save) new image and animation
 * formats.
 * <p>
 * <strong>Implementing modules</strong><br/>
 * The {@code GdkPixbuf} interfaces needed for implementing modules are contained in
 * {@code gdk-pixbuf-io.h} (and {@code gdk-pixbuf-animation.h} if the module supports
 * animations). They are not covered by the same stability guarantees as the
 * regular GdkPixbuf API. To underline this fact, they are protected by the
 * {@code GDK_PIXBUF_ENABLE_BACKEND} pre-processor symbol.
 * <p>
 * Each loadable module must contain a {@code GdkPixbufModuleFillVtableFunc} function
 * named {@code fill_vtable}, which will get called when the module
 * is loaded and must set the function pointers of the {@code GdkPixbufModule}.
 * <p>
 * In order to make format-checking work before actually loading the modules
 * (which may require calling {@code dlopen} to load image libraries), modules export
 * their signatures (and other information) via the {@code fill_info} function. An
 * external utility, {@code gdk-pixbuf-query-loaders}, uses this to create a text
 * file containing a list of all available loaders and  their signatures.
 * This file is then read at runtime by {@code GdkPixbuf} to obtain the list of
 * available loaders and their signatures.
 * <p>
 * Modules may only implement a subset of the functionality available via
 * {@code GdkPixbufModule}. If a particular functionality is not implemented, the
 * {@code fill_vtable} function will simply not set the corresponding
 * function pointers of the {@code GdkPixbufModule} structure. If a module supports
 * incremental loading (i.e. provides {@code begin_load}, {@code stop_load} and
 * {@code load_increment}), it doesn't have to implement {@code load}, since {@code GdkPixbuf}
 * can supply a generic {@code load} implementation wrapping the incremental loading.
 * <p>
 * <strong>Installing modules</strong><br/>
 * Installing a module is a two-step process:
 * <ul>
 * <li>copy the module file(s) to the loader directory (normally
 *    {@code $libdir/gdk-pixbuf-2.0/$version/loaders}, unless overridden by the
 *    environment variable {@code GDK_PIXBUF_MODULEDIR})
 * <li>call {@code gdk-pixbuf-query-loaders} to update the module file (normally
 *    {@code $libdir/gdk-pixbuf-2.0/$version/loaders.cache}, unless overridden
 *    by the environment variable {@code GDK_PIXBUF_MODULE_FILE})
 * </ul>
 */
public class PixbufModule extends Struct {
    
    static {
        GdkPixbuf.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkPixbufModule";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("module_name"),
            Interop.valueLayout.ADDRESS.withName("module_path"),
            Interop.valueLayout.ADDRESS.withName("module"),
            Interop.valueLayout.ADDRESS.withName("info"),
            Interop.valueLayout.ADDRESS.withName("load"),
            Interop.valueLayout.ADDRESS.withName("load_xpm_data"),
            Interop.valueLayout.ADDRESS.withName("begin_load"),
            Interop.valueLayout.ADDRESS.withName("stop_load"),
            Interop.valueLayout.ADDRESS.withName("load_increment"),
            Interop.valueLayout.ADDRESS.withName("load_animation"),
            Interop.valueLayout.ADDRESS.withName("save"),
            Interop.valueLayout.ADDRESS.withName("save_to_callback"),
            Interop.valueLayout.ADDRESS.withName("is_save_option_supported"),
            Interop.valueLayout.ADDRESS.withName("_reserved1"),
            Interop.valueLayout.ADDRESS.withName("_reserved2"),
            Interop.valueLayout.ADDRESS.withName("_reserved3"),
            Interop.valueLayout.ADDRESS.withName("_reserved4")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link PixbufModule}
     * @return A new, uninitialized @{link PixbufModule}
     */
    public static PixbufModule allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        PixbufModule newInstance = new PixbufModule(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code module_name}
     * @return The value of the field {@code module_name}
     */
    public java.lang.String getModuleName() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("module_name"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code module_name}
     * @param moduleName The new value of the field {@code module_name}
     */
    public void setModuleName(java.lang.String moduleName) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("module_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (moduleName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(moduleName, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code module_path}
     * @return The value of the field {@code module_path}
     */
    public java.lang.String getModulePath() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("module_path"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code module_path}
     * @param modulePath The new value of the field {@code module_path}
     */
    public void setModulePath(java.lang.String modulePath) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("module_path"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (modulePath == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(modulePath, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code info}
     * @return The value of the field {@code info}
     */
    public org.gtk.gdkpixbuf.PixbufFormat getInfo() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("info"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return org.gtk.gdkpixbuf.PixbufFormat.fromAddress.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code info}
     * @param info The new value of the field {@code info}
     */
    public void setInfo(org.gtk.gdkpixbuf.PixbufFormat info) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("info"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (info == null ? MemoryAddress.NULL : info.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code load}
     * @return The value of the field {@code load}
     */
    public org.gtk.gdkpixbuf.PixbufModuleLoadFunc getLoad() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("load"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return null /* Unsupported parameter type */;
        }
    }
    
    /**
     * Change the value of the field {@code load}
     * @param load The new value of the field {@code load}
     */
    public void setLoad(org.gtk.gdkpixbuf.PixbufModuleLoadFunc load) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("load"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (load == null ? MemoryAddress.NULL : (Addressable) load.toCallback()));
        }
    }
    
    /**
     * Get the value of the field {@code load_xpm_data}
     * @return The value of the field {@code load_xpm_data}
     */
    public org.gtk.gdkpixbuf.PixbufModuleLoadXpmDataFunc getLoadXpmData() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("load_xpm_data"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return null /* Unsupported parameter type */;
        }
    }
    
    /**
     * Change the value of the field {@code load_xpm_data}
     * @param loadXpmData The new value of the field {@code load_xpm_data}
     */
    public void setLoadXpmData(org.gtk.gdkpixbuf.PixbufModuleLoadXpmDataFunc loadXpmData) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("load_xpm_data"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (loadXpmData == null ? MemoryAddress.NULL : (Addressable) loadXpmData.toCallback()));
        }
    }
    
    /**
     * Get the value of the field {@code begin_load}
     * @return The value of the field {@code begin_load}
     */
    public org.gtk.gdkpixbuf.PixbufModuleBeginLoadFunc getBeginLoad() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("begin_load"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return null /* Unsupported parameter type */;
        }
    }
    
    /**
     * Change the value of the field {@code begin_load}
     * @param beginLoad The new value of the field {@code begin_load}
     */
    public void setBeginLoad(org.gtk.gdkpixbuf.PixbufModuleBeginLoadFunc beginLoad) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("begin_load"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (beginLoad == null ? MemoryAddress.NULL : (Addressable) beginLoad.toCallback()));
        }
    }
    
    /**
     * Get the value of the field {@code stop_load}
     * @return The value of the field {@code stop_load}
     */
    public org.gtk.gdkpixbuf.PixbufModuleStopLoadFunc getStopLoad() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("stop_load"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return null /* Unsupported parameter type */;
        }
    }
    
    /**
     * Change the value of the field {@code stop_load}
     * @param stopLoad The new value of the field {@code stop_load}
     */
    public void setStopLoad(org.gtk.gdkpixbuf.PixbufModuleStopLoadFunc stopLoad) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("stop_load"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (stopLoad == null ? MemoryAddress.NULL : (Addressable) stopLoad.toCallback()));
        }
    }
    
    /**
     * Get the value of the field {@code load_increment}
     * @return The value of the field {@code load_increment}
     */
    public org.gtk.gdkpixbuf.PixbufModuleIncrementLoadFunc getLoadIncrement() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("load_increment"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return null /* Unsupported parameter type */;
        }
    }
    
    /**
     * Change the value of the field {@code load_increment}
     * @param loadIncrement The new value of the field {@code load_increment}
     */
    public void setLoadIncrement(org.gtk.gdkpixbuf.PixbufModuleIncrementLoadFunc loadIncrement) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("load_increment"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (loadIncrement == null ? MemoryAddress.NULL : (Addressable) loadIncrement.toCallback()));
        }
    }
    
    /**
     * Get the value of the field {@code load_animation}
     * @return The value of the field {@code load_animation}
     */
    public org.gtk.gdkpixbuf.PixbufModuleLoadAnimationFunc getLoadAnimation() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("load_animation"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return null /* Unsupported parameter type */;
        }
    }
    
    /**
     * Change the value of the field {@code load_animation}
     * @param loadAnimation The new value of the field {@code load_animation}
     */
    public void setLoadAnimation(org.gtk.gdkpixbuf.PixbufModuleLoadAnimationFunc loadAnimation) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("load_animation"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (loadAnimation == null ? MemoryAddress.NULL : (Addressable) loadAnimation.toCallback()));
        }
    }
    
    /**
     * Get the value of the field {@code save}
     * @return The value of the field {@code save}
     */
    public org.gtk.gdkpixbuf.PixbufModuleSaveFunc getSave() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("save"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return null /* Unsupported parameter type */;
        }
    }
    
    /**
     * Change the value of the field {@code save}
     * @param save The new value of the field {@code save}
     */
    public void setSave(org.gtk.gdkpixbuf.PixbufModuleSaveFunc save) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("save"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (save == null ? MemoryAddress.NULL : (Addressable) save.toCallback()));
        }
    }
    
    /**
     * Get the value of the field {@code save_to_callback}
     * @return The value of the field {@code save_to_callback}
     */
    public org.gtk.gdkpixbuf.PixbufModuleSaveCallbackFunc getSaveToCallback() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("save_to_callback"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return null /* Unsupported parameter type */;
        }
    }
    
    /**
     * Change the value of the field {@code save_to_callback}
     * @param saveToCallback The new value of the field {@code save_to_callback}
     */
    public void setSaveToCallback(org.gtk.gdkpixbuf.PixbufModuleSaveCallbackFunc saveToCallback) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("save_to_callback"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (saveToCallback == null ? MemoryAddress.NULL : (Addressable) saveToCallback.toCallback()));
        }
    }
    
    /**
     * Get the value of the field {@code is_save_option_supported}
     * @return The value of the field {@code is_save_option_supported}
     */
    public org.gtk.gdkpixbuf.PixbufModuleSaveOptionSupportedFunc getIsSaveOptionSupported() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_save_option_supported"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return null /* Unsupported parameter type */;
        }
    }
    
    /**
     * Change the value of the field {@code is_save_option_supported}
     * @param isSaveOptionSupported The new value of the field {@code is_save_option_supported}
     */
    public void setIsSaveOptionSupported(org.gtk.gdkpixbuf.PixbufModuleSaveOptionSupportedFunc isSaveOptionSupported) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_save_option_supported"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (isSaveOptionSupported == null ? MemoryAddress.NULL : (Addressable) isSaveOptionSupported.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code Reserved1Callback} callback.
     */
    @FunctionalInterface
    public interface Reserved1Callback {
    
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
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Reserved1Callback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _reserved1}
     * @param Reserved1 The new value of the field {@code _reserved1}
     */
    public void setReserved1(Reserved1Callback Reserved1) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_reserved1"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (Reserved1 == null ? MemoryAddress.NULL : Reserved1.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code Reserved2Callback} callback.
     */
    @FunctionalInterface
    public interface Reserved2Callback {
    
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
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Reserved2Callback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _reserved2}
     * @param Reserved2 The new value of the field {@code _reserved2}
     */
    public void setReserved2(Reserved2Callback Reserved2) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_reserved2"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (Reserved2 == null ? MemoryAddress.NULL : Reserved2.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code Reserved3Callback} callback.
     */
    @FunctionalInterface
    public interface Reserved3Callback {
    
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
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Reserved3Callback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _reserved3}
     * @param Reserved3 The new value of the field {@code _reserved3}
     */
    public void setReserved3(Reserved3Callback Reserved3) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_reserved3"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (Reserved3 == null ? MemoryAddress.NULL : Reserved3.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code Reserved4Callback} callback.
     */
    @FunctionalInterface
    public interface Reserved4Callback {
    
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
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Reserved4Callback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _reserved4}
     * @param Reserved4 The new value of the field {@code _reserved4}
     */
    public void setReserved4(Reserved4Callback Reserved4) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_reserved4"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (Reserved4 == null ? MemoryAddress.NULL : Reserved4.toCallback()));
        }
    }
    
    /**
     * Create a PixbufModule proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected PixbufModule(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, PixbufModule> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new PixbufModule(input);
    
    /**
     * A {@link PixbufModule.Builder} object constructs a {@link PixbufModule} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link PixbufModule.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final PixbufModule struct;
        
        private Builder() {
            struct = PixbufModule.allocate();
        }
        
        /**
         * Finish building the {@link PixbufModule} struct.
         * @return A new instance of {@code PixbufModule} with the fields 
         *         that were set in the Builder object.
         */
        public PixbufModule build() {
            return struct;
        }
        
        /**
         * the name of the module, usually the same as the
         *  usual file extension for images of this type, eg. "xpm", "jpeg" or "png".
         * @param moduleName The value for the {@code moduleName} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setModuleName(java.lang.String moduleName) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("module_name"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (moduleName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(moduleName, SCOPE)));
                return this;
            }
        }
        
        /**
         * the path from which the module is loaded.
         * @param modulePath The value for the {@code modulePath} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setModulePath(java.lang.String modulePath) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("module_path"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (modulePath == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(modulePath, SCOPE)));
                return this;
            }
        }
        
        /**
         * the loaded {@code GModule}.
         * @param module The value for the {@code module} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setModule(org.gtk.gmodule.Module module) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("module"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (module == null ? MemoryAddress.NULL : module.handle()));
                return this;
            }
        }
        
        /**
         * a {@code GdkPixbufFormat} holding information about the module.
         * @param info The value for the {@code info} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setInfo(org.gtk.gdkpixbuf.PixbufFormat info) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("info"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (info == null ? MemoryAddress.NULL : info.handle()));
                return this;
            }
        }
        
        /**
         * loads an image from a file.
         * @param load The value for the {@code load} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLoad(org.gtk.gdkpixbuf.PixbufModuleLoadFunc load) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("load"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (load == null ? MemoryAddress.NULL : (Addressable) load.toCallback()));
                return this;
            }
        }
        
        /**
         * loads an image from data in memory.
         * @param loadXpmData The value for the {@code loadXpmData} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLoadXpmData(org.gtk.gdkpixbuf.PixbufModuleLoadXpmDataFunc loadXpmData) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("load_xpm_data"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (loadXpmData == null ? MemoryAddress.NULL : (Addressable) loadXpmData.toCallback()));
                return this;
            }
        }
        
        /**
         * begins an incremental load.
         * @param beginLoad The value for the {@code beginLoad} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setBeginLoad(org.gtk.gdkpixbuf.PixbufModuleBeginLoadFunc beginLoad) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("begin_load"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (beginLoad == null ? MemoryAddress.NULL : (Addressable) beginLoad.toCallback()));
                return this;
            }
        }
        
        /**
         * stops an incremental load.
         * @param stopLoad The value for the {@code stopLoad} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setStopLoad(org.gtk.gdkpixbuf.PixbufModuleStopLoadFunc stopLoad) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("stop_load"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (stopLoad == null ? MemoryAddress.NULL : (Addressable) stopLoad.toCallback()));
                return this;
            }
        }
        
        /**
         * continues an incremental load.
         * @param loadIncrement The value for the {@code loadIncrement} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLoadIncrement(org.gtk.gdkpixbuf.PixbufModuleIncrementLoadFunc loadIncrement) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("load_increment"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (loadIncrement == null ? MemoryAddress.NULL : (Addressable) loadIncrement.toCallback()));
                return this;
            }
        }
        
        /**
         * loads an animation from a file.
         * @param loadAnimation The value for the {@code loadAnimation} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLoadAnimation(org.gtk.gdkpixbuf.PixbufModuleLoadAnimationFunc loadAnimation) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("load_animation"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (loadAnimation == null ? MemoryAddress.NULL : (Addressable) loadAnimation.toCallback()));
                return this;
            }
        }
        
        /**
         * saves a {@code GdkPixbuf} to a file.
         * @param save The value for the {@code save} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSave(org.gtk.gdkpixbuf.PixbufModuleSaveFunc save) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("save"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (save == null ? MemoryAddress.NULL : (Addressable) save.toCallback()));
                return this;
            }
        }
        
        /**
         * saves a {@code GdkPixbuf} by calling the given {@code GdkPixbufSaveFunc}.
         * @param saveToCallback The value for the {@code saveToCallback} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSaveToCallback(org.gtk.gdkpixbuf.PixbufModuleSaveCallbackFunc saveToCallback) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("save_to_callback"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (saveToCallback == null ? MemoryAddress.NULL : (Addressable) saveToCallback.toCallback()));
                return this;
            }
        }
        
        /**
         * returns whether a save option key is supported by the module
         * @param isSaveOptionSupported The value for the {@code isSaveOptionSupported} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setIsSaveOptionSupported(org.gtk.gdkpixbuf.PixbufModuleSaveOptionSupportedFunc isSaveOptionSupported) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("is_save_option_supported"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (isSaveOptionSupported == null ? MemoryAddress.NULL : (Addressable) isSaveOptionSupported.toCallback()));
                return this;
            }
        }
        
        public Builder setReserved1(Reserved1Callback Reserved1) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_reserved1"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (Reserved1 == null ? MemoryAddress.NULL : Reserved1.toCallback()));
                return this;
            }
        }
        
        public Builder setReserved2(Reserved2Callback Reserved2) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_reserved2"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (Reserved2 == null ? MemoryAddress.NULL : Reserved2.toCallback()));
                return this;
            }
        }
        
        public Builder setReserved3(Reserved3Callback Reserved3) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_reserved3"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (Reserved3 == null ? MemoryAddress.NULL : Reserved3.toCallback()));
                return this;
            }
        }
        
        public Builder setReserved4(Reserved4Callback Reserved4) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_reserved4"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (Reserved4 == null ? MemoryAddress.NULL : Reserved4.toCallback()));
                return this;
            }
        }
    }
}
