package org.gtk.gdkpixbuf;

@FunctionalInterface
public interface PixbufModuleStopLoadFunc {

    /**
     * Finalizes the image loading state.
     * 
     * This function is called on success and error states.
     */
    public boolean onPixbufModuleStopLoadFunc(jdk.incubator.foreign.MemoryAddress context);
}
