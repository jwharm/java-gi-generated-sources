package org.gtk.gdkpixbuf;

/**
 * Sets up the image loading state.
 * 
 * The image loader is responsible for storing the given function pointers
 * and user data, and call them when needed.
 * 
 * The image loader should set up an internal state object, and return it
 * from this function; the state object will then be updated from the
 * {@link [callback@GdkPixbuf.PixbufModuleIncrementLoadFunc] (ref=callback)} callback, and will be freed
 * by {@link [callback@GdkPixbuf.PixbufModuleStopLoadFunc] (ref=callback)} callback.
 */
@FunctionalInterface
public interface PixbufModuleBeginLoadFunc {
        jdk.incubator.foreign.MemoryAddress onPixbufModuleBeginLoadFunc(PixbufModuleSizeFunc sizeFunc, PixbufModulePreparedFunc preparedFunc, PixbufModuleUpdatedFunc updatedFunc);
}
