package org.gtk.gdkpixbuf;

@FunctionalInterface
public interface PixbufModuleBeginLoadFunc {

    /**
     * Sets up the image loading state.
     * 
     * The image loader is responsible for storing the given function pointers
     * and user data, and call them when needed.
     * 
     * The image loader should set up an internal state object, and return it
     * from this function; the state object will then be updated from the
     * [callback@GdkPixbuf.PixbufModuleIncrementLoadFunc] callback, and will be freed
     * by [callback@GdkPixbuf.PixbufModuleStopLoadFunc] callback.
     */
    public jdk.incubator.foreign.MemoryAddress onPixbufModuleBeginLoadFunc(PixbufModuleSizeFunc sizeFunc, PixbufModulePreparedFunc preparedFunc, PixbufModuleUpdatedFunc updatedFunc, jdk.incubator.foreign.MemoryAddress userData);
}
