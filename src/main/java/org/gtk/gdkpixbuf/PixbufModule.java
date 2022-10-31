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
public class PixbufModule extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        GdkPixbuf.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkPixbufModule";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
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
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static PixbufModule allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PixbufModule newInstance = new PixbufModule(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code module_name}
     * @return The value of the field {@code module_name}
     */
    public java.lang.String module_name$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("module_name"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code module_name}
     * @param module_name The new value of the field {@code module_name}
     */
    public void module_name$set(java.lang.String module_name) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("module_name"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(module_name));
    }
    
    /**
     * Get the value of the field {@code module_path}
     * @return The value of the field {@code module_path}
     */
    public java.lang.String module_path$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("module_path"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code module_path}
     * @param module_path The new value of the field {@code module_path}
     */
    public void module_path$set(java.lang.String module_path) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("module_path"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(module_path));
    }
    
    /**
     * Get the value of the field {@code info}
     * @return The value of the field {@code info}
     */
    public org.gtk.gdkpixbuf.PixbufFormat info$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("info"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.gdkpixbuf.PixbufFormat(Refcounted.get(RESULT, false));
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
    public org.gtk.gdkpixbuf.PixbufModuleLoadXpmDataFunc load_xpm_data$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("load_xpm_data"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Get the value of the field {@code begin_load}
     * @return The value of the field {@code begin_load}
     */
    public org.gtk.gdkpixbuf.PixbufModuleBeginLoadFunc begin_load$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("begin_load"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Get the value of the field {@code stop_load}
     * @return The value of the field {@code stop_load}
     */
    public org.gtk.gdkpixbuf.PixbufModuleStopLoadFunc stop_load$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("stop_load"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Get the value of the field {@code load_increment}
     * @return The value of the field {@code load_increment}
     */
    public org.gtk.gdkpixbuf.PixbufModuleIncrementLoadFunc load_increment$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("load_increment"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Get the value of the field {@code load_animation}
     * @return The value of the field {@code load_animation}
     */
    public org.gtk.gdkpixbuf.PixbufModuleLoadAnimationFunc load_animation$get() {
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
    public org.gtk.gdkpixbuf.PixbufModuleSaveCallbackFunc save_to_callback$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("save_to_callback"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Get the value of the field {@code is_save_option_supported}
     * @return The value of the field {@code is_save_option_supported}
     */
    public org.gtk.gdkpixbuf.PixbufModuleSaveOptionSupportedFunc is_save_option_supported$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("is_save_option_supported"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    @ApiStatus.Internal
    public PixbufModule(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
