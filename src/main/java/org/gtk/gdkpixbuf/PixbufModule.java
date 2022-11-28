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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link PixbufModule}
     * @return A new, uninitialized @{link PixbufModule}
     */
    public static PixbufModule allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PixbufModule newInstance = new PixbufModule(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code module_name}
     * @return The value of the field {@code module_name}
     */
    public java.lang.String moduleName$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("module_name"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code module_name}
     * @param moduleName The new value of the field {@code module_name}
     */
    public void moduleName$set(java.lang.String moduleName) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("module_name"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(moduleName));
    }
    
    /**
     * Get the value of the field {@code module_path}
     * @return The value of the field {@code module_path}
     */
    public java.lang.String modulePath$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("module_path"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code module_path}
     * @param modulePath The new value of the field {@code module_path}
     */
    public void modulePath$set(java.lang.String modulePath) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("module_path"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(modulePath));
    }
    
    /**
     * Get the value of the field {@code info}
     * @return The value of the field {@code info}
     */
    public org.gtk.gdkpixbuf.PixbufFormat info$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("info"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.gdkpixbuf.PixbufFormat(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code info}
     * @param info The new value of the field {@code info}
     */
    public void info$set(org.gtk.gdkpixbuf.PixbufFormat info) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("info"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), info.handle());
    }
    
    /**
     * Get the value of the field {@code load}
     * @return The value of the field {@code load}
     */
    public org.gtk.gdkpixbuf.PixbufModuleLoadFunc load$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("load"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Get the value of the field {@code load_xpm_data}
     * @return The value of the field {@code load_xpm_data}
     */
    public org.gtk.gdkpixbuf.PixbufModuleLoadXpmDataFunc loadXpmData$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("load_xpm_data"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Get the value of the field {@code begin_load}
     * @return The value of the field {@code begin_load}
     */
    public org.gtk.gdkpixbuf.PixbufModuleBeginLoadFunc beginLoad$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("begin_load"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Get the value of the field {@code stop_load}
     * @return The value of the field {@code stop_load}
     */
    public org.gtk.gdkpixbuf.PixbufModuleStopLoadFunc stopLoad$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("stop_load"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Get the value of the field {@code load_increment}
     * @return The value of the field {@code load_increment}
     */
    public org.gtk.gdkpixbuf.PixbufModuleIncrementLoadFunc loadIncrement$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("load_increment"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Get the value of the field {@code load_animation}
     * @return The value of the field {@code load_animation}
     */
    public org.gtk.gdkpixbuf.PixbufModuleLoadAnimationFunc loadAnimation$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("load_animation"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Get the value of the field {@code save}
     * @return The value of the field {@code save}
     */
    public org.gtk.gdkpixbuf.PixbufModuleSaveFunc save$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("save"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Get the value of the field {@code save_to_callback}
     * @return The value of the field {@code save_to_callback}
     */
    public org.gtk.gdkpixbuf.PixbufModuleSaveCallbackFunc saveToCallback$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("save_to_callback"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Get the value of the field {@code is_save_option_supported}
     * @return The value of the field {@code is_save_option_supported}
     */
    public org.gtk.gdkpixbuf.PixbufModuleSaveOptionSupportedFunc isSaveOptionSupported$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("is_save_option_supported"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Create a PixbufModule proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public PixbufModule(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private PixbufModule struct;
        
         /**
         * A {@link PixbufModule.Build} object constructs a {@link PixbufModule} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = PixbufModule.allocate();
        }
        
         /**
         * Finish building the {@link PixbufModule} struct.
         * @return A new instance of {@code PixbufModule} with the fields 
         *         that were set in the Build object.
         */
        public PixbufModule construct() {
            return struct;
        }
        
        /**
         * the name of the module, usually the same as the
         *  usual file extension for images of this type, eg. "xpm", "jpeg" or "png".
         * @param moduleName The value for the {@code moduleName} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setModuleName(java.lang.String moduleName) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("module_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (moduleName == null ? MemoryAddress.NULL : Interop.allocateNativeString(moduleName)));
            return this;
        }
        
        /**
         * the path from which the module is loaded.
         * @param modulePath The value for the {@code modulePath} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setModulePath(java.lang.String modulePath) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("module_path"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (modulePath == null ? MemoryAddress.NULL : Interop.allocateNativeString(modulePath)));
            return this;
        }
        
        /**
         * the loaded {@code GModule}.
         * @param module The value for the {@code module} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setModule(org.gtk.gmodule.Module module) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("module"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (module == null ? MemoryAddress.NULL : module.handle()));
            return this;
        }
        
        /**
         * a {@code GdkPixbufFormat} holding information about the module.
         * @param info The value for the {@code info} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setInfo(org.gtk.gdkpixbuf.PixbufFormat info) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("info"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (info == null ? MemoryAddress.NULL : info.handle()));
            return this;
        }
        
        /**
         * loads an image from a file.
         * @param load The value for the {@code load} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setLoad(java.lang.foreign.MemoryAddress load) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("load"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (load == null ? MemoryAddress.NULL : load));
            return this;
        }
        
        /**
         * loads an image from data in memory.
         * @param loadXpmData The value for the {@code loadXpmData} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setLoadXpmData(java.lang.foreign.MemoryAddress loadXpmData) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("load_xpm_data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (loadXpmData == null ? MemoryAddress.NULL : loadXpmData));
            return this;
        }
        
        /**
         * begins an incremental load.
         * @param beginLoad The value for the {@code beginLoad} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setBeginLoad(java.lang.foreign.MemoryAddress beginLoad) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("begin_load"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (beginLoad == null ? MemoryAddress.NULL : beginLoad));
            return this;
        }
        
        /**
         * stops an incremental load.
         * @param stopLoad The value for the {@code stopLoad} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setStopLoad(java.lang.foreign.MemoryAddress stopLoad) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("stop_load"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (stopLoad == null ? MemoryAddress.NULL : stopLoad));
            return this;
        }
        
        /**
         * continues an incremental load.
         * @param loadIncrement The value for the {@code loadIncrement} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setLoadIncrement(java.lang.foreign.MemoryAddress loadIncrement) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("load_increment"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (loadIncrement == null ? MemoryAddress.NULL : loadIncrement));
            return this;
        }
        
        /**
         * loads an animation from a file.
         * @param loadAnimation The value for the {@code loadAnimation} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setLoadAnimation(java.lang.foreign.MemoryAddress loadAnimation) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("load_animation"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (loadAnimation == null ? MemoryAddress.NULL : loadAnimation));
            return this;
        }
        
        /**
         * saves a {@code GdkPixbuf} to a file.
         * @param save The value for the {@code save} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSave(java.lang.foreign.MemoryAddress save) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("save"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (save == null ? MemoryAddress.NULL : save));
            return this;
        }
        
        /**
         * saves a {@code GdkPixbuf} by calling the given {@code GdkPixbufSaveFunc}.
         * @param saveToCallback The value for the {@code saveToCallback} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSaveToCallback(java.lang.foreign.MemoryAddress saveToCallback) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("save_to_callback"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (saveToCallback == null ? MemoryAddress.NULL : saveToCallback));
            return this;
        }
        
        /**
         * returns whether a save option key is supported by the module
         * @param isSaveOptionSupported The value for the {@code isSaveOptionSupported} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setIsSaveOptionSupported(java.lang.foreign.MemoryAddress isSaveOptionSupported) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_save_option_supported"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (isSaveOptionSupported == null ? MemoryAddress.NULL : isSaveOptionSupported));
            return this;
        }
        
        public Build setReserved1(java.lang.foreign.MemoryAddress Reserved1) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_reserved1"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (Reserved1 == null ? MemoryAddress.NULL : Reserved1));
            return this;
        }
        
        public Build setReserved2(java.lang.foreign.MemoryAddress Reserved2) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_reserved2"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (Reserved2 == null ? MemoryAddress.NULL : Reserved2));
            return this;
        }
        
        public Build setReserved3(java.lang.foreign.MemoryAddress Reserved3) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_reserved3"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (Reserved3 == null ? MemoryAddress.NULL : Reserved3));
            return this;
        }
        
        public Build setReserved4(java.lang.foreign.MemoryAddress Reserved4) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_reserved4"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (Reserved4 == null ? MemoryAddress.NULL : Reserved4));
            return this;
        }
    }
}
