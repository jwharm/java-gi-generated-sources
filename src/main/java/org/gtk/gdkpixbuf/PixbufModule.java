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
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("module_name"),
        Interop.valueLayout.ADDRESS.withName("module_path"),
        org.gtk.gmodule.Module.getMemoryLayout().withName("module"),
        org.gtk.gdkpixbuf.PixbufFormat.getMemoryLayout().withName("info"),
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
    ).withName("GdkPixbufModule");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public PixbufModule(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
